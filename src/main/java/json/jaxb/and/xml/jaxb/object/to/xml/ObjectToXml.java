package json.jaxb.and.xml.jaxb.object.to.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;

public class ObjectToXml {
    public static void main(String[] args) throws Exception {
        JAXBContext contextObj = JAXBContext.newInstance(Question.class);

        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Answer ans1 = new Answer(101, "java is a programming language", "ravi");
        Answer ans2 = new Answer(102, "java is a platform", "john");

        ArrayList<Answer> list = new ArrayList<>();
        list.add(ans1);
        list.add(ans2);

        Question question = new Question(1, "What is java?", list);
        marshallerObj.marshal(question, new File("question.xml"));
    }
}
