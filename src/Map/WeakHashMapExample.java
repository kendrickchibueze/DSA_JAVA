package Map;

import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args)  {
        WeakHashMap<String, Integer> numbers = new WeakHashMap<String, Integer>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Five", 5);

        String four = new String("Four");
        Integer fourValue = 4;
        numbers.put(four, fourValue);
        System.out.println("Before gc :" + numbers);

        //we can also assign a null value but we have to clear the garbage collection for it to work
        four = null;
        System.gc();
        System.out.println( "After gc : " + numbers);

    }
}
