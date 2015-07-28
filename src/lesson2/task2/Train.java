package lesson2.task2;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;


/**
 * Created by admin on 27.07.2015.
 */
@XmlRootElement(name = "train")
public class Train {
    @XmlAttribute
    private int id;
    @XmlElement
    private String from;
    @XmlElement
    private String to;
    @XmlElement
    private String date;
    @XmlElement
    private String departure;

    public String getDeparture() { return departure; }

    public String getDate() { return date; }

    @Override
    public String toString() {
        return String.format("#%d: %s - %s on %s at %s", id, from, to, date,
                departure);
    }
}
