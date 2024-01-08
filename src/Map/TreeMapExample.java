package Map;

import java.util.TreeMap;


/* The treemap implementation is not synchronized in the sense that if a map is accessed by multiple threads,
concurrently and at least one of the threads modifies the map structurally, it must be synchronized externally.*/
public class TreeMapExample {

    public static void main(String[] args){
        TreeMap<String, Integer> numbers = new TreeMap<String, Integer>();
        numbers.put("ONE", 1);
        numbers.put("TWO", 2);

        numbers.putIfAbsent("TWO", 2);
        numbers.putIfAbsent("Three", 3);
        numbers.putIfAbsent("Four", 4);
        System.out.println(numbers);
        System.out.println(numbers.entrySet());
        System.out.println(numbers.keySet());
        System.out.println(numbers.pollLastEntry());
    }
}
