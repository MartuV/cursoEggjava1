
package guia2.ejercicio1;

/*La clase Scanner está disponible a partir de Java 5 y facilita la lectura de datos en los programas Java.
 Para utilizar Scanner en el programa tendremos que hacer lo siguiente:
 1.Escribir el import
 La clase Scanner se encuentra en el paquete java.util (libreria???) por lo tanto se debe incluir al inicio del programa la instrucción:
*/
import java.util.Scanner;


public class Guia2Ejercicio1 {
    
   public static void main(String[] args) {
        
        
        /* 2. Crear un objeto Scanner
           Tenemos que crear un objeto de la clase Scanner asociado al dispositivo de entrada.
           Si el dispositivo de entrada es el teclado escribiremos:

           Scanner sc = new Scanner(System.in);

           Se ha creado el objeto sc asociado al teclado representado por System.in
           Una vez hecho esto podemos leer datos por teclado.  */
        
        Scanner sc = new Scanner(System.in);
        
        //pide el primer numero por pantalla
        System.out.println("ingresar primer numero: ");
        
        //con el metodo .nextInt obtengo (leo???) el dato del tipo int y lo asigno(almaceno???) a la variable num1
        int num1 = sc.nextInt();
        
        //pide el primer numero por pantalla
        System.out.println("ingresar segundo numero: ");
        
       
        int num2 = sc.nextInt();
        
        
        int suma = num1+num2;
        
        
        //muestro por pantalla el resultado de la suma
        System.out.println("la suma de los dos numeros es: "+suma);
        
    }
    
    
   
}
