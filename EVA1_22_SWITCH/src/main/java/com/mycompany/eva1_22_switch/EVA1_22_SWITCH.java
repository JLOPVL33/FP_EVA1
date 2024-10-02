/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_22_switch;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA1_22_SWITCH {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int dias;
        Scanner captura = new Scanner(System.in);
        System.out.println("CAPTURE EL NUMERO DEL DIA DEL 1 AL 7");
        dias = captura.nextInt();
        captura.nextLine();
      
        switch(dias){
        case 1:
            System.out.println("LUNES"); 
             
        case 2:
          System.out.println("MARTES");
          break;
        case 3:
          System.out.println("MIERCOLES");
          break;    
        case 4:
          System.out.println("JUEVES");
          break;
        case 5:
          System.out.println("VIERNES");
          break;    
        case 6:
          System.out.println("SABADO");
          break;
        case 7:
          System.out.println("DOMINGO");
          break;  
        default:
          System.out.println("NO ES UN NUMERO VALIDO");
          

        }
    }
}
