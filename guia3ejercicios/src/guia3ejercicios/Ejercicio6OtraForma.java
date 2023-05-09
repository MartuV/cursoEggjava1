package guia3ejercicios;

import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class Ejercicio6OtraForma {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        int num1, num2, opcion;
        char confirmar = 0;
        
        System.out.print("Ingrese el primer número: ");
            num1 = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            num2 = scanner.nextInt();
            
           
        do {
            
           
            System.out.println("Menú de opciones:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
           
             switch (opcion) {
                case 1:
                    //continue ; no se ejecuten el resto del codigo que esta por debajo, en un bucle me quedo en el bucle
                    //continue; en un switch que no este dentro de un bucle da error
                    //en un switc el break que uso es para que no entre en otras opciones del menu
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La división es: " + ((double) num1 / num2));
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    confirmar = scanner.next().charAt(0);
                    switch (confirmar) {
                        case 'S':
                        case 's':
                            System.out.println("ud. ha salido del sistema"); 
                            //aca opcion=5 entonces con break salgo del menu, llego al while y salgo 
                            //el break es para salir del menu
                            break;
                        case 'N':
                        case 'n':
                           //para que se quede dentro del bucle, cambio el valor de opcion que sea distinto de 5
                           opcion=9;
                           System.out.println("ud.no ha salido del sistema");
                           //aca puedo usar continue porque esta dentro de un bucle y que no se ejecute default
                           continue;
                            
                        default:
                           System.out.println("no es una opcion valida de confirmacion");
                            
                           opcion=0; 
                           continue;
                        }
   
                  default:
                   System.out.println("no es una opcion valida del menu");
                            
                          
                   break;       
                           
                    
                
            }
            
            }while (opcion != 5 );
        
        
        scanner.close();
    

        
    }

}
