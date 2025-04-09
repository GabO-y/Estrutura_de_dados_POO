package org.example;

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

    public void setElement(Element element) {
        this.element = element;
    }
}
