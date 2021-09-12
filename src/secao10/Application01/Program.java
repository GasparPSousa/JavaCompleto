package secao10.Application01;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = sc.nextInt();
        double [] vect = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite a altura do paciente 0" + (i+1) + " : " );
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        double media = soma / n;

        System.out.printf("A altura média dos pacientes é : %.2f m%n", media);



        sc.close();

    }
}
