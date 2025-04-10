package org.example.Struacts;

import org.example.Element;

public class ArrayList {

    Integer[] element;

    public void add(Integer value){

        if(element == null){
            element = new Integer[]{value};
            return;
        }

        var aux = element;

        element = new Integer[aux.length + 1] ;

        for(int i = 0; i < aux.length; i++){
            element[i] = aux[i];
        }

        element[element.length - 1] = value;
    }

    public void addFirst(Integer value){

        if(size() == 0){
            element = new Integer[]{value};
            return;
        }

        var aux = new Integer[element.length + 1];
        aux[0] = value;

        for(int i = 1, l = 0; l < element.length; i++, l++){
            aux[i] = element[l];
        }

        element = aux;

    }

    public void add(Integer value, int pos){

        if(pos == 1){
            addFirst(value);
            return;
        }

        if(pos > element.length){
            add(value);
            return;
        }

        var aux = new Integer[element.length + 1];

        for(int i = 0, l = 0; l < element.length; i++, l++){

            if(i == pos - 1){
                aux[i] = value;
                l--;
                continue;
            }

            aux[i] = element[l];

        }

        element = aux;

    }

    public void show(){

        if(element == null || element.length == 0){
            throw new RuntimeException("Empty list");
        }

        for (Integer integer : element) {
            System.out.println(integer);
        }

    }

    public int get(int pos){

        if(size() == 0){
            throw new RuntimeException("Empty list");
        }

        return element[pos - 1];
    }

    public void remove(int pos){

        pos--;

        var aux = new Integer[element.length - 1];

        for(int i = 0, l = 0; i < element.length; i++, l++){

            if(i == pos){
                l--;
                continue;
            }

            aux[l] = element[i];
        }

        element = aux;

    }

    public void removeFirst(){
        remove(1);
    }

    public void removeLast(){
        remove(size());
    }

    public int size(){
        return element == null ? 0 : element.length;
    }

}
