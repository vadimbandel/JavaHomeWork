package javase01.t02;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an epsilon: ");
        double eps = in.nextDouble(); //Enter an epsilon
        int n = 1;
        double a;
        if (eps > 0) {
             do {
                a = 1/Math.pow(n + 1, 2);
                System.out.println("a(" + n + ") = " + a);
                 ++n;
            } while (a >= eps);
            System.out.println( "Number of the smallest element: " + (n - 1));
        } else {
            System.out.println("Epsilon must be greater than 0!");
        }

    }
}
