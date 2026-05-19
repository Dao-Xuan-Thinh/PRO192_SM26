package Lab_2;
import java.util.Scanner;

public class Lab2_6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a = sc.nextInt();

        System.out.println("Nhap so b: ");
        int b = sc.nextInt();

        System.out.println("Nhap so c: ");
        int c = sc.nextInt();
        
        int max = a;

        if (max < b && max > c){
            max = b;
        }

        else if (max > b && max < c){
            max = c;
        }

        else if (max < b && max < c){
            if (b < c){
                max = c;
            }
            else{
                max = b;
            }
        }

        System.out.println("So lon nhat la " + max);
    }
}
