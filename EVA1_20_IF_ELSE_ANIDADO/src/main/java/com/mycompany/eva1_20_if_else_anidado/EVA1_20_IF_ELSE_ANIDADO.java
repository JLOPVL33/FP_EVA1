/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_20_if_else_anidado;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA1_20_IF_ELSE_ANIDADO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int diasemana;
        Scanner captura = new Scanner(System.in);
        
        System.out.println("Captura el numero del dia (1 a 7): ");
        diasemana = captura.nextInt();
        captura.nextLine();
        
        if(diasemana == 1){
            System.out.println("Domingo");
        }else if (diasemana == 2){
            System.out.println("Lunes");
        }else if (diasemana == 3){
            System.out.println("Martes");
        }else if (diasemana == 4){
            System.out.println("Miercoles");
        }else if (diasemana == 5){
            System.out.println("Jueves");
        }else if (diasemana == 6){
            System.out.println("Viernes");
        }else if (diasemana == 7){
            System.out.println("Sabado");
        }else{
            System.out.println("Numero de dia invalido");
        }
    }
}
