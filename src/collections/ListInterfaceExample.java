package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterfaceExample {

    public static void main(String[] args){
    /*    we cannot instantiate a list class in Java because it is an interface
        we can only use a concrete class to implement it and that is LinkedList, ArrayList, Vector*/

        List<Integer> linkedList = new LinkedList<Integer>();
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> vector = new Vector<Integer>();
    }

}
