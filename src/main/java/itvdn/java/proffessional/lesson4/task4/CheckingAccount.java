package itvdn.java.proffessional.lesson4.task4;

public class CheckingAccount extends Account {
    private double overdraftAmount;

    public CheckingAccount(double initBalance, double overdraftAmount) {
        this.balance = initBalance;
        this.overdraftAmount = overdraftAmount;
    }

    public CheckingAccount(double initBalance) {
        this(initBalance, 0);
    }

    public boolean withdraw(double amt) {
        if (amt <= balance + overdraftAmount) {
            balance = balance - amt;
            return true;
        }
        return false;
    }

    public double getOverdraftAmount() {
        return overdraftAmount;
    }
}
