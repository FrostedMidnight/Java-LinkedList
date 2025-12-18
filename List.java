// https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/List.html

// An ordered collection, where the user has precise control over where in the list each element is inserted.
// The user can access elements by their integer index (position in the list), and search for elements in the list.

import java.util.Comparator;

public interface List<E> extends SequencedCollection<E> {
    // TODO: Implement sort() in List interface
    // Sorts this list according to the order induced by the specified Comparator (optional operation).
    default void sort(Comparator<? super E> c) {
        // The default implementation obtains an array containing all elements in this list, sorts the array, and iterates over this list resetting each element from the corresponding position in the array.
        E arr[] = (E[]) new Object[this.size()];

        Iterator<E> it = this.iterator();
        int current = 0;

        while (it.hasNext()) {
            arr[current] = it.next();
            current++;
        }

        int smallestIndex;

        for (int i = 0; i < this.size(); i++) {
            smallestIndex = i;
            for (int j = i; j < this.size(); j++) {
                if (c.compare(arr[j], arr[smallestIndex]) < 0) {
                    smallestIndex = j;
                }
            }

            E temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }

        it = this.iterator();

        while (it.hasNext()) {
            arr[current] = it.next();
            current++;
        }
    }
}
