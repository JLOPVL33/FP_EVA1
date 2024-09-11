/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_conversiones;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA1_11_CONVERSIONES {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //CONVERSIONES DE TEMPERATURA
        double fahr, cent, kel;
        Scanner captura = new Scanner(System.in);
        
        //FAHRENHEIT A CENTIGRADOS
        System.out.println("Captura los Fahrenheit:");
        fahr = captura.nextDouble();
        cent = (fahr - 32)/1.8; //expresión
        System.out.println("°C -" + cent);
        //Para convertir de ºF a ºC use la fórmula: ºC = (ºF-32) ÷ 1.8.
        
        //CENTIGRADOS A FAHRENHEIT
        System.out.println("Captura los Celcius:");
        cent= captura.nextDouble();
        fahr=(cent*9/5)+32;
        System .out.println("F= " + fahr);
        
        //CENTIGRADOS A KELVIN
        System.out.println("Captura los Celcius:");
        cent = captura.nextDouble();
        kel = (cent+273.15);
        System.out.println("K= " + kel);
                
        //FAHRENHEIT A KELVIN      
        System.out.println("Captura los Fahrenheit:");
        fahr = captura.nextDouble();
        kel = (fahr-32)/5/9;
        System .out.println("K= " + kel);
             
    }
}
