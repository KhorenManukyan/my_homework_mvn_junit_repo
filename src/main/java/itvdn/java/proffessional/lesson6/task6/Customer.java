package itvdn.java.proffessional.lesson6.task6;

public class Customer {
    private Account[] accounts;
    private String fullName;
    private int customerNumber;
    private static int customerNumberBase = 1000;
    private int numOfAccounts;

    public Customer(String fullName) {
        accounts = new Account[10];
        this.fullName = fullName;
        this.customerNumber = customerNumberBase++;
        this.numOfAccounts = 0;
    }

    public Account getAccount(int accountNumber) {
        if (accountNumber < accounts.length && numOfAccounts != 0) {
            return accounts[accountNumber];
        }
        return null;
    }

    @Override
    public String toString() {
        String s = "Customer: " +
                "fullName='" + fullName + '\'' +
                ", customerNumber=" + customerNumber +
                ", numOfAccounts=" + numOfAccounts +
                '}';

        // for add all accounts client
        for (int i = 0; i < this.numOfAccounts; i++) {
            Account account = getAccount(i);
            if (account instanceof SavingsAccount) {
                s = "\n\t" + (i + 1) + " Savings account interest rate %" + ((SavingsAccount) account).getInterestRate();
            } else {
                s = "\n\t" + (i + 1)  + " Checking account overdraft $" + ((CheckingAccount) account).getOverdraftAmount();
            }
            s = s + ", balance $" + account.getBalance();
        }

        s = s + "\n";
        return s;
    }

    public void addAccount(Account account) {
        accounts[numOfAccounts] = account;
        numOfAccounts++;
    }
}
