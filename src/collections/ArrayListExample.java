package collections;


import java.util.ArrayList;
import java.util.List;

//It is similar to arrays but can dynamically increase or decreased in size
//It is not synchronized and uses only an iterator. It is faster than vector but it is not thread-safe
public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Kendrick");
        list.add("Joseph");
        list.add("Nelson");

        System.out.println(list);
        System.out.println(list.size());

        //forEach loop
        for(String value:list){
            System.out.println(value);
        }
    }
}
