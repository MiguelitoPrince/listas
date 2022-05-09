package com.company.Lista_circular.ListadobleEnlaze;

public class ListaDobleEnlaze {
    Nodo inicio;
    public ListaDobleEnlaze(){
        inicio= null;
    }
    public boolean EstaVacia(){return  inicio == null;}
    public void insertarFinal(Object dato){
        if (EstaVacia()){
            Nodo nuevo = new Nodo();
            nuevo.setAnterior(nuevo);
            nuevo.setDato(dato);
            nuevo.setSiguiente(nuevo);

            inicio = nuevo;
        }else {
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio){
                ultimo = ultimo.getSiguiente();
            }
            Nodo nuevo = new Nodo();
            nuevo.setAnterior(ultimo);
            nuevo.setDato(dato);
            nuevo.setSiguiente(inicio);

            ultimo.setSiguiente(nuevo);
            inicio.setAnterior(nuevo);
        }
    }
    public void eliminarFinal(){
        if (!EstaVacia()){
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() !=inicio){
                ultimo=ultimo.getSiguiente();
            }
            Nodo penultomo=ultimo.getAnterior();
            penultomo.setSiguiente(inicio);

            inicio.setAnterior(penultomo);
        }
    }
    public void Mostrar(){
        if (!EstaVacia()){
            Nodo temp = inicio;
            while (temp.getSiguiente() != inicio){
                System.out.print(temp.getDato() + "   ");
                temp = temp.getAnterior();
            }
            System.out.println(temp.getDato());
        }
    }
    public void MostrarAdelante(int vueltas){
        if (!EstaVacia()){
            Nodo temp = inicio;
            int contador = 0;
            while (contador < vueltas){
                if (temp.getSiguiente()==inicio){
                    contador++;
                }

                System.out.print(temp.getDato() + "   ");
                temp = temp.getSiguiente();
            }
            System.out.println();
        }
    }
    public void MostrarAtras(int vueltas){
        if (!EstaVacia()){
            Nodo temp = inicio.getAnterior();
            int contador = 0;
            while (contador < vueltas){
                if (temp.getAnterior()==inicio){
                    contador++;
                }
                System.out.print(temp.getDato() + "   ");
                temp = temp.getAnterior();
            }
            System.out.println(temp.getDato());
        }
    }
}
