package learning;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] words = {"avracadavra", "animal", "baseball", "coffee"};
        Random random = new Random();
        spanzuratoarea(words[random.nextInt(words.length)]);

    }

    static void spanzuratoarea(String word) {
        java.util.Scanner input = new Scanner(System.in);
        char[] letters = word.toCharArray();
        char[] duplicate = initialization(word);

        System.out.println();
        do {
            int x = 0;
            char c = input.next().charAt(0);
            for (int i = 0; i < letters.length - 1; i++) {
                if (c == letters[i]) {
                    duplicate[i] = c;
                    x++;
                }
            }
            if (x == 0)
                System.out.println("Wrong letter, try again");
            display(duplicate);
            System.out.println();
        } while (!Arrays.equals(duplicate, letters));

        System.out.println("Congratulations! The word is " + word);
    }

    static void display(char[] word) {
        for (char c : word) {
            System.out.print(c);
        }
    }

    static char[] initialization(String word) {
        char[] letters = word.toCharArray();
        char[] duplicate = new char[letters.length];

        duplicate[0] = letters[0];
        duplicate[letters.length - 1] = letters[letters.length - 1];
        for (int i = 2; i < letters.length; i++) {
            duplicate[i - 1] = '_';
        }
        for (int i = 1; i < letters.length; i++) {
            if (letters[0] == letters[i])
                duplicate[i] = letters[0];
            if (letters[letters.length - 1] == letters[i])
                duplicate[i] = letters[letters.length - 1];
        }
        display(duplicate);
        return duplicate;
    }
}
