package Lab_3;
import java.util.Scanner;

public class lab3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap n > ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }

        int min = a[0];
        for(int x : a){
            if(min > x){
                min = x;
            }
        }

        System.out.println("So be nhat trong mang la: " + min);
    }
}
