package Slot_9;

import java.util.HashMap;
import java.util.Map;

class iStudent {
    private String id;
    private String name;

    public iStudent(){

    }

    public iStudent(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getID(){
        return id;
    }

    public String getNAME(){
        return name;
    }

    public void setID(String id){
        this.id = id;
    }

    public void setNAME(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student ID: " + id + ", Name: " + name;
    }
}


public class Student{
    public static void main(String[] args) {
        Map<String, iStudent> students = new HashMap<>();

        students.put("SE001", new iStudent("SE001", "Nguyen Van A"));
        students.put("SE002", new iStudent("SE002", "Tran Thi B"));
        students.put("SE003", new iStudent("SE003", "Le Van C"));

        System.out.println("Student SE001: ");
        System.out.println(students.get("SE001"));

        System.out.println("\nStudent List: ");
        for(Map.Entry<String, iStudent> entry : students.entrySet()){
            System.out.println("Key = " + entry.getKey() + " | Value = " + entry.getValue());
        }

        students.remove("SE003");
        System.out.println("\nAfter removing SE003");
        for (iStudent s : students.values()){
            System.out.println(s);
        }
    }
}