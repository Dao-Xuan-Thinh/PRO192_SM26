package Slot_2;
import java.util.Scanner;

public class Lab2_7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap diem: ");
        float grade = sc.nextFloat();

        if(grade >= 9){
            System.out.println("Excellent");
        }

        else if(grade >= 7 && grade < 9){
            System.out.println("Good");
        }

        else if(grade >= 6 && grade < 7){
            System.out.println("Medium");
        }

        else if(grade >= 5 && grade < 6){
            System.out.println("Average");
        } 

        else if(grade >= 0 && grade < 5){
            System.out.println("Weak");
        }

        else{
            System.out.println("Invalid Score");
        }
    }
}
