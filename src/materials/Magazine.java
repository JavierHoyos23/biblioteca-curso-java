package materials;

public class Magazine extends Material{

    private String volume;
    private String topic;


    Magazine(){
        System.out.print("Volume: ");
        this.volume = userInput.nextLine();
        System.out.print("Topic: ");
        this.topic = userInput.nextLine();
    }

    @Override
    public void getMaterialInfo() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Released Date: " + this.getReleasedDate());
        System.out.println("Category: " + this.getCategory());
        System.out.println("Volume: " + this.volume);
        System.out.println("Topic: " + this.topic +"\n");
    }

    @Override
    public void updateInformation(){
        super.updateInformation();
        System.out.print("Volume: ");
        this.setVolume(userInput.nextLine());
        System.out.print("Topic: ");
        this.setTopic(userInput.nextLine());
    }

    public String getTopic() { return topic; }
    public void setTopic(String topic) { this.topic = topic; }

    public String getVolume() { return volume; }
    public void setVolume(String volume) { this.volume = volume; }

}
