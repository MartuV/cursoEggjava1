package guia3ejercicios;

import java.util.Scanner;

/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *

 * @author MartuV
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar numero entero para dibujar el cuadrado");
        int num = sc.nextInt();
        
        for (int i = 0; i < num; i++) {
            
            
            for (int j = 0; j < num; j++) {
                
                if (j==0 || j==num-1 ||i==0 ||i==num-1 ) {
                    //.print para que escriba en la misma linea
                    //.si pongo .println salta de linea
                    System.out.print(" * ");
                    
                }else{
                
                    System.out.print("   ");       
                }
                    
            }
            //salto de linea 
            //System.out.println(); tb funciona sin las comillas
             System.out.println("");  
            
        }
        
    }

}
