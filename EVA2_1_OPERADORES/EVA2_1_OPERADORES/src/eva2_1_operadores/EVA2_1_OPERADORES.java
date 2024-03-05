/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_operadores;

/**
 *
 * @author invitado
 */
public class EVA2_1_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
                num1 =5;
                num2 =3;
        int suma = 5 + 3;
        System.out.println("La suma es");
        System.out.println("suma");
        boolean prueba = true;
        System.out.println("El valor de prueba es " + prueba);
        //multiplicacion
        int multi;
        multi = num1 * num2;
        System.out.println("La multiplicacion es " +  multi);
        int divi = 7 / 2;
        System.out.println("La division de 5 / 3 es " +  divi );
        double diviDouble = 7 / 2.0;
        System.out.println("La division (double) de 7 / 2 es  " +  diviDouble );
        //acumulador
        //suma+=,RESTA -=,MULTI *=,DIVI /=
        int sumaToria = 0;
        sumaToria = sumaToria + 90;
        sumaToria = sumaToria + 80;
        sumaToria = sumaToria + 80;
        
        sumaToria += 90;
        sumaToria += 80;
        sumaToria += 80;
        System.out.println("la sumatoria es " + sumaToria);
        sumaToria -= 70;
        System.out.println("la sumatoria es " + sumaToria);
        
        int multiAcum = 1;
        multiAcum *= 100;
        System.out.println("Multiacum = "+ multiAcum);
        multiAcum *=5;
        System.out.println("Multiacum = "+ multiAcum);
        
    }
    
}
