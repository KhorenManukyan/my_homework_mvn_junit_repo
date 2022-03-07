package itvdn.java.proffessional.lesson2;

/**
 * Worker class for lennon2
 * @author Khoren
 */
public class Quotation {

    /**
     * Displays author name and quotation on the new line with indent
     * @param author name of the author
     * @param quotation text of quotation
     */
    public static void displayQuotation(String author, String quotation){
        System.out.println(author + " say: \n\t'" + quotation +".'"); // display quotation on a new line with indent
    }
}
