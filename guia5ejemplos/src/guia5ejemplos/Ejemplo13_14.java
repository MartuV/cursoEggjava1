package guia5ejemplos;

import java.util.Scanner;

/**
 **Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
* 
* Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
compañeros de equipo

 * @author MartuV
 */
public class Ejemplo13_14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String  equipo[]= new String[5];
        
        //lleno el vector
        for (int i = 0; i < 5; i++) {
            
            System.out.println("ingresar el nombre del compa@ero numero "+(i+1)+" del mequipo:");
            
            //si escribo next y pongo por ej juan pablo, pablo lo pone en la siguiente posicion
            //.next solo leee y guarda la primer palabra
            equipo[i]=sc.nextLine();
            
        }
        
        //imprimo el vector 
        for (int i = 0; i < 5; i++) {
            
            System.out.println("el nombre del compa@ero numero "+(i+1)+" del equipo es:"+ equipo[i]);
            
            //los escribe todos en la misma linea
            //System.out.print("el nombre del compa@ero numero "+(i+1)+" del equipo es:"+ equipo[i]);

        }
        
    }

}
