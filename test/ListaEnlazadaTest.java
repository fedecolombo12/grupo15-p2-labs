import uy.edu.um.prog2.adt.linkedList.ListaEnlazada;
import static org.junit.jupiter.api.Assertions.*;

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
    void remove() {
            nuevaLista.add("A");
            nuevaLista.add("B");
            nuevaLista.add("C");

            // Chequeo si el elemento a REMOVER esta en la lista
            assertTrue(nuevaLista.contains("B"));

            // REMUEVO
            nuevaLista.remove("B");

            // Chequeo que haya sido eliminado y que los otros dos siguen ahí
            assertFalse(nuevaLista.contains("B"));
            assertTrue(nuevaLista.contains("A"));
            assertTrue(nuevaLista.contains("C"));
        }

    @org.junit.jupiter.api.Test
    void get() {

        nuevaLista.add("A");
        nuevaLista.add("B");
        nuevaLista.add("C");

        // Get posicion 1
        assertEquals("A", nuevaLista.get(1));
        assertEquals("B", nuevaLista.get(2));

        // Get el valor de una posicion que NO EXISTE (EXCEPCIÓN)
        assertNull(nuevaLista.get(6));

        }

        @org.junit.jupiter.api.Test
        void contains() {

        nuevaLista.add("A");
        nuevaLista.add("B");
        nuevaLista.add("C");

        // Chequear si "A" esta en la lista

            assertTrue(nuevaLista.contains("A"));
            assertFalse(nuevaLista.contains("G"));
        }
    }

