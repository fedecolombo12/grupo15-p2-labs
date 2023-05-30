public class Nodo<T> {
        private T valor;
        private Nodo<T> siguiente;
        private Nodo<T> anterior;
        private int prioridad;

        public Nodo (T valor, int prioridad) {
            this.valor = valor;
            this.prioridad = prioridad;
        }

        public Nodo(T value) {
            this.valor = value;
            this.siguiente = null;
            this.anterior = null;
            this.prioridad = 0;
        }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo<T> anterior) {
        this.anterior = anterior;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
            this.prioridad = prioridad; }


}
