package secao08.Application06;

import secao08.Application06.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Digite o nome do aluno: ");
        student.nome = sc.nextLine();
        System.out.println("Digite a primeira nota(no máximo 30): ");
        student.nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota(no máximo 35):  ");
        student.nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota(no máximo 35): ");
        student.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.media());
        student.status();

    }
}
