/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_captura_auto;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA1_7_CAPTURA_AUTO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //DECLARAMOS LAS VARIABLES
        String marca;
        String modelo;
        int year;
        double precio;
        //AQUI CREAMOS EL SCANNER
        Scanner captura;
        captura = new Scanner(System.in);
        //CAPTURAMOS LOS DATOS
        System.out.println("Captura la marca del auto");
        marca = captura.nextLine();
        System.out.println("Captura el modelo");
        modelo = captura.nextLine();
        System.out.println("Captura el year del auto");
        year = captura.nextInt();
        System.out.println("Captura el precio del auto");
        precio = captura.nextDouble();
        //IMPRESION
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);
        
        
    }
}
