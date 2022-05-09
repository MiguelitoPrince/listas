package com.company;

import com.company.Lista_circular.Lista_Circular;
import com.company.Lista_circular.ListadobleEnlaze.ListaDobleEnlaze;
import com.company.Lista_doblemente_enlazada.Lista_Doble_Enlaze;

public class Main {

public static void main(String[] args) {
	// write your code here
    //Lista listp = new Lista();
    //listp.mostrar();

   // listp.insertarInicio(8347);
    //listp.insertarInicio(3554);
   // listp.insertarInicio(22);
  //  listp.insertarInicio("info");
   // listp.insertarInicio("miguel");
   // listp.insertarInicio("marco");
   // listp.insertarInicio("delgado");
  //  listp.insertarInicio("pongo");


    //-----------------------------------------------------------------------

   // Lista_Doble_Enlaze lista_doble_enlaze = new Lista_Doble_Enlaze();
   // System.out.println(lista_doble_enlaze.Estavacia());
   // for (int i  = 20; i > 0; i--){
   //     lista_doble_enlaze.insertar(i);
  //  }
    //System.out.println(lista_doble_enlaze.Estavacia());
    //lista_doble_enlaze.mostrarAdelante();
//
    //lista_doble_enlaze.eliminar();

    ////lista_doble_enlaze.mostrarAtras();


    //------------------------------------------------------------------------------


   // Lista_Circular lista_circular = new Lista_Circular();
    //System.out.println(lista_circular.estaVacia());
    //System.out.println(lista_circular.tamaño());
    //for (int i = 1; i <= 12; i++){
     //   lista_circular.insertarFin(i);
    //}
    //lista_circular.mostrar();
    //System.out.println(lista_circular.tamaño());

   // lista_circular.mostrarCircular(2);



    //---------------------------------------------------------------------------------------

    ListaDobleEnlaze listaDobleEnlaze = new ListaDobleEnlaze();
    System.out.print(listaDobleEnlaze.EstaVacia());
    for (int i = 1 ; i <= 5 ; i++){
    listaDobleEnlaze.insertarFinal(i);
    }
    listaDobleEnlaze.Mostrar();
    listaDobleEnlaze.eliminarFinal();
    listaDobleEnlaze.eliminarFinal();
    listaDobleEnlaze.Mostrar();

    listaDobleEnlaze.MostrarAdelante(8);
    listaDobleEnlaze.MostrarAtras(8);
 }

}
