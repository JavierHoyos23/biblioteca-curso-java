package models;

import java.util.Scanner;

public abstract class Material {

    Scanner userInput = new Scanner(System.in);
    private String title;
    private String author;
    private String releasedDate;
    private String category;

     Material(){
         System.out.print("Title: ");
         this.title = userInput.nextLine();
         System.out.print("Author: ");
         this.author = userInput.nextLine();
         System.out.print("Released Date: ");
         this.releasedDate = userInput.nextLine();
         System.out.print("Category: ");
         this.category = userInput.nextLine();
     }

    public abstract void getMaterialInfo();

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getReleasedDate() { return releasedDate; }
    public void setReleasedDate(String releasedDate) { this.releasedDate = releasedDate; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

}
