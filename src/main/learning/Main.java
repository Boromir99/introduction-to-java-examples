package learning;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        java.util.Scanner input = new Scanner(System.in);
        String string = input.next();
        subStr(string);

    }

    public static void subStr(String string) {
        int subStrindexStart = 0;
        int subStrIndexEnd = 0;
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            int j;
            for (j = 0; i + j < string.length() - 1; j++) {
                if (string.charAt(i + j) >= string.charAt(i + j + 1)) {
                    break;
                }
            }
            if (j > count) {
                count = j;
                subStrindexStart = i;
                subStrIndexEnd = subStrindexStart + count;
                i += j;
            }
        }

        for (int i = subStrindexStart; i <= subStrIndexEnd; i++) {
            System.out.print(string.charAt(i));
        }
    }
}