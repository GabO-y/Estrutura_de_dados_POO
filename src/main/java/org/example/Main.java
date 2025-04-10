package org.example;

import org.example.Struacts.Queue;
import org.example.Struacts.Stack;
import org.example.Struacts.StackQueue;

public class Main {
    public static void main(String[] args) {

        StackQueue q = new StackQueue();

        q.push(10);


        q.show();
        System.out.println("----------------");
        q.pop();
        q.show();

        System.out.println();



    }
}
