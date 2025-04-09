package org.example;

public class Element {

    private Integer value;
    private Element prox;

    public Element(Integer value, Element prox) {
        this.value = value;
        this.prox = prox;
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

}
