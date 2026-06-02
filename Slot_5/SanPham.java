import java.util.Scanner;

public class SanPham {
    public String name;
    public double price;
    public double sale;
    public double tax = 0;

    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print(">> Ten san pham: ");
        this.name = sc.nextLine();
        System.out.print(">> Gia san pham: ");
        this.price = sc.nextDouble();
        System.out.print(">> Giam gia (%): ");
        this.sale = sc.nextDouble();
    }

    public void output(){
        System.out.println("Ten san pham: " +this.name);
        System.out.println("Gia san pham: " +this.price * (1 - this.sale/100));
        System.out.println("Thue san pham: " +this.tax);
    }

    public double Thue(){
        this.tax = this.price * 0.1;
        return tax;
    }

    public static void main(String[] args) {
           SanPham ngu = new SanPham();
           ngu.input();
           ngu.Thue();
           ngu.output();
    }
}
