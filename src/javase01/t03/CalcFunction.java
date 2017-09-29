package javase01.t03;

import java.util.Scanner;

public class CalcFunction {
    private double a;
    private double b;
    private double h;

    private CalcFunction(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    private void ShowFunc() {
        System.out.println("x | f(x)");
        for (; a < b; a += h) {
            System.out.printf("%.3f | %.3f%n", a, (Math.tan(2 * a) - 3));
        }
        System.out.printf("%.3f | %.3f%n", b, (Math.tan(2 * b) - 3));
    }

    public static void main(String[] args) {
        double a;
        double b;
        double h;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter left border a: ");
        a = in.nextDouble();
        do {
            System.out.print("Enter left border b, must be greater than a: ");
            b = in.nextDouble();
        } while (b <= a);

        do {
            System.out.print("Enter step h, must be greater than 0: ");
            h = in.nextDouble();
        } while (h <= 0);
        CalcFunction test = new CalcFunction(a, b, h);
        test.ShowFunc();


    }

}
