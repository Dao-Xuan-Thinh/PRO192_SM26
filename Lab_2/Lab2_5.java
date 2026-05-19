package Lab_2;
import java.util.Scanner;

public class Lab2_5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so gio: ");
        float hour = sc.nextFloat();

        System.out.println("Nhap so tien hang tieng: ");
        float wage = sc.nextFloat();

        if(hour <= 40){
            double total = hour * wage;
            System.out.println("Tong tien luong la: " + total);
        }

        else{
            double total = (hour - 40) * (wage * 1.5) + 40 * wage;
            System.out.println("Tong tien luong la: " + total);   
        }
    }    
}
