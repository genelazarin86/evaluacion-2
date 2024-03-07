/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double  califa;
        Scanner captu = new Scanner (System.in);
        System.out.println("inriduce calificacion");
                
        califa = captu.nextDouble();
        
        if(califa >=70)
            System.out.println("aporbaste!!!");
        else 
            System.out.println("No Acreditaste!!");
            
        
    }
    
}
