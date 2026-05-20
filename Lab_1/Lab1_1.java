import java.util.Scanner;

public class Lab1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.printf("Enter number of columns: ");
        int columns = sc.nextInt();

        int[][] a = new int [rows][columns];
        System.out.printf("Enter the matrix: ");

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.printf("a["+i+"]["+j+"] = ");
                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        float average = 0;
        System.out.println("Matrix Input-ed: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.printf("%d ", a[i][j]);
                sum += a[i][j];
            }
            System.out.println();
        }

        System.out.println("Sum: " +sum);
        average = sum / (rows + columns);
        System.out.println("Average: " +average);
    }
}
