/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_18_rangos;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA1_18_RANGOS {

    public static void main(String[] args) {
        int califa;
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce una calificacion");
        califa = captura.nextInt();
        
        if(califa>=0 && califa<=100){
            System.out.println("CALIFICACION VALIDA");
        }else{
            System.out.println("CALIFICACION NO VALIDA");
            
        }
        
    }
}
