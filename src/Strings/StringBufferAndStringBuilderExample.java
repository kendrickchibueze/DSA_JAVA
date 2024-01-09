package Strings;

public class StringBufferAndStringBuilderExample {

    public static void main(String[] args){

        long startTime = System.currentTimeMillis();

        //the initial capacity of a StringBuffer is 16 bits ie 2bytes initially
        StringBuffer buffer = new StringBuffer();
        System.out.println(buffer.capacity());

        StringBuffer buffer1 = new StringBuffer("Hello ");
        /*buffer1.append("world");
        System.out.println(buffer1);*/

        for(int i = 0; i < 10000; i++){
            buffer1.append("world");
        }
        System.out.println("Time taken by String buffer " + (System.currentTimeMillis() - startTime));




       /* StringBuilder is also mutable but does not provide thread safety and hence cannot be used by multiple threads
       at the same time, hence, it is the fastest*/
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.capacity());

        StringBuilder builder1 = new StringBuilder("Hello ");
        //builder1.append("world");
        for(int i = 0; i < 10000; i++){
            builder1.append("world");
        }
        System.out.println("Time taken by String builder " + (System.currentTimeMillis() - startTime));
    }
}
