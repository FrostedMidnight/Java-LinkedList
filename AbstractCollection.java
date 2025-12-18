//https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/AbstractCollection.html

//This class provides a skeletal implementation of the Collection interface, to minimize the effort required to implement this interface.

//To implement an unmodifiable collection, the programmer needs only to extend this class and provide implementations for the iterator and size methods.
//(The iterator returned by the iterator method must implement hasNext and next.)

//To implement a modifiable collection, the programmer must additionally override this class's add method (which otherwise throws an UnsupportedOperationException),
//and the iterator returned by the iterator method must additionally implement its remove method.
public abstract class AbstractCollection<E> implements Collection<E> {

    //Sole constructor. (For invocation by subclass constructors, typically implicit.)
    protected AbstractCollection() {}

    //Returns an iterator over the elements contained in this collection.
    @Override
    public abstract Iterator<E> iterator();

    //Returns true if this collection contains no elements.
    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    //Ensures that this collection contains the specified element (optional operation).
    public boolean add(E e)
        throws UnsupportedOperationException, NullPointerException, IllegalArgumentException, IllegalStateException {
        //This implementation always throws an UnsupportedOperationException.
        throw new UnsupportedOperationException();
    }

    //Returns a string representation of this collection.
    @Override
    public String toString() {
        //The string representation consists of a list of the collection's elements in the order they are returned by its iterator, enclosed in square brackets ("[]").
        //Adjacent elements are separated by the characters ", " (comma and space).

        if (this.isEmpty()) {
            return "[]";
        } else {
            StringBuilder sb = new StringBuilder("[");

            forEach(i -> sb.append(i).append(", "));

            int replaceIndex = sb.lastIndexOf(", ");
            sb.replace(replaceIndex, replaceIndex + 1, "]");

            return sb.toString();
        }
    }
}
