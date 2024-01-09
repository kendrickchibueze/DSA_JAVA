package Set;


import java.util.NavigableSet;
import java.util.TreeSet;

//It inherits from sortedset and can be traversed either in ascending or descending order
// It provides additional methods for navigating through the elements in a specific order
public class NavigableSetExample {
    public static void main(String[] args){
        NavigableSet<Integer> set = new TreeSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        NavigableSet<Integer> reversedSet = set.descendingSet();
        System.out.println(set);
        System.out.println(reversedSet);

        NavigableSet<Integer> threeorMore = set.tailSet(50, true);
        System.out.println(threeorMore);

    }
}
