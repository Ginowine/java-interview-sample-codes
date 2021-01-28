package generaljavaexamples;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortTextFile {
    public static void main(String[] args) {

        //Create an ArrayList object to hold the lines of input file
        ArrayList<String> lines = new ArrayList<String>();

        try (
                BufferedReader reader = new BufferedReader(new FileReader("C:\\file.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\output.txt"));
        )
        {
            //Reading all the lines of input file one by one and adding them into ArrayList
            String currentLine = reader.readLine();

            while (currentLine != null) {
                lines.add(currentLine);
                currentLine = reader.readLine();
            }

            //Sorting the ArrayList
            Collections.sort(lines);

            //Writing sorted lines into output file
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
