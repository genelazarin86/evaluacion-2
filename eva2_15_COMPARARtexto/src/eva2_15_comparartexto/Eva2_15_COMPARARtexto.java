/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_comparartexto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_15_COMPARARtexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dia;
        int otroDia;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce el dia (lunes,martes, etc)");
        
        dia = captu.nextLine();
        if(dia.equals("domingo"))
            System.out.println("1");
        else if (dia.equals("lunes"))
            System.out.println("2");
        else if (dia.equals("martes"))
            System.out.println("3");
        else if (dia.equals("miercoles"))
            System.out.println("4");
        else if (dia.equals("jueves"))
            System.out.println("5");
        else if (dia.equals("viernes"))
            System.out.println("6");
        else if (dia.equals("sabado"))
            System.out.println("7");
        else
            System.out.println("otro dia");
    
    
}
}