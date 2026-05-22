package Slot_3;
import java.util.Arrays;
import java.util.Scanner;

public class lab3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap n > ");
        int n = sc.nextInt();

        float[] a = new float[n];

        for(int i = 0; i < n; i++){
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextFloat();
        }

        float max = a[0];
        for(float x : a){
            if(max < x){
                max = x;
            }
        }

        Arrays.sort(a);
        System.out.printf("Mang sau khi sort la: ");
        for(float x : a){
            System.out.printf("%.1f ", x);
        }

        System.out.println();
        System.out.println("So lon nhat trong mang la: " + max);
    }
}
