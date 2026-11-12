import static org.junit.Assert.*;
import org.junit.Test;

public class HeapTest {
    // add()
    @Test
    public void testAddIfValueAdded() {
        Heap heap = new Heap();
        heap.add(2);
        assertEquals(2, heap.values().get(0).intValue());
    }

    @Test 
    public void testIfHeapSortsCorrectlyAfterAdd() {
        Heap heap = new Heap();
        heap.add(2);
        heap.add(1);

        assertEquals(2, heap.values().get(1).intValue());
        assertEquals(1, heap.values().get(0).intValue());
    }

    @Test
    public void testIfHeapSuccessfullyAddsTwoSameValues() {
        Heap heap = new Heap();
        heap.add(3);
        heap.add(3);

        assertTrue(heap.values().get(0).intValue() == heap.values().get(1).intValue());
    }

    @Test
    public void testIfHeapIsSortedCorrectlyAfterManyValuesAdded() {
        Heap heap = new Heap();
        int count = 0;

        for (int i = 5; i >= 1; i--) {
            heap.add(i);
            count++;
        }

        for (int i = 0; i < 5; i++) {
            if (i * 2 + 1 < count) {
                assertTrue(heap.values().get(i).intValue() <= heap.values().get(i * 2 + 1));
            }
            if (i * 2 + 2 < count) {
                assertTrue(heap.values().get(i).intValue() <= heap.values().get(i * 2 + 2));
            }
        }
    }
}
