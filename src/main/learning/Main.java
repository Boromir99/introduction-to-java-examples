package learning;

public class Main {

    public static void main(String[] args) {

        System.out.println(happyNumber(19));
    }

    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            n = n / 10;
        }
        return sum;
    }

    public static boolean happyNumber(int n) {
        if (n < 0) {
            return false;
        }

        int slowSum = n;
        int fastSum = sumOfSquares(slowSum);
        if (slowSum == 1 && fastSum == 1) {
            return true;
        }

        while (slowSum != fastSum) {
            slowSum = sumOfSquares(slowSum);
            fastSum = sumOfSquares(sumOfSquares(fastSum));
            if (slowSum == 1 || fastSum == 1) {
                return true;
            }
        }
        return false;
    }
}



