package itvdn.java.proffessional.lesson5.task5;


/**
 * @author Khoren
 */
public class TestAccount {
    public static void main(String[] args) {
        Bank bank = Bank.getBank();
        Bank otherBank = Bank.getBank();

        Customer firstCustomer = new Customer("John Doe");
        Customer secondCustomer = new Customer("Jane Doe");

        SavingsAccount johnSavings = new SavingsAccount(1000, 5);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);
        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);
        bank.addCustomer(firstCustomer);
        bank.addCustomer(secondCustomer);

        //sout both client
        displayCustomers(bank);

        bank.getCustomer(0).getAccount(0).deposit(2000);
        bank.getCustomer(0).getAccount(1).withdraw(5500);
        ((SavingsAccount) bank.getCustomer(0).getAccount(0)).addInterestRate();
//        System.out.println(" ");

        System.out.println(bank.getCustomer(0));
        System.out.println(bank.getCustomer(1));

        displayCustomers(bank);

    }

    private static void displayCustomers(Bank bank) {
        System.out.println(bank.getCustomer(0));
        System.out.println(bank.getCustomer(1));
    }
}
