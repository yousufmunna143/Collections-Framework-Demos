import java.util.*;

public class LearnHashSet 
{
    public static void main(String[] args)
    {
        /*
         * All these 3 classes implement Set interface.Hence common property is uniqueness of elements 
         * HashSet:
         * -> HashSet is an unordered collection that uses a hash table to store elements.
        *  -> Elements in a HashSet are not stored in any particular order, and there is no guarantee of their order when you iterate through the set.
        *  -> HashSet offers constant-time average complexity for basic operations like add, remove, and contains.
        *  -> HashSet is typically the fastest option for most operations among the three, but it doesn't maintain any specific order.
         * 
         * LinkedHashSet:
         * -> LinkedHashSet is an ordered collection that combines the features of HashSet and a linked list.
        *  -> Elements in a LinkedHashSet are stored in the order they were added, which means they maintain the insertion order.
        *  -> It offers the same constant-time average complexity for basic operations as HashSet.
         * 
         * TreeSet:
         * -> TreeSet is an ordered collection that uses a Red-Black Tree (a type of balanced binary search tree) to store elements.
        *  -> Elements in a TreeSet are stored in sorted order, either in their natural order (comparable) or according to a custom comparator.
        *  -> TreeSet is suitable when you need a sorted set of elements.
        *  -> Basic operations like add, remove, and contains have a time complexity of O(log n) because of the underlying balanced tree structure.

        SUMMARY:
        * -> HashSet is unordered and uses a hash table.
        * -> TreeSet is ordered and uses a Red-Black Tree for sorting.
        * -> LinkedHashSet is ordered and maintains insertion order by using both a hash table and a linked list.
        * -> Your choice of which set implementation to use depends on your specific requirements. If you need a fast and unordered collection with no duplicates, HashSet is a good choice. If you need elements sorted in a specific order, TreeSet is the way to go. If you need elements to be stored in the order they were added, LinkedHashSet is appropriate.
         */
        // HashSet<Integer> set = new HashSet<>();
        // TreeSet<Integer> set = new TreeSet<>();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(34);
        set.add(55);
        set.add(344);
        set.add(32);
        set.add(22);
        set.add(26);
        set.add(34);

        System.out.println(set);

        set.remove(34);

        System.out.println(set);

        System.out.println(set.contains(34));
        System.out.println(set.contains(22));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
    
}
