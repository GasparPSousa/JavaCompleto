package secao08.Application01;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Resolvendo um problema SEM POO
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures os triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures os triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double pX = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX -xC));

        double pY = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY -yC));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();

    }
}
