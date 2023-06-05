package uy.edu.um.prog2.adt.MyHeap;
import uy.edu.um.prog2.adt.exceptions.EmptyHeapException;

public interface MyHeap<T extends Comparable<T>> {

    T delete() throws EmptyHeapException;

    int size();

    void insert (T value);

    String toString();

}
