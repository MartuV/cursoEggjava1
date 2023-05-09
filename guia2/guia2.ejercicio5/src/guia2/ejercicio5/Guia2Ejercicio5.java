/*Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt()*/

package guia2.ejercicio5;

import java.util.Scanner;

public class Guia2Ejercicio5 {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingresar un numero entero:");
        
        int num = sc.nextInt();
        
        int doble = num*2;
        
        int triple = num*3;
        
        /*clase Math nos ofrece numerosos y valiosos métodos y constantes
          estáticos, que podemos utilizar tan sólo anteponiendo el nombre de la clase
          clase Math del paquete java.lang (no es necesario importar la clase???)
        
          metodo .sqrt(double a) Devuelve la raíz cuadrada positiva correctamente
          redondeada de un double.
        */
        
        double raizCuadrada = Math.sqrt(num);
        
        System.out.println("el doble del "+num+" es: "+doble);
        
        System.out.println("el triple del "+num+" es: "+triple);
        
        System.out.println("la raiz cuadrada del "+num+" es: "+raizCuadrada);
        
    }
    
}
