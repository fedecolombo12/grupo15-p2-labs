package uy.edu.um.prog2.adt.heap;

public interface MyHeap<K, T> {

    void add(K key, T data);

    void remove(K key);

    String toString();

}
