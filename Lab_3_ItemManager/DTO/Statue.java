package DTO;

public class Statue extends Item {
    private int weight;
    private String color;

    public Statue() {
    }

    public Statue(int value, String creator, int weight, String color) {
        super(value, creator);
        this.weight = weight;
        this.color = color;
    }

    public int get_weight() {
        return weight;
    }

    public String get_color() {
        return color;
    }

    public void set_weight(int weight) {
        this.weight = weight;
    }

    public void set_color(String color) {
        this.color = color;
    }

    public void outputStatue() {
        output();
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
    }

    public void inputStatue() {
        input();
        try {
            System.out.print("Enter weight: ");
            this.weight = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter color: ");
            this.color = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}