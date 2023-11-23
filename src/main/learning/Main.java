package learning;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        String text = "Good morning. Have a good class. " +
                "Have a good visit. Have fun!";

        Map<String, Integer> map = new TreeMap<>();

        String[] words = text.split("[\\s+\\p{P}]");

        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();

            if (key.length() > 0) {
                map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
            }
        }
        map.forEach((k, v) ->System.out.println(k + "\t" + v));
    }
}



