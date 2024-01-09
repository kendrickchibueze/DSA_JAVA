package collections;

import java.util.List;
import java.util.Vector;

/*
This is also a dynamic array and can grow or shrink in size. There is no size limits
it is synchronized it means only one thread at a time can access the code.It is thread safe
It uses Enumerator and iterator for traversing
It contains legacy methods not included in the collections interface framework*/
public class VectorExample {
    public static void main(String[] args){
        Vector<String> vector = new Vector<String>();
        vector.add("Programming");
        vector.add("DevOps");
        vector.add("Research");
        vector.add("Writing");

        System.out.println(vector.size());
        System.out.println(vector.remove(2));
        vector.clear();
        System.out.println(vector.size());
    }
}
