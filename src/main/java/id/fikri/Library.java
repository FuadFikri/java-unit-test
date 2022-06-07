package id.fikri;

import java.util.ArrayList;
import java.util.List;

public class Library {


    private List<String> books = new ArrayList<>();


    public List<String> getBooks() {
        return books;
    }

    public void addBook(String book) {
        this.books.add(book);
    }

    public void clearBooks(){
        books.clear();
    }
}
