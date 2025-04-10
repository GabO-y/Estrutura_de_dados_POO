package org.example;

public class Element {

    private Integer value;
    private Element prox;
    private Element ante;
    private int pos;

    public Element(Integer value, Element prox, Element ante, int pos) {
        this.value = value;
        this.prox = prox;
        this.ante = ante;
        this.pos = pos;
    }

    public Element(Integer value, int pos) {
        this.value = value;
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

        if(prox != null){
        prox.setAnte(this);
        }
    }

    public String toString(){
        return (ante != null ? ante.value : "null") + " > " + value + " > " +  (prox != null ? prox.value : "null");
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public Element getAnte() {
        return ante;
    }

    public void setAnte(Element ante) {
        this.ante = ante;
    }
}
