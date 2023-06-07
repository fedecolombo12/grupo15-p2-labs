package uy.edu.um.prog2.adt.binarySearchTree;
import uy.edu.um.prog2.adt.linkedList.ListaEnlazada;


public class MyBinarySearchTreeImpl <K extends Comparable<K>, T> implements MyBinarySearchTree<K, T> {
    private NodeBST<K, T> raiz;
    private ListaEnlazada<NodeBST<K, T>> orden;

    public NodeBST<K, T> getRaiz() {return raiz;}
    public void setRaiz(NodeBST<K, T> raiz) {
        this.raiz = raiz;
    }
    public MyBinarySearchTreeImpl() {
        this.raiz = null;
    }
    @Override
    public T find(K key) {
        return findRec(key, getRaiz());
    }

    public T findRec(K keyBuscar, NodeBST<K,T> nuevoNodo){
        T valInicial = null;
        if (getRaiz() != null){
        int valor = keyBuscar.compareTo(nuevoNodo.getKey());
            if (valor > 0) {
               valInicial = findRec(keyBuscar, nuevoNodo.getRight());
            } else if (valor == 0) {
                valInicial = getRaiz().getValue();
            } else {
                valInicial = findRec(keyBuscar, getRaiz().getLeft());
            }
        }
        return valInicial;
    }
    @Override
    public void insert(K key, T data) {
        NodeBST<K,T> ingreso = new NodeBST<>(key,data);
        if (getRaiz() == null){
            setRaiz(ingreso);
        } else {
            getRaiz().ingresoRec(key,data);
        }
    }

    @Override
    public void delete(K key) {
        if (getRaiz() != null){
            setRaiz(getRaiz().deleteRec(key));
        }
    }

    @Override
    public ListaEnlazada preOrder() {
        ListaEnlazada<NodeBST<K, T>> listPreO = new ListaEnlazada<>();
        this.preOrderR(this.raiz, listPreO);
        return listPreO;
    }

    private void preOrderR(NodeBST<K, T> node, ListaEnlazada<NodeBST<K, T>> nodeListPreO){
        if (node != null){
            nodeListPreO.add(node);
            this.preOrderR(node.getLeft(), nodeListPreO);
            this.preOrderR(node.getRight(), nodeListPreO);
        }
    }

    @Override
    public ListaEnlazada inOrder() {
        ListaEnlazada<NodeBST<K, T>> listInO = new ListaEnlazada<>();
        this.inOrderR(this.raiz, listInO);
        return listInO;
    }


    private void inOrderR(NodeBST<K, T> node, ListaEnlazada<NodeBST<K, T>> nodeListInO){
        if (node != null){
            this.inOrderR(node.getLeft(), nodeListInO);
            nodeListInO.add(node);
            this.inOrderR(node.getRight(),nodeListInO);
        }
    }


    @Override
    public ListaEnlazada posOrder() {
        ListaEnlazada<NodeBST<K, T>> listPosO = new ListaEnlazada<>();
        this.posOrderR(this.raiz, listPosO);
        return listPosO;
    }
    private void posOrderR(NodeBST<K, T> node, ListaEnlazada<NodeBST<K, T>> nodeListPosO) {
        if (node != null) {
            this.posOrderR(node.getLeft(), nodeListPosO);
            this.posOrderR(node.getRight(), nodeListPosO);
            nodeListPosO.add(node);
        }

    }

    public NodeBST min(NodeBST<K,T> node){
        if (node.getLeft() == null){
            return node;
        }
        return min(node.getLeft());
    }

    public NodeBST delMin(NodeBST<K,T> node){
        if (node.getLeft() == null){
            return node.getRight();
        }
        node.setLeft(delMin(node.getLeft()));
        return node;
    }

    public void printTree() {
        printTreeRec(getRaiz());
    }

    private void printTreeRec(NodeBST<K, T> node) {
        if (node != null) {
            printTreeRec(node.getLeft());
            System.out.println(node.getKey() + ": " + node.getValue());
            printTreeRec(node.getRight());
        }
    }


}



