package guia3ejerciciosextra;

import java.util.Scanner;

/**
 *Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 * 
 * @author MartuV
 */
public class Ejercicio_10 {

    public static void main(String[] args) {
        
        int numIngresado;
        int i=0;
         
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        int resultado = num1 * num2;

        Scanner sc = new Scanner(System.in);
        
        ///para saber cual seria el resultado
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(resultado);
        
        
        do {
            System.out.println("ingrese un numero del 0 al 100 para adivinar el resultado de la multiplicacion");
            numIngresado = sc.nextInt();
            
            if (numIngresado<=0 || numIngresado>=100) {
                
                System.out.println("el numero ingresado debe ser del 0 al 100");
                continue;
            }

            i++;
            
            if (numIngresado == resultado) {
                System.out.println("ud. ha adivinidado en el intento numero: " + i);
                System.out.println("el resultado de la multiplicacion es: " + resultado);
            } else {
                System.out.println("ud. NO ha adivinidado" );
                System.out.println("vuelva a intentar!!!");
            }

        } while (!(numIngresado == resultado));

    }


}
        
        
       
                
        
    


