package uy.edu.um.prog2.adt.MyHeap;

public interface MyHeap<T extends Comparable<T>> {

    T deleteAndReturn();

    int size();

    void insert (T value);

    String toString();

}
