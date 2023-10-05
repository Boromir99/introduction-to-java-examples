package learning;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        java.util.Scanner input = new Scanner(System.in);
        String string = input.next();
        subStr(string);

    }

    public static void subStr(String string) {
        int j1 = 0;
        int j2 = 0;
        int count = 0;
        int higher = 0;

        for (int i = 0; i < string.length() - 1; i++) {

            if (string.charAt(i) >= string.charAt(i + 1)) {
                j1 = i + 1;
                count = 0;
            } else {
                j2 = i + 1;
                count++;
            }
            if (count > higher) {
                higher = count;
            }
        }

        if (count == higher) {
            for (int i = j1; i <= j2; i++) {
                System.out.print(string.charAt(i));
            }
        } else {
            for (int i = j1 - higher - 1; i <= j2 - higher; i++) {
                System.out.print(string.charAt(i));
            }
        }
    }
}