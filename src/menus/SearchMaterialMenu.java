package menus;

import service.search.SearchMaterial;
import materials.Material;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchMaterialMenu {

    private final Scanner SEARCH_SCANNER = new Scanner(System.in);
    private final SearchMaterial SEARCH = new SearchMaterial();

    public void searchMaterial(ArrayList<Material> materials) {
        try {
            System.out.print(SEARCH.OPTIONS);
            String userSearchTypeInput = SEARCH_SCANNER.nextLine();

            switch (userSearchTypeInput) {
                case "1":
                    searchByTitle(materials);
                    break;
                case "2" :
                    searchByAuthor(materials);
                    break;
                case "3":
                    searchByReleasedDate(materials);
                    break;
                case "4":
                    searchByCategory(materials);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        }
    }

    private void searchByTitle(ArrayList<Material> materials) {
        System.out.print("Search by the following Title: ");
        String userInput = getUserInput();
        System.out.println("\nResults:\n");
        SEARCH.searchByTitle(userInput, materials);
    }

    private void searchByAuthor(ArrayList<Material> materials) {
        System.out.print("Search by the following Author: ");
        String userInput = getUserInput();
        System.out.println("\nResults:\n");
        SEARCH.searchByAuthor(userInput, materials);
    }

    private void searchByReleasedDate(ArrayList<Material> materials) {
        System.out.print("Search by the following Released Date: ");
        String userInput = getUserInput();
        System.out.println("\nResults:\n");
        SEARCH.searchByReleasedDate(userInput, materials);
    }

    private void searchByCategory(ArrayList<Material> materials) {
        System.out.print("Search by the following Category: ");
        String userInput = getUserInput();
        System.out.println("\nResults:\n");
        SEARCH.searchByCategory(userInput, materials);
    }

    private String getUserInput() {
        return SEARCH_SCANNER.nextLine().toUpperCase().replaceAll("\\s+", "");
    }

}