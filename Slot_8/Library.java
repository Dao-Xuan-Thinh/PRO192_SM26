import java.util.Scanner;

abstract class sBook{
    protected String title;
    protected String author;
    protected double price;

    public sBook(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public abstract void output();
}

class TextBook extends sBook{
    protected String subject;

    public TextBook(String title, String author, double price, String subject){
        super(title, author, price);
        this.subject = subject;
    }

    @Override
    public void output(){
        System.out.println(">> title: " +title);
        System.out.println(">> author: " +author);
        System.out.println(">> price: " +price);
        System.out.println(">> subject: " +subject);
    }
}

class ReferenceBook extends sBook{
    protected String category;

    public ReferenceBook(String title, String author, double price, String category){
        super(title, author, price);
        this.category = category;
    }

    @Override
    public void output(){
        System.out.println(">> title: " +title);
        System.out.println(">> author: " +author);
        System.out.println(">> price: " +price);
        System.out.println(">> category: " +category);
    }
}

public class Library {
    static sBook[] books = new sBook[100];
    static int count = 0;

    public static void addBook(sBook book) {
        books[count] = book;
        count++;
    }

    public static void showAllBook() {
        if (count == 0) {
            System.out.println("No books in library.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println("--- Book " + (i + 1) + " ---");
            books[i].output();
        }
    }

    public static double totalPrice() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += books[i].price;
        }
        return total;
    }

    public static void addBookFromInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What type of book?");
        System.out.println("1. TextBook");
        System.out.println("2. ReferenceBook");
        System.out.print("Choice: ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        if (type == 1) {
            System.out.print("Enter subject: ");
            String subject = sc.nextLine();
            addBook(new TextBook(title, author, price, subject));
        } else if (type == 2) {
            System.out.print("Enter category: ");
            String category = sc.nextLine();
            addBook(new ReferenceBook(title, author, price, category));
        } else {
            System.out.println("Invalid type, book not added.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("\n1. Add a book");
            System.out.println("2. Show all books");
            System.out.println("3. Total price");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addBookFromInput();
                    break;
                case 2:
                    showAllBook();
                    break;
                case 3:
                    System.out.println("Total price: $" + totalPrice());
                    break;
            }
        } while (choice != 0);
    }
}
