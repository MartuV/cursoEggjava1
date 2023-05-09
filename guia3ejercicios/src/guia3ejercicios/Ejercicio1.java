package guia3ejercicios;

import java.util.Scanner;

/**
 *Crear un programa que dado un número determine si es par o impar
 * @author MartuV
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar un numero:");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            
            System.out.println("el numero es par");
            
        } else {
            
            System.out.println("el numero es impar");

        }
                
                
        
    }

}
