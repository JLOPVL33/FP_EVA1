/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA1_16_TIPO_HACIENDA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        char tipo;
        Scanner captura = new Scanner(System.in);
        System.out.println("Tipor de persona F--> FÍSICA, M--> MORAL");
        tipo = captura.nextLine().charAt(0);
        //System.out.println(tipo);
        //IMPRIMIR EL TIPO DE PERSONA
        if(tipo == 'F'){
           System.out.println("Persona Fisica");
        }else{
           System.out.println("Persona Moral");
        }
    }
}
        
        
