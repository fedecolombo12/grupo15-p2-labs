package uy.edu.um.prog2.adt.binarySearchTree;

public class MyBinarySearchTreeImpl <K extends Comparable<K>, T> implements MyBinarySearchTree<K, T> {

    private NodeBST<K,T> raiz;

    public NodeBST<K, T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NodeBST<K, T> raiz) {
        this.raiz = raiz;
    }

    private NodeBST<K,T> nodoPadre;

    public NodeBST<K, T> getNodoPadre() {
        return nodoPadre;
    }

    public void setNodoPadre(NodeBST<K, T> nodoPadre) {
        this.nodoPadre = nodoPadre;
    }

    private int size = 0;

    @Override
    public T find(K key) {
        return findRecursivo(key, raiz);
    }

    public T findRecursivo (K keyBuscar, NodeBST<K,T> nuevoNodo){
        T nuevoValor = null;
        if (nuevoNodo != null){
        int valor = keyBuscar.compareTo(nuevoNodo.getKey());
            if (valor == 0) {
                nuevoValor = nuevoNodo.getValue();
            } else if (valor > 0) {
                nuevoValor = findRecursivo(keyBuscar, nuevoNodo.getRight());
            } else {
               nuevoValor = findRecursivo(keyBuscar, nuevoNodo.getRight());
            }
        }
        return nuevoValor;
    }

    @Override
    public void insert(K key, T data) {
        setRaiz(insertRecursivo(getRaiz(),key,data));
        size = size +1;
    }

    public NodeBST<K,T> insertRecursivo(NodeBST<K,T> nuevoNodo, K key, T data){
        if (nuevoNodo == null){
            return new NodeBST<K, T>(key,data);
        }
        if (nuevoNodo.getKey().compareTo(key)< 0){
            nuevoNodo.setRight(insertRecursivo(nuevoNodo.getRight(),key,data));
        } else if (nuevoNodo.getKey().compareTo(key) > 0) {
            nuevoNodo.setLeft(insertRecursivo(nuevoNodo.getLeft(),key,data));
        } else {
            nuevoNodo.setValue(data);
        }
        return nuevoNodo;
    }

    @Override
    public void delete(K key) {
            raiz = deleteRecursivo(raiz,key);
    }
    public NodeBST deleteRecursivo(NodeBST<K, T> nuevoNodo, K key){
        NodeBST<K,T> nodo = new NodeBST<K, T>(key, null);
        if (nuevoNodo == null){
            return null;
        }
        int comparar = nodo.compareTo(nuevoNodo);
        if (comparar > 0){
            nuevoNodo.setRight(deleteRecursivo(nuevoNodo.getRight(),key));
        } else if (comparar < 0){
            nuevoNodo.setLeft(deleteRecursivo(nuevoNodo.getLeft(),key));
        } else {
            if (nuevoNodo.getLeft() == null){
                return nuevoNodo.getRight();
            } else if (nuevoNodo.getRight() == null) {
                    return nuevoNodo.getLeft();
            } else {
                NodeBST nodeMin = min(nuevoNodo.getRight());
                nuevoNodo.setKey((K) nodeMin.getKey());
                nuevoNodo.setValue((T) nodeMin.getValue());
                nuevoNodo.setRight(delMin(nuevoNodo.getRight()));
            }
        }
        return nuevoNodo;
    }

    public NodeBST min(NodeBST<K,T> node){
        if (node.getLeft() == null){
            return node;
        }
        return min(node.getRight());
    }

    public NodeBST delMin(NodeBST<K,T> node){
        if (node.getLeft() == null){
            return node.getRight();
        }
        node.setLeft(delMin(node.getLeft()));
        return node;
    }

    public void preOrder(){
        preOrderRecursivo(raiz);
    }

    private void preOrderRecursivo(NodeBST nodo) {
        if (nodo != null){
            System.out.println(nodo.getKey() + " : " + nodo.getValue());
            preOrderRecursivo(nodo.getLeft());
            preOrderRecursivo(nodo.getRight());
        }
    }

    public void inOrder (){
        inOrdenRecursivo(raiz);
    }

    private void inOrdenRecursivo (NodeBST nodo){
        if (nodo != null){
            inOrdenRecursivo(nodo.getLeft());
            inOrdenRecursivo(nodo.getRight());
            System.out.println(nodo.getKey() + ": " + nodo.getValue());
        }
    }


    public void postOrden() {
        postOrdenRecursivo(raiz);
    }

    private void postOrdenRecursivo(NodeBST nodo){
        if (nodo != null){
            postOrdenRecursivo(nodo.getLeft());
            postOrdenRecursivo(nodo.getRight());
            System.out.println(nodo.getKey() + ": " + nodo.getValue());
        }
    }

}
