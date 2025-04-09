package org.example;

import org.example.Struacts.Queue;
import org.example.Struacts.Stack;

public class Main {
    public static void main(String[] args) {

        Stack q = new Stack();

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);

        q.show();

        System.out.println(q.peek());



    }
}
