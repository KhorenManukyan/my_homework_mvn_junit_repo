package book.ocp.chapter2.page77;

//Lazy instantiation
public class VisitorTicketTracker {
    private static VisitorTicketTracker instance;
    private VisitorTicketTracker(){}

    public static VisitorTicketTracker getInstance(){
        if (instance == null){
            instance = new VisitorTicketTracker(); // Not thread-safe!
        }

        return instance;
    }

    // Data access methods
    // ...........
}
