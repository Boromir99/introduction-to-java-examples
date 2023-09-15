package learning;



public class Main {
    public static void main(String[] args) {

        String str = "papagal";
        String substr = "papa";
        System.out.print(find(str, substr));
    }

    static boolean find(String str, String substr) {

        for (int i = 0; i < str.length() - substr.length(); i++) {
            boolean match = true;
            for (int j = 0; j < substr.length(); j++) {
                if (str.charAt(i + j) != substr.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match)
                return true;
        }
        return false;
    }
}
