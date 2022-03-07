package book.ocp.chapter2.page83;

import java.util.ArrayList;
import java.util.List;

public final class Animal {
    private final List<String> favoriteFoods;

    public Animal(List<String> favoriteFoods){
        if (favoriteFoods == null){
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }

    public List<String> getFavoriteFoods(){ // makes class mutable!
        return favoriteFoods;
    }

}
