/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_26_break;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_26_break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario,pwd;
        String USUARIO = "ADMIN";
        String PASSWORD = "ADMIN";
        Scanner captu = new Scanner (System.in);
        
        
        while(true){
            System.out.println("usuario");
            usuario=captu.nextLine();
            System.out.println("contraseña:");
            pwd= captu.nextLine();
            if(usuario.equals(USUARIO) && pwd.equals(PASSWORD))
                break;
            else 
                System.out.println("datos incorrectos");
        }
        System.out.println("bienvenido al sistema!!");
    }
    
    
}
