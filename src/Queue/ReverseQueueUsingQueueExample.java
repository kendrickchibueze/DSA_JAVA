package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUsingQueueExample {
//you can manipulate your queue with the help of stack, array,linklist,vector

    public static void Reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<Integer>();
        while(!queue.isEmpty())
            stack.push(queue.remove());
        while(!stack.isEmpty())
            queue.add(stack.pop());

    }

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        Reverse(queue);
        System.out.println();
        System.out.println(queue);
    }
}

