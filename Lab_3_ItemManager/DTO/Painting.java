package DTO;

public class Painting extends Item {

    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting(){

    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed ){
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int get_height(){
        return height;
    }
    public int get_width(){
        return width;
    }
    public boolean get_Iswatercolour(){
        return isWatercolour;
    }
    public boolean get_Isframed(){
        return isFramed;
    }

    public void set_height(int height){
        this.height = height;
    }
    public void set_width(int width){
        this.width = width;
    }
    public void set_Iswatercolour(boolean isWatercolour){
        this.isWatercolour = isWatercolour; }
    public void set_Isframed(boolean isFramed){
        this.isFramed = isFramed;
    }

    public void outputPainting() {
        output();
        System.out.println("Height >> " + this.height);
        System.out.println("Width >> " + this.width);
        System.out.println("Is watercolour >> " + this.isWatercolour);
        System.out.println("Is framed >> " + this.isFramed);
    }

    public void inputPainting() {
        input();
        try {
            System.out.print("Enter height: ");
            this.height = sc.nextInt();
            System.out.print("Enter width: ");
            this.width = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter isWatercolour (true/false): ");
            this.isWatercolour = sc.nextBoolean();
            sc.nextLine();
            System.out.print("Enter isFramed (true/false): ");
            this.isFramed = sc.nextBoolean();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}