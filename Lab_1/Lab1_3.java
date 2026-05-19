package Lab_1;
import java.util.Scanner;

public class Lab1_3 {
    public static void main(String[] args) {
        float a, b, c, d;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Math: ");
        a = sc.nextFloat();

        System.out.println("Physics: ");
        b = sc.nextFloat();

        System.out.println("Chemistry: ");
        c = sc.nextFloat();

        d = (a + b + c) / 3;
        System.out.println("Average = " + d);
    }
}