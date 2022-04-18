package com.company;

public class Main {

public static void main(String[] args) {
	// write your code here
    Lista listp = new Lista();
    listp.mostrar();

    listp.insertarInicio(8347);
    listp.insertarInicio(3554);
    listp.insertarInicio(22);
    listp.insertarInicio("info");
    listp.insertarInicio("miguel");
    listp.insertarInicio("marco");
    listp.insertarInicio("delgado");
    listp.insertarInicio("pongo");

    listp.mostrar();
 }

}
