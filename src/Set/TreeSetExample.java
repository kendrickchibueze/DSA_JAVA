package Set;


import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/*It is implemented using  a binary search tree and it implements NavigableSet interface
It is used to keep large data structure and perform operations on it
Internally stringBuffer uses the treeSet.It maintains the elements in sorted
order based on their natural ordering or a specified comparator
*/
public class TreeSetExample {
    public static void main(String[] args) {
        NavigableSet<String> set1 = new TreeSet<String>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        set1.add("D");

        System.out.println(set1);
        System.out.println(set1.contains("C"));
        System.out.println(set1.higher("B"));
        System.out.println(set1.lower("D"));

    }
}
