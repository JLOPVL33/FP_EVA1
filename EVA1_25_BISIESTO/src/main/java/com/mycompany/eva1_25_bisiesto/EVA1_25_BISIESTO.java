/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA1_25_BISIESTO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int year;
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce el año:");
        year = captura.nextInt();
        captura.nextLine();
        //Año divisble entre cuatro con residuo 0
        //Modulo --> calculo del residuo -->%
        int modulo4, modulo100, modulo400;
        modulo4 = year % 4;
        if(modulo4 == 0){
            modulo100 = year % 100;
            if(modulo100 != 0);
              System.out.println("ES BISISESTO");
            }else{
              modulo400 = year % 400;
              if(modulo400 == 0){
                  System.out.println("ES BISISESTO");
              }else{
                  System.out.println("NO ES BISISESTO");
              }
        }
                     
        }        

    }
