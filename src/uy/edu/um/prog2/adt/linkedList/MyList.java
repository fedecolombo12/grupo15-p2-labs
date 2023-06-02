package uy.edu.um.adt.linkedlist;

public interface MyList<T> extends Iterable<T> {

    void add(T value);

    T get(int position);

    boolean contains(T value);

    void remove(T value);

    int size();
    //prueba
}
