package itvdn.java.proffessional.lesson7.task7;

/**
 * Bank Account class
 *
 * @author Khoren
 */
public class Account {
    protected double balance;

    /**
     * Constructor that provides initial balance
     *
     * @param balance a positive account balance
     */
    protected Account(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    /**
     * Default constructor that provides initial balance
     */
    public Account() {
        this.balance = 0;
    }

    /**
     * Method to add money to account
     *
     * @param amt a positive amount of money
     */
    public boolean deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            return true;
        }
        return false;
    }

    /**
     * Method to withdraw money
     *
     * @param amt a positive amount of money
     */
    public boolean withdraw(double amt) throws Exception {
        if (amt <= balance) {
            balance -= amt;
            return true;
        }
        return false;
    }

    /**
     * Method to check account balance
     *
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }
}
