package com.company.Lista_doblemente_enlazada;

public class Lista_Doble_Enlaze {
    Nodo inicio;

    public Lista_Doble_Enlaze(){
        inicio = null;
    }
    public boolean Estavacia(){
        return inicio == null;
    }
    public void insertar(Object dato){
        if (Estavacia()){
            Nodo nuevo = new Nodo(null, dato, null);
            inicio = nuevo;
        }else {
            Nodo nuevo=new Nodo(null, dato, inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }
    public void eliminar(){
        if (!Estavacia()){
            if (inicio.getSiguiente()== null) {
                inicio=inicio.getSiguiente();
            } else {
                inicio=inicio.getSiguiente();
                inicio.setAnterior(null);
            }
        }
    }
    public void mostrarAdelante(){
        if (!Estavacia()){
            Nodo temp = inicio;
            while (temp != null){
                System.out.print(temp.getDato() + "   ");
                temp = temp.getSiguiente();
            }
            System.out.println("");
        }
    }
    public void mostrarAtras(){
        if (!Estavacia()){
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() !=null){
                ultimo= ultimo.getSiguiente();
            }
            Nodo temp = ultimo;
            while (temp !=null){
                System.out.print(temp.getDato() + "   ");
                temp = temp.getAnterior();
            }
            System.out.println();
        }
    }
}
