package learning;


public class Main {

    public static void main(String[] args) {

        int[] zeros = {0, 1, 0, 3, 12};
        moveZeros(zeros);

        for (int i : zeros) {
            System.out.print(i + " ");
        }
    }

    public static void moveZeros(int[] array) {
        int zeros = 0;

        for (int i = 0; i < array.length - zeros; i++) {
            if (array[i] == 0) {
                zeros++;
                for (int j = i; j < array.length - zeros; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - zeros] = 0;
            }
        }
    }
}



