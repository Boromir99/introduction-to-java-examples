package learning;


public class Main {

    public static void main(String[] args) {

        System.out.println(lengthOgLastWord("Hello World"));

    }

    public static int lengthOgLastWord(String s){
        int i = s.length() - 1, length = 0;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' '){
            length++;
            i--;
        }
        return length;
    }
}



