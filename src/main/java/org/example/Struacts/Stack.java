package org.example.Struacts;

import org.example.Element;

public class Stack {

    private Element element;

    public Stack(Element element) {
        this.element = element;
    }

    public Stack(){}

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

        if(element.getProx() == null){
            element = null;
            return;
        }

        var current = element;

        while(current.getProx().getProx() != null ){
            current = current.getProx();
        }

        current.setProx(null);
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

    public Element peek(){

        if(element == null){
            System.out.println("Empty stack");
            return null;
        }

        var current = element;

        while(current.getProx() != null){
            current = current.getProx();
        }

        return current;

    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
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

    @Override
    public String toString(){
        return "Value: " + element.getValue().toString();
    }
}
