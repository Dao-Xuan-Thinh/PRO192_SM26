package Slot_3;
import java.util.Scanner;

public class lab3_3 {
    public static void main(String[] args) {
        int[] a = new int[5];
            Scanner scan = new Scanner(System.in);
            for(int i = 0; i < a.length; i++){
                System.out.printf("a[%d] = ", i);
                a[i] = scan.nextInt(); 
            }


        double sum = 0;
            for(int x : a){
                sum += x;
            }
        System.out.println("Tong: " + sum);    
        System.out.println();
    }
}
