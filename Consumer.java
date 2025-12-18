//https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/function/Consumer.html

//Represents an operation that accepts a single input argument and returns no result.

//This is a functional interface whose functional method is accept(Object).
@FunctionalInterface
public interface Consumer<T> {
    //Performs this operation on the given argument.
    void accept(T t);
}
