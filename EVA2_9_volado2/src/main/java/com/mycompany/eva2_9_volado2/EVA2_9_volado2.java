/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_volado2;


import java.util.Scanner;


/**
 *
 * @author leo
 */
public class EVA2_9_volado2 {

    public static void main(String[] args) {
        double moneda;
        int adivinar;
         Scanner captu = new Scanner(System.in);
        System.out.println("cara(0) o cruz (1)?");
        adivinar = captu.nextInt();
        
        moneda = Math.random();
         System.out.println( "el valor de moneda = " + moneda);
                 if(moneda >  0.5 && adivinar == 0)
                     System.out.println("adivinaste es cara");
                 
                  else
                  if (moneda <=0.5 && adivinar ==1)    
                     System.out.println("adivinaste es cruz");
                   else
                       System.out.println("perdiste");
    }

    
    
    

    
}
