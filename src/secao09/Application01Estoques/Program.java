package secao09.Application01Estoques;

import secao09.Application01Estoques.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
//        System.out.print("Quantity in stock: ");
//        int quantity = sc.nextInt();

        Product product = new Product(name, price);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of product to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity); // Faz a atualização da quantidade dentro do objeto product

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of product to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity); // Faz a atualização da quantidade dentro do objeto product

        System.out.println();
        System.out.println("Updated data: " + product);


        sc.close();
    }
}
