package uy.edu.um.prog2.adt.binarySearchTree;
import java.util.ArrayList;
import java.util.List;
import uy.edu.um.prog2.adt.linkedList.ListaEnlazada;

public class NodeBST<K extends Comparable<K>, T> implements Comparable<NodeBST<K, T>> {
    private K key;
    private T value;
    private NodeBST<K,T> left;
    private NodeBST<K,T> right;
    public NodeBST(K key, T value) {
        this.key = key;
        this.value = value;
        this.right = null;
        this.left = null;
    }
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public NodeBST<K, T> getLeft() {
        return left;
    }
    public void setLeft(NodeBST<K, T> left) {
        this.left = left;
    }
    public NodeBST<K, T> getRight() {
        return right;
    }
    public void setRight(NodeBST<K, T> right) {
        this.right = right;
    }

    public NodeBST<K,T> findMin() {
        NodeBST<K,T> encontrar = this;
        if (getLeft() != null) {
            encontrar = getLeft().findMin();
        }
        return encontrar;
    }


    // Agregar nuevo nodo al BST de manera recursiva.
    public void ingresoRec(K key, T value){
        NodeBST<K,T> elementoNuevo = new NodeBST<>(key, value);
        if (key.compareTo(getKey()) > 0) {
            if (getRight() == null){
                setRight(elementoNuevo);;
            } else {
                getRight().ingresoRec(key, value); // llama al mismo método
            }
        } else {
            if (getLeft() == null) {
                setLeft(elementoNuevo);
            } else {
                getLeft().ingresoRec(key, value); // llama al mismo método
            }
        }
    }

    // Sacar elemento

    public NodeBST<K,T> deleteRec(K key){
        int valores = ((Comparable<K>)key).compareTo(key);
        if (valores < 0){
            if (getLeft() != null){
                setLeft(getLeft().deleteRec(key));
            }
        } else if (valores> 0){
            if (getRight() != null){
                setRight(getRight().deleteRec(key));
            }
        } else if (getRight() != null && getLeft() != null) {
                NodeBST<K,T> aux = getRight().findMin();
                setKey(aux.getKey());
                setValue(aux.getValue());
                setRight(getRight().deleteRec(aux.getKey()));
        } else {
                if (getLeft() != null) {
                    return getLeft();
                } else {
                    return getRight();
                }
            }
            return this;
        }
    public int compareTo(NodeBST<K, T> nuevoNodo) {
        return 0;
    }
}