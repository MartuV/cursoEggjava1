package guia3ejerciciosextra;

import java.util.Scanner;

/**
 *Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
 * 
 * @author MartuV
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        
       
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int iLeidos = 0;
        int iPares = 0;
        int iImpares = 0;
        int suma=0;
        
        System.out.println("con numeros multiplos de 5 se sale del programa");

        do {

            System.out.println("ingrese un numero entero ( numero ingresado " + (iLeidos + 1) + " ):");
            num = sc.nextInt();

            

            // agrego && para que no me cuente los multiplos de 5 que uso [ara salir
            if (num % 2 != 0 && num % 5 != 0) {
                iImpares++;
            }

            if (num % 2 == 0 && num % 5 != 0) {
                iPares++;
            }

            //el enunciado no es claro, 
            //entiendo que se quieren sumar todos los numeros, menos los negativos y el que entro para salir del bucle
            if (num > 0 && num % 5 != 0) {

                suma = suma + num;

            }

            //para que no cuente como un numero ingresado el numero que uso para salir
            if ((num < 0 && num % 5 == 0) || (num > 0 && num % 5 == 0)) {

                //iLeidos = iLeidos - 1;
                break;
            }
            
            iLeidos++;

        } while (!(num % 5 == 0));

        System.out.println("cantidad numeros ingresados: "+ (iLeidos)); 
        System.out.println("cantidad numeros pares: "+iPares); 
        System.out.println("cantidad numeros impares: "+(iImpares)); 
        System.out.println("la suma de los numeros ingresados es: "+suma);
            
    }

}
