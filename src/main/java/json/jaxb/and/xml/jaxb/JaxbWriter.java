package json.jaxb.and.xml.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbWriter {
    public static void main(String[] args) throws JAXBException {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Max");
        customer.setAge(29);

        File file = new File("C:\\apps\\IdeaProjects\\my_mvn_junit_repo\\src\\main\\java\\json\\jaxb\\and\\xml\\jaxb\\file.xml");
        JAXBContext context = JAXBContext.newInstance(Customer.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(context,file);
        marshaller.marshal(context, System.out);
    }
}
