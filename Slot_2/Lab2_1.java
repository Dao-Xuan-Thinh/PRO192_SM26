package Slot_2;
import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so a: ");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println(a + " la so chan");
        } else {
            System.out.println(a + " la so le");
        }
    }
}
