package uy.edu.um.prog2.adt.queue;

public interface MyQueue<T> {
    void enqueue (T element); //sirve para enqueueLeft
    T dequeue () throws EmptyQueueException; // sirve para dequeueRight
    boolean isEmpty();
    void imprimirQueue();
    void enqueueRight(T element);
    T dequeueLeft () throws EmptyQueueException;
}
