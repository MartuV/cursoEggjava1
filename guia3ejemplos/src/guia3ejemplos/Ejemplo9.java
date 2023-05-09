package guia3ejemplos;

import java.util.Scanner;

/**
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 *
 * @author MartuV
 */
public class Ejemplo9 {

    public static void main(String[] args) {
        
        /*
        Scanner leer = new Scanner(System.in);      	
        int num, suma;         
        suma = 0;        	
        do {      	
            System.out.println("Ingres un numero");     	
            num = leer.nextInt();         
                if (num > 0) {             
                      suma = num + suma;            
                      System.out.println("La suma es: " + suma);          
                }     	
        } while (num != 0);         
        
           System.out.println("Se capturó el numero cero");


        */
        
        Scanner sc = new Scanner(System.in);
        
        int cont=0;
        int suma=0;
        
        do {
            System.out.println("ingresar un numero");
            int num = sc.nextInt();
            //para ir contando las veces que se ingresan los numeros
            cont++;
            //imprimo para probar cuentos numeros van ingresados
            System.out.println("numero "+cont);
            
            if (num==0) {
                
                System.out.println("se capturo el numero 0");
                //si el num=0 se sale del bucle
                break;
                
            } else {
                
                if (num>0) {
                    suma=suma+num;
                    
                } 
            }
            
        } while (cont<20);
        
        
        
        
        System.out.println("el resultado de la suma es: "+suma);
        
    }

}
