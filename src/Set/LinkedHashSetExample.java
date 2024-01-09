package Set;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*Hash table and linked list implementation of the Set interface, with predictable iteration order.
This is an ordered version of HashSet that maintains a doubly linkedlist across all its element
the elements would be returned in order it was inserted.Thus,it maintains
the insertion order of elements and does not allow duplicate elements

*/
public class LinkedHashSetExample {
    public static void main(String[] args){
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);

        /*LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>(evenNumbers);
        System.out.println(numbers);*/

        //if the arraylist is not ready
        LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
        numbers.addAll(evenNumbers);
        numbers.add(8);
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
