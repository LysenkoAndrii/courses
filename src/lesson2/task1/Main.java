package lesson2.task1;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.Reader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;


/**
 * Created by admin on 27.07.2015.
 */
public class Main {
    public static void main(String[] args) {
        try {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            File file = new File(".\\src\\lesson2\\task1\\json.txt");
            Reader reader = new BufferedReader(new FileReader(file));
            Json json = gson.fromJson(reader, Json.class);
            json.print();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
