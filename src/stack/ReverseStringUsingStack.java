package stack;


import java.util.Stack;

class ReverseString{

    public String Reverse(String input ){
        Stack<Character> character = new Stack<Character>();
        String newChar = "";
         for(char ch: input.toCharArray())
             character.push(ch);
             while(!character.isEmpty())
                 newChar += character.pop();
             return  newChar;


    }
}
public class ReverseStringUsingStack {

    public static void main(String[] args){
        ReverseString reversestring = new ReverseString();
           String str = reversestring.Reverse("coding");
           System.out.println(str);
    }

}
