package uy.edu.um.prog2.adt.MyHeap;

import uy.edu.um.prog2.adt.exceptions.EmptyHeapException;

public class MyHeapImpl <T extends Comparable<T>> implements MyHeap{

    private boolean heapMaximo;

    private int ultimaPosicion;

    private T[] datos;

    public MyHeapImpl(boolean heapMaximo, T[] datos) {
        this.heapMaximo = heapMaximo;
        this.datos = datos;
        this.ultimaPosicion = 0;
    }


    @Override
    public T delete() throws EmptyHeapException {
        return null;
    }

    @Override
    public int size() {
        return ultimaPosicion;
    }

    @Override
    public void insert(Comparable dato) {
        // this.datos[ultimaPosicion] = dato;
        int datoPos = ultimaPosicion;
        ultimaPosicion = ultimaPosicion + 1;

        while (dato.compareTo(getPosPadre(datoPos)) > 0 && datoPos != 0){


        }

    }

    private T getPadre(int posHijo) {
        return datos[(posHijo - 1) / 2];
    }

    private int getPosPadre (int posHijo){
        return (posHijo-1)/2;
    }
}


