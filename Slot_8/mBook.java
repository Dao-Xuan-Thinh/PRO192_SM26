package Slot_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class book {
    private String author;
    private int page;

    public book(){
        this.author = "null";
        this.page = 0;
    }

    public book(String author, int page){
        this.author = author;
        this.page = page;
    }

    public String getAuthor(){
        return author;
    }

    public int getPage(){
        return page;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString(){
        return "("+ author +", "+ page +")";
    }
}

interface iBook{
    int f1(List<book> t);
    void f2(List<book> t);
    void f3(List<book> t);
}

class myBook implements iBook{
    @Override
    public int f1(List<book> t){
        int min = Integer.MAX_VALUE;
        for (book b : t){
            String[] words = b.getAuthor().trim().split("\\s+");
            if (words.length >= 2){
                min = Math.min(min, b.getPage());
            }
        }
        return min;
    }

    @Override
    public void f2(List<book> t){
        Collections.sort(t, (a, b) -> b.getPage() - a.getPage());
    }

    @Override
    public void f3(List<book> t){
        int minPage = Integer.MAX_VALUE;
        for (book b : t){
            minPage = Math.min(minPage, b.getPage());
        }
        Iterator<book> it = t.iterator();
        while (it.hasNext()){
            book b = it.next();
            if (b.getAuthor().startsWith("M") && b.getPage() == minPage){
                it.remove();
            }
        }
    }
}

public class mBook{
        static void display(List<book> list){
            for (book b : list){
                System.out.println(b);
            }
        }

        public static void main(String[] args) {
            List<book> list = new ArrayList<>();
            list.add(new book("Ngu Dan", 2010));
            list.add(new book("Mgu THoi", 812));
            list.add(new book("Ngu 2s", 924));
            myBook mb = new myBook();

            System.out.println("========Before=========");
            display(list);

            System.out.println("\n=========Result=========");
            System.out.println(mb.f1(list));
            
            mb.f2(list);
            System.out.println("\n=========After F2=========");
            display(list);

            mb.f3(list);
            System.out.println("\n=========After F3=========");
            display(list);
        }
}
