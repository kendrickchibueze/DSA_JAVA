package Set;


import Map.EnumMapExample;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;

//The enumset is faster than hashset
//It does not allow null objects and uses fail-safe iterator
public class EnumSetExample {
    enum Size{
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args){
        EnumSet<Size> sizes =  EnumSet.allOf(Size.class);
        System.out.println(sizes);

        EnumSet<Size> size1 =  EnumSet.noneOf(Size.class);
        System.out.println(size1);

        EnumSet<Size> size2 =  EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
        System.out.println((size2));

        EnumSet<Size> size3 =  EnumSet.of(Size.SMALL, Size.LARGE);
        System.out.println(size3);

        Iterator<Size> iterate = sizes.iterator();
        while(iterate.hasNext())
            System.out.println(iterate.next());

    }
}
