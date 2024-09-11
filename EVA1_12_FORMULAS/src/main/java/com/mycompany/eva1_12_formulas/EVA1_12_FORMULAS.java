/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_formulas;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA1_12_FORMULAS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        double vo, d, a, t;
        Scanner captura = new Scanner(System.in);
        
        System.out.println("Velocidad inicial: ");
        vo = captura.nextDouble();
        System.out.println("Aceleración: ");
        a = captura.nextDouble();
        System.out.println("Tiempo: ");
        t = captura.nextDouble();
        
        d = vo * t + (a * t * t)/2.0;
        System.out.println("Distancia = " + d);
        
        
    }
}
