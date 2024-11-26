package menus;

import materials.Library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private static final String MATERIALS_OPTIONS = """
            1. Book
            2. Magazine
            3. Movie
            4. Digital Document
            Material selected:""";
    private static final String OPTIONS = """

                    Select an option:
                    1. Add material
                    2. List material
                    3. Search Material
                    4. Delete Material
                    5. Update Material
                    6. Exit
                    My selection:""";
    private static final Library LIBRARY = new Library();
    private static Boolean isInitialized;

    private static void mainLoop(){
        while (isInitialized){
            System.out.print(OPTIONS);
            switch(userInput()){
                case "1":
                    System.out.print("\nSelect a material to add:\n" + MATERIALS_OPTIONS);
                    LIBRARY.addMaterial(userInput());
                    break;
                case "2":
                    System.out.print("\nSelect a material to list:\n" + MATERIALS_OPTIONS);
                    LIBRARY.listMaterial(userInput());
                    break;
                case "3":
                    System.out.print("\nSelect a material to Search:\n" + MATERIALS_OPTIONS);
                    LIBRARY.searchMaterial(userInput());
                    break;
                case "4":
                    System.out.print("\nSelect a material to delete:\n" + MATERIALS_OPTIONS);
                    LIBRARY.deleteMaterial(userInput());
                    break;
                case "5":
                    System.out.print("\nSelect a material to update:\n" + MATERIALS_OPTIONS);
                    LIBRARY.updateMaterial(userInput());
                    break;
                case "6":
                    exitMenu();
                    break;
                default:
                    System.out.println("\nInvalid option.");
                    break;
            }
        }
    }

    public static void initMenu(){
        isInitialized = Boolean.TRUE;
        mainLoop();
    }

    private static void exitMenu(){
        isInitialized = Boolean.FALSE;
    }

    private static String userInput(){
        try {
            return new Scanner(System.in).nextLine();
        } catch (InputMismatchException error){
            return "";
        }
    }

}
