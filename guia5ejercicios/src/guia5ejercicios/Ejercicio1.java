package guia5ejercicios;
/**
 *Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
* 
 * @author MartuV
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        int numeros[]=new int[100];
        
        for (int i=99; i >=0; i--) {
            
            //numeros del 1 al 100
            numeros[i]=i+1;
            
        } 
        
        for (int i=99; i >=0; i--) {
            
            System.out.println("["+numeros[i]+"]");
     
            
        }
        
    }

}
