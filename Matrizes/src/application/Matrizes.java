package Matrizes.src.application;

import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] mat = new int[N][N]; // arranjo bidimensional 
        
        for (int i = 0; i < mat.length; i++) {
            for (int j=0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal Principal");
        for (int i = 0; i < N; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();

        int negNumber = 0;

        for (int i =0 ; i < mat.length; i++) {
            for (int j=0 ; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    negNumber++;
                }
            }
        }

        System.out.println("Números Negativos = " + negNumber);

        sc.close();
    }
    
}
