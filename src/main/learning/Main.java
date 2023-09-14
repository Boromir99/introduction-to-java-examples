package learning;


public class Main {
    public static void main(String[] args) {

        int[] grades1 = {7, 10, 9, 4, 0, 4, 2, 5};
        int[] grades2 = {3, 11, 5};
        ordonare(grades1);
        ordonare(grades2);
        int[] imbinare = imbinare(grades1, grades2);
        for (int i = 0; i < grades1.length + grades2.length; i++) {
            System.out.print(imbinare[i] + " ");
        }
    }

    static int[] ordonare(int[] grades) {
        int minIndex = 0;

        for (int i = 0; i < grades.length; i++) {
            for (int j = 1; j < grades.length; j++) {
                if (grades[j] > grades[j - 1])
                    minIndex = j;
            }
            int temp = grades[i];
            grades[i] = grades[minIndex];
            grades[minIndex] = temp;
        }
        return grades;
    }

    static int[] imbinare(int[] list1, int[] list2){
        int[] imbinare = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, imbinare, 0, list1.length);
        System.arraycopy(list2, 0, imbinare, list1.length, list2.length);


        for (int i = 0; i < imbinare.length; i++) {
            int minIndex = i;

            for (int j = 1 + i; j < imbinare.length; j++) {
                if (imbinare[j] < imbinare[minIndex])
                    minIndex = j;
            }
            int temp = imbinare[i];
            imbinare[i] = imbinare[minIndex];
            imbinare[minIndex] = temp;
        }
        return imbinare;
    }
}
