package org.example;

public class Element {

    private Integer value;
    private Element prox;
    private int pos;

    public Element(Integer value, Element prox, int pos) {
        this.value = value;
        this.prox = prox;
        this.pos = pos;
    }

    public Element(Integer value) {
        this.value = value;
    }

    public Element(){}

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Element getProx() {
        return prox;
    }

    public void setProx(Element prox) {
        this.prox = prox;
    }

    public String toString(){
        return "Value: " + value;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
}
