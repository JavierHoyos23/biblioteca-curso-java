package models;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {

    Scanner scanner = new Scanner(System.in);
    private static final HashMap<String,Book> BOOKS = new HashMap<>();
    private static final HashMap<String,Magazine> MAGAZINES = new HashMap<>();
    private static final HashMap<String,Movie> MOVIES = new HashMap<>();
    private static final HashMap<String,DigitalDocument> DIGITAL_DOCUMENTS = new HashMap<>();

    public void addMaterial(Integer userInput){
        switch (userInput){
            case 1:
                System.out.println("\nNew Book data:");
                Book newBook = new Book();
                BOOKS.put(newBook.getTitle(), newBook);
                System.out.println("New Book created: "+ newBook.getTitle());
                break;
            case 2:
            case 3:
            case 4:
            default:
                System.out.println("\nInvalid option.");
                break;
        }
    }

    public void listMaterial(Integer userInput) {
        switch (userInput){
            case 1:
                System.out.println("\nList of books:");
                BOOKS.keySet().forEach(System.out::println);
                break;
            case 2:
            case 3:
            case 4:
            default:
                System.out.println("\nInvalid option.");
                break;
        }
    }

    public void deleteMaterial(Integer userInput) {
        switch (userInput){
            case 1:
                System.out.print("\nType the name of the book to delete: ");
                BOOKS.remove(scanner.nextLine());
                System.out.println("Number of remaining books: " + BOOKS.size());
                break;
            case 2:
            case 3:
            case 4:
            default:
                System.out.println("\nInvalid option.");
                break;
        }
    }

    public void updateMaterial(Integer userInput) {
        switch (userInput){
            case 1:
                String selectedBook = scanner.nextLine();
                if (BOOKS.containsKey(selectedBook)){
                    BOOKS.get(selectedBook).setTitle(scanner.nextLine());
                    BOOKS.get(selectedBook).setAuthor(scanner.nextLine());
                    BOOKS.get(selectedBook).setReleasedDate(scanner.nextLine());
                    BOOKS.get(selectedBook).setCategory(scanner.nextLine());
                    BOOKS.get(selectedBook).setGenre(scanner.nextLine());
                    BOOKS.get(selectedBook).setPagesNumber(scanner.nextInt());
                } else {
                    System.out.println(selectedBook + "not found.");
                }
                break;
            case 2:
            case 3:
            case 4:
            default:
                System.out.println("\nInvalid option.");
                break;
        }
    }

}
