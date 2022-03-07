package itvdn.java.proffessional.lesson3.task3;

public class Bank {
    private Customer[] customers;
    private int numOfClients;

    public Bank() {
        customers = new Customer[1000];
        numOfClients = 0;
    }

    public Customer getCustomer(int customerNumber) {
        if (customerNumber < customers.length) {
            return customers[customerNumber];
        }
        return null;
    }

    public void addCustomer(Customer newCustomer) {
        customers[numOfClients] = newCustomer;
        numOfClients++;
    }
}
