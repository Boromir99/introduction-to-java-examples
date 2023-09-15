package learning;


import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[array.length - 1].length; j++) {
                int p = random.nextInt(2);
                if (p == 1)
                    array[i][j] = 1;
            }
        }
        for (int[] i : array) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }

        int largestRow = 0;
        int curentRow = 1;
        for (int i = 0; i < array[array.length - 1].length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == 1)
                    count++;
            }
            if (count > curentRow) {
                curentRow = count;
                largestRow = i + 1;
            }
        }
        System.out.println("The richest row is: " + largestRow);

        int largestCollum = 0;
        int curentCoollum = 1;
        for (int i = 0; i < array[array.length - 1].length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] == 1)
                    count++;
            }
            if (count > largestCollum) {
                curentCoollum = count;
                largestCollum = i + 1;
            }
        }
        System.out.println("The richest collum is: " + largestCollum);
    }
}