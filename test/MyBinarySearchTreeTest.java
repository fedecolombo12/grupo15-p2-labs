import org.junit.jupiter.api.Test;
import uy.edu.um.prog2.adt.binarySearchTree.MyBinarySearchTreeImpl;
import static org.junit.jupiter.api.Assertions.*;

import uy.edu.um.prog2.adt.binarySearchTree.NodeBST;
import uy.edu.um.prog2.adt.linkedList.ListaEnlazada;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MyBinarySearchTreeTest {
    MyBinarySearchTreeImpl<Integer,String> nuevoArbol = new MyBinarySearchTreeImpl<>();


    @Test
    void insert() {

        nuevoArbol.insert(2, "r");
        nuevoArbol.insert(1,"a");
        nuevoArbol.insert(5,"l");
        nuevoArbol.insert(3, "b");
        nuevoArbol.insert(4,"o");

        System.out.println("Chequear INSERTS: ");
        nuevoArbol.printTree();
        System.out.println("Letra a eliminar: ");
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


        nuevoArbol.delete(2);
        System.out.println("Árbol con elemento eliminado: ");
        nuevoArbol.printTree();
    }

    @Test
    void preOrder() {
        ListaEnlazada<NodeBST<Integer, String>> listaPreO = nuevoArbol.preOrder();

        nuevoArbol.insert(2, "r");
        nuevoArbol.insert(1,"a");
        nuevoArbol.insert(5,"l");
        nuevoArbol.insert(3, "b");
        nuevoArbol.insert(4,"o");

        System.out.println("Pre Order: ");
        System.out.println(nuevoArbol.preOrder());

    }

    @Test
    void inOrder() {
        nuevoArbol.insert(2, "r");
        nuevoArbol.insert(1,"a");
        nuevoArbol.insert(5,"l");
        nuevoArbol.insert(3, "b");
        nuevoArbol.insert(4,"o");

        System.out.println("In Order: ");
        nuevoArbol.inOrder();
    }


    @Test
    void posOrder() {
        nuevoArbol.insert(2, "r");
        nuevoArbol.insert(1,"a");
        nuevoArbol.insert(5,"l");
        nuevoArbol.insert(3, "b");
        nuevoArbol.insert(4,"o");

        System.out.println("Pos Order: ");
        nuevoArbol.posOrder();

        // nuevoArbol.posOrder().imprimirLista();
        // uy.edu.um.prog2.adt.binarySearchTree.NodeBST@1efee8e7, uy.edu.um.prog2.adt.binarySearchTree.NodeBST@1ee807c6,
        // uy.edu.um.prog2.adt.binarySearchTree.NodeBST@76a4d6c,
        // uy.edu.um.prog2.adt.binarySearchTree.NodeBST@517cd4b, uy.edu.um.prog2.adt.binarySearchTree.NodeBST@6cc7b4de,
        }
    }




