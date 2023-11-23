package learning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        String[] names = {"George", "Jim", "John", "Blake", "Kevin", "Michael",
                "George", "Katie", "Kevin", "Michelle", "Ryan"};

        Set<String> setWriter = new TreeSet<>(Arrays.asList(names));

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\denis\\Desktop\\output.txt"));
        for (String name: setWriter){
            writer.write(" " + name);
        }
        writer.close();

        /////////////////////////////////////////////////////////////////////

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\denis\\Desktop\\output.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}



