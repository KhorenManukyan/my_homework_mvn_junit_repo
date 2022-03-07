package itvdn.java.proffessional.lesson6.task6;


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
        try {
            bank.getCustomer(0).getAccount(1).withdraw(7500);
        } catch (OverdraftException e) {
            System.out.println(e.getMessage() + ": $" + e.getDeficit() + "!\n");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

        ((SavingsAccount) bank.getCustomer(0).getAccount(0)).addInterestRate();
//        System.out.println(" ");

        displayCustomers(bank);

    }

    private static void displayCustomers(Bank bank) {
        System.out.println(bank.getCustomer(0));
        System.out.println(bank.getCustomer(1));
    }
}
