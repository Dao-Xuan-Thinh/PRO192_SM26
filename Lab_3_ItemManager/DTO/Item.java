package DTO;

import java.util.Scanner;

public class Item {
    protected int value;
    protected String creator;
    
    public Item(){
        this.value = 0;
        this.creator = "null";
    }

    public Item(int vaule, String creator){
        this.vaule = vaule;
        this.creator = creator;
    }

    public int get_Vaule(){
        return value;
    }

    public String get_Creator(){
        return creator;
    }

    public output(){
        System.out.println("Value >> " +value);
        System.out.println("Creator >> " +creator);
    }

    public input(){
        static Scanner sc = new Scanner(System.in);
        do{
            this.vaule = sc.nextInt();
            this.creator = sc.nextLine();
        }while (vaule <= 0 && creator != "");
    }
}