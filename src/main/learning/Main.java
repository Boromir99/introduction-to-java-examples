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
        for (String name : setWriter) {
            writer.write(" " + name);
        }
        writer.close();

        /////////////////////////////////////////////////////////////////////
        Set<Character> vowels = new TreeSet<>();

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\denis\\Desktop\\output.txt"));

        HashSet<Character> hashSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        int character;
        int countV = 0, countC = 0;
        while ((character = reader.read()) != -1) {
            char charValue = Character.toLowerCase((char) character);

            if (hashSet.contains(charValue)) {
                vowels.add(charValue);
                countV++;
            }
            else countC++;
        }
        System.out.print(vowels + "\nvowels " + countV + "\nconsonants " + countC);
        reader.close();
    }
}



