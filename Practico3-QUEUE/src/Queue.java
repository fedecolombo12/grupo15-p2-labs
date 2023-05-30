public class Queue<T> implements MyQueue<T>{

    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int size;

    @Override
    public void enqueue(T element) {
        Nodo<T> nuevoNodo = new Nodo<>(element);

        // Si la cola esta vacía, será el primer valor
        if (isEmpty()){
            primero = nuevoNodo;
        } else {
            ultimo.setSiguiente(nuevoNodo);
        }
        // busca el ultimo nodo registrado y pone al ingresado como el siguiente a ese (el cual AHORA sera el ultimo)

    ultimo = nuevoNodo;
    size = size + 1;
    }

    @Override
    public T dequeue() throws EmptyQueueException {

        // Si la cola esta vacía, tira directamente la EXCEPCIÓN
        if (isEmpty()){
            throw new EmptyQueueException();
        }

        T valor = primero.getValor();
        if (size == 1){
            primero = null;
            ultimo = null;
        } else {
            primero = primero.getAnterior();
            primero.setAnterior(null);
        }
        size = size - 1;
        return valor;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
