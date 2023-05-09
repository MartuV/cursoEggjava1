package guia3ejerciciosextra;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
 * 
 * @author MartuV
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        char letra= ' ';
        
        Scanner leer = new Scanner(System.in);
        
        
        do {
            System.out.println("Ingrese una letra:(z - Salir)");
            letra = leer.next().charAt(0);
            
            //convierte mayusculas en minusculas
            letra = Character.toLowerCase(letra);
            
            //para comparar chat == ' ' comillas simples
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                
            } else {
                System.out.println("No es una vocal.");
                
            }
        } while (letra != 'z');
        
    }

}
