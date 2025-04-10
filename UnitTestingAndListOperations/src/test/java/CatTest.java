import org.example.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {

    @Test
    public void testIncreaseAge() {
        Cat cat = new Cat("", 3);
        int expected = 4;
        cat.increaseAge();
        Assertions.assertEquals(expected, cat.getAge());
    }


}
