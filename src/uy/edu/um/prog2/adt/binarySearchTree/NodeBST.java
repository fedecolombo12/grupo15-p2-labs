package uy.edu.um.prog2.adt.binarySearchTree;
import java.util.ArrayList;
import java.util.List;

public class NodeBST<K extends Comparable<K>, T> {

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
        if (left != null) {
            encontrar = left.findMin();
        }
        return encontrar;
    }

    public List<K> inOrderT(){
        List<K> lista = new ArrayList<>();
        // Recorrer los nodos del subarbol DERECHO
        if (getRight() != null){
            lista.addAll(getRight().inOrderT());
        }

        // Agregar clave de NODO ACTUAL
        lista.add(this.getKey());

        // Recorrer los nodos del subarbol IZQUIERDO
        if (getLeft() != null){
            lista.addAll(getLeft().inOrderT());
        }
        return lista;
    }
    public List<K> posOrderT(){
        List<K> lista = new ArrayList<>();

        // Recorrer los nodos del subarbol DERECHO
        if (getRight() != null){
            lista.addAll(getRight().inOrderT());
        }

        // Recorrer los nodos del subarbol IZQUIERDO
        if (getLeft() != null){
            lista.addAll(getLeft().inOrderT());
        }

        // Agregar clave de NODO ACTUAL
        lista.add(this.getKey());
        return lista;
    }
    public List<K> preOrderT(){
        List<K> lista = new ArrayList<>();
        lista.add(this.getKey());

        // Recorrer los nodos del subarbol DERECHO
        if (getRight() != null){
            lista.addAll(getRight().inOrderT());
        }

        // Recorrer los nodos del subarbol IZQUIERDO
        if (getLeft() != null){
            lista.addAll(getLeft().inOrderT());
        }
        return lista;
    }

    // Agregar nuevo nodo al ABB de manera recursiva.
    public void ingresoRec(K key, T value){
        NodeBST<K,T> elementoNuevo = new NodeBST<>(key, value);
        //
        if (key.compareTo(getKey()) > 0) {
            if (getRight() == null){
                setRight(elementoNuevo);;
            } else {
                // llama al mismo método
                getRight().ingresoRec(key, value);
            }
        } else {
            if (getLeft() == null) {
                setLeft(elementoNuevo);
            } else {
                // llama al mismo método
                getLeft().ingresoRec(key, value);
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