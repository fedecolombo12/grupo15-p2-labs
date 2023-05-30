
import java.util.EmptyStackException;

public class StackArray <T> implements MyStack<T> {

        private final T[] stackArray;
        private int topIndice;

        public StackArray(int size) {
            stackArray = (T[]) new Object[size];
            topIndice = -1;
        }

        @Override
        public T pop() throws EmptyStackException {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            T value = stackArray[topIndice];
            stackArray[topIndice] = null;
            topIndice--;
            return value;
        }

        @Override
        public T top() throws EmptyStackException {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return stackArray[topIndice];
        }

        @Override
        public void push(T element) {
            if (topIndice == stackArray.length - 1) {
                throw new StackOverflowError();
            }
            topIndice = topIndice+1;
            stackArray[topIndice] = element;
        }

        @Override
        public boolean isEmpty() {
            return topIndice == -1;
        }

        @Override
        public void makeEmpty() {
            while (!isEmpty()) {
                pop();
            }
        }
    }

