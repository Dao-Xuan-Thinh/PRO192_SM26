package Slot_9;

import java.util.HashMap;

public class ex1 {
    public static void main(String[] args) {
        HashMap<String, Double> scores = new HashMap<>();

        scores.put("An", 8.5);
        scores.put("Binh", 9.0);
        scores.put("Cuong", 7.5);

        for(String name : scores.keySet()){
            System.out.println(name + " : " + scores.get(name));
        }
    }
}
