package Week2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestBook {
    public static void main(String[] args) {
        List<Book> listProgrammingBook = new ArrayList<>();
        ProgrammingBook programmingBook1 = new ProgrammingBook(1, "Book1",
                10000, "Mr.phu", "Vietnamese", "one");

        ProgrammingBook programmingBook2 = new ProgrammingBook(1, "Book1",
                10000, "Mr.phu", "Vietnamese", "Two");

        ProgrammingBook programmingBook3 = new ProgrammingBook(1, "Book1",
                10000, "Mr.phu", "Vietnamese", "Three");

        ProgrammingBook programmingBook4 = new ProgrammingBook(1, "Book1",
                10000, "Mr.phu", "Vietnamese", "Four");

        ProgrammingBook programmingBook5 = new ProgrammingBook(1, "Book1",
                10000, "Mr.phu", "Vietnamese", "Five");

        listProgrammingBook.add(programmingBook1);
        listProgrammingBook.add(programmingBook2);
        listProgrammingBook.add(programmingBook3);
        listProgrammingBook.add(programmingBook4);
        listProgrammingBook.add(programmingBook5);

        FictionBook fictionBook1 = new FictionBook(1, "hanh dong", 200000,
                "Mr.Nam", "loai 1");
        FictionBook fictionBook2 = new FictionBook(1, "Viễn Tưởng", 200000,
                "Mr.Nam", "loai 2");
        FictionBook fictionBook3 = new FictionBook(1, "avatar", 200000,
                "Mr.Nam", "Viễn Tưởng");
        FictionBook fictionBook4 = new FictionBook(1, "Viễn Tưởng", 200000,
                "Mr.Nam", "loai 4");
        FictionBook fictionBook5 = new FictionBook(1, "avatar", 200000,
                "Mr.Nam", "Viễn Tưởng");

        listProgrammingBook.add(fictionBook1);
        listProgrammingBook.add(fictionBook2);
        listProgrammingBook.add(fictionBook3);
        listProgrammingBook.add(fictionBook4);
        listProgrammingBook.add(fictionBook5);

        int sum = 0;
        int coun = 0;
        int coun1 = 0;
        for (int i = 0; i < listProgrammingBook.size(); i++) {
            sum += listProgrammingBook.get(i).getPrice();
            if (listProgrammingBook.get(i) instanceof FictionBook){
                if (((FictionBook) listProgrammingBook.get(i)).getCategory() == "Viễn Tưởng") {
                    coun++;
                }
            }
            if (listProgrammingBook.get(i).getPrice() < 90000) {
                coun1++;
            }
        }
        System.out.println("Sum Money  = " + sum);
        System.out.println("FictionBook have category is \"Viễn Tưởng\": " + coun);
        System.out.println("Book have money < 90000: " + coun1);
    }
}
