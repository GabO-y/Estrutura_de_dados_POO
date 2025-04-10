package org.example;

import org.example.Struacts.Queue;
import org.example.Struacts.QueueStack;
import org.example.Struacts.Stack;
import org.example.Struacts.StackQueue;

public class Main {
    public static void main(String[] args) {

        QueueStack q = new QueueStack();

        q.push(10);
        q.push(20);
        q.push(30);

        q.pop();
        q.pop();



        q.show();



    }
}
