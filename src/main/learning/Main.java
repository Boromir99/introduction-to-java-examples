package learning;


public class Main {
    public static void main(String[] args) {
        int character = 0;
        int number = 0;

        String password = "Georgica78";

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i))) {
                character++;
            } else if (Character.isDigit(password.charAt(i))) {
                number++;
            } else {
                System.out.println("Invalid password");
                break;
            }
        }
        if (character + number < 8)
            System.out.println("To short");
        else if (number < 2)
            System.out.println("To few digits");
        else System.out.println("Is Valid");
    }
}
