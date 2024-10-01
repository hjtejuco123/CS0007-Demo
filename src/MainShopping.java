/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hadjitejuco
 */
import java.util.Scanner;
public class MainShopping {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        ElectronicProduct[] products = new ElectronicProduct[numProducts];

        for (int i = 0; i < numProducts; i++) {
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();

            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();

            System.out.print("Enter product stock: ");
            int stock = scanner.nextInt();

            System.out.print("Enter warranty period (in years): ");
            int warrantyYears = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            products[i] = new ElectronicProduct(name, price, stock, warrantyYears);
        }

        System.out.println("\nProduct Details:");
        for (ElectronicProduct product : products) {
            product.displayInfo();
        }

        // Simulate ordering a product
        System.out.print("Enter product index to order: ");
        int index = scanner.nextInt();
        System.out.print("Enter quantity to order: ");
        int quantity = scanner.nextInt();
        
        products[index].orderProduct(quantity);
        products[index].displayInfo();

        scanner.close();
    } 
}
