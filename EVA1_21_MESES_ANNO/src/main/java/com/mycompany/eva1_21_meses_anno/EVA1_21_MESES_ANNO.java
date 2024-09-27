/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_21_meses_anno;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA1_21_MESES_ANNO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int mes;
        Scanner captura = new Scanner(System.in);
        
        System.out.println("Captura el numero del dia (1 a 12): ");
        mes = captura.nextInt();
        captura.nextLine();
        
        if(mes == 1){
            System.out.println("Enero");
        }else if (mes == 2){
            System.out.println("Febrero");
        }else if (mes == 3){
            System.out.println("Marzo");
        }else if (mes == 4){
            System.out.println("Abril");
        }else if (mes == 5){
            System.out.println("Mayo");
        }else if (mes == 6){
            System.out.println("Junio");
        }else if (mes == 7){
            System.out.println("Julio");
        }else if (mes == 8){
            System.out.println("Agosto");
        }else if (mes == 9){
            System.out.println("Septiembre");   
        }else if (mes == 10){
            System.out.println("Octubre");
        }else if (mes == 11){
            System.out.println("Noviembre");
        }else if (mes == 12){
            System.out.println("Diciembre");
        }else{
            System.out.println("Numero de mes invalido");
        }
    }
}
