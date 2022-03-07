package itvdn.java.proffessional.lesson8.task8;

public class CheckingAccount extends Account {
    private double overdraftAmount;

    public CheckingAccount(double initBalance, double overdraftAmount) {
        this.balance = initBalance;
        this.overdraftAmount = overdraftAmount;
    }

    public CheckingAccount(double initBalance) {
        this(initBalance, 0);
    }

    @Override
    public boolean withdraw(double amt) throws OverdraftException {
        if (amt <= balance + overdraftAmount) {
            balance = balance - amt;
            return true;
        }
        throw new OverdraftException("Error! Insuficient found", amt - balance - overdraftAmount);
    }

    public double getOverdraftAmount() {
        return overdraftAmount;
    }
}
