package materials;

import java.util.InputMismatchException;

public class Book extends Material{

    private String pagesNumber;
    private String genre;

     Book(){
         super();
         System.out.print("genre: ");
         this.genre = userInput.nextLine();
         System.out.print("Pages number: ");
         this.pagesNumber = userInput.nextLine();
     }

    @Override
    public void getMaterialInfo() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Released Date: " + this.getReleasedDate());
        System.out.println("Category: " + this.getCategory());
        System.out.println("pagesNumber: " + this.pagesNumber);
        System.out.println("genre: " + this.genre +"\n");
    }

    @Override
    public void updateInformation(){
        super.updateInformation();
        System.out.print("Genre: ");
        this.setGenre(userInput.nextLine());
        System.out.print("Pages Number: ");
        this.setPagesNumber(userInput.nextLine());
    }

    public String getPagesNumber() { return this.pagesNumber; }
    public void setPagesNumber(String pagesNumber) throws InputMismatchException { this.pagesNumber = pagesNumber; }

    public String getGenre() { return this.genre; }
    public void setGenre(String genre) { this.genre = genre; }

}
