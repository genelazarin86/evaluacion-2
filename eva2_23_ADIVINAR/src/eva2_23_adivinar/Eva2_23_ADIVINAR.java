/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_23_adivinar;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_23_ADIVINAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume = 5;
        int valor = 0;
        Scanner captu = new Scanner (System.in);
        
        do{
            System.out.println("¿cual es el numero? (entre 1 y 10:");
            valor = captu.nextInt();
        }while (nume != valor);
        System.out.println("ADIVINASTE");
                
    }
    
}
