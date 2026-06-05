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

    public void outputPainting(){
        System.out.println( "Height >> "+this.height);
        System.out.println( "Width >> "+this.width);
        System.out.println("Is coloured >> "+this.isWatercolour);
        System.out.println( "Is framed >> "+this.isFramed);
    }

    public void inputPainting(){
        input();
        this.height = sc.nextInt();
        this.width = sc.nextInt();
        sc.nextLine();
        this.isWatercolour = sc.nextBoolean();
        sc.nextLine();
        this.isFramed = sc.nextBoolean();
    }
}