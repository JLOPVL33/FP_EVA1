/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_14_califas;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA1_14_CALIFAS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int califa;
        Scanner captura = new Scanner(System.in);
        System.out.println("¿Cuál es la calificación?");
        califa = captura.nextInt();
        if(califa < 70){//SE PUEDE PONER if(califa>=70)
            System.out.println("NA");
        }else{ 
            System.out.println("ACREDITAS");
                
                }    
        }
    }

