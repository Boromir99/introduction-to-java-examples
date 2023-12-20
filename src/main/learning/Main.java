package learning;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 8, 6, 2, 30, 4, 8, 3, 9};
        System.out.println(container(arr));

    }

    public static int container(int[] arr) {
        int minArea;
        int maxArea = 0;
        int hMin;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    hMin = i;
                } else {
                    hMin = j;
                }
                int dist = j - i;
                minArea = arr[hMin] * dist;
                if (minArea > maxArea){
                    maxArea = minArea;
                }
            }
        }
        return maxArea;
    }
}



