package models;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Book extends Material{

    private Integer pagesNumber;
    private String genre;

     Book(){
         super();
         try {
             System.out.print("genre: ");
             this.genre = userInput.nextLine();
             System.out.print("Pages number: ");
             this.pagesNumber = userInput.nextInt();
         } catch (InputMismatchException error){
             System.out.println("Invalid type of data, you can edit it later");
         }
     }

    @Override
    public void getMaterialInfo() {
        System.out.println("");
    }

    public Integer getPagesNumber() { return this.pagesNumber; }
    public void setPagesNumber(Integer pagesNumber) throws InputMismatchException { this.pagesNumber = pagesNumber; }

    public String getGenre() { return this.genre; }
    public void setGenre(String genre) { this.genre = genre; }
}
