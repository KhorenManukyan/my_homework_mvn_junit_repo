package itvdn.java.proffessional.task.bank;

public class OverdraftException extends Exception {
    private double deficit;

    public OverdraftException(String message, double deficit) {
        super(message);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }
}
