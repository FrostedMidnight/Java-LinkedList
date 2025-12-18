package src;
//https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/AbstractCollection.html

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
