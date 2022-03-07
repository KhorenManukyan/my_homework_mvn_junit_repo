package itvdn.java.proffessional.lesson4.task4;

/**
 * @author Khoren
 */
public class TestAccount {
    public static void main(String[] args) {

        Customer firstCustomer = new Customer("John Doe");
        Customer secondCustomer = new Customer("Jane Doe");

        SavingsAccount johnSavings = new SavingsAccount(1000, 5);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount janeAccount = new CheckingAccount(500, 100);
        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(janeAccount);
        Bank.addCustomer(firstCustomer);
        Bank.addCustomer(secondCustomer);

        //sout both client
        System.out.println(Bank.getCustomer(0));
        System.out.println(Bank.getCustomer(1));

        Bank.getCustomer(0).getAccount(0).deposit(2000);
        Bank.getCustomer(0).getAccount(1).withdraw(5500);
        ((SavingsAccount)Bank.getCustomer(0).getAccount(0)).addInterestRate();
//        System.out.println(" ");

        System.out.println(Bank.getCustomer(0));
        System.out.println(Bank.getCustomer(1));


    }
}
