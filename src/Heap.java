import java.util.ArrayList;
import java.util.List;

/**
 * A min-heap. 
 * 
 * Must contain functionality for the following: (n = # of elements in heap)
 * 
 * Adding a new value to the heap  O(log(n))
 * Popping the front of the heap O(log(n))
 * Peeking at the front of the heap without removing the element O(1)
 * Getting the size of the heap O(1)
 * Checking whether the heap is empty O(1)
 * 
 * 
 * The Heap must hold ints
 * 
 * Use List/ArrayList as a backing array, but DO NOT use the 
 * PriorityQueue class. Do not make Node objects, use array
 * indexing instead.
 * 
 * It is up to you to make design decisions about how to:
 *  - name methods
 *  - determine return value and argument types
 *  - hold private instance variables
 */
public class Heap {
    private int size;
    private List<Integer> arr;

    public Heap() {
        size = 0;
        arr = new ArrayList<>();
    }

    public void add(int num) {
        if (size == 0) {
            arr.add(num);
            return;
        }
        
        arr.add(num);
        int index = size;

        while (arr.get(index) < arr.get((index - 1) / 2)) {
            int current = arr.get(index);
            int parent = arr.get((index - 1) / 2);

            arr.set(index, parent);
            arr.set((index - 1) / 2, current);

            index = (index - 1) / 2;
        }

        size++;
    }
}