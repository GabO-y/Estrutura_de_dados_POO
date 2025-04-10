package org.example.Struacts;

import org.example.Element;

import java.util.Objects;

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
            element.setPos(1);
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

                var aux = current.getProx();

                current.setProx(new Element(value, pos));
                current.getProx().setAnte(current);
                current.getProx().setProx(aux);

                break;
            }

            if(current.getProx().getPos() > pos){
                current.setProx(new Element(value, current.getProx(),current, pos));
                current.getProx().setAnte(current);

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
            element = new Element(value, element,null, 1);
            updatePos();
        }else{
            var aux = getLast();
            getLast().setProx(new Element(value, null, aux, getLast().getPos() + 1));
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
        element.setAnte(null);

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


//        var current = element;
//
//        while(current != null){
//
//            if(current.getPos() == pos){
//                return current;
//            }
//
//            current = current.getProx();
//        }
//
//        return current;

        return get(element, pos);

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
            System.out.println(current.getPos() + " - [" + current.getValue() + "]");
            current = current.getProx();
        }

    }

    public void show(boolean inverse){

        if(size() == 0){

            System.out.println("Empty list");

            return;
        }

        var current = getLast();

        while(current != null){
            System.out.println(current.getPos() + " - [" + current.getValue() + "]");
            current = current.getAnte();
        }

    }

    public void showAll(){

        if(size() == 0){
            throw new RuntimeException("Empty list");
        }

        var current = element;

        while(current != null){
            System.out.println(current);
            current = current.getProx();
        }

    }

    public int size(){

        if(element.getValue() == null){
            return 0;
        }

//        var current = element;
//        int tam = 0;
//
//        while(current != null){
//            tam++;
//            current = current.getProx();
//        }
//
//        return tam;

        return size(element, 0);

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

       while(current.getProx() != null){

            while(current.getPos() - current.getProx().getPos() >= 0){

                current.getProx().setPos(current.getProx().getPos() + 1);
            }

           current = current.getProx();
       }
    }

    private int size(Element element, int num){

        if(element == null){
            return num;
        }


        num++;
        return size(element.getProx(), num);
    }

    private Element get(Element element, int pos) {

        if(element.getProx() == null || pos == 1){
        return element;
        }

        pos--;

        return get(element.getProx(), pos);
    }
}
