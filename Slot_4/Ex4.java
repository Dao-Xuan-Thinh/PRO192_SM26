import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Nhap ten nguoi dung: ");
        String username = sc.nextLine();

        System.out.printf("Nhap Mat Khau: ");
        String password = sc.nextLine();

        if(username.equalsIgnoreCase("hello") && password.length() > 6){
            System.out.println("Dang nhap thanh cong!!");
        }

        else {
            System.out.println("Dang nhap khong thanh cong :c");
        }
    }
}