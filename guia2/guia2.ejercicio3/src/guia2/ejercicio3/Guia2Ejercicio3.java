
package guia2.ejercicio3;

import java.util.Scanner;

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/

public class Guia2Ejercicio3 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese una frase:");
        
        String frase = sc.nextLine();
        
        String fraseMayuscula = frase.toUpperCase();
        
        System.out.println("la frase en mayusculas es: "+fraseMayuscula);
        
        String fraseMinuscula = frase.toLowerCase();
        
        System.out.println("la frase en minusculas es: "+fraseMinuscula);
        
        
        
   
    }
    
}
