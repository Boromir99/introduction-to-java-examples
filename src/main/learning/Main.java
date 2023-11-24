package learning;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\denis\\Desktop\\123.txt"));
        String line;

        Map<String, Integer> counting = new TreeMap<>();

        while ((line = reader.readLine()) != null) {
            String[] words = line.split("[\\s,+;.:?='\"(){}<>]+");

            for (String word : words) {
                String lowercaseWord = word.toLowerCase();
                counting.put(lowercaseWord, counting.getOrDefault(lowercaseWord, 0) + 1);

            }
        }
        // Print the first 5 entries and then start a new line
        int count = 0;
        for (Map.Entry<String, Integer> entry : counting.entrySet()) {
            System.out.print(entry.getKey() + " " + entry.getValue() + "   ");
            count++;
            if (count == 5) {
                System.out.println(); // Start a new line after the 5th entry
                count = 0;
            }
        }
        reader.close();
    }
}



