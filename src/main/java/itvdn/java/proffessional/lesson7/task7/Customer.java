package itvdn.java.proffessional.lesson7.task7;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Account> accounts;

    private String firstName;
    private String lastName;

    public int getNumOfAccounts() {
        return numOfAccounts;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private int customerNumber;
    private static int customerNumberBase = 1000;
    private int numOfAccounts;

    public Customer(String firstName, String lastName) {
        accounts = new ArrayList<>();
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerNumber = customerNumberBase++;
        this.numOfAccounts = 0;
    }

    public Account getAccount(int accountNumber) {
        if (accountNumber < accounts.size() && numOfAccounts != 0) {
            return accounts.get(accountNumber);
        }
        return null;
    }

    @Override
    public String toString() {
        String s = "Customer: " +
                "fullName='" + lastName + ", " + firstName + '\'' +
                ", customerNumber=" + customerNumber +
                ", numOfAccounts=" + numOfAccounts +
                '}';

        // for add all accounts client
        for (int i = 0; i < this.numOfAccounts; i++) {
            if (getAccount(i) instanceof SavingsAccount) {
                s = s + "\n Savings Account with interest rate " + ((SavingsAccount) getAccount(i)).getInterestRate() + "%";
            } else {
                s = s + "\n Checking Account with overdraft $" + ((CheckingAccount) getAccount(i)).getOverdraftAmount();
            }
            s = s + ", balance $" + getAccount(i).getBalance();
        }

        return s;
    }

    public void addAccount(Account account) {
        accounts.add(account);
        numOfAccounts++;
    }
}
