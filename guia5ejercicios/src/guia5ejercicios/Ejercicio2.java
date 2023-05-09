package guia5ejercicios;

import java.util.Scanner;

/**
 *Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
* 
 * @author MartuV
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresar el tamaño del vectot: ");
        int n = sc.nextInt();

        int numeros[] = new int[n];

        //lleno el vector
        for (int i = 0; i < n; i++) {

            //lleno con numeros del 0? 1? al 99, .Math.random da valores entres 0.1-0.9 , por eso multiplico por 100
            //.Math.randon es Double por eso casting a int??? casting?? que lo convierte a entero???
            numeros[i] = (int) (Math.random() * 100);

            // imprimo para ver y probar
            System.out.println("[" + numeros[i] + "]");

        }

        System.out.println("ingresar numero para verificar si se encuentra en el vector: ");
        int num = sc.nextInt();

        //cont para ver si se repite el num
        int j = 0;
        
        //recorro el vector
        for (int i = 0; i < n; i++) {

            if (num == numeros[i]) {

                j++;

                System.out.println("el numero se encuentra en la posicion del vector: " + i);

            }
        }

        //condiciones para contar las veces que se repite el num , 
        //del para poque sino en cada vuelta se imprimirian
        if (j == 0) {

            System.out.println("el numero no se encuentra en el vector");

        } else if (j == 1) {

            System.out.println("el numero se encuentra en el vector y se repite: " + j + " vez");

        } else {

            System.out.println("el numero se encuentra en el vector y se repite: " + j + " veces");

        }

    }

}
