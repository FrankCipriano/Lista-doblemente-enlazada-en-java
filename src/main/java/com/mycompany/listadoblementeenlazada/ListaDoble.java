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
public class ListaDoble {
    public static void main(String args[]){
        Lista lista = new Lista();
        int op=0,edad;
        
        do{
            try{
                op=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Ingresar dato al inicio de la lista\n"
                        + "2. Ingresar dato al final de la lista\n"
                        + "3. Mostrar la lista de inicio a fin\n"
                        + "4. Mostrar la lista de fin a inicio\n"
                        + "5. Eliminar un dato al inicio de la lista\n"
                        + "6. Eliminat un dato al final de la lista\n"
                        + "7. Salir\n"
                        + "Ingrese una opcion..!!",
                        "Menu de Opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                switch(op){
                    case 1:
                        edad=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese tu edad","Agregar al inicio",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarAlInicio(edad);
                        break;
                    case 2:
                        edad=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese tu edad","Agregar al final",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarAlFinal(edad);
                        break;
                    case 3:
                        if(!lista.estaVacia()){
                            lista.mostrarListaDesdeInicio();
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay datos que mostrar",
                                    "Lista vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!lista.estaVacia()){
                            lista.mostrarListaDesdeFin();
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay datos que mostrar",
                                    "Lista Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if(!lista.estaVacia()){
                            edad=lista.eliminarDelInicio();
                            JOptionPane.showMessageDialog(null,edad+": Eliminado",
                                    "Eliminacion al inicio de la lista",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay nada que eliminar");
                        }
                        break;
                    case 6:
                        if(!lista.estaVacia()){
                            edad=lista.eliminarDelFinal();
                            JOptionPane.showMessageDialog(null, edad+": Eliminado",
                                    "Eliminacion al final de la lista",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay nada que eliminar");
                        }
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null,"Gracias por utilizar los servicios de FrankDev");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"La opcion no existe en el menu",
                                "Error",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Error"+
                        ex.getMessage());
            }
        }while(op!=7);
    }
    
}
