package itvdn.java.proffessional.lesson6.task6;

public class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(double initBalance, double interestRate) {
        this.balance = initBalance;
        this.interestRate = interestRate;
    }

    public void addInterestRate() {
        this.balance = this.balance * this.balance * interestRate / 100;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
