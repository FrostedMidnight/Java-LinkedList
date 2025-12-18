//https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/LinkedList.html

//Doubly-linked list implementation of the List and Deque interfaces.
//Implements all optional list operations, and permits all elements (including null).

import java.util.NoSuchElementException;

public class LinkedList<E> extends AbstractCollection<E> implements Queue<E> {

    private static class Node<E> {

        private E val;
        private Node<E> prev, next;

        public Node(E val) {
            this.val = val;
            this.prev = this.next = null;
        }
    }

    private Node<E> head, tail;

    //Constructs an empty list.
    public LinkedList() {
        this.head = this.tail = null;
    }

    //Returns the number of elements in this list.
    @Override
    public int size() {
        int count = 0;
        Iterator<E> it = this.iterator();

        while (it.hasNext()) {
            count++;
            it.next();
        }

        return count;
    }

    //Appends the specified element to the end of this list.
    //This method is equivalent to addLast(E).
    @Override
    public boolean add(E e) {
        if (this.isEmpty()) {
            this.head = new Node<>(e);
            this.tail = this.head;
        } else {
            this.tail.next = new Node<>(e);
            this.tail.next.prev = this.tail;
            this.tail = this.tail.next;
        }

        return true;
    }

    //Retrieves, but does not remove, the head (first element) of this list.
    @Override
    public E peek() {
        if (this.isEmpty()) {
            return null;
        } else {
            return this.head.val;
        }
    }

    //Retrieves, but does not remove, the head (first element) of this list.
    @Override
    public E element() throws NoSuchElementException {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return this.head.val;
        }
    }

    //Retrieves and removes the head (first element) of this list.
    @Override
    public E poll() {
        if (this.isEmpty()) {
            return null;
        } else {
            E returnElement = this.head.val;
            this.head = this.head.next;
            this.head.prev = null;
            return returnElement;
        }
    }

    //Retrieves and removes the head (first element) of this list.
    @Override
    public E remove() throws NoSuchElementException {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            E returnElement = this.head.val;
            this.head = this.head.next;
            this.head.prev = null;
            return returnElement;
        }
    }

    //Adds the specified element as the tail (last element) of this list.
    @Override
    public boolean offer(E e) {
        if (this.isEmpty()) {
            this.head = new Node<>(e);
            this.tail = this.head;
        } else {
            this.tail.next = new Node<>(e);
            this.tail.next.prev = this.tail;
            this.tail = this.tail.next;
        }

        return true;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> current = LinkedList.this.head;

            @Override
            public boolean hasNext() {
                return this.current != null;
            }

            @Override
            public E next() throws NoSuchElementException {
                if (this.hasNext()) {
                    E nextE = current.val;
                    current = current.next;
                    return nextE;
                } else {
                    throw new NoSuchElementException();
                }
            }
        };
    }
}
