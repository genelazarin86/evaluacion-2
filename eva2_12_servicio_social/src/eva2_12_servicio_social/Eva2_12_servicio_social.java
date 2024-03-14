/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_servicio_social;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_12_servicio_social {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int creditos, semestre;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿que semestre vas ?");
        semestre = captu.nextInt();
        System.out.println("¿cuantos creditos llevas?");
                creditos = captu.nextInt();
                if((semestre >=6) && (creditos >=150))
                    System.out.println("puedes realizar el servicio social");
                else
                    System.out.println("no puedes realizar el servicio social");
        
    }
    
}
