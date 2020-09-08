package Questions;

/**
 * This class provides answers to the questions asked in the Basics class
 */
public class Answers {
    /**
     * 1. Data structure is a structure that holds data. It is how data is represented. Data structures are
     * distinguished from each other by their memory usage and performance characteristics.
     * eg:- Arrays, Stack, Queue, LinkedList, Tree
     *
     * Collection Framework provides an architecture in Java to implement these data structures. Search, insertion,
     * deletion, Sorting and manipulation are performed using Collection framework.
     *eg :- Set, List, Queue etc.
     */

    /**
     * 2. Collection framework has a set of interfaces and classes.
     * Interfaces :  List, Set, Queue, Dequeue,SortedSet etc.
     * Classes : ArrayList,HashSet,LinkedList, TreeSet, Vector etc.
     * There are no classes implementing Collection framework directly as of today.
     * A class implementing a collection framework (directly or indirectly) should contain 2 constructors.
     * i) no-arg constructor
     * ii) that accepts a Collection object as arg
     * There is no way to enforce this convention as interfaces cannot contain constructors. But all the
     * general purposes implementations comply.
     */

    /**
     * 3. toArray(): The return type of this method is Object[].
     * If we need it to be of any particular type, we need to type cast it. Otherwise we get compilation error.
     * toArray(T[]) :  The return type of this method is T[].
     * The type of the expected array is passed as arg. Hence there is no need for type casting.
     * If the array passed has enough space, the elements would be stored in the array itself. Otherwise,
     * a new array is created with the same type and size of the given list.
     * ArrayStoreException is thrown if the type of the elements is not the same as the type of the array.
     */

    /**
     * 4. Equals method compares the given object with the passed object. In List and set, instead of the
     * reference comparison, value comparison takes place using an iterator. List and Set objects can be compared
     * only to themselves. The implementations are given inside AbstractList and AbstractSet classes respectively.
     */
}
