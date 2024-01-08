import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //System.out.println("i = " + i);
        }

        int [] myArray = new int [5];
        myArray[0] = 4;
        myArray[1] = 5;
        //System.out.println(myArray[1]);

        //stack
        Stack<Integer>  stack = new Stack<Integer>();
        System.out.println(stack.size());
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.size());
        System.out.println(stack);
    }
}