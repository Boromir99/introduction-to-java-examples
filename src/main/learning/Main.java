package learning;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[]{8, 32, 64, 8};

        int commonNumber = numbers[0];
        for (int i = 1; i < numbers.length - 1; i++) {
            commonNumber = gcd(commonNumber, numbers[i]);

        }
        System.out.println(commonNumber);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
