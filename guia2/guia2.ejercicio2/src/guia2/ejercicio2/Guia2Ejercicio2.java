
package guia2.ejercicio2;

import java.util.Scanner;


public class Guia2Ejercicio2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
       System.out.println("Ingrese su nombre"); 
       
       // Scanner sc = new Scanner(System.in); puede ir mas cortito porque lo uso una vez
       
       String nombre=new Scanner(System.in).next();
       
       System.out.println("su nombre es "+nombre);
    }
    
}
