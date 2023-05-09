package guia3ejemplos;

import java.util.Scanner;

/**
 *  Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 *
 * @author MartuV
 */
public class Ejemplo8 {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("ingrese una nota");
        
        int  nota = sc.nextInt();
        
        while (nota<0 || nota>10) {
            
            System.out.println("ingrese nuevamente la nota");
            
            //para la salir del bucle, ingreso otro numero para poder comparar
            //no nesecito definir de nuevo la variable nota, ya la tengo definida en la linea 21
            nota = sc.nextInt();

            
        }
        
        System.out.println("la nota ingresada es correcta");
        
    }

}
