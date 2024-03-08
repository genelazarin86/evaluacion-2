/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_ventas;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA2_4_VENTAS {

    public static void main(String[] args) {
        int canti, sald;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿CUANTAS PÍEZAS QUIERE COMPRAR?");
        canti = captu.nextInt();
        
        if(canti >= 1000)
            sald = canti * 500;
        else sald = canti * 800;
        System.out.println("el saldo es " + sald);        
            
    }
}
