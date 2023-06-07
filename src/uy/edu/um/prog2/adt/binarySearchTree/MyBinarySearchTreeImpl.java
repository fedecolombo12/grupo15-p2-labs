package uy.edu.um.prog2.adt.binarySearchTree;
import uy.edu.um.prog2.adt.binarySearchTree.NodeBST;
import uy.edu.um.prog2.adt.linkedList.ListaEnlazada;

import java.util.List;


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
        return null;
    }

    @Override
    public ListaEnlazada inOrder() {
        return null;
    }

    @Override
    public ListaEnlazada posOrder() {
        ListaEnlazada<NodeBST<K, T>> list = new ListaEnlazada<>();
        this.postOrderHelper(this.raiz, list);
        return list;
    }


    private void postOrderHelper(NodeBST<K, T> node, ListaEnlazada<NodeBST<K, T>> list) {
        if (node != null) {
            this.postOrderHelper(node.getLeft(), list);
            this.postOrderHelper(node.getRight(), list);
            list.add(node);
        }

    }

    public void printPosOrder() {
        ListaEnlazada<NodeBST<K, T>> posOrderList = posOrder();
        System.out.println(posOrderList);
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



