package src;
// https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/SequencedCollection.html

// A collection that has a well-defined encounter order, that supports operations at both ends, and that is reversible.
// The elements of a sequenced collection have an encounter order, where conceptually the elements have a linear arrangement from the first element to the last element.
// Given any two elements, one element is either before (closer to the first element) or after (closer to the last element) the other element.

import java.util.NoSuchElementException;

import src.Collection;

public interface SequencedCollection<E> extends Collection<E> {
    // Returns a reverse-ordered view of this collection.
    SequencedCollection<E> reversed();

    // Adds an element as the first element of this collection (optional operation).
    default void addFirst(E e) throws UnsupportedOperationException {
        // The implementation in this interface always throws UnsupportedOperationException.
        throw new UnsupportedOperationException();
    }

    // Adds an element as the last element of this collection (optional operation).
    default void addLast(E e) throws UnsupportedOperationException {
        // The implementation in this interface always throws UnsupportedOperationException.
        throw new UnsupportedOperationException();
    }

    // Gets the first element of this collection.
    default E getFirst() throws NoSuchElementException {
        // The implementation in this interface obtains an iterator of this collection, and then it obtains an element by calling the iterator's next method.
        // Any NoSuchElementException thrown is propagated. Otherwise, it returns the element.
        return this.iterator().next();
    }

    // Gets the last element of this collection.
    default E getLast() throws NoSuchElementException {
        // The implementation in this interface obtains an iterator of the reversed view of this collection, and then it obtains an element by calling the iterator's next method.
        // Any NoSuchElementException thrown is propagated. Otherwise, it returns the element.
        return this.reversed().iterator().next();
    }

    // Removes and returns the first element of this collection (optional operation).
    default E removeFirst()
        throws UnsupportedOperationException, NoSuchElementException {
        // The implementation in this interface obtains an iterator of this collection, and then it obtains an element by calling the iterator's next method.
        // Any NoSuchElementException thrown is propagated. It then calls the iterator's remove method.
        // Any UnsupportedOperationException thrown is propagated. Then, it returns the element.
        Iterator<E> it = this.iterator();

        E returnElement = it.next();
        it.remove();

        return returnElement;
    }

    // Removes and returns the last element of this collection (optional operation).
    default E removeLast()
        throws UnsupportedOperationException, NoSuchElementException {
        // The implementation in this interface obtains an iterator of the reversed view of this collection, and then it obtains an element by calling the iterator's next method.
        // Any NoSuchElementException thrown is propagated. It then calls the iterator's remove method.
        // Any UnsupportedOperationException thrown is propagated. Then, it returns the element.
        Iterator<E> it = this.reversed().iterator();

        E returnElement = it.next();
        it.remove();

        return returnElement;
    }
}
