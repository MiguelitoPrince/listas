package com.company.Lista_doblemente_enlazada;

public class Nodo {
    private Nodo anterior;
    private Object dato;
    private Nodo siguiente;

    public Nodo(Nodo anterior, Object dato, Nodo siguiente){
        this.anterior=anterior;
        this.dato=dato;
        this.siguiente=siguiente;
    }
    public Nodo getAnterior(){
        return anterior;
    }
    public void setAnterior(Nodo anterior){
        this.anterior=anterior;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente=siguiente;
    }

    public Object getDato() {
        return dato;
    }
    public void setDato(Object dato){
        this.dato=dato;
    }
}
