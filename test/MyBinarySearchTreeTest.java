

import org.junit.jupiter.api.Test;
import uy.edu.um.prog2.adt.binarySearchTree.MyBinarySearchTreeImpl;
import uy.edu.um.prog2.adt.binarySearchTree.MyBinarySearchTree;
import static org.junit.jupiter.api.Assertions.*;

public class MyBinarySearchTreeTest {
    MyBinarySearchTreeImpl<Integer,String> nuevoArbol = new MyBinarySearchTreeImpl<>();


    @Test
    void insert() {

        nuevoArbol.insert(2, "r");
        nuevoArbol.insert(1,"a");
        nuevoArbol.insert(5,"l");
        nuevoArbol.insert(3, "b");
        nuevoArbol.insert(4,"o");

        System.out.println(nuevoArbol.find(2)); // devuelve "r", lo que significa que fue INSERTADO CORRECTAMENTE
        assertEquals("r", nuevoArbol.find(2));
    }

    @Test
    void delete() {

        nuevoArbol.insert(2, "r");
        nuevoArbol.insert(1,"a");
        nuevoArbol.insert(5,"l");
        nuevoArbol.insert(3, "b");
        nuevoArbol.insert(4,"o");

    }

    @Test
    void preOrder() {
    }

    @Test
    void inOrder() {
    }

    @Test
    void posOrder() {
    }
}



