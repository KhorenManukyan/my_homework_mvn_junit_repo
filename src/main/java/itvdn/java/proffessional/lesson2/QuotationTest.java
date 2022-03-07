package itvdn.java.proffessional.lesson2;

/**
 * Test class for lennon2
 * @author Khoren
 */
public class QuotationTest {
    /**
     * Uses Quotation class to display quotation
     * @see Quotation#displayQuotation(String, String)
     */
    public static void main(String[] args) {
        Quotation.displayQuotation("Confucius", " wherever you go, go with all your heart ");
        Quotation.displayQuotation(args[0], args[1]);
    }
}
