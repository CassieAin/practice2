package view;

import controller.BooksController;
import model.Book;

import java.util.Date;

public class DisplayArrays {
    private BooksController controller;

    private Book[] books  = {
            new Book("Carrie", "Stephen King", "Pocket Books", new Date(2005, 11, 1), 253, 6.57),
            new Book("Thinking in Java", "Bruce Eckel","Pearson", new Date(2008, 3, 12), 1512, 18.84),
            new Book("Needful things", "Stephen King", "Hodder & Stoughton Ltd", new Date(1992, 6, 1), 790, 7.15),
            new Book("The Plague", "Albert Camus", "Vintage International", new Date(1999, 3, 7), 308, 6.99),
            new Book("Java in a Nutshell", "David Flanagan", "O'Reilly Media ", new Date(2005, 3, 25), 1224, 37.03),
            new Book("Frankenstein", "Mary Shelley","Penguin", new Date(2003, 3, 12), 273, 18.84),
            new Book("1984", "George Orwell", "New American Library", new Date(1950, 7, 1), 328, 7.50),
            new Book("Flowers for Algernon", "Daniel Keyes", "Mariner Books", new Date(2005, 5, 1), 311, 2.99),
    };

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public DisplayArrays(){
        controller = new BooksController(books);
    }

    public void printArray(Book[] printBooks){
        for(Book book : printBooks){
            System.out.println(book + ", ");
        }
    }

    public void sortArray(){
        System.out.println("\nSorted array: ");
        controller.sortBooksByPublisher();
        printArray(books);
    }

    public void displayBooksByDate(Date date){
        System.out.println("\nBooks that are later than " + date + ": ");
        printArray(controller.getBooksByDate(date));
    }

    public void displayBooksByAuthor(String author){
        System.out.println("\nBooks that were written by " + author + ": ");
        printArray(controller.getBooksByAuthor(author));
    }

    public void displayBooksByPublisher(String publisher){
        System.out.println("\nBooks that were published by " + publisher + ": ");
        printArray(controller.getBooksByPublisher(publisher));
    }
}
