/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_operador_logicos;

/**
 *
 * @author invitado
 */
public class Eva2_11_OPERADOR_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean hayDinero, hayBuenClima;
        hayDinero = false;
        hayBuenClima = true;
        System.out.println("1. NO HAY DINERO Y  HAY BUEN CLIMA");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("se armo la carnita");
        else

            System.out.println("buevito");
       
        hayDinero = false;
        hayBuenClima = false;
        System.out.println("1. NO HAY DINERO Y NO BUEN CLIMA");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("se armo la carnita");
        else

            System.out.println("buevito");
        
        hayDinero = true;
        hayBuenClima = true;
        System.out.println("1. hay dinero y  hay buen clima");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("se armo la carnita");
        else

            System.out.println("buevito");
    }
    
}
