import java.util.EmptyStackException;

public class Stack<T> implements MyStack<T>{

    Nodo<T> primero;
    Nodo<T> ultimo;
    int size;
    @Override
    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = ultimo.getValue();
        if (size == 1) {
            primero = null;
            ultimo = null;
        } else {
            ultimo = ultimo.getPrev();
            ultimo.setNext(null);
        }
        size--;
        return value;
    }

    @Override
    public T top() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return ultimo.getValue();
    }

    @Override
    public void push(T element) {
        Nodo<T> newNodo = new Nodo<>(element);
        if (isEmpty()) {
            primero = newNodo;
            ultimo = newNodo;
        } else {
            ultimo.setNext(newNodo);
            newNodo.setPrev(ultimo);
            ultimo = newNodo;
        }
        size++;
    }

    @Override
    public boolean isEmpty() { //isEmpty: devuelve true si la pila esta vacia
        return size == 0;
    }

    @Override
    public void makeEmpty() {
        primero = null;
        ultimo = null;
        size = 0;
    }

}
