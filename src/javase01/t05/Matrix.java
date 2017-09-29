package javase01.t05;

import java.util.Scanner;

public class Matrix {
    private int dim;
    private int[][] arrarr;

    private Matrix(int dim) {
        this.dim = dim;
        this.arrarr = new int[dim][dim];
    }

    private void makeSingleMatrix() {
        for (int i = 0; i < dim; i++) {
            arrarr[i][i] = 1;
            arrarr[i][dim - i - 1] = 1;
        }
    }

    private void showArr() {
        for (int i = 0; i < dim; i++) {
            System.out.println();
            for (int j = 0; j < dim; j++) {
                System.out.print(arrarr[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dim;
        do {
            System.out.print("Enter the dimension of the square matrix, it must be positve number: ");
            dim = in.nextInt();
        } while (dim <= 0);
        Matrix mtx = new Matrix(dim);
        mtx.makeSingleMatrix();
        mtx.showArr();
    }
}
