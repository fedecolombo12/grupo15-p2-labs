package uy.edu.um.prog2.adt.heap;

import uy.edu.um.prog2.adt.binarySearchTree.NodeBST;

public interface MyHeap<K extends Comparable<K>,T> {

    NodeBST<K,T> remove();

    void insert(K key,T data) throws Exception;

    int size();

    String toString();


}
