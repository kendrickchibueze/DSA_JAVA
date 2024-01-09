package Set;

import java.util.*;


//Elements are sorted in ascending order and duplicate elements are removed
//All elements inserted into a sorted set must implement the Comparable interface
public class SortedSetExample {

    public static void main(String[] args){
       SortedSet<String> set1 = new TreeSet<String>();
       set1.add("Australia");
        set1.add("Nigeria");
        set1.add("USA");
        set1.add("Canada");

        System.out.println(set1);

        Iterator<String> iterator = set1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(set1.remove("Nigeria"));
    }
}
