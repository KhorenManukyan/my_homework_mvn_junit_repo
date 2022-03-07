package json.jaxb.and.xml.jaxb.object.to.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Question {
    private int id;
    private String questionName;
    private List<Answer> answer;

    public Question() {
    }

    public Question(int id, String questionName, List<Answer> answer) {
        super();
        this.id = id;
        this.questionName = questionName;
        this.answer = answer;


    }

    @XmlAttribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    @XmlElement
    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }
}
