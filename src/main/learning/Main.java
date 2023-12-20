package learning;

public class Main {

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, -2, 1, -5, 4};
        System.out.println(subArray(nums));
    }

    public static int subArray(int[] arr) {
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int minSum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (minSum > maxSum) {
                    maxSum = minSum;
                }
                minSum += arr[j];

            }
        }
        return maxSum;
    }
}



