package guia3ejercicios;

import java.util.Scanner;

/**
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.

 * 
 * @author MartuV
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase = sc.nextLine(); 
        
        if (frase.equals("eureka")) {
            
            System.out.println("correcto");
            
        } else {
            
            System.out.println("incorrecto");

        }
        
    }

}
