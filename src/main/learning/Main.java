package learning;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        DataOutputStream output =
                new DataOutputStream(new FileOutputStream("temp.dat"));

        // Write student test scores to the file
        output.writeUTF("John");
        output.writeDouble(85.5);
        output.writeUTF("Jim");
        output.writeDouble(185.5);
        output.writeUTF("George");
        output.writeDouble(105.25);

        DataInputStream input =
                new DataInputStream(new FileInputStream("temp.dat"));

        // Read student test scores from the file
        System.out.println(input.readUTF() + " " + input.readDouble());
        System.out.println(input.readUTF() + " " + input.readDouble());
        System.out.println(input.readUTF() + " " + input.readDouble());
    }
}
