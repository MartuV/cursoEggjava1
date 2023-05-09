package guia7extra.ejercicio4.entidades;

import java.util.Scanner;

/**
 *Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 * @author MartuV
 */
public class Cuenta {
    
    private String titular;
    
    private float saldo;

    public Cuenta() {
        
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(float saldo) {
        
        Scanner sc = new Scanner(System.in);
      
        //valido que el saldo no sea sea 0 o negativo
        do {
            
             if (saldo > 0) {
                 //cuando el saldo es mayor a 0 lo asigno al atributo
                this.saldo = saldo;
            } else {
                System.out.println("el saldo debe ser mayor a 0");
                System.out.println("ingresar nuevamente el saldo actual:");
        
                saldo=sc.nextFloat();
            }

            
        } while (saldo <= 0);
        
        

    }

   
    
    public float retirarDinero(float retiro){
        
        Scanner sc = new Scanner(System.in);
    
        //valido que el retiro no supere al saldo
        do {

            if (retiro>saldo) {

                System.out.println("saldo insuficiente para retirar el monto solicitado");
                System.out.println("ingresar nuevamente el monto a retirar:");
                retiro = sc.nextFloat();

            }

        } while (retiro>saldo);

        saldo -= retiro;


        return saldo;

    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }

    

}
