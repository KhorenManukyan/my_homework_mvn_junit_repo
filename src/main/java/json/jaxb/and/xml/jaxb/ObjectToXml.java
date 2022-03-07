package json.jaxb.and.xml.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
//import java.io.FileOutputStream;

public class ObjectToXml {
    public static void main(String[] args) throws Exception {
         JAXBContext contextObj;

        contextObj = JAXBContext.newInstance(Employee.class);

        Marshaller marshallerObj = contextObj.createMarshaller();
//        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

//        Employee1 emp1 = new Employee1(1, "Vimal Jaiswal", 50000);
        marshallerObj.marshal(new Employee(1, "Vimal Jaiswal", 50000), new File("employee.xml"));

    }
}













