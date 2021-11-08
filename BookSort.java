package _11_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Book implements Comparable<Book>{
    int price;
    Book(int price) {
        this.price = price;
    }
    String Print() {
//        System.out.println("Book [price=" + price + "]");
        return "Book [price=" + price + "]";

    }

    @Override
    public int compareTo(Book s) {
//        if (this.price < s.price) {
//            return -1;
//        } else if (this.price == s.price) {
//            return 0;
//        } else {
//            return 1;
//        }
        return price - s.price;
    }
}


public class BookSort {
    public static void main(String[] args) {
        Book[] b={new Book(15000),new Book(50000),new Book(20000)};
//        List<Book> b = new ArrayList<>();
//        b.add(new Book(15000));
//        b.add(new Book(50000));
//        b.add(new Book(20000));

        for(Book o:b)
            System.out.println(o.Print());

        Arrays.sort(b);
//        Collections.sort(b);
        for(Book o1:b)
            System.out.println(o1.Print());
//            System.out.println(o1.Print());

    }
}
