import java.util.NoSuchElementException;

// A linear collection that supports element insertion and removal at both ends.
// The name deque is short for "double ended queue" and is usually pronounced "deck".

public interface Deque<E> extends Queue<E>, SequencedCollection<E> {
    // Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
    // When using a capacity-restricted deque, it is generally preferable to use method offerFirst(E).
    @Override
    void addFirst(E e)
        throws IllegalStateException, NullPointerException, IllegalArgumentException;

    // Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
    // When using a capacity-restricted deque, it is generally preferable to use method offerLast(E).
    @Override
    void addLast(E e)
        throws IllegalStateException, NullPointerException, IllegalArgumentException;

    // Inserts the specified element at the end of this deque unless it would violate capacity restrictions.
    // When using a capacity-restricted deque, this method is generally preferable to the addLast(E) method, which can fail to insert an element only by throwing an exception.
    boolean offerFirst(E e)
        throws NullPointerException, IllegalArgumentException;

    // Inserts the specified element at the end of this deque unless it would violate capacity restrictions.
    // When using a capacity-restricted deque, this method is generally preferable to the addLast(E) method, which can fail to insert an element only by throwing an exception.
    boolean offerLast(E e)
        throws NullPointerException, IllegalArgumentException;

    // Retrieves and removes the first element of this deque.
    // This method differs from pollFirst only in that it throws an exception if this deque is empty.
    @Override
    E removeFirst() throws NoSuchElementException;

    // Retrieves and removes the last element of this deque.
    // This method differs from pollLast only in that it throws an exception if this deque is empty.
    @Override
    E removeLast() throws NoSuchElementException;

    // Retrieves and removes the first element of this deque, or returns null if this deque is empty.
    E pollFirst();

    // Retrieves and removes the last element of this deque, or returns null if this deque is empty.
    E pollLast();

    // Retrieves, but does not remove, the first element of this deque.
    // This method differs from peekFirst only in that it throws an exception if this deque is empty.
    @Override
    E getFirst();

    // Retrieves, but does not remove, the last element of this deque.
    // This method differs from peekLast only in that it throws an exception if this deque is empty.
    @Override
    E getLast();

    // Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
    E peekFirst();

    // Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
    E peekLast();

    // Returns a reverse-ordered view of this collection.
    @Override
    default Deque<E> reversed() {
        // The implementation in this interface returns a reverse-ordered Deque view.
        // The reversed() method of the view returns a reference to this Deque.
        // Other operations on the view are implemented via calls to public methods on this Deque.
        // The exact relationship between calls on the view and calls on this Deque is unspecified.
        // However, order-sensitive operations generally behave as if they delegate to the appropriate method with the opposite orientation.
        // For example, calling getFirst on the view might result in a call to getLast on this Deque.

        // TODO: Implement reverse() in Deque interface
        return null;
    }
}
