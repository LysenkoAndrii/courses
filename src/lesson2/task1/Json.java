package lesson2.task1;


import java.util.Arrays;

/**
 * Created by admin on 28.07.2015.
 */
public class Json {
    private String name;
    private String surname;
    private String[] phones;
    private String[] sites;
    private Address address = new Address();

    private static class Address {
        String country;
        String city;
        String street;

        @Override
        public String toString() {
            return String.format("%s, %s, %s", country, city, street);
        }
    }

    public void print() {
        String out = String.format("%s %s; phones%s; sites%s; address: %s",
                name, surname, Arrays.toString(phones), Arrays.toString(sites),
                address.toString());
        System.out.println(out);
    }
}
