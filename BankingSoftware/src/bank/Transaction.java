package bank;

import java.io.Serializable;
import java.math.BigDecimal;

/*
 Represents a banking transaction such as a transfer, deposit, or withdrawal.
 Stores the operation type, amount, and the involved IBANs.
 */
public class Transaction implements Serializable {
    public String operationCode;
    public BigDecimal amount;
    public String fromIban;
    public String toIban;

    public Transaction(String code, BigDecimal  amount, String from, String to) {
        this.operationCode = code;
        this.amount = amount;
        this.fromIban = from;
        this.toIban = to;
    }
}
