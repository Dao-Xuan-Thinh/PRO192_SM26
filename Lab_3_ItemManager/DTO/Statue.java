package DTO;

import java.util.Scanner;

public class Statue extends Item{
    private int weight;
    private String color;

    public Statue(){

    }

    public Statue(int vaule, String creator, int weight, String color){
        super(vaule, creator);
        this.weight = weight;
        this.color = color;
    }

    public get_weight(){
        return weight;
    }

    public get_color(){
        return color;
    }

    public output_Statue(){
        System.out.println("Weight >> " +weight);
        System.out.println("Color >> " +color);
    }

    public intput_Statue(){
        input();
        this.weight = sc.nextInt();
        this.color = sc.nextLine();
    }
}