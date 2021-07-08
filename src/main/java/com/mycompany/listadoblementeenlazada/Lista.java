/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listadoblementeenlazada;

import javax.swing.JOptionPane;

/**
 *
 * @author frankdev
 */
public class Lista {
    Nodo inicio,fin;
    public Lista(){
        inicio=fin=null;
    }
    //METODO PARA SABER SI LA LISTA ESTA VACIA
    public boolean estaVacia(){
        return inicio==null;
    }
    //METODO PARA AGREGAR AL FINAL DE LA LISTA
    public void agregarAlFinal(int edad){
        if(!estaVacia()){
            fin=new Nodo(edad,null,fin);
            fin.anterior.siguiente=fin;
        }else{
            inicio=fin=new Nodo(edad);
        }
    }
    //METODO PARA AGREGAR AL INCIO DE LA LISTA
    public void agregarAlInicio(int edad){
        if(!estaVacia()){
            inicio=new Nodo(edad,inicio,null);
            inicio.siguiente.anterior=inicio;
        }else{
            inicio=fin=new Nodo(edad);
        }
    }
    //METODO PARA MOSTRAR LISTA DE INICIO A FIN
    public void mostrarListaDesdeInicio(){
        if(!estaVacia()){
            String lista= "<=>";
            Nodo auxiliar = inicio;
            while(auxiliar!=null){
                lista=lista+"["+auxiliar.edad+"]"+"<=>";
                auxiliar=auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null,"[inicio]"+lista+"[fin]",
                    "Mostrando lista de inico a fin",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //METODO PARA MOSTRAR LISTA DE FIN A INICIO
    public void mostrarListaDesdeFin(){
        String lista="<=>";
        Nodo auxiliar=fin;
        while(auxiliar!=null){
            lista=lista+"["+auxiliar.edad+"]"+"<=>";
            auxiliar=auxiliar.anterior;
        }
        JOptionPane.showMessageDialog(null, "[fin]"+lista+"[inicio]",
                "Mostrando lista de fin a inicio",
                JOptionPane.INFORMATION_MESSAGE);
    }
    //METODO PARA ELIMINAR UN NODO AL INICIO DE LA LISTA
    public int eliminarDelInicio(){
        int edad=inicio.edad;
        if(inicio==fin){
            inicio=fin=null;
        }else{
            inicio=inicio.siguiente;
            inicio.anterior=null;
        }
        return edad;
    }
    //METODO PARA ELIMINAR UN ELEMENTO AL FINAL DE LA LISTA
    public int eliminarDelFinal(){
        int edad=fin.edad;
        if(inicio==fin){
            inicio=fin=null;
        }else{
            fin=fin.anterior;
            fin.siguiente=null;
        }
        return edad;
    }
}
