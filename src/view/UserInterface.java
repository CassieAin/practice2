package view;

import java.util.Date;
import java.util.Scanner;

public class UserInterface {

    public static void run(){
        int count = 21;
        DisplayArrays display = new DisplayArrays();

        System.out.println("Hello, user! In this system you can make several actions");

        while(count > 0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nPress 1 - to get the list of books by specific author");
            System.out.println("Press 2 - to get the list of books by specific publisher");
            System.out.println("Press 3 - to get the list of books published after specific year");
            System.out.println("Press 4 - to get sorted list of books by publishers");
            System.out.println("Press 5 - to get the list of books by default");
            System.out.println("Press 6 - to exit");
            System.out.println("Choose the action, please:");
            int number = scanner.nextInt();

            switch(number){
                case 1:
                    System.out.println("Input the author name:");
                    String author = scanner.nextLine();
                    display.displayBooksByAuthor(author);
                    break;
                case 2:
                    System.out.println("Input the publisher name:");
                    String publisher = scanner.nextLine();
                    display.displayBooksByPublisher(publisher);
                    break;
                case 3:
                    System.out.println("Input the year:");
                    int year = scanner.nextInt();
                    display.displayBooksByDate(new Date(year,1,1));
                    break;
                case 4:
                    display.sortArray();
                    break;
                case 5:
                    System.out.println("Printed array:");
                    display.printArray(display.getBooks());
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    System.exit(1);
            }
            count--;
        }
    }
}
