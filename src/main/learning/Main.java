package learning;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String string = input.next();
        String substring = input.next();
        System.out.print(indexMatched(string, substring));

    }

    public static int indexMatched(String string, String substring) {
        int index = 0;
        int count = 0;

        if (substring.length() > string.length()) {
            System.out.println("Substring is larger then the string");
            return 0;
        }
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < substring.length(); j++) {
                if (substring.charAt(j) == string.charAt(i + j)) {
                    count++;
                } else break;
            }
            if (count == substring.length())
                index = i;
            count = 0;
        }
        return index;
    }
}