package test_bank;

/**
 * A class to represent a single bank account.
 * @author cs302
 */
public class BankAccount {

    private double balance;
    private int accountNumber;

    public BankAccount(double initialBalance, int accountNumber) {

        if (initialBalance < 0) {
            throw new IllegalArgumentException(
                    "Accounts with a negative balance cannot be created!");
        }
    
        balance = initialBalance;
        this.accountNumber = accountNumber;
        if(accountNumber < 10000 || accountNumber > 99999) {
        	throw new IllegalArgumentException(
                    "Account number must be 5 digits!!!");
        }
        
    }

    /**
     * Deposits money into the BankAccount
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException(
                    "Don't deposit negative amounts!");
        }
        balance = balance + amount;
    }

    //************
    //*  TASK 3  *
    //************
    /**
     * Withdraws money from the BankAccount
     *
     * @param amount the amount to withdraw
     */
    //TODO TASK 3: add code to throw our new exception if an overdraw is attempted
    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount < 0) {
            throw new IllegalArgumentException(
                    "Don't withdraw a negative amount!");
        }
        
        if(balance < amount) {
        	throw new InsufficientFundsException( "You can't withdraw more than you have!");
        }
        else balance = balance - amount;
    }

    /**
     * Gets the current balance of the BankAccount
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Gets the account number of the BankAccount
     * @return the account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Returns a string representation this BankAccount in
     * the following format, e.g. 12345 $100.52 where 12345
     * is the account number, and 100.52 is the balance.
     */
    public String toString () {
        return "" + accountNumber + " $" + balance;
    }
}
