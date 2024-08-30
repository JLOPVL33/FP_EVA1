/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA1_6_ENTRADA_DATOS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Declaramos las variables
        String nombre;
        String CURP;
        int edad;
        double promedio;
        //Creamos el scanner por que no existe aun
        Scanner captura;
        captura = new Scanner(System.in);
        //Capturamos todos los datos
        System.out.println("Captura tu nombre completo");
        nombre = captura.nextLine();
        System.out.println("Captura la CURP");
        CURP = captura.nextLine();
        System.out.println("Captura la edad");
        edad = captura.nextInt();
        System.out.println("Captura el promedio");
        promedio = captura.nextDouble();
        //IMPRESIÓN
        System.out.println(nombre);
        System.out.println(CURP);
        System.out.println(edad);
        System.out.println(promedio);
        
        
               
        
        
        
        
    }
}
