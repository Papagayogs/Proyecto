/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Invertir {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Dime una frase: ");
        String frase=sc.nextLine(); // frase a convertir
        
        String invertida=""; //frase invertida
        
        for (int i=0; i<frase.length(); i++){ //invertir los caracteres //          correcion=
            if(frase.charAt(i)==frase.toLowerCase().charAt(i)){         // Character.isLowerCase(frase.charAt(i));
                invertida = invertida + frase.toUpperCase().charAt(i);  // + Character.toUpperCase(frase.charAt(i));
            }else {                                                     // else if (Character.isUpperCase(frase.charAt(i));
                invertida= invertida + frase.toLowerCase().charAt(i);   // + Character.toLowerCase(frase.charAt(i));
            }                                                           // else{ invertida= invertida + frase.charAt(i); }
        }
        System.out.println(invertida);
    }
}
