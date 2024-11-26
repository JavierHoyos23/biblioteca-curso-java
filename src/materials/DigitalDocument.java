package materials;

public class DigitalDocument extends Material{

    private String size;
    private String format;
    private String recommendedDevice;


    DigitalDocument(){
        System.out.print("Size: ");
        this.size = userInput.nextLine();
        System.out.print("Format: ");
        this.format = userInput.nextLine();
        System.out.print("Recommended Device: ");
        this.recommendedDevice = userInput.nextLine();
    }

    @Override
    public void getMaterialInfo() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Released Date: " + this.getReleasedDate());
        System.out.println("Category: " + this.getCategory());
        System.out.println("Size: " + this.size);
        System.out.println("Format: " + this.format);
        System.out.println("Recommended Device: " + this.recommendedDevice +"\n");
    }

    @Override
    public void updateInformation(){
        super.updateInformation();
        System.out.print("Duration: ");
        this.setSize(userInput.nextLine());
        System.out.print("Format: ");
        this.setFormat(userInput.nextLine());
        System.out.print("Recommended Device: ");
        this.setRecommendedDevice(userInput.nextLine());
    }

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public String getFormat() { return format; }
    public void setFormat(String format) { this.format = format; }

    public String getRecommendedDevice() { return recommendedDevice; }
    public void setRecommendedDevice(String recommendedDevice) { this.recommendedDevice = recommendedDevice; }

}
