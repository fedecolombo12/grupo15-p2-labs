import uy.edu.um.prog2.adt.hash.MyHash;
import uy.edu.um.prog2.adt.hash.TablaHash;

public class HashTest {
    public static void main(String[] args) {
        // Crea una instancia de MyHashTable
        MyHash<String, Integer> hashTable = new TablaHash<>(10);

        // Prueba el método put()
        hashTable.put("A", 1);
        hashTable.put("B", 2);
        hashTable.put("C", 3);

        // Prueba el método contains()
        System.out.println("Contiene 'A': " + hashTable.contains("A")); // Debe imprimir true
        System.out.println("Contiene 'D': " + hashTable.contains("D")); // Debe imprimir false

        // Prueba el método get()
        System.out.println("Valor de 'B': " + hashTable.get("B")); // Debe imprimir 2

        // Prueba el método printHashTable()
        hashTable.printHash(); // Debe imprimir la estructura de la tabla hash

        // Prueba el método remove()
        hashTable.remove("B");
        System.out.println("Contiene 'B' después de eliminar: " + hashTable.contains("B")); // Debe imprimir false

        // Prueba los métodos size() e isEmpty()
        System.out.println("Tamaño de la tabla: " + hashTable.size()); // Debe imprimir 2
        System.out.println("La tabla está vacía: " + hashTable.isEmpty()); // Debe imprimir false
    }
}
