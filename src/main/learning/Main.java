package learning;


public class Main {
    public static void main(String[] args) {

        System.out.printf("%-10s%-15s\n", "i", "m(i)");
        for (int i = 1; i <= 10; i++)
            System.out.printf("%-10d%-15.6f\n", i, m(i));
    }
    public static double m(int n){
        if (n == 0)
            return 1;
        else
            return m(n - 1) + 1.0 / n;
    }
}