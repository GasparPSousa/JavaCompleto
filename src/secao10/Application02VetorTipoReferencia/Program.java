package secao10.Application02VetorTipoReferencia;

import secao09.Application01Estoques.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // quebra de linha ficou pendente
        Product[] vect = new Product[n];

        for(int i = 0; i < vect.length; i++) {
            sc.nextLine(); //consumindo a quebra de linha que estava pendente
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        } // Lendo os produtos, instaciando os objetos e guardando nas posições do vetor

        double sum = 0.0;
        for(int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice(); // acessando o vetor na posição i e pegando somento o preço do objeto.
        }

        double avg = sum / vect.length;

        System.out.printf("O preço médio dos produtos é : R$ %.2f%n", avg);


        sc.close();
    }
}
