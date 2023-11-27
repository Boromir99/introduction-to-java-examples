package learning;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> primeNumbers = new Stack<>();
        for (int i = 2; i < 5000; i++) {
            int count = 0;
            if (primeNumbers.size() < 50) {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0){
                    primeNumbers.push(i);
                }
            } else break;
        }
        System.out.println(primeNumbers);
    }
}



