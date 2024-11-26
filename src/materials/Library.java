package materials;

import menus.SearchMaterialMenu;

import java.util.*;

public class Library {

    Scanner scanner = new Scanner(System.in);
    private static final HashMap<String,Book> BOOKS = new HashMap<>();
    private static final HashMap<String,Magazine> MAGAZINES = new HashMap<>();
    private static final HashMap<String,Movie> MOVIES = new HashMap<>();
    private static final HashMap<String,DigitalDocument> DIGITAL_DOCUMENTS = new HashMap<>();
    private static final SearchMaterialMenu SEARCH_MATERIAL_MENU = new SearchMaterialMenu();


    public void addMaterial(String userInput){
        switch (userInput){
            case "1":
                System.out.println("\nNew Book data:");
                Book newBook = new Book();
                BOOKS.put(newBook.getTitle(), newBook);
                System.out.println("New Book created: "+ newBook.getTitle());
                break;
            case "2":
                System.out.println("\nNew Magazine data:");
                Magazine newMagazine = new Magazine();
                MAGAZINES.put(newMagazine.getTitle(), newMagazine);
                System.out.println("New Magazine created: "+ newMagazine.getTitle());
                break;
            case "3":
                System.out.println("\nNew Movie data:");
                Movie newMovie = new Movie();
                MOVIES.put(newMovie.getTitle(), newMovie);
                System.out.println("New Movie created: "+ newMovie.getTitle());
                break;
            case "4":
                System.out.println("\nNew Digital Document data:");
                DigitalDocument newDigitalDocument = new DigitalDocument();
                DIGITAL_DOCUMENTS.put(newDigitalDocument.getTitle(), newDigitalDocument);
                System.out.println("New Digital Document created: "+ newDigitalDocument.getTitle());
                break;
            default:
                System.out.println("\nInvalid option.");
                break;
        }
    }

    public void listMaterial(String userInput) {
        switch (userInput){
            case "1":
                System.out.println("\nList of books:");
                BOOKS.keySet().forEach(System.out::println);
                break;
            case "2":
                System.out.println("\nList of magazines:");
                MAGAZINES.keySet().forEach(System.out::println);
                break;
            case "3":
                System.out.println("\nList of movies:");
                MOVIES.keySet().forEach(System.out::println);
                break;
            case "4":
                System.out.println("\nList of digital documents:");
                DIGITAL_DOCUMENTS.keySet().forEach(System.out::println);
                break;
            default:
                System.out.println("\nInvalid option.");
                break;
        }
    }

    public void searchMaterial(String userInput){
        switch (userInput){
            case "1":
                ArrayList<Material> booksList = new ArrayList<>(BOOKS.values());
                SEARCH_MATERIAL_MENU.searchMaterial(booksList);
                break;
            case "2":
                ArrayList<Material> magazineList = new ArrayList<>(MAGAZINES.values());
                SEARCH_MATERIAL_MENU.searchMaterial(magazineList);
                break;
            case "3":
                ArrayList<Material> moviesList = new ArrayList<>(MOVIES.values());
                SEARCH_MATERIAL_MENU.searchMaterial(moviesList);
                break;
            case "4":
                ArrayList<Material> digitalDocumentsList = new ArrayList<>(DIGITAL_DOCUMENTS.values());
                SEARCH_MATERIAL_MENU.searchMaterial(digitalDocumentsList);
                break;
            default:
                System.out.println("\nInvalid option.");
                break;
        }
    }

    public void deleteMaterial(String userInput) {
        switch (userInput){
            case "1":
                System.out.print("Type the name of the book to delete: ");
                BOOKS.remove(scanner.nextLine());
                System.out.println("Number of remaining books: " + BOOKS.size());
                break;
            case "2":
                System.out.print("Type the name of the magazine to delete: ");
                MAGAZINES.remove(scanner.nextLine());
                System.out.println("Number of remaining magazines: " + MAGAZINES.size());
                break;
            case "3":
                System.out.print("Type the name of the movie to delete: ");
                MOVIES.remove(scanner.nextLine());
                System.out.println("Number of remaining movies: " + MOVIES.size());
                break;
            case "4":
                System.out.print("Type the name of the digital document to delete: ");
                DIGITAL_DOCUMENTS.remove(scanner.nextLine());
                System.out.println("Number of remaining digital documents: " + DIGITAL_DOCUMENTS.size());
                break;
            default:
                System.out.println("\nInvalid option.");
                break;
        }
    }

    public void updateMaterial(String userInput) {
        switch (userInput){
            case "1":
                System.out.print("Type the name of the book to update: ");
                String userBookInput = scanner.nextLine();
                if (BOOKS.containsKey(userBookInput)){
                    BOOKS.get(userBookInput).updateInformation();
                    BOOKS.put(BOOKS.get(userBookInput).getTitle(), BOOKS.get(userBookInput));
                    BOOKS.remove(userBookInput);
                } else {
                    System.out.println(userBookInput + "not found.");
                }
                break;
            case "2":
                System.out.print("Type the name of the magazine to update: ");
                String userMagazineInput = scanner.nextLine();
                if (MAGAZINES.containsKey(userMagazineInput)){
                    MAGAZINES.get(userMagazineInput).updateInformation();
                    MAGAZINES.put(MAGAZINES.get(userMagazineInput).getTitle(), MAGAZINES.get(userMagazineInput));
                    MAGAZINES.remove(userMagazineInput);
                } else {
                    System.out.println(userMagazineInput + "not found.");
                }
                break;
            case "3":
                System.out.print("Type the name of the movie to update: ");
                String userMovieInput = scanner.nextLine();
                if (MOVIES.containsKey(userMovieInput)){
                    MOVIES.get(userMovieInput).updateInformation();
                    MOVIES.put(MOVIES.get(userMovieInput).getTitle(), MOVIES.get(userMovieInput));
                    MOVIES.remove(userMovieInput);
                } else {
                    System.out.println(userMovieInput + "not found.");
                }
                break;
            case "4":
                System.out.print("Type the name of the digital document to update: ");
                String userDigitalDocumentInput = scanner.nextLine();
                if (DIGITAL_DOCUMENTS.containsKey(userDigitalDocumentInput)){
                    DIGITAL_DOCUMENTS.get(userDigitalDocumentInput).updateInformation();
                    DIGITAL_DOCUMENTS.put(DIGITAL_DOCUMENTS.get(userDigitalDocumentInput).getTitle(),
                            DIGITAL_DOCUMENTS.get(userDigitalDocumentInput));
                    DIGITAL_DOCUMENTS.remove(userDigitalDocumentInput);
                } else {
                    System.out.println(userDigitalDocumentInput + "not found.");
                }
                break;
            default:
                System.out.println("\nInvalid option.");
                break;
        }
    }

}
