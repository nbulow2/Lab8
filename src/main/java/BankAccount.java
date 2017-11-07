import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document tfgdfgdhis class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;
    public static int totalAccounts = 0;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        totalAccounts += 1;
    }

    public BankAccount() {

    }


    public double getBalance() {
        return accountBalance;
    }

    public void withdrawl(double amount) {
        accountBalance = accountBalance - amount;

    }

    public void deposit(double amount) {
        accountBalance = accountBalance + amount;

    }

    public void setName(String name) {
        ownerName = name;
    }
}