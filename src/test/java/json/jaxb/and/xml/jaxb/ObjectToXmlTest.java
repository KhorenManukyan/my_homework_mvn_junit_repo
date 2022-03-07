package json.jaxb.and.xml.jaxb;

import json.jaxb.and.xml.jaxb.Employee;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class ObjectToXmlTest {
    private JAXBContext context;


    @Before
    public void init() throws JAXBException {
        this.context = JAXBContext.newInstance(Employee.class);
    }

    @Test
    public void serialization() throws JAXBException {
        Marshaller marshaller = this.context.createMarshaller();
        marshaller.marshal(new Employee(1, "Vimal Jaiswal", 50000), new File("employee.xml"));
    }

}
