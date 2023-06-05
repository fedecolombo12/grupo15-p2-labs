import uy.edu.um.prog2.adt.binarySearchTree.MyBinarySearchTreeImpl;

public class MyBinarySearchTreeTest {

    public static void main(String[] args) {
        MyBinarySearchTreeImpl<Integer,String> prueba = new MyBinarySearchTreeImpl<>();

        prueba.insert(6, "Perros");
        prueba.insert(8,"Gatos");
        prueba.insert(3,"Hamsters");
        prueba.insert(1, "Pez");
        prueba.insert(4, "Gallinas");

        System.out.println(prueba.find(6)); //Devuelve perros, que es la información que tiene 6

        System.out.println("PreOden: ");
        prueba.preOrder();

        System.out.println("InOrden: ");
        prueba.inOrder();

        System.out.println("PostOrden: ");
        prueba.postOrden();
    }
}
