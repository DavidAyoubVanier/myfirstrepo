import org.example.SinglyLinkedList;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class SinglyLinkedListTest {

    @Test
    public void testAdd_emptyList() {
        SinglyLinkedList<Integer> nums = new SinglyLinkedList<>();

        nums.add(0); // {0}

        Assertions.assertTrue(nums.size() == 1
                && nums.get(0) == 0);
    }

    @Test
    public void testAdd_normalList() {
        SinglyLinkedList<Integer> nums = new SinglyLinkedList<>();

        nums.add(0); // {0}
        nums.add(1); // {0,1}
        nums.add(2); // {0,1,2}

        Assertions.assertTrue(nums.size() == 3
                && nums.get(0) == 0
                && nums.get(1) == 1
                && nums.get(2) == 2);
    }

    @Test
    public void testGet_indexOutofBound() {
        SinglyLinkedList<Integer> nums = new SinglyLinkedList<>();
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> nums.add(-2, 0));
    }

    @Test
    public void testAddWithIdx_addAtTheEnd() {
        SinglyLinkedList<Integer> nums = new SinglyLinkedList<>();
        nums.add(0, 0);
        nums.add(1, 1);
        nums.add(2, 2);

        Assertions.assertTrue(nums.size() == 3
                && nums.get(0) == 0
                && nums.get(1) == 1
                && nums.get(2) == 2);
    }

    @Test
    public void testAddWithIdx_addInTheMiddle() {
        SinglyLinkedList<Integer> nums = new SinglyLinkedList<>();
        nums.add(0, 0);
        nums.add(1, 1);
        nums.add(2, 2); // {0,1,2}
        nums.add(1, 4); // {0,4,1,2}

        Assertions.assertTrue(nums.size() == 4
                && nums.get(0) == 0
                && nums.get(1) == 4
                && nums.get(2) == 1
                && nums.get(3) == 2);
    }




}
