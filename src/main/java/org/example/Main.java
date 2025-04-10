package org.example;

import org.example.Struacts.Queue;
import org.example.Struacts.QueueStack;
import org.example.Struacts.Stack;
import org.example.Struacts.StackQueue;

public class Main {
    public static void main(String[] args) {

        Stack s = new Stack();
        Queue q = new Queue();

        s.push(10);
        s.push(20);
        s.push(30);


        q = s.toQueue();

        q.show();

        Stack stack = q.toStack();

        System.out.println("------------ ");

        stack.show();

        System.out.println("------------ ");


        stack.pop();
            q.pop();


            stack.show();
        System.out.println("------------ ");
            q.show();




    }
}
