package uy.edu.um.prog2.adt.binarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class MyBinarySearchTreeImpl <K extends Comparable<K>, T> implements MyBinarySearchTree<K, T> {

    private NodeBST<K, T> raiz;

    public NodeBST<K, T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NodeBST<K, T> raiz) {
        this.raiz = raiz;
    }

    public MyBinarySearchTreeImpl() {
        this.raiz = null;
    }

    @Override
    public T find(K key) {
        return findRec(key, raiz);
    }

    public T findRec(K keyBuscar, NodeBST<K,T> nuevoNodo){
        T valInicial = null;
        if (raiz != null){
        int valor = keyBuscar.compareTo(nuevoNodo.getKey());
            if (valor > 0) {
               valInicial = findRec(keyBuscar, nuevoNodo.getRight());
            } else if (valor == 0) {
                valInicial = raiz.getValue();
            } else {
                valInicial = findRec(keyBuscar, raiz.getLeft());
            }
        }
        return valInicial;
    }


    @Override
    public void insert(K key, T data) {
        NodeBST<K,T> ingreso = new NodeBST<>(key,data);
        if (raiz == null){
            raiz = ingreso;
        } else {
            raiz.ingresoRec(key,data);
        }
    }

    @Override
    public void delete(K key) {
        if (raiz != null){
            raiz = raiz.deleteRec(key);
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

    @Override
    public List<K> preOrder() {
        List<K> nuevaList = new ArrayList<K>();
        if (raiz != null){
            nuevaList.addAll(raiz.preOrderT());
        }
        return nuevaList;
    }

    @Override
    public List<K> inOrder() {
        List<K> nuevaLista = new ArrayList<K>();
        if (raiz != null){
            nuevaLista.addAll(raiz.inOrderT());
        }
        return nuevaLista;
    }

    @Override
    public List<K> posOrder() {
        List<K> nuevaLis = new ArrayList<K>();
        if (raiz != null){
            nuevaLis.addAll(raiz.posOrderT());
        }
        return nuevaLis;
    }

}



