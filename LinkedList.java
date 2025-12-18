//https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/LinkedList.html

//Doubly-linked list implementation of the List and Deque interfaces.
//Implements all optional list operations, and permits all elements (including null).
public class LinkedList<E> extends AbstractCollection<E> {

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

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> current = LinkedList.this.head;

            @Override
            public boolean hasNext() {
                return this.current != null;
            }

            @Override
            public E next() {
                E nextE = current.val;
                current = current.next;
                return nextE;
            }
        };
    }
}
