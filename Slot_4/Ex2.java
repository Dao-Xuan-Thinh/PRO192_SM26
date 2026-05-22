import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < 5; i++){
            System.out.printf("Câu hỏi thứ %d: ", list.size());
            String question = sc.nextLine();
            list.add(question);
        }

        Collections.shuffle(list);
        for(String x : list){
            System.out.println(x);
        }
    }
}