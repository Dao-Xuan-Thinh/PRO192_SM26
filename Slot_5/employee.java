import java.util.Scanner;

public class employee {
    public String fullname;
    public double salary;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print(">> Full Name: ");
        this.fullname = sc.nextLine();

        System.out.print(">> Salary: ");
        this.salary = sc.nextDouble();
    }

    public void output(){
        System.out.println("--OUTPUT--");
        System.out.println(this.fullname);
        System.out.println(this.salary);        
    }

    public static void main(String[] args) {
        employee ngu = new employee();
        ngu.input();
        ngu.output();
    }
}
