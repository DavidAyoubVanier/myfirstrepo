import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testFibonacci1() {
        int num = 5;
        Long expected = 5L;
        Long result = Main.fibonacci(num);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFibonacci2() {
        int num = 10;
        Long expected = 55L;
        Long result = Main.fibonacci(num);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFibonacci3() {
        int num = 0;
        Long expected = 0L;
        Long result = Main.fibonacci(num);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFibonacci4() {
        int num = 1;
        Long expected = 1L;
        Long result = Main.fibonacci(num);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFibonacci5() {
        int num = -5;
        Long expected = null;
        Long result = Main.fibonacci(num);
        Assertions.assertEquals(expected, result);
    }

}
