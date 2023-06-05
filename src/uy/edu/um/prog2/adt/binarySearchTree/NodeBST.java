package uy.edu.um.prog2.adt.binarySearchTree;
import java.util.ArrayList;
import java.util.List;

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

    private NodeBST<K,T> leftCh;

    public NodeBST<K, T> getLeftCh() {
        return leftCh;
    }
    public void setLeftCh(NodeBST<K, T> left) {
        this.leftCh = left;
    }

    private NodeBST<K,T> rightCh;

    public NodeBST<K, T> getRightCh() {
        return rightCh;
    }

    public void setRightCh(NodeBST<K, T> right) {
        this.rightCh = rightCh;
    }


    public NodeBST<K,T> findMin() {
        NodeBST<K,T> encontrar = this;
        if (leftCh != null) {
            encontrar = leftCh.findMin();
        }
        return encontrar;
    }

    public NodeBST(K key, T value) {
        this.key = key;
        this.value = value;
        this.rightCh = null;
        this.leftCh = null;
    }

    public List<K> inOrderT(){
        List<K> lista = new ArrayList<>();

        // Recorrer los nodos del subarbol DERECHO
        if (rightCh != null){
            lista.addAll(rightCh.inOrderT());
        }

        // Agregar clave de NODO ACTUAL
        lista.add(this.getKey());

        // Recorrer los nodos del subarbol IZQUIERDO
        if (leftCh != null){
            lista.addAll(leftCh.inOrderT());
        }

        return lista;
    }

    public List<K> posOrderT(){
        List<K> lista = new ArrayList<>();

        // Recorrer los nodos del subarbol DERECHO
        if (rightCh != null){
            lista.addAll(rightCh.inOrderT());
        }

        // Recorrer los nodos del subarbol IZQUIERDO
        if (leftCh != null){
            lista.addAll(leftCh.inOrderT());
        }

        // Agregar clave de NODO ACTUAL
        lista.add(this.getKey());
        return lista;
    }

    public List<K> preOrderT(){
        List<K> lista = new ArrayList<>();
        lista.add(this.getKey());

        // Recorrer los nodos del subarbol DERECHO
        if (rightCh != null){
            lista.addAll(rightCh.inOrderT());
        }

        // Recorrer los nodos del subarbol IZQUIERDO
        if (leftCh != null){
            lista.addAll(leftCh.inOrderT());
        }
        return lista;
    }


    // Agregar nuevo nodo al ABB de manera recursiva.
    public void ingresoRec(K key, T value){
        NodeBST<K,T> elementoNuevo = new NodeBST<>(key, value);
        //
        if (key.compareTo(this.key) > 0) {
            if (rightCh == null){
                rightCh = elementoNuevo;
            } else {
                // llama al mismo método
                rightCh.ingresoRec(key, value);
            }
        } else {
            if (leftCh == null) {
                leftCh = elementoNuevo;
            } else {
                // llama al mismo método
                leftCh.ingresoRec(key, value);
            }
        }
    }

    // Sacar elemento

    public NodeBST<K,T> deleteRec(K key){
        int valores = ((Comparable<K>)key).compareTo(key);
        if (valores < 0){
            if (leftCh != null){
                leftCh = leftCh.deleteRec(key);
            }
        } else if (valores> 0){
            if (rightCh != null){
                rightCh = rightCh.deleteRec(key);
            }
        } else if (rightCh != null && leftCh != null) {
                NodeBST<K,T> aux = rightCh.findMin();
                this.key = aux.getKey();
                this.value = aux.getValue();
                rightCh = rightCh.deleteRec(aux.getKey());
        } else {
                if (leftCh != null) {
                    return leftCh;
                } else {
                    return rightCh;
                }
            }
            return this;
        }




    public int compareTo(NodeBST<K, T> nuevoNodo) {
        return 0;
    }
}