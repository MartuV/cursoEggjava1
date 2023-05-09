package guia3ejercicios;

import java.util.Scanner;

/**
 *Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 * 
 * @author MartuV
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num1, num2, opcion;
        char confirmar = 0;
        //definir una variable para permanecer o no en el menu
        boolean salir=false;
        
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
                    if (confirmar == 'S' || confirmar == 's') {
                        //para salir del sistema, cierro todo no es que me quedo en la clase
                        //System.exit(0);
                        System.out.println("ud. ha salido del sistema"); 
                        //hago verdadera la variable para poder salir
                        salir=true;
                        break;
                        
                    }else if(confirmar == 'n' || confirmar == 'N'){
                        System.out.println("ud. NO ha salido del sistema");
                       break; 
                    }else {
                        System.out.println("no es una opcion valida de confirmacion");
                        break;
                    }
                default:
                    System.out.println("Opción inválida");
                    
            }
        } while (! salir);
        
        //} while (confirmar != 'n' || confirmar != 'N');
        //} while (confirmar != 's' || confirmar != 'S');
        //}while (opcion !=5);
        
        
        scanner.close();

        
   }
 }
        
        
    


