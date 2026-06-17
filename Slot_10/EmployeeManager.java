package Slot_10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    String code, name;
    double salary;

    public Employee(String code, String name, double salary){
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return code + ", " + name + ", " + salary;
    }
}

public class EmployeeManager{
    private static final String FILE_NAME = "employees.txt";
    private static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        loadFromFile();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\nEmployee Manager System");
            System.out.println("1. Add Employee");
            System.out.println("2. List Employees");
            System.out.println("3. Save to File");
            System.out.println("4. Quit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: addEmployee(sc); break;
                case 2: listEmployees(); break;
                case 3: saveToFile(); break;
                case 4: System.out.println("Existing..."); break;
                default: System.out.println("Invalid chocie");
            }
        } while (choice != 4);
    }
    private static void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;
    
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    employees.add(new Employee(parts[0], parts[1], Double.parseDouble(parts[2])));
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }
    
    private static void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Employee emp : employees) {
                bw.write(emp.toString());
                bw.newLine();
            }
            System.out.println("Employees saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
    
    private static void addEmployee(Scanner sc) {
        System.out.print("Enter Employee Code: ");
        String code = sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
    
        employees.add(new Employee(code, name, salary));
        System.out.println("Employee added successfully.");
    }
    
    private static void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        System.out.println("\nEmployee List:");
        for (Employee emp : employees) {
            System.out.println(emp.code + " - " + emp.name + " - $" + emp.salary);
        }
    }
}
