package learning;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        primeNumber(1000000);
        desplayFile();

    }

    static void primeNumber(int maxNumber) throws IOException {
        int a = 0;

        try (FileOutputStream output = new FileOutputStream("temp.dat")){
            for (int i = 2; i <= maxNumber; i++) {
                for (int j = 2; j < i / 2; j++) {
                    a = i % j;
                    if (a == 0) {
                        break;
                    }
                }
                if (a != 0) {
                    output.write(i);
                }
                a = 0;
            }
        }
    }

    static void desplayFile() throws IOException {
        try(FileInputStream input = new FileInputStream("temp.dat")) {
            int value;
            while ((value = input.read()) != -1)
                System.out.print(value + " ");
        }
    }
}
