package javase01.t04;

import java.util.Random;
import java.util.Scanner;

public class FindMaxPair {

    private int n;
    private double[] a;

    private FindMaxPair(int n) {
        this.n = n;
        this.a = new double[2 * n];
    }

    //Заполняем массив случайными действительными числами от 0 до 100
    private void fillAnArray() {
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextDouble() * 100;
        }
    }

    private void showArr() {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = %.3f%n", i, a[i]);
        }
    }

    private void findMaxSum() {
        double max = a[0] + a[a.length - 1];
        int elem = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] + a[a.length - (i + 1)] > max) {
                max = a[i] + a[a.length - (i + 1)];
                elem = i;
            }
        }
        System.out.printf("Max sum is a[%d] + a[%d] = %.3f%n",
                elem, a.length - elem - 1, a[elem] + a[a.length - elem - 1]);
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = in.nextInt();
        FindMaxPair test = new FindMaxPair(n);
        test.fillAnArray();
        test.showArr();
        test.findMaxSum();
    }
}
