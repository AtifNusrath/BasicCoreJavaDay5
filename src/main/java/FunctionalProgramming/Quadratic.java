package FunctionalProgramming;

import java.util.Scanner;

public class Quadratic {
    public static void printQuadraticRoots(int aValue, int bValue, int cValue) {
        double delta = bValue * bValue - 4 * aValue * cValue;
        if (delta > 0) {
            double sqroot = Math.sqrt(delta);
            double root1 = (-bValue + sqroot) / (2.0 * aValue);
            double root2 = (-bValue - sqroot) / (2.0 * aValue);

            System.out.println(root1);
            System.out.println(root2);
        } else {
            System.out.println("Roots are imaginary");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quadratic Equation : ax^2+bx+c= ");
        System.out.println("Enter a Value: ");
        int aValue = sc.nextInt();

        System.out.println("Enter b Value: ");
        int bValue = sc.nextInt();

        System.out.println("Enter c Value: ");
        int cValue = sc.nextInt();

        printQuadraticRoots(aValue, bValue, cValue);

    }
}
