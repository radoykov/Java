package bank;

import java.math.BigDecimal;
import java.util.*;

//The application in action
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<User> users = new ArrayList<>();
        List<Account> accounts = new ArrayList<>();
        Queue<Transaction> transactions = new ArrayDeque<>();

        Database.load("users.data", users);
        Database.load("accounts.data", accounts);
        Database.load("transactions.data", transactions);

        User currentUser = null;

        while (true) {
            if (currentUser == null) {
                System.out.println("1. Login");
                System.out.println("2. Register");
                System.out.println("3. Exit\n");

                System.out.print("Choice : ");
                int choice = Integer.parseInt(sc.nextLine());

                if (choice == 1) {
                    System.out.print("Username: ");
                    String u = sc.nextLine();
                    System.out.print("Password: ");
                    String p = sc.nextLine();

                    currentUser = BankService.login(users, u, p);
                    if (currentUser == null) {
                        System.out.println("No such user found. Please register.");
                    }

                } else if (choice == 2) {
                    System.out.print("Username: ");
                    String u = sc.nextLine();
                    System.out.print("Password: ");
                    String p = sc.nextLine();

                    currentUser = BankService.register(users, accounts, u, p);

                    //Only for register
                    if (currentUser != null) {
                        Database.save("users.data", users);
                        Database.save("accounts.data", accounts);
                    } else {
                        System.out.println("User already exists. Please login.");
                    }

                } else {
                    break;
                }

            } else {
                Account acc = BankService.findUserAccount(accounts, currentUser);

                System.out.println("1. Show current balance");
                System.out.println("2. Show IBAN");
                System.out.println("3. Deposit");
                System.out.println("4. Withdraw");
                System.out.println("5. Transfer");
                System.out.println("6. Process transactions");
                System.out.println("7. Logout\n");

                System.out.print("Choice : ");
                int choice = Integer.parseInt(sc.nextLine());

                if (choice == 1) {
                    System.out.print("Money : ");
                    System.out.println(acc.getBalance());

                } else if (choice == 2) {
                    System.out.print("IBAN : ");
                    System.out.println(acc.getIban());

                } else if (choice == 3) {
                    System.out.print("Amount: ");
                    String amtStr = sc.nextLine();
                    BigDecimal amt = new BigDecimal(amtStr);

                    if (BankService.validAmount(amt)) {
                        acc.deposit(amt);
                        Database.save("accounts.data", accounts);
                        System.out.println("Successful deposit");
                    } else {
                        System.out.println("Failed to deposit");
                    }

                } else if (choice == 4) {
                    System.out.print("Amount: ");
                    String amtStr = sc.nextLine();
                    BigDecimal amt = new BigDecimal(amtStr);

                    if (BankService.validAmount(amt)) {
                        if (acc.withdraw(amt) == 1) { //Error in withdraw
                            System.out.println("Failed due to insufficient funds.");
                        } else {
                            Database.save("accounts.data", accounts);
                            System.out.println("Successful withdraw");
                        }
                    } else {
                        System.out.println("Failed to withdraw");
                    }

                } else if (choice == 5) {
                    System.out.print("Target IBAN: ");
                    String iban = sc.nextLine();
                    System.out.print("Amount: ");
                    String amtStr = sc.nextLine();
                    BigDecimal amt = new BigDecimal(amtStr);

                    if (BankService.validAmount(amt)) {
                        transactions.add(new Transaction("TRANSFER", amt, acc.getIban(), iban));
                        Database.save("transactions.data", transactions);
                        System.out.println("Successful transaction");
                    } else {
                        System.out.println("Failed transaction");
                    }

                } else if (choice == 6) {
                    BankService.processTransactions(transactions, accounts);
                    Database.save("accounts.data", accounts);
                    Database.save("transactions.data", transactions);
                    System.out.println("Successful procedures executed");

                } else {
                    currentUser = null;
                }
            }
        }
    }
}
