package Lab_3;
import java.util.Scanner;

public class lab3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scan.nextInt();

        int total = 0;
        for(int i = 0; i <= n; i++){
            total = total + i;
        }

        System.out.println("Tong la: " + total);
    }
}
