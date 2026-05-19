package Lab_1;
import java.util.Scanner;

public class Lab1_1 {
    public static void main(String[] args) {
        float a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for a:");
        a = sc.nextFloat();

        System.out.println("Enter value for b:");
        b = sc.nextFloat();

        c = a + b;
        System.out.println("a + b = " + c);
    }
}