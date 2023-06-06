import org.junit.jupiter.api.Test;
import uy.edu.um.prog2.adt.exceptions.EmptyQueueException;
import uy.edu.um.prog2.adt.queue.MyQueue;
import uy.edu.um.prog2.adt.queue.Queue;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void flujoPrincipal() {

        MyQueue<Integer> queueTest = new Queue<>();

        queueTest.enqueue(3);
        queueTest.enqueue(5);
        queueTest.enqueue(8);
        queueTest.enqueue(11);
        queueTest.enqueue(15);
        queueTest.enqueueRight(28);

        try {
            Integer eliminado = queueTest.dequeue();
            assertEquals(28,eliminado);
        } catch (EmptyQueueException e) {
            System.out.println("Queue Empty");
        }
        try {
            Integer eliminado = queueTest.dequeueLeft();
            assertEquals(15,eliminado);
        } catch (EmptyQueueException e) {
            System.out.println("Queue Empty");
        }

        assertFalse(queueTest.isEmpty());

        queueTest.imprimirQueue();

    }
}
