package guia4ejemplos;

import java.util.Scanner;

/**
 *Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
 * validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, 
 * sino informe que no lo son.
 * 
 * @author MartuV
 */
public class Ejemplo12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingresar primer numero");
        int num1 = sc.nextInt();
        
        System.out.println("ingresar primer numero");
        int num2 = sc.nextInt();
        
        
        esMultiplo(num1,num2);
        
        
    }
    
    public static void esMultiplo(int num1,int num2){
        
        if (num1 % num2 == 0) {
            
            System.out.println("es multiplo");
        
        }else{
        
            System.out.println("no es multiplo");
        
        }
        
        
        
    }

}
