package Strings;

/*string is a reference type and are of two types-immutable(String class) and mutable(StringBuilder class)
Two ways of creating strings in Java: String literal and String object(using new keyword)*/
public class StringExample {

    public static void main(String[] args){

        //string literal
        String str = "My code ";

        //string object
        String str2  = new String("My perfect coding");

        String str3 = str + str2;

        //space is considered a character
        System.out.println(str3.toCharArray());
        System.out.println(str3.length());
        System.out.println(str3.charAt(4));
        System.out.println(str3.substring(1, 6));
    }
}
