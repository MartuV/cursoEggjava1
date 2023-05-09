package guia3ejercicios;

import java.util.Scanner;

/**
 *. Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java
 * 
 * @author MartuV
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase = sc.nextLine(); 
        
        // length es similar a longitud de cadena
        if (frase.length()<=8) {
           System.out.println("correcto");
            
        } else {
           System.out.println("incorrecto");  
        }
        
    }

}
