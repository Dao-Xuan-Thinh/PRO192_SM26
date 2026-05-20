import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nhap so 1: ");
        float a = sc.nextFloat();

        System.out.printf("Nhap so 2: ");
        float b = sc.nextFloat();

        sc = new Scanner(System.in);

        System.out.printf("Nhap op (+-*/): ");
        String op = sc.nextLine();

        if(op.equals("+")){
            System.out.println("Ket qua cua: "+ a+ op+ b +" = "+(a+b));
        }

        else if (op.equals("-")){
            System.out.println("Ket qua cua: "+ a+ op+ b +" = "+(a-b));
        }
        
        else if (op.equals("*")){
            System.out.println("Ket qua cua: "+ a+ op+ b +" = "+(a*b));
        }

        else if (op.equals("/")){
            System.out.println("Ket qua cua: "+ a+ op+ b +" = "+(a/b));
        }
    }    
}
