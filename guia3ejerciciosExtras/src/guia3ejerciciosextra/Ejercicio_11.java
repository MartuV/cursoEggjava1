package guia3ejerciciosextra;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
 * 
 * @author MartuV
 */
public class Ejercicio_11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar un numero para saber la cantidad de digitos");
        int num = sc.nextInt();
        
        int i=0;
        
        while (num>0) {
            
            num = num / 10;
            i++;
            
        }
        
        System.out.println("la canitida de digitos que tiene el numero es: "+ i);
        
        
        
        
        
        
    }

}
