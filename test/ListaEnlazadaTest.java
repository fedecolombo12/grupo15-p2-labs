import uy.edu.um.prog2.adt.linkedList.ListaEnlazada;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListaEnlazadaTest {

    // Creación de una lista
    ListaEnlazada<String> nuevaLista = new ListaEnlazada<>();

    @org.junit.jupiter.api.Test
    void add() {
        nuevaLista.add("Hola");
        nuevaLista.add("Chau");

        // Chequear que el primer elemento sea "Hola"
        assertEquals("Hola", nuevaLista.getPrimero().getValue());

        // Chequear último elemento
        assertEquals("Chau", nuevaLista.getUltimo().getValue());
        }

    @org.junit.jupiter.api.Test
    void addFirst() {

        nuevaLista.addFirst("Adiós");
        nuevaLista.addFirst("Malo");
        nuevaLista.addFirst("Bueno");

        // Chequear que el primer elemento sea Bueno
        assertEquals("Bueno", nuevaLista.getPrimero().getValue());
        }

        @org.junit.jupiter.api.Test
        void addOrder() {

        nuevaLista.add("Hola");
        nuevaLista.add("Bueno");
        nuevaLista.add("Bien");

        // Chequear que "Hola" sea primer elemento
            assertEquals("Hola", nuevaLista.getPrimero().getValue());

        // Chequear ultimo valor
            assertEquals("Bien", nuevaLista.getUltimo().getValue());

        }

        @org.junit.jupiter.api.Test
        void remove() {
        }

        @org.junit.jupiter.api.Test
        void get() {
        }

        @org.junit.jupiter.api.Test
        void contains() {
        }
    }

