package service.search;

import materials.Material;

import java.util.ArrayList;

public class SearchMaterial implements Search {

    public final String OPTIONS = """
            
            How do you want to search?
            1. Search by Title
            2. Search by Author
            3. Search by Released Date
            4. Search by Category
            User option:""";

    @Override
    public void searchByTitle(String title, ArrayList<Material> materials) {
        materials.forEach(material -> {
            if (material.getTitle().toUpperCase().replaceAll("\\s+", "").equals(title)){
                material.getMaterialInfo();
            }
        });
    }

    @Override
    public void searchByAuthor(String author, ArrayList<Material> materials) {
        materials.forEach(material -> {
            if (material.getAuthor().toUpperCase().replaceAll("\\s+", "").equals(author)){
                material.getMaterialInfo();
            }
        });
    }

    @Override
    public void searchByReleasedDate(String releasedDate, ArrayList<Material> materials) {
        materials.forEach(material -> {
            if (material.getReleasedDate().toUpperCase().replaceAll("\\s+", "").equals(releasedDate)){
                material.getMaterialInfo();
            }
        });
    }

    @Override
    public void searchByCategory(String category, ArrayList<Material> materials) {
        materials.forEach(material -> {
            if (material.getCategory().toUpperCase().replaceAll("\\s+", "").equals(category)){
                material.getMaterialInfo();
            }
        });
    }

}
