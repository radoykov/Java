package bank;

import java.math.BigDecimal;
import java.util.*;

/*
 Provides core banking operations such as user registration,
 login, account lookup, amount validation, and transaction processing.
 */
public class BankService {

    public static User register(List<User> users, List<Account> accounts, String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username)) return null;
        }
        User user = new User(username, password);
        users.add(user);
        accounts.add(new Account(user.getId()));
        return user;
    }

    public static User login(List<User> users, String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username) && u.checkPassword(password))
                return u;
        }
        return null;
    }

    public static Account findUserAccount(List<Account> accounts, User user) {
        for (Account a : accounts) {
            if (a.getUserId().equals(user.getId())) return a;
        }
        return null;
    }

    public static Account findByIban(List<Account> accounts, String iban) {
        for (Account a : accounts) {
            if (a.getIban().equals(iban)) return a;
        }
        return null;
    }

    //Checks accuracy up to second digit and for non-negative numbers
    public static boolean validAmount(BigDecimal amount) {
        return amount.compareTo(BigDecimal.ZERO) > 0
                && amount.scale() <= 2;
    }


    public static void processTransactions(Queue<Transaction> queue, List<Account> accounts) {
        while (!queue.isEmpty()) {
            Transaction t = queue.poll();
            Account from = findByIban(accounts, t.fromIban);
            Account to = findByIban(accounts, t.toIban);

            if (from != null && to != null) {
                from.withdraw(t.amount);
                to.deposit(t.amount);
            }
        }
    }
}