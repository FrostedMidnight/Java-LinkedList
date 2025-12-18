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
}
