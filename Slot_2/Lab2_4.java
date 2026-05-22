package Slot_2;
import java.util.Scanner;

public class Lab2_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a = sc.nextInt();

        System.out.println("Nhap so b: ");
        int b = sc.nextInt();

        if (a > b){
            System.out.println("So lon nhat la a: " + a);
        } 

        else if (a == b){
            System.out.println("Hai so bang nhau: " + a);
        }

        else{
            System.out.println("So lon nhat la b: " + b);
        }
    }
}
