package uy.edu.um.prog2.adt.binarySearchTree;
import uy.edu.um.prog2.adt.linkedList.ListaEnlazada;
import uy.edu.um.prog2.adt.binarySearchTree.NodeBST;


public interface MyBinarySearchTree <K extends Comparable<K>, T> {
    T find (K key);
    void insert (K key, T data);
    void delete (K key);
    ListaEnlazada preOrder();
    ListaEnlazada inOrder();
    ListaEnlazada posOrder();
}
