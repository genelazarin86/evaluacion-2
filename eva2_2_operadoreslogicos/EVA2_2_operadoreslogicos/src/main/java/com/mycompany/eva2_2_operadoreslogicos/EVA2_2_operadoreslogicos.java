/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_operadoreslogicos;

/**
 *
 * @author leo
 */
public class EVA2_2_operadoreslogicos {

    public static void main(String[] args) {
        boolean A, B;
        A = false;
        B = false;
        boolean resu;
        //operador
        resu = A && B;
        System.out.println("Resu = " + resu);
        A = true;
        B = true;
        resu = A && B;
        System.out.println("Resu = " + resu);
                
        //operador or
        
    A = false;
    B = false;
    resu = A && B;
        System.out.println("Resu = " + resu);
        A = true;
        B = false;
    resu = A || B;
        System.out.println("Resu (or) = " + resu);
        A = true;
        B = false;
        resu = A || B;
        System.out.println("Resu (or) = " + resu);
        A = true;
        B = true;
        resu = A || B;
        System.out.println("Resu (or) =  " + resu);
        A = false;
        B = false;
        resu = !A;
        System.out.println("Resu (!) = " + resu);
    }
}
