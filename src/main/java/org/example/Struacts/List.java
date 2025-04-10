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
            element.setPos(size());
            return;
        }

        add(value, false);
    }

    public void add(int value, int pos){


        if(pos < 1){
            throw new RuntimeException("Position need to be positive");
        }

        if(pos == 1){
            add(value, true);
            return;
        }

        if(pos > getLast().getPos()){

            add(value);
            getLast().setPos(pos);
            return;

        }

        var current = element;

        while(current != null){

            if(current.getProx().getPos() == pos){
                current.setProx(new Element(value, current.getProx(), pos));
                break;
            }

            if(current.getProx().getPos() > pos){
                current.setProx(new Element(value, current.getProx(), pos));
                break;
            }

            current = current.getProx();
        }

        updatePos();

    }

    public void add(Integer value, Boolean begin){

        if(element.getValue() == null){
            element.setValue(value);
            return;
        }

        if(begin){
            element = new Element(value, element, 1);
            updatePos();
        }else{
            getLast().setProx(new Element(value, null, size() + 1));
        }

    }

    public void removeLast(){

        if(size() == 0){
            throw new RuntimeException("Empty list");
        }

        if(size() == 1){
            removeFirst();
        }

        Element current = null;

        for(int i = getLast().getPos() - 1; current == null; i--){
                current = get(i);
        }

        current.setProx(null);
    }

    public void removeFirst(){

        if(size() == 0){
            throw new RuntimeException("Empty list");
        }

        element = element.getProx();
        updatePos();
    }

    public void remove(int pos){

        if(pos <= 0){
            return;
        }

        if(pos == 1){
            removeFirst();
            return;
        }

        if(pos == getLast().getPos()){
            removeLast();
            return;
        }

        Element current = null;

        for(int i = pos - 1; current == null; i--){
            current = get(i);
        }

        current.setProx(current.getProx().getProx());
        updatePos();

    }

    public Element get(int pos){

        if(size() == 0){
            System.out.println("List empty");
            return null;
        }

        if(pos == getLast().getPos()){
            return getLast();
        }

        if(pos == 1){
            return getFirst();
        }


        var current = element;

        while(current != null){

            if(current.getPos() == pos){
                return current;
            }

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

        while(current != null){
            System.out.println(current.getPos() + " - " + current.getValue());
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

    private void updatePos(){

        if(size() == 0){
            System.out.println("Empty list");
            return;
        }

        var current = element;

        if(current.getPos() != 1){
            current.setPos(1);
        }

       while(current != null){

           try{

           if(current.getPos() == current.getProx().getPos()){
               current.getProx().setPos(current.getPos() + 1);
           }

           }catch(Exception _){

           }
           current = current.getProx();
       }



    }

}
