import java.util.Scanner;

public class Lab1_3 {
    public static void main(String[] args) {
        String[] list = new String[10];

        for(int i = 0; i < 10; i++){
            Scanner sc = new Scanner(System.in);
            list[i] = sc.nextLine();
            list[i] = list[i].toUpperCase();
        }

        for (String x : list){
            System.out.println(x);
        }
    }    
}
