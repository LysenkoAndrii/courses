package lesson2.task2;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by admin on 27.07.2015.
 */
@XmlRootElement(name = "trains")
public class Trains {
    @XmlElement(name = "train")
    private List<Train> trains = new ArrayList<>();

    /*
     * Prints exclusively those trains that have departure time in range of
     * arguments. In other words, prints train's info if and only if train's
     * departure time is more than or equal to <code>start</code> and less than
     * or equal to <code>end</code>
     * Input time format must represent hour:minute value separated by a colon
     *
     * @param   start     start time
     * @param   end       end time
     */
    public void print(String start, String end) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        String currentDate = format.format(new Date());
        for (Train train : trains) {
            String dep = train.getDeparture();
            String date = train.getDate();
            boolean b = currentDate.equals(date) &&
                    start.compareTo(dep) <= 0 &&
                    end.compareTo(dep) >= 0;
            if (b)
                System.out.println(train.toString());
        }
    }
}
