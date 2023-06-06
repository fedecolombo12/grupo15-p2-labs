
import uy.edu.um.prog2.adt.exceptions.EmptyHeapException;

import org.junit.jupiter.api.Test;
import uy.edu.um.prog2.adt.heap.MyHeapImpl;

import static org.junit.jupiter.api.Assertions.*;

class HeapTest {
    MyHeapImpl<Integer, Integer> heap = new MyHeapImpl<>(1);
    @Test
    void insertUnValor(){
        heap.insert(1, 1);
        assertFalse(heap.is_empty());
        assertEquals(heap.extractMax(), 1);
        assertEquals(heap.size(), 0);
        System.out.println(heap.size());
    }

    @Test
    void insertVariosVal(){
        heap.insert(1, 1);
        heap.insert(5, 5);
        heap.insert(3, 3);
        heap.insert(2, 2);
        heap.insert(4, 4);
        heap.insert(6, 6);
        heap.insert(7, 7);
        heap.insert(9, 9);
        heap.insert(10, 10);
        heap.insert(8, 8);

        assertEquals(heap.extractMax(), 10);
        assertEquals(heap.extractMax(), 9);
        assertEquals(heap.extractMax(), 8);
        assertEquals(heap.extractMax(), 7);
        assertEquals(heap.extractMax(), 6);
        assertEquals(heap.extractMax(), 5);
        assertEquals(heap.extractMax(), 4);
        assertEquals(heap.extractMax(), 3);
        assertEquals(heap.extractMax(), 2);
        assertEquals(heap.extractMax(), 1);
        assertTrue(heap.is_empty());

    }


    @Test
    void upAndDown(){

        MyHeapImpl<Integer,String> up = new MyHeapImpl<>(5);

        up.insert(1, "A");
        up.insert(2, "B");
        up.insert(3, "C");
        up.insert(4, "D");
        up.insert(5, "E");

        System.out.println("ARREGLO: ");



    }

    }