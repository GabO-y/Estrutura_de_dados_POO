package org.example.Struacts;

import org.example.Element;

public class List {

    Element element;

    public List(Integer value) {
        element = new Element(value);
    }

    public List(){
        element = new Element();
    }

    public void add(Integer value){

        if(element.getValue() == null){
            element.setValue(value);
            return;
        }

        add(value, false);
    }

    public void add(Integer value, Boolean begin){

        if(element.getValue() == null){
            element.setValue(value);
            return;
        }

        if(begin){
            element = new Element(value, element);
        }else{
            getLast().setProx(new Element(value));
        }

    }

    public void removeLast(){
        remove(size());
    }

    public void removeFirst(){
        remove(1);
    }

    public void remove(int pos){

        if(pos > size() || pos <= 0){
            return;
        }

        if(pos == 1){
            element = element.getProx();
            return;
        }

        if(pos == size()){
            get(pos - 1).setProx(null);
            return;
        }

        get(pos - 1).setProx(get(pos + 1));
    }

    public Element get(int pos){

        if(size() == 0){
            System.out.println("List empty");
            return null;
        }

        if(pos == size()){
            return getLast();
        }
        if(pos == 1){
            return getFirst();
        }

        var current = element;

        for(int i = 1; i < pos; i++){
            current = current.getProx();
        }

        return current;

    }

    public Element getFirst(){
        if(size() == 0){
            System.out.println("Empty list");
            return null;
        }
        return element;
    }

    public Element getLast(){

        if(size() == 0){

            System.out.println("Empty list");

            return null;
        }

        var current = element;

        while(current.getProx() != null){
            current = current.getProx();
        }

        return current;

    }

    public void show(){

        if(size() == 0){

            System.out.println("Empty list");

            return;
        }

        var current = element;

        for(int i = 1; current != null; i++){
            System.out.println(i + " - " + current.getValue());
            current = current.getProx();
        }

    }

    public int size(){

        if(element.getValue() == null){
            return 0;
        }

        var current = element;
        int tam = 0;

        while(current != null){
            tam++;
            current = current.getProx();
        }

        return tam;
    }

    public List invert(){

        if(size() == 0){
            System.out.println("List empty");
            return null;
        }

        List list = new List();

        var current = element;

        while(current != null){
            list.add(current.getValue(), true);
            current = current.getProx();
        }

        return list;

    }
}
