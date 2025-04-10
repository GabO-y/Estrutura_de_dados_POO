package org.example.Struacts;

import org.example.Element;

public class QueueStack {

    Stack queue;

    public QueueStack(Integer value){
        queue = new Stack();
        queue.push(value);
    }

    public QueueStack(){
        queue = new Stack();
    }

    public Element push(Integer value){
        return queue.push(value);
    }

    public void pop(){

        if(queue.size() == 0){
            System.out.println("QueueStack empty");
            return;
        }

        if(queue.size() == 1){
            queue.setElement(null);
            return;
        }

        queue.setElement(queue.getElement().getProx());
    }

    public void show(){

        if(queue.size() == 0){
            System.out.println("QueueStack empty");
            return;
        }

        var current = queue.getElement();

        for(int i = 0; current != null; i++){

            System.out.println(i + " - " + current.getValue());

            current = current.getProx();
        }

    }

    public int size(){
        return queue.size();
    }

}
