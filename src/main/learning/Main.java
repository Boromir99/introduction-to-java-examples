package learning;


public class Main {
    public static void main(String[] args) {

        reverseDisplay("12345");

    }

    public static void reverseDisplay(String value) {
        if (value.length() == 0)
            return;
        else {
            System.out.print(value.charAt(value.length() - 1));
            reverseDisplay(value.substring(0, value.length() - 1));
        }

    }
}
