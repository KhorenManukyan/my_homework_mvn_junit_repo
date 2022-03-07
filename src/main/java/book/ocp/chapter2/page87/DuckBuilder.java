package book.ocp.chapter2.page87;

import java.util.Arrays;

public class DuckBuilder {
    public static void main(String[] args) {
        AnimalBuilder duckBuilder = new AnimalBuilder();
        duckBuilder
                .setAge(4)
                .setFavoriteFoods(Arrays.asList("grass", "fish"))
                .setSpecies("duck");
        Animal duck = duckBuilder.build();

        Animal flamingo = new AnimalBuilder()
                .setFavoriteFoods(Arrays.asList("algae", "insects"))
                .setSpecies("flamingo").build();
    }
}
