package DTO;

public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int get_height() {
        return height;
    }

    public String get_material() {
        return material;
    }

    public void set_height(int height) {
        this.height = height;
    }

    public void set_material(String material) {
        this.material = material;
    }

    public void outputVase() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }

    public void inputVase() {
        input();
        try {
            System.out.print("Enter height: ");
            this.height = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter material: ");
            this.material = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}