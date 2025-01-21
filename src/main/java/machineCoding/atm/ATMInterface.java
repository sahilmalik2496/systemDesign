package machineCoding.atm;

import java.util.Scanner;

public class ATMInterface {
    private final ATM atm;

    public ATMInterface(ATM atm) {
        this.atm = atm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ATM machine
        ATM atm = new ATM();

        // Add users to the ATM
        Account user1Account = new Account("A1", 1000, "Savings");
        User user1 = new User("U1", "John Doe", "123456789", "1234", user1Account);
        atm.addUser(user1);

        // Create an ATM card for the user
        Card card1 = new Card("U1", "1234");

        // ATM authentication and transaction
        System.out.println("Enter Card Number: ");
        String cardNumber = scanner.nextLine();

        System.out.println("Enter PIN: ");
        String pin = scanner.nextLine();

        if (atm.authenticateCard(card1, pin)) {
            System.out.println("Authentication successful!");

            // Menu for transactions
            while (true) {
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        double balance = atm.checkBalance(user1Account.getAccountId());
                        System.out.println("Balance: " + balance);
                        break;
                    case 2:
                        System.out.println("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        if (atm.deposit(user1Account.getAccountId(), depositAmount)) {
                            System.out.println("Deposit successful.");
                        } else {
                            System.out.println("Deposit failed.");
                        }
                        break;
                    case 3:
                        System.out.println("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        if (atm.withdraw(user1Account.getAccountId(), withdrawAmount)) {
                            System.out.println("Withdrawal successful.");
                        } else {
                            System.out.println("Insufficient funds.");
                        }
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option.");
                }
            }
        } else {
            System.out.println("Authentication failed!");
        }
    }
}
