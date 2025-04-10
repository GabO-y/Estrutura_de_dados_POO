package org.example.Struacts;

import org.example.Element;

public class StackQueue {

    private Queue stack;

    public StackQueue(Integer value) {
        this.stack = new Queue();
        stack.setElement(new Element(value));
    }

    public StackQueue(){
        stack = new Queue();
    }

    public Element push(Integer value){
        return stack.push(value);
    }

    public void pop(){

        if(stack.size() == 0){
            System.out.println("StackQueue empty");
            return;
        }

        if(stack.size() == 1){
            stack.setElement(null);
            return;
        }

        var current = stack.getElement();

        int size = stack.size();

        while(size > 1){

            push(current.getValue());
            stack.pop();

            current = current.getProx();
            size--;
        }

        stack.pop();
    }

    public void show(){
        if(stack.getElement() == null){
            System.out.println("StackQueue empty");
            return;
        }

        var current = stack.getElement();

        while(current != null){
            System.out.println(current.getValue());
            current = current.getProx();
        }

    }

}
