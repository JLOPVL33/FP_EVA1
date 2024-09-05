/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_10_operaciones2;

/**
 *
 * @author Jennifer
 */
public class EVA1_10_OPERACIONES2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //OPERADOR DE CONCATENACIÓN
        //Mismo simbolo con diferentes usos:
        //Sobrecarga de operadores
        String nombre = "Ruben";
        String apellido = "Hernandez";
        String nombrecompleto;
        
        //CONCATENAR
        nombrecompleto = nombre + " " + apellido;
        System.out.println(nombrecompleto);
        
        //datos
        System.out.println("Nombre del usuario: " + nombre);
        System.out.println("Apellido del usuario:" + apellido);
        System.out.println("Nombre completo del usuario:" + nombrecompleto);
        
    }
}
