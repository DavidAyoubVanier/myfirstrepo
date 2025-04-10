import org.example.Cat;
import org.example.PetStore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PetStoreTest {

    @Test
    public void testSearchedByName() {
        PetStore petStore = new PetStore();
        Cat c1 = new Cat("bob", 2);
        Cat c2 = new Cat("BOB", 2);
        Cat c3 = new Cat("Bob", 2);
        Cat c4 = new Cat("bob_yeah", 2);
        Cat c5 = new Cat("bo", 2);
        Cat c6 = new Cat("Yeah", 2);
        petStore.addCat(c1);
        petStore.addCat(c2);
        petStore.addCat(c3);
        petStore.addCat(c4);
        petStore.addCat(c5);
        petStore.addCat(c6);

        String keyword = "yeah";
        List<Cat> expected = new ArrayList<>();
        expected.add(c4);
        expected.add(c6);

        List<Cat> results = petStore.searchedByName(keyword);


        Assertions.assertEquals(expected, results);
    }


}
