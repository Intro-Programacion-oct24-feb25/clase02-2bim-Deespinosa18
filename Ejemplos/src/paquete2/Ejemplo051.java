/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;


/**
 *
 * @author reroes
 */
public class Ejemplo051 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarar y generar arreglos en Java
        
       Scanner entrada= new Scanner(System.in);
       System.out.println("Ingrese el numero de elementos"); 
       int n_elementos = entrada.nextInt();
       
       int[] arreglo1 = new int[n_elementos];
       
       
       // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.printf("Subíndice o Índice %d, con valor %d\n",
                    i, arreglo1[i]);
        }
        
    }

}
