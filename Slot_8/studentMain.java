package Slot_8;

import java.util.ArrayList;
import java.util.List;

public class studentMain {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("Thinh");
        students.add("Ngu");
        students.add("Ngu2");

        System.out.println("Students list");
        for (String student : students){
            System.out.println(students);
        }

        System.out.println("\nFirst Student: " + students.get(0));

        students.remove("Ngu");
        
        System.out.println("\nAfter removing Ngu");
        for (String student : students){
            System.out.println(student);
        }

        System.out.println("\nTotal Students: " + students.size());
    }
}
