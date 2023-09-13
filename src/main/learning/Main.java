package learning;


public class Main {
    public static void main(String[] args) {

        String[] stundents = {"Mihaela", "Geanina", "Robert"};
        int[] grades = {7, 10, 9};
        ordonare(stundents, grades);
        for (int i = 0; i < stundents.length; i++) {
            System.out.println(stundents[i]);
        }
    }

    static String[] ordonare(String[] students, int[] grades) {
        int minIndex = 0;

        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length; j++) {
                if (grades[j] > grades[j - 1])
                    minIndex = j;
            }
            String temp = students[i];
            students[i] = students[minIndex];
            students[minIndex] = temp;
        }
        return students;
    }
}
