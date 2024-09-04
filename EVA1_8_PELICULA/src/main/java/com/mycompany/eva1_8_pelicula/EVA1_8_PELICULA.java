/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_8_pelicula;

import java.util.Scanner;
 //* @author Jennifer
 
public class EVA1_8_PELICULA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    String nombre;
    String genero;
    int duracion;
    String reparto;
    String clasificacion;
    //Creamos el escaner
    Scanner captura;
    captura  = new Scanner(System.in);
    //Capturamos los valores
    System.out.println("Captura el nombre de la pelicula");
    nombre = captura.nextLine();
    System.out.println("Captura el genero de la pelicula");
    genero = captura.nextLine();
    System.out.println("Captura la duracion en segundos de la pelicula");
    duracion = captura.nextInt();
    System.out.println("Captura el reparto de la pelicula");
    reparto = captura.nextLine();
    captura.nextLine(); //No me captura el dato si no agrego esto
    System.out.println("Captura la clasificacion;");
    clasificacion = captura.nextLine();
    
    System.out.println("-------------IMPRESIÓN DE LAS CAPTURAS---------------");
    System.out.println(nombre);
    System.out.println(genero);
    System.out.println(duracion);
    System.out.println(reparto);
    System.out.println(clasificacion);
    
    
    }
}
