package guia3ejercicios;

import java.util.Scanner;

/**
 *Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 * 
 * @author MartuV
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        
        int suma=0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingresar valor limite");
        
        int limite = sc.nextInt();
        
        do {
            
            System.out.println("ingresar numeros");
        
            int num = sc.nextInt();
            
            suma=suma+num;
            
        } while (suma<limite);
        
        
        
    }

}
