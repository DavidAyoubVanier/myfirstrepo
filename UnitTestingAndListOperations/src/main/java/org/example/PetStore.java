package org.example;

import java.util.ArrayList;
import java.util.List;

public class PetStore {
    private List<Cat> cats;

    public PetStore() {
        this.cats = new ArrayList<>();
    }

    public void addCat(Cat cat) {
        this.cats.add(cat);
    }

    /**
     * returns a list of cats whose name contains the keyword (case-insensitive)
     * @param keyword the keyword to search for
     * @return a list of cats whose name contains the keyword
     */
    public List<Cat> searchByName(String keyword) {
        List<Cat> searched = new ArrayList<>();

        for (Cat cat : cats) {
            if (cat.getName().toLowerCase().contains(keyword.toLowerCase())) {
                searched.add(cat);
            }
        }
        return searched;
    }

    public List<Cat> searchedByName(String keyword) {
        return cats.stream()
                .filter(cat -> cat.getName().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }

}
