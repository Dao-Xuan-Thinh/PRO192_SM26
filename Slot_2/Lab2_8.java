package Slot_2;
import java.util.Scanner;

public class Lab2_8 {
    static void solveQuadratic(double a, double b, double c) {
        // Handle degenerate case: equation becomes linear.
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Infinite solutions");
                } else {
                    System.out.println("No solution");
                }
            } else {
                double x = -c / b;
                System.out.println("One solution: x = " + x);
            }
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("No real solution");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Double root: x = " + x);
        } else {
            double sqrtDelta = Math.sqrt(delta);
            double x1 = (-b + sqrtDelta) / (2 * a);
            double x2 = (-b - sqrtDelta) / (2 * a);
            System.out.println("Two solutions: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        // Solves ax^2 + bx + c = 0.
        solveQuadratic(a, b, c);

        sc.close();
    }
}
