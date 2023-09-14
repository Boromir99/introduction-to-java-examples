package learning;


public class Main {
    public static void main(String[] args) {


        System.out.print(order("erwoiajvaelbiru"));

    }
    static String order(String s){
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            for (int j = 1 + i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    char temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        return new String(array);
    }
}
