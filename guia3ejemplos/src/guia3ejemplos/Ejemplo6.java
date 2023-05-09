package guia3ejemplos;

import java.util.Scanner;

/**
 * Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 *
 * @author MartuV
 */
public class Ejemplo6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar primer numero");
        int num1 = sc.nextInt();
        
        System.out.println("ingresar segungo numero");
        int num2 = sc.nextInt();
        
        if (num1>25 && num2>25) {
            
            System.out.println("ambos numeros son mayores a 25");
            
        } else if(num1>25 ||  num2>25){
            
            System.out.println("uno de los numeros es mayor a 25");
            
        } else{
        
            System.out.println("ninguno de los numeros es mayor a 25");
            
        }
        
    }

}
