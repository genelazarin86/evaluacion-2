/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_calif_euu;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_14_calif_euu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calif;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce la califa (0-100):");
        
        calif= captu.nextInt();
        if(calif >=90 && calif <= 100)
            System.out.println("A");
        
        else if   (calif >=80 && calif <=89)
          
                System.out.println("B");
        
        else if   (calif >=70 && calif<=79)
          
                System.out.println("C");
        
        else if   (calif >= 60 && calif <=69)
          
                System.out.println("D");
        
        else if   (calif >=0 && calif<=59)
          
                System.out.println("f");
        
       
        
      
        else
            System.out.println("el numero no es una califa valida");
    }
    
}
