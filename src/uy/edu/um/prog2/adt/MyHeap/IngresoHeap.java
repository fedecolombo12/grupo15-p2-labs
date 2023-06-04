package uy.edu.um.prog2.adt.MyHeap;

public class IngresoHeap<F> implements Comparable<IngresoHeap<F>> {

    private F dato;
    private float clave;

    @Override
    public int compareTo(IngresoHeap C) {
        if (this.clave > C.getClave()){
            return 1;
        } else if (this.clave < C.getClave()) {
            return -1;
        }
        return 0;
    }

    public F getDato() {
        return dato;
    }

    public void setDato(F dato) {
        this.dato = dato;
    }

    public float getClave() {
        return clave;
    }

    public void setClave(float clave) {
        this.clave = clave;
    }
}
