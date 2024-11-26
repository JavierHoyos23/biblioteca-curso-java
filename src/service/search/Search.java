package service.search;

import materials.Material;

import java.util.ArrayList;

public interface Search {

    public abstract void searchByTitle(String title, ArrayList<Material> materials);

    public abstract void searchByAuthor(String author, ArrayList<Material> materials);

    public abstract void searchByReleasedDate(String releasedDate, ArrayList<Material> materials);

    public abstract void searchByCategory(String category, ArrayList<Material> materials);

}
