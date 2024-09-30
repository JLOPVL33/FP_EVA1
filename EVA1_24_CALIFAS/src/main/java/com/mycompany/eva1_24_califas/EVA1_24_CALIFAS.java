/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA1_24_CALIFAS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int calífa;
        Scanner captura= new Scanner(System.in);
        
        System.out.println("Cual es la calificación? (0-100)");
        calífa = captura.nextInt();
        captura.nextLine();
        
        if (calífa>=90 && calífa <=100){
           System.out.println("A");
        }else if (calífa>=80 && calífa <=89){
           System.out.println("B");
        }else if (calífa>=70 && calífa <=79){
           System.out.println("C");
        }else if (calífa>=60 && calífa <=69){
           System.out.println("D");
        }else if (calífa>=0 && calífa <=59){
           System.out.println("F");
        }else{
            System.out.println("Calificación invalida");   
        
        
        }
    }
}
