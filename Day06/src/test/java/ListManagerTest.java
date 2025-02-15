import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import org.example.basic_junit_test.testing_list_operations.ListManager;
class ListManagerTest {
    ListManager listManager;
    List<Integer> list;

    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        listManager.addElement(list, 5);
        assertTrue(list.contains(5));
        assertEquals(1, listManager.getSize(list));

        listManager.addElement(list, 10);
        assertTrue(list.contains(10));
        assertEquals(2, listManager.getSize(list));
    }

    @Test
    void testRemoveElement() {
        listManager.addElement(list, 5);
        listManager.addElement(list, 10);
        listManager.addElement(list, 15);

        listManager.removeElement(list, 10);
        assertFalse(list.contains(10));
        assertEquals(2, listManager.getSize(list));

        listManager.removeElement(list, 5);
        assertFalse(list.contains(5));
        assertEquals(1, listManager.getSize(list));
    }

    @Test
    void testGetSize() {
        assertEquals(0, listManager.getSize(list));

        listManager.addElement(list, 7);
        assertEquals(1, listManager.getSize(list));

        listManager.addElement(list, 14);
        assertEquals(2, listManager.getSize(list));

        listManager.removeElement(list, 7);
        assertEquals(1, listManager.getSize(list));
    }

    @Test
    void testNullList() {
        assertEquals(0, listManager.getSize(null));

        listManager.addElement(null, 5);
        listManager.removeElement(null, 5);
    }
}

