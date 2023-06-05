import org.junit.jupiter.api.Test;
import uy.edu.um.prog2.adt.exceptions.EmptyStackException;
import uy.edu.um.prog2.adt.stack.MyStack;
import uy.edu.um.prog2.adt.stack.Stack;

import static org.junit.jupiter.api.Assertions.*;

class StackTest{

    @Test
    void flujoPrincipal() throws EmptyStackException {

        MyStack<Integer> stackTest = new Stack<>();

        stackTest.push(1);
        stackTest.push(2);
        stackTest.push(3);
        stackTest.push(4);

        try {
            Integer top = stackTest.top();
            assertEquals(4,top);
        } catch (EmptyStackException e) {
            System.out.println("Empty Stack");
        }
        stackTest.imprimirStack();
        try {
            Integer eliminado = stackTest.pop();
            assertEquals(4,eliminado);
        } catch (EmptyStackException e) {
            System.out.println("Empty Stack");
        }
        assertFalse(stackTest.isEmpty());
        System.out.println(stackTest.isEmpty());
        stackTest.imprimirStack();
        stackTest.makeEmpty();
        assertTrue(stackTest.isEmpty());
        System.out.println(stackTest.isEmpty());
    }
}
