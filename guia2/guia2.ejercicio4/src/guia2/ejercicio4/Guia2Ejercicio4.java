/*4. Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5)*/

package guia2.ejercicio4;

import java.util.Scanner;

public class Guia2Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese los grados centigrados que se quieren convertir:");
        
        float gradosC = sc.nextFloat();
        
        float gradosF = 32+ (9 * gradosC / 5);
        
        System.out.println(gradosC+" grados centigrados equivalen a "+gradosF+" grados Fahrenheit");
        
        
    }
    
}
