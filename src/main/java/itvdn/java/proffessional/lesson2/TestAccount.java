package itvdn.java.proffessional.lesson2;

public class TestAccount {
    public static void main(String[] args) {
        Account myAccount = new Account(-255.06);
        System.out.println("Account balance is $"+ myAccount.getBalance());

        myAccount.deposit(120);
        myAccount.withdraw(120);
        myAccount.withdraw(400);
        System.out.println("Account balance is $"+ myAccount.getBalance());
    }
}
