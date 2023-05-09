package guia7extra.ejercicio4;

import guia7extra.ejercicio4.entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class Guia7extraEjercicio4Main {

    public static void main(String[] args) {
        
        float retiro;
        
        Scanner sc = new Scanner(System.in);
        
        Cuenta c = new Cuenta();
        
        System.out.println("ingresar titular de la cuenta:");
        
        c.setTitular(sc.nextLine());
        
        System.out.println("ingresar saldo actual:");
        
        c.setSaldo(sc.nextFloat());
        
     
        //valido que el retiro no se a 0 o negativo 
        do {
            
            System.out.println("ingresar monto a retirar:");
            retiro= sc.nextFloat();
            
            if (retiro <=0 ) {
                
                System.out.println("el monto a retirar debe ser mayor a 0");
            }
            
        } while (retiro<=0);
        
        
        
        c.retirarDinero(retiro);
        
        
        System.out.println("datos de la cuenta:"+c.toString());
        
    }

}
