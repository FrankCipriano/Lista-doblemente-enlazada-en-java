/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listadoblementeenlazada;

/**
 *
 * @author frankdev
 */
public class Nodo {
    int edad;
    Nodo siguiente,anterior;
    //CONSTRUCTOR PARA CREAR EL PRIMER NODO
    public Nodo(int edad){
        this(edad,null,null);
    }
    //CONSTRUCTOR PARA CREAR MAS NODOS
    public Nodo(int edad,Nodo siguiente,Nodo anterior){
        this.edad=edad;
        this.siguiente=siguiente;
        this.anterior=anterior;
    }
    
}
