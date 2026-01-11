package bank;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;

/*
 Represents a bank account belonging to a specific user.
 Each account has a unique IBAN, a balance, and an associated user ID.
 */
public class Account implements Serializable {

    private String iban;
    private BigDecimal balance;
    private String userId;

    public Account(String userId) {
        this.iban = UUID.randomUUID().toString().substring(0, 8);
        this.balance = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_UP);
        this.userId = userId;
    }

    public String getIban() {
        return iban;
    }

    public String getUserId() {
        return userId;
    }

    public BigDecimal getBalance() {
        return balance.setScale(2, RoundingMode.HALF_UP);
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount).setScale(2, RoundingMode.HALF_UP);
    }

    public int withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) < 0) {
            return 1; // insufficient funds
        }
        balance = balance.subtract(amount).setScale(2, RoundingMode.HALF_UP);
        return 0;
    }
}