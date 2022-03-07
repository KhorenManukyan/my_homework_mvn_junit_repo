package itvdn.java.proffessional.lesson8.task8.com.mybank.data;

import itvdn.java.proffessional.lesson8.task8.Customer;
import itvdn.java.proffessional.lesson8.task8.Bank;
import itvdn.java.proffessional.lesson8.task8.CheckingAccount;
import itvdn.java.proffessional.lesson8.task8.SavingsAccount;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DataSource {
    private File dataFile;

    public DataSource(String dataFilePath) {
        dataFile = new File(String.valueOf(dataFilePath));
    }

    public void loadData() throws IOException {
        Scanner input = new Scanner(dataFile);
        Bank bank = Bank.getBank();

        Customer customer;

        int numOfCustomers = input.nextInt();
        for (int i = 0; i < numOfCustomers; i++) {
            String firstName = input.next();
            String lastName = input.next();
            bank.addCustomer(new Customer(firstName, lastName));
            customer = bank.getCustomer(i);

            int numOfAccounts = input.nextInt();
            while (numOfAccounts-- > 0) {
                char accountType = input.next().charAt(0);
                switch (accountType) {
                    case 'S': {
                        float initBalance = input.nextFloat();
                        float interestRate = input.nextFloat();
                        customer.addAccount(new SavingsAccount(initBalance, interestRate));
                        break;
                    }
                    case 'C': {
                        float initBalance = input.nextFloat();
                        float overdraftAmount = input.nextFloat();
                        customer.addAccount(new CheckingAccount(initBalance, overdraftAmount));
                        break;
                    }
                }
            }

        }
    }
}
