import java.util.*;

// ----------------------------
// Custom Exception 1
// ----------------------------
class InvalidAccountException extends Exception {
    public InvalidAccountException() {
        super("Invalid account number");
    }

    public InvalidAccountException(String msg) {
        super(msg);
    }
}

// ----------------------------
// Custom Exception 2
// ----------------------------
class DailyLimitExceededException extends Exception {
    public DailyLimitExceededException() {
        super("Daily transaction limit exceeded");
    }

    public DailyLimitExceededException(String msg) {
        super(msg);
    }
}

// ----------------------------
// Custom Exception 3
// ----------------------------
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        super("Insufficient balance in the account");
    }

    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

// ------------------------------------------------------------
// Main Transaction System
// ------------------------------------------------------------
class OnlineTransactionSystem {

    private double balance;
    private double dailyLimit;
    private String accountNumber;

    public OnlineTransactionSystem(String accountNumber, double balance, double dailyLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dailyLimit = dailyLimit;
    }

    public void processTransaction(String accNo, double amount)
            throws InvalidAccountException, DailyLimitExceededException, InsufficientBalanceException {

        // 1. Validate account number
        if (!accNo.equals(this.accountNumber)) {
            throw new InvalidAccountException("Account number does not match our records");
        }

        // 2. Check daily limit
        if (amount > dailyLimit) {
            throw new DailyLimitExceededException("Amount exceeds your daily transaction limit");
        }

        // 3. Check sufficient balance
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance to complete the transaction");
        }

        // If everything is fine → complete transaction
        balance -= amount;
        System.out.println("Transaction successful! Remaining balance: " + balance);
    }
}

// ------------------------------------------------------------
// DEMO CLASS (Main)
// ------------------------------------------------------------
public class Lab11_2 {
    public static void main(String[] args) {

        OnlineTransactionSystem user =
                new OnlineTransactionSystem("ACC123", 5000, 2000);

        // ----------------------------
        // 1. Test InvalidAccountException
        // ----------------------------
        try {
            System.out.println("Testing InvalidAccountException:");
            user.processTransaction("ACC999", 1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // ----------------------------
        // 2. Test DailyLimitExceededException
        // ----------------------------
        try {
            System.out.println("\nTesting DailyLimitExceededException:");
            user.processTransaction("ACC123", 3000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // ----------------------------
        // 3. Test InsufficientBalanceException
        // ----------------------------
        try {
            System.out.println("\nTesting InsufficientBalanceException:");
            user.processTransaction("ACC123", 6000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // ----------------------------
        // 4. A successful transaction
        // ----------------------------
        try {
            System.out.println("\nTesting Successful Transaction:");
            user.processTransaction("ACC123", 1500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
