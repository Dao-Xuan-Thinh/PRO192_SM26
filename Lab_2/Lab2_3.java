package Lab_2;
import java.util.Scanner;

public class Lab2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a = sc.nextInt();

        System.out.println("Nhap so b: ");
        int b = sc.nextInt();

        int c = b;
        b = a;
        a = c;

        System.out.println("Sau khi hoan doi: a = " + a + ", b = " + b);
    }
}
