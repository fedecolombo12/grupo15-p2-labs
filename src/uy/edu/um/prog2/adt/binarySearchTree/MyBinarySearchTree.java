package uy.edu.um.prog2.adt.binarySearchTree;

// Aspecto a CAMBIAR para la realización del OBLIGATORIO - debemos utilizar nuestra LINKEDLIST
import uy.edu.um.prog2.adt.linkedList.ListaEnlazada;

import java.util.List;

public interface MyBinarySearchTree <K extends Comparable<K>, T> {
    T find (K key);
    void insert (K key, T data);
    void delete (K key);
    List<K> preOrder();
    List<K> inOrder();
    List<K> posOrder();
}
