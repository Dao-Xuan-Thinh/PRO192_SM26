import java.util.Scanner;

abstract class sEmployee {
    protected int id;
    protected String name;

    public sEmployee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public abstract double calculateSalary();

    public void output(){
        System.out.println(">> id: " +id);
        System.out.println(">> name: " +name);
        System.out.println(">> salary: " + calculateSalary());
    }
}

class PartTime extends sEmployee{
    protected double hourlyRate;
    protected int hoursWorked; 

    public PartTime(int id, String name, double hourlyRate, int hoursWorked){
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary(){
        return this.hourlyRate * this.hoursWorked;
    }

    @Override
    public void output(){
        super.output();
    }
}

class FullTime extends sEmployee{
    protected double monthlySalary;

    public FullTime(int id, String name, double monthlySalary){
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary(){
        return this.monthlySalary;
    }

    @Override
    public void output(){
        super.output();
    }
}

public class Employee{
    sEmployee emp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID - Name");
        System.out.print("> ");
        int id = sc.nextInt();
        System.out.println("");
        System.out.print(">");
        String name = sc.nextLine();
        System.out.print("Role > ");
        String role = sc.nextLine();

        if ("FullTime".equalsIgnoreCase(role)){
            System.out.print("Monthly Salary >");
            double temp = sc.nextDouble();
            FullTime ngu = new FullTime(id, name, temp);
            ngu.output();
            System.out.println("Salary >> " +ngu.calculateSalary());
        }

        else if ("PartTime".equalsIgnoreCase(role)){
            System.out.print("Hours Worked >");
            int temp1 = sc.nextInt();
            System.out.print("Hourly Rate >");
            double temp2 = sc.nextDouble();
            PartTime ngu = new PartTime(id, name, temp2, temp1);
            ngu.output();
            System.out.println("Salary >> " +ngu.calculateSalary());
        }
    }
}