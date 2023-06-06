package uy.edu.um.prog2.adt.heap;

public interface MyHeap <K, V> {
    void insert (K key, V value);
    V extractMax ();
    void heapifyUp();
    void heapifyDown();
    int size();
    boolean is_empty();
}
