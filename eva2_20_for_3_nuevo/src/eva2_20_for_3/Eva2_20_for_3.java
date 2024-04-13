/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_for_3;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class Eva2_20_for_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int numNombre;
        Scanner captu =  new Scanner  (System.in);
        System.out.println("introducir mensaje");
        nombre = captu.nextLine();
        System.out.println("numero de veces a imprimir el mensaje");
        numNombre = captu.nextInt();
        
        for (int i = 1; i <= numNombre; i++) {
            System.out.println(nombre);
        }
     int numSum;
      int resu = 0;
        System.out.println("introdcue el numero a sacar sumatoria");
        numSum = captu.nextInt();
        for (int i = 1; i <= numSum; i++) {
            resu = resu + i;  
        }
        System.out.println("la sumatoria de " + numSum + "=" + resu);
        
        int cant = 0;
        System.out.println("filas a impirmir ?");
        cant = captu.nextInt();
        for (int i = 1  ; i <= cant; i++) {
         for (int j = 1; j <= i; j++) {
             System.out.println("*");     
            }
            System.out.println("");
        }
    } 
    
    
}
