package generaljavaexamples;

import java.io.FileWriter;
import java.io.IOException;

public class AppendTestToFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\Gino\\JavaSpringBootApplications\\demo.txt";
        String text = "Append new text";
        try (FileWriter fw = new FileWriter(path, true);) {
            fw.write(text);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
