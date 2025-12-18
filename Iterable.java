//https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Iterable.html

//Implementing this interface allows an object to be the target of the enhanced for statement
//(sometimes called the "for-each loop" statement).
public interface Iterable<T> {
    //Returns an iterator over elements of type T.
    Iterator<T> iterator();

    //Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
    //Actions are performed in the order of iteration, if that order is specified.
    default void forEach(Consumer<? super T> action) {
        // The default implementation behaves as if:
        // for (T t : this)
        //      action.accept(t);

        Iterator<T> it = this.iterator();

        while (it.hasNext()) {
            action.accept(it.next());
        }
    }
}
