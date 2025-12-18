package src;
//https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Queue.html

//A collection designed for holding elements prior to processing.

import java.util.NoSuchElementException;

import src.Collection;

public interface Queue<E> extends Collection<E> {
    //Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions,
    //returning true upon success and throwing an IllegalStateException if no space is currently available.
    @Override
    boolean add(E e)
        throws IllegalStateException, NullPointerException, IllegalArgumentException;

    //Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
    //When using a capacity-restricted queue, this method is generally preferable to add(E),
    //which can fail to insert an element only by throwing an exception.
    boolean offer(E e) throws NullPointerException, IllegalArgumentException;

    //Retrieves and removes the head of this queue.
    //This method differs from poll() only in that it throws an exception if this queue is empty.
    E remove() throws NoSuchElementException;

    //Retrieves and removes the head of this queue, or returns null if this queue is empty.
    E poll();

    //Retrieves, but does not remove, the head of this queue.
    //This method differs from peek only in that it throws an exception if this queue is empty.
    E element() throws NoSuchElementException;

    //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
    E peek();
}
