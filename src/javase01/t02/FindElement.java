package javase01.t02;

import java.util.Scanner;

public class FindElement {
    private double eps;
    private double a;

    private int n;


    private FindElement(double eps) {
        this.eps = eps;
        this.n = 1;
    }

    private void findAndShowElems() {
        do {
            a = 1/Math.pow(n + 1, 2);
            System.out.println("a(" + n + ") = " + a);
            ++n;
        } while (a >= eps);
        System.out.println( "Number of the smallest element: " + (n - 1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an epsilon: ");
        double eps;
        do {
            eps = in.nextDouble();
            if (eps > 0) {
                FindElement test = new FindElement(eps);
                test.findAndShowElems();
            } else {
                System.out.println("Epsilon must be greater than 0!");
            }
        } while (eps <= 0);


    }
}
