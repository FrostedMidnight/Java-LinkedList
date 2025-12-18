package src;
//https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Iterator.html

//An iterator over a collection.

import java.util.NoSuchElementException;

public interface Iterator<E> {
    //Returns true if the iteration has more elements.
    boolean hasNext();

    //Returns the next element in the iteration.
    E next() throws NoSuchElementException;

    //Removes from the underlying collection the last element returned by this iterator (optional operation).
    //This method can be called only once per call to next().
    default void remove()
        throws UnsupportedOperationException, IllegalStateException {
        //The default implementation throws an instance of UnsupportedOperationException and performs no other action.
        throw new UnsupportedOperationException();
    }
}
