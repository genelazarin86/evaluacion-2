/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_par_impar;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_7_par_impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,divi,resi;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce un numero entero:");
        num = captu.nextInt();
        divi = num / 2;
        System.out.println("Division entera de " + num +
                " / 2 = " + divi);
        resi = num % 2;
        System.out.println("el residuo de " + num +
                " % 2 = " + resi);
        if(resi == 0)
            System.out.println(num +" es par");
        else
                System.out.println(num + " es impar");
        
    }
    
}
