package uy.edu.um.prog2.adt.hash;

public class NodoHash<K, V> implements Comparable<NodoHash<K, V>> {
    private K key;
    private V value;
    private NodoHash<K, V> next;
    public NodoHash(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public NodoHash<K, V> getNext() {
        return next;
    }

    public void setNext(NodoHash<K, V> next) {
        this.next = next;
    }

    @Override
    public int compareTo(NodoHash<K, V> o) {
        return 0;
    }
}
