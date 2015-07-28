package lesson2.task2;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBException;
import java.io.File;


public class Main {

    public static void main(String[] args) {
	    File file = new File(".\\src\\lesson2\\task2\\newSchedule.xml");
        try {
            JAXBContext jaxb = JAXBContext.newInstance(Trains.class);
            Unmarshaller unmarsh = jaxb.createUnmarshaller();
            Trains trains = (Trains) unmarsh.unmarshal(file);
            String startTime = "15:05";
            String endTime = "19:05";
            trains.print(startTime, endTime);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
