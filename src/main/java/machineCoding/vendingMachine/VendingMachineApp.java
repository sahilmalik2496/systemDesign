package machineCoding.vendingMachine;

import java.util.Scanner;

public class VendingMachineApp {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct("P001", "Chips", 50, 10);
        vendingMachine.addProduct("P002", "Soda", 30, 5);
        vendingMachine.addProduct("P003", "Chocolate", 20, 8);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Vending Machine ---");
            vendingMachine.displayProducts();
            System.out.println("1. Insert Money");
            System.out.println("2. Select Product");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter amount to insert: ");
                int amount = scanner.nextInt();
                vendingMachine.insertMoney(amount);
            } else if (choice == 2) {
                System.out.print("Enter product ID to select: ");
                String productId = scanner.next();
                vendingMachine.selectProduct(productId);
            } else {
                break;
            }
        }
        scanner.close();
    }
}
