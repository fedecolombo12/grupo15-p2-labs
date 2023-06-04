package uy.edu.um.prog2.adt.stack;

import java.util.EmptyStackException;

public class Stack<T> implements MyStack<T>{
    public Stack(NodoStack<T> ultimo) {
        this.ultimo = ultimo;
    }
    private NodoStack<T> ultimo;

    public NodoStack<T> getUltimo() {
        return ultimo;
    }
    public void setUltimo(NodoStack<T> ultimo) {
        this.ultimo = ultimo;
    }

    @Override
    public void pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            setUltimo(getUltimo().getSiguiente());
            /* Nodo<T> aux = getUltimo().getSiguiente();
            setUltimo(aux); OTRA FORMA*/
        }
    }
    @Override
    public T top() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return getUltimo().getValue();
    }

    @Override
    public void push(T element) {
        NodoStack<T> new_nodo = new NodoStack<>(element);
        if (isEmpty()) {
            setUltimo(new_nodo);
        } else {
            NodoStack<T> aux = getUltimo();
            new_nodo.setSiguiente(aux);
            setUltimo(new_nodo);
        }
    }

    @Override
    public void imprimirStack() {
        NodoStack<T> nodoActual = getUltimo();
        while (nodoActual != null) {
            System.out.println(nodoActual.getValue());
            nodoActual = nodoActual.getSiguiente();
        }
    }

    @Override
    public boolean isEmpty() {
        return getUltimo() == null;
    }

    @Override
    public void makeEmpty() {
        while (!isEmpty()) {
            pop();
        }
    }
}

