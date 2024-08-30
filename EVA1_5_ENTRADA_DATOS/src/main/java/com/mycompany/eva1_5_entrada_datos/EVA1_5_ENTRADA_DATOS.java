/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA1_5_ENTRADA_DATOS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String nombre;
        //Scanner es un tipo de dato
        //Scanner es un tipo de herramienta (clase)
        Scanner captura;
        //Scanner no existe, hay que crearla
        captura = new Scanner(System.in);
        //Darle una instrucción al usuario
        System.out.println("Introduce tu nombre completo: ");
        //Capturamos, osea damos valor a las variables
        nombre = captura.nextLine();//capturamos el texto hasta preionar enter
        //Mandamos a imprimir los datos
        System.out.println("<<<<<<<<<<<<DATOS CAPTURADOS>>>>>>>>>>>>");
        System.out.println(nombre);
    }
}
