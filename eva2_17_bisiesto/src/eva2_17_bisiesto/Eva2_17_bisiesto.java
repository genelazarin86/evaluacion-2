/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_17_bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int anio;
      Scanner captu = new Scanner(System.in);
        System.out.println("introduce el año a evaluar");
      anio = captu.nextInt();
      if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
	System.out.println("El año es bisiesto");
else
	System.out.println("El año no es bisiesto");
    }
    
}
