package Map;

import java.util.LinkedHashMap;


 /*HashMap provided the advantage of quick insertion, search, and deletion. Allows null keys and values but it never maintained
 the track and order of insertion, which the LinkedHashMap
 provides where the elements can be accessed in their insertion order.*/
public class LinkedHashMapExample {


    public static void main(String[] args){
        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<String, Integer>();
        evenNumbers.put("fNumber", 2);
        evenNumbers.put("sNumber", 4);
        System.out.println(evenNumbers);

        //creating a new Hashmap out of an existing hashmap
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<String, Integer>(evenNumbers);
        numbers.put("tNumber", 6);
        System.out.println(numbers);
    }
}
