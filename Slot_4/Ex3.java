import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        System.out.printf("Nhập n: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.printf("Họ tên thứ %d: ", list.size());
            String names = sc.nextLine();
            list.add(names);
        }

        System.out.println("SINH VIÊN TÊN NGHUYỄN HOẶC HỌ NGUYỄN");
        for(String x : list){
            if (list.toUpperCase().startsWith("NGUYEN") || x.toUpperCase().endsWith(" TUAN")){
                System.out.println(x.toUpperCase());
                }
            }

         
        }
    }
}