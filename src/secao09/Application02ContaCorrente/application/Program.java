package secao09.Application02ContaCorrente.application;

import secao09.Application02ContaCorrente.entities.ContaCorrente;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaCorrente contaCorrente;

        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Digite o seu nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Tem deposito inicial (s / n)? ");
        char reposta = sc.next().charAt(0);

        if (reposta == 's') {
            System.out.print("Informe o valor do deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            contaCorrente = new ContaCorrente(numero, nome, depositoInicial);
        } else {
            contaCorrente = new ContaCorrente(numero, nome);
        }

        System.out.println();
        System.out.println("Dados da Conta Corrente: ");
        System.out.println(contaCorrente);

        System.out.println();
        System.out.print("Deposite um valor: ");
        double valorDoDeposito = sc.nextDouble();
        contaCorrente.depositar(valorDoDeposito);
        System.out.println("Dados da Conta Corrente Atualizados: ");
        System.out.println(contaCorrente);

        System.out.println();
        System.out.print("Saque um valor: ");
        double valorDoSaque = sc.nextDouble();
        contaCorrente.sacar(valorDoSaque);
        System.out.println("Dados da Conta Corrente Atualizados: ");
        System.out.println(contaCorrente);



        sc.close();


    }
}
