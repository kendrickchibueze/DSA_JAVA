package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//This operates like LIFO and it implements the null element; it offers constant time performance for operations(add,remove,contains,size)
//This Java Set implementations does not allow duplicate elements and does not maintain any specific order of elements
public class HashSetExample {
    public static void main(String[] args){
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        System.out.println(numbers);

        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }

        System.out.println(numbers.remove(300));
        System.out.println(numbers);

        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(100);
        set1.add(200);
        set1.add(300);
        set1.add(400);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(100);
        set2.add(200);
        set2.add(300);
        set2.add(500);

        //union of set
        //set1.addAll(set2);
        //System.out.println(set1);

        //intersection of set
        set1.retainAll(set2);
        System.out.println(set1);

        set2.removeAll(set1);
        System.out.println(set2);



    }
}
