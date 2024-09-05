/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_operaciones;

/**
 *
 * @author Jennifer
 */
public class EVA1_9_OPERACIONES {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //OPERACIONES ARITMETICAS
        //INICIALIZACIÓN DE UNA VARIABLE
        int x = 10;
        int y = 5;   
        
        int suma, resta, multiplicación, división, potencia, raíz;
        
        //Suma y resta
        suma = x + y;
        System.out.println("La suma de x + y :");
        System.out.println(suma);
        
        resta = x - y;
        System.out.println("Resta de x - y :");
        System.out.println(resta);
        
        //MULTIPLICACIÓN
        multiplicación = x * y; //Operador de multiplicación
        System.out.println("La multiplicación de x * y:");
        System.out.println(multiplicación);
        
        //DIVISÓN
        //En java las operaciónes dependen del tipo de dato
        //Divides entero, Java da como resultado entero
        división = x / y; //Operador de divisón
        System.out.println("El resultado de la división");
        System.out.println(división);
        x = 5;
        y = 2;
        división = x / y;
        System.out.println("División de x (5) / y (2):");
        System.out.println(división);
        
        //División con numeros con punto flotante
        double val1 = 5;
        double val2 = 2;
        double resultado;
        resultado = val1 / val2;
        
        System.out.println("Divisi+on de val1(5) / val2 (2):");
        System.out.println(resultado);
        
    }
}
