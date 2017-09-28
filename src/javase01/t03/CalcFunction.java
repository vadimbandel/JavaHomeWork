package javase01.t03;

import java.util.Scanner;

public class CalcFunction {
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
        System.out.println("x | f(x)");

        for (;a < b; a+=h){
            System.out.println(a + " | " + (Math.tan(2*a) - 3));
        }
        System.out.println(b + " | " + (Math.tan(2*a) - 3));

    }

}
