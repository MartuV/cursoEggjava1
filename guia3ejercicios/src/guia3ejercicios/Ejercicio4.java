package guia3ejercicios;

import java.util.Scanner;

/**
 *Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 * 
 * @author MartuV
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase = sc.next(); 
        
       //charAt(0) tb me da la primer letra, pero no la puedo usar con equals me salta error
        // .equals es solo para String????
        char primerLetra = frase.charAt(0);
       
        System.out.println("la primera letra es: "+primerLetra);
        
        //me da las dos primeras letras
        System.out.println(frase.substring(0,2));
        
        //me da la ultima letra
        System.out.println(frase.substring(frase.length()-1,frase.length()));
        
        if (frase.substring(0,1).equals("A")) {
           System.out.println("correcto");
            
        } else {
           System.out.println("incorrecto");  
        }
        
    }

}
