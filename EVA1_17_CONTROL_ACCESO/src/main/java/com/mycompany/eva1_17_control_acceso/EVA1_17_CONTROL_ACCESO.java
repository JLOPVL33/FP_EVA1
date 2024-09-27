/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_control_acceso;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class EVA1_17_CONTROL_ACCESO {

    public static void main(String[] args) {

        String usuario, pasword;
        Scanner captura = new Scanner(System.in);
        System.out.println("Usuario: ");
        usuario = captura.nextLine();
        System.out.println("Pasword: ");
        pasword = captura.nextLine();
        
        if(usuario.equals("Admin") && pasword.equals("1234")){
          System.out.println("Acceso concedido!!!");
        }else{
          System.out.println("Acceso denegado");
    }
    }
}