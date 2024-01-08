package Map;

import java.util.HashMap;
import java.util.Map;

/*ConcurrentHashMap is an enhancement of HashMap as
we know that while dealing with Threads in our application HashMap
is not a good choice because performance-wise HashMap is not up to the mark.
ConcurrentHashMap is a thread-safe implementation of the Map interface in Java,
which means multiple threads can access it simultaneously without any synchronization issues.*/


public class HashMapExample {

    public static void main(String[] args){
         Map<Integer, String> map = new HashMap<Integer, String>();
         map.put(100, "My new HashMap");
         map.put(101, "While Learning Java DSA");
         map.put(102, "After Learning C#/.NET");
        map.put(103, "After Learning NodeJs");

         for(Map.Entry<Integer, String> m : map.entrySet()) {
             System.out.println(m.getKey() + ":" + m.getValue());
         }
         System.out.println(map.get(101));
        System.out.println(map.entrySet());
        System.out.println(map.remove(103));
        System.out.println(map.values());

    }
}
