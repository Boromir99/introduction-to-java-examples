package learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] matrice1 = initializareMatrice();
        int[][] matrice2 = initializareMatrice();
        afisareMatrice(matrice1);
        afisareMatrice(matrice2);
        adunareMatrici(matrice1, matrice2);
        inmultireMatrici(matrice1, matrice2);

    }

    static int[][] initializareMatrice() {
        java.util.Scanner input = new Scanner(System.in);
        int ordin;

        //Determinam ordinul matricei ce urmeaza sa fie implementata
        //Dorim sa fie minim ordin 2
        do {
            System.out.print("Scrieti de ce ordin este matricea: ");
            ordin = input.nextInt();
            if (ordin < 2)
                System.out.println("Ordinul matricii trebuie sa fie minim 2");
        } while (ordin < 2);
        int[][] matrice = new int[ordin][ordin];

        //Scriem elementele unei matrici
        for (int i = 0; i < ordin; i++) {
            for (int j = 0; j < ordin; j++) {
                System.out.print("Definiti matricea [" + i + "]" + "[" + j + "]: ");
                matrice[i][j] = input.nextInt();
            }
        }
        return matrice;
    }

    static void afisareMatrice(int[][] matrice) {
        for (int[] i : matrice) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int[][] adunareMatrici(int[][] matrice1, int[][] matrice2) {

        int[][] adunare = new int[matrice1.length][matrice1.length];
        if (egal(matrice1, matrice2)) {

            //Adunam matricile
            for (int i = 0; i < matrice1.length; i++) {
                for (int j = 0; j < matrice1.length; j++) {
                    adunare[i][j] = matrice1[i][j] + matrice2[i][j];
                }
            }
            //Afisam suma
            System.out.println("Suma matricilor este: ");
            for (int[] i : adunare) {
                for (int j : i) {
                    System.out.print(j + "\t");
                }
                System.out.println();
            }
            return adunare;
        } else System.out.println("Matricile nu sunt de acelasi ordin");
        return null;
    }

    static boolean egal(int[][] matrice1, int[][] matrice2) {

        //Verificam daca randurile sunt egale in lungime
        if (matrice1.length != matrice2.length)
            return false;

        //Verificam daca coloanele sunt egale in lungime
        for (int i = 0; i < matrice1.length; i++) {
            if (matrice1[i].length != matrice2[i].length)
                return false;
        }
        return true;
    }

    static int[][] inmultireMatrici(int[][] matrice1, int[][] matrice2) {
        if (egal(matrice1, matrice2)) {
            int[][] produs = new int[matrice1.length][matrice1.length];

            //Inmultim matricile
            for (int i = 0; i < matrice1.length; i++) {
                for (int j = 0; j < matrice1.length; j++) {
                    for (int k = 0; k < matrice1.length; k++) {
                        produs[i][j] += matrice1[i][k] * matrice2[k][j];
                    }
                }
            }

            //Afisam produsul
            System.out.println("Produsul matricilor este: ");
            for (int[] i : produs) {
                for (int j : i) {
                    System.out.print(j + "\t");
                }
                System.out.println();
            }
            return produs;
        }
        return null;
    }
}
