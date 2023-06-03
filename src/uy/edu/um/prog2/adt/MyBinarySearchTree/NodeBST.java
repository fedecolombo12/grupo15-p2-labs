package uy.edu.um.prog2.adt.MyBinarySearchTree;

public class NodeBST<K extends Comparable<K>, T> {

    private K key;

    private T value;

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

    private NodeBST<K,T> left;

    public NodeBST<K, T> getLeft() {
        return left;
    }
    public void setLeft(NodeBST<K, T> left) {
        this.left = left;
    }

    private NodeBST<K,T> right;

    public NodeBST<K, T> getRight() {
        return right;
    }

    public void setRight(NodeBST<K, T> right) {
        this.right = right;
    }

    // Eliminar nodo del ABB


    public NodeBST<K,T> findMin() {
        NodeBST<K,T> encontrar = this;

        if (left != null) {
            encontrar = left.findMin();
        }
        return encontrar;
    }


    // Agregar nuevo nodo al ABB de manera recursiva.
    public void insert(K key, T value){
        NodeBST<K,T> elementoNuevo = new NodeBST<>(key, value);

        //
        if (key.compareTo(this.key) > 0) {
            if (right == null){
                right = elementoNuevo;
            } else {
                // llama al mismo método
                right.insert(key, value);
            }
        } else {
            if (left == null) {
                left = elementoNuevo;
            } else {
                // llama al mismo método
                left.insert(key, value);
            }
        }
    }


    public NodeBST(K key, T value) {
        this.key = key;
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public int compareTo(NodeBST<K, T> nuevoNodo) {
        return 0;
    }
}