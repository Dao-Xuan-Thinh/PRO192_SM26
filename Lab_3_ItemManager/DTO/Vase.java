package DTO;

import java.util.Scanner;

public class Vase extends Item{
    private int height;
    private String material;

    public Vase(){

    }

    public Vase(int vaule, String creator, int height, String material){
        super(vaule, creator);
        this.height = height;
        this.material = material;
    }

    public get_height(){
        return height;
    }

    public get_material(){
        return material;
    }

    public output_Vase(){
        System.out.println("Height >> " +height);
        System.out.println("Material >> " +material);
    }

    public intput_Vase(){
        input();
        this.height = sc.nextInt();
        this.material = sc.nextLine();
    }
}