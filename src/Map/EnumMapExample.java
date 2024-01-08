package Map;

import java.util.EnumMap;

public class EnumMapExample {

    //enumMap is faster than HashMap
    enum Size{
        SMALL, MEDIUM, LARGE, EXTRALARGE

    }

    public static void main(String[] args){
        EnumMap<Size,Integer> sizes = new EnumMap<>(Size.class);
        sizes.put(Size.SMALL, 10);
        sizes.put(Size.MEDIUM, 20);
        sizes.put(Size.LARGE, 30);
        sizes.put(Size.EXTRALARGE, 40);
        System.out.println(sizes);
        System.out.println(sizes.entrySet());
        System.out.println(sizes.keySet());
        System.out.println(sizes.get(Size.LARGE));
        System.out.println(sizes.values());
    }

}
