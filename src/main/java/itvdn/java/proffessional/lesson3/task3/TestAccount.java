package itvdn.java.proffessional.lesson3.task3;

/**
 * @author Khoren
 */
public class TestAccount {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        Customer firstCustomer = new Customer("John Doe");
        Customer secondCustomer = new Customer("Jane Doe");

        SavingsAccount johnSavings = new SavingsAccount(1000,5);
        CheckingAccount johnAccount = new CheckingAccount(5000,1000);
        CheckingAccount janeAccount = new CheckingAccount(500,100);
        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);
        myBank.addCustomer(firstCustomer);
        myBank.addCustomer(secondCustomer);

        System.out.println(myBank.getCustomer(0));
        myBank.getCustomer(0).getAccount(0).deposit(2000);
        myBank.getCustomer(0).getAccount(1).withdraw(5500);
        ((SavingsAccount)myBank.getCustomer(0).getAccount(0)).addInterestRate();

        System.out.println(myBank.getCustomer(0).getAccount(0).getBalance());
        System.out.println(myBank.getCustomer(0).getAccount(1).getBalance());

        System.out.println(myBank.getCustomer(1));

    }
}
