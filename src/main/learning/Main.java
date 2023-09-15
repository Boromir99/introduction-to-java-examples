package learning;


public class Main {
    public static void main(String[] args) {

        int baza10 = 602;
        baza2(baza10);

        int[] baza2 = {1, 0, 0, 1, 0, 1, 1, 0, 1, 0};
        baza10(baza2);
    }

    static int[] baza2(int baza10) {

        int size = 100;
        int[] baza2Inversa = new int[size];
        int index = 0;

        while (baza10 != 0) {
            baza2Inversa[index] = baza10 % 2;
            baza10 /= 2;
            index++;
        }
        int[] baza2 = new int[index];
        for (int i = 0; i < baza2.length; i++) {
            baza2[i] = baza2Inversa[index - 1];
            index--;
            System.out.print(baza2[i]);
        }
        System.out.println();
        return baza2;
    }

    static void baza10(int[] baza2) {
        int baza10 = 0;
        for (int i = 0; i < baza2.length; i++) {
            int doiLaPutere = (int) Math.pow(2, baza2.length - i - 1);
            if (baza2[i] == 1) baza10 += doiLaPutere;

        }
        System.out.print(baza10);
    }
}