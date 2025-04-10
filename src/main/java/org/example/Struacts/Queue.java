package org.example.Struacts;

import org.example.Element;

public class Queue {

    private Element element;

    public Queue(Element element) {
        this.element = element;
    }

    public Queue(){}

    public Element push(Integer value){

        if(element == null){
            element = new Element(value);
            return element;
        }

        Element current = element;

        while(current.getProx() != null){
            current = current.getProx();
        }

        current.setProx(new Element(value));

        return current.getProx();
    }

    public void pop(){

        if(element == null){
            System.out.println("Empty queue");
            return;
        }

        element = element.getProx();
    }

    public Element getElement() {
        return element;
    }

    public void show(){

        if(element == null){
            System.out.println("Queue empty");
            return;
        }

        var current = element;

        for(int i = 0; current != null; i++){

            System.out.println(i + " - " +current.getValue());

            current = current.getProx();
        }

    }

    public int size(){

        if(element == null){
            return 0;
        }

        int tam = 0;
        var current = element;

        while(current != null){
            tam++;
            current = current.getProx();
        }

        return tam;

    }

    public void setElement(Element element) {
        this.element = element;
    }

    public Stack toStack(){

        if(size() == 0){
            System.out.println("Queue empty");
            return null;
        }

        Stack stack = new Stack();

        var current = element;

        while(current != null){
            stack.push(current.getValue());
            current = current.getProx();
        }

        return stack;

    }

    @Override
    public String toString(){
        return "Value: " + element.getValue().toString();
    }
}
