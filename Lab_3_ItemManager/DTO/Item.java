package DTO;

import java.util.Scanner;

public class Item {
    protected int value;
    protected String creator;
    protected static Scanner sc = new Scanner(System.in);

    public Item() {
        this.value = 0;
        this.creator = "";
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int get_Value() {
        return value;
    }

    public String get_Creator() {
        return creator;
    }

    public void set_Value(int value) {
        this.value = value;
    }

    public void set_Creator(String creator) {
        this.creator = creator;
    }

    public void output() {
        System.out.println("Value >> " + value);
        System.out.println("Creator >> " + creator);
    }

    public void input() {
        do {
            try {
                System.out.print("Enter value (> 0): ");
                this.value = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter creator: ");
                this.creator = sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input, please try again.");
                sc.nextLine();
                this.value = 0;
            }
        } while (value <= 0 || creator.isEmpty());
    }
}