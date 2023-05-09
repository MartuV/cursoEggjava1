package guia3ejemplos;

import java.util.Scanner;

/**
 *Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
 * 
 * @author MartuV
 */
public class Ejemplo10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
        int cont=0;
        
        do {
            
            System.out.println("ingresar numero");
            int  num = sc.nextInt();

            System.out.print(num+" ");
                
            if (num>=1 && num<=20) {    
                
                for (int i = 0; i < num; i++) {
                    
                    System.out.print("*");
                    
                }
                //para que sean 4 numeros entre 1 y 20
                cont++;
                
                
            }
                
            } while (cont<4);
        
          
        
    }

}
