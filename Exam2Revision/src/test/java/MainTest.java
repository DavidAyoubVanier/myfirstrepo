import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    public class MainTest {
        @Test
        public void testReverse1() {
            String input = "hello";
            String expected = "olleh";
            String result = Main.reverse(input);

            Assertions.assertEquals(expected, result);
        }

        @Test
        public void testReverse2() {
            String input = "";
            String expected = "";
            String result = Main.reverse(input);

            Assertions.assertEquals(expected, result);
        }

        @Test
        public void testReverse3() {
            String input = "null";
            String expected = "null";
            String result = Main.reverse(input);

            Assertions.assertEquals(expected, result);
        }


    }
}
