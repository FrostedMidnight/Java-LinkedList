//https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Collection.html

//The root interface in the collection hierarchy.
//A collection represents a group of objects, known as its elements.
//Some collections allow duplicate elements and others do not.
//Some are ordered, and others are unordered.
public interface Collection<E> extends Iterable<E> {
    //Returns the number of elements in this collection.
    //If this collection contains more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
    int size();

    //Returns true if this collection contains no elements.
    boolean isEmpty();

    //Returns an iterator over the elements in this collection.
    @Override
    Iterator<E> iterator();

    //Ensures that this collection contains the specified element (optional operation).
    boolean add(E e)
        throws UnsupportedOperationException, NullPointerException, IllegalArgumentException, IllegalStateException;
}
