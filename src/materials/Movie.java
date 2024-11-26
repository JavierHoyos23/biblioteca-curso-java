package materials;

public class Movie extends Material{

    private String duration;
    private String format;


    Movie(){
        System.out.print("Duration: ");
        this.duration = userInput.nextLine();
        System.out.print("Format: ");
        this.format = userInput.nextLine();
    }

    @Override
    public void getMaterialInfo() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Released Date: " + this.getReleasedDate());
        System.out.println("Category: " + this.getCategory());
        System.out.println("Duration: " + this.duration);
        System.out.println("Format: " + this.format +"\n");
    }

    @Override
    public void updateInformation(){
        super.updateInformation();
        System.out.print("Duration: ");
        this.setDuration(userInput.nextLine());
        System.out.print("Format: ");
        this.setFormat(userInput.nextLine());
    }

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }

    public String getFormat() { return format; }
    public void setFormat(String format) { this.format = format; }

}
