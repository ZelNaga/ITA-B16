package lesson8;

import java.util.LinkedList;

/**
 * Created by asv on 05.06.17.
 */
public class OurStack<T> {

    private LinkedList<T> ll = new LinkedList<>();

    public boolean empty() {

        return ll.isEmpty();
    }

    public T peek( ) {

        return ll.peek();
    }

    public T pop( ) {

        return ll.pop();
    }

    public void push(T element) {

        ll.push(element);
    }

    public boolean search(T element) {

        return ll.contains(element);
    }
}
