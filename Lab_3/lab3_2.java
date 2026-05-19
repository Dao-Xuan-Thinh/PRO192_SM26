package Lab_3;
import java.util.Scanner;

public class lab3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scan.nextInt();
        int factorial = 1;

        for(int i = 1; i <= n; i++){
            factorial = factorial * i; 
        }

        System.out.print("Factorial: " + factorial);
    }
}
