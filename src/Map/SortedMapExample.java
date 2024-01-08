package Map;


/*SortedMap interface is implemented by TreeMap and ConcurrentSkipListMap classes
consider using sorted map when the following critera is met:
-null key or null value is not permitted
-The keys are sorted either by natural ordering or by specific comparator*/

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args){

        SortedMap<String, Integer> numbers = new TreeMap<String, Integer>();
        numbers.put("ONE", 1);
        numbers.put("TWO", 2);
        System.out.println(numbers);
        System.out.println(numbers.firstKey());
        System.out.println(numbers.lastKey());
        System.out.println(numbers.values());

    }
}
