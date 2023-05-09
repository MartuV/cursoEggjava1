package guia8ejercicio1otraforma.servicios;

import guia8ejercicio1otraforma.entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class CuentaBancariaServicios {
    
    Scanner kmo = new Scanner(System.in).useDelimiter("\n");
    
    //lo define como un atributo??? no como un objeto
    private CuentaBancaria cuenta;
    
//     Método para crear cuenta pidiéndole los datos al usuario.
    public void crearCuenta() {
        System.out.println("crear su numero de cuenta");       
       // cuenta.setNumeroCuenta( kmo.nextInt());
       int numeroCuenta=kmo.nextInt();
        System.out.println("ingrese su DNI");
       // cuenta.setDniCliente(kmo.nextInt());
        long DniCliente=kmo.nextLong();
        System.out.println("ingrese el monto de su cuenta");
        // cuenta.setSaldo(kmo.nextDouble());
         double saldo =kmo.nextDouble();
        
        //al atributo le asigna la referencia del objeto????
        cuenta = new CuentaBancaria(numeroCuenta, DniCliente, saldo);
    }
    
//Método ingresar(double): recibe una cantidad de dinero a ingresar y
//se le sumará al saldo actual.
    
   
    public double ingresar(double ingresar) {
        double j = 0;
        //deberia pedirlo en el main, y pasarlo por parametro????
        System.out.println("ingrese cantidad a depositar");
        ingresar = kmo.nextDouble();
        j += ingresar + cuenta.getSaldo();
        System.out.println("tu nuevo saldo es de: " + j);
        cuenta.setSaldo(j);
        return ingresar;
    }
    
//     
// Método retirar(double): recibe una cantidad de dinero a retirar y se le
//restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
//retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    public double retirar(double retirar) {
        System.out.println("ingrese el monto que quiere retirar");
        retirar = kmo.nextDouble();
        if (retirar < cuenta.getSaldo()) {
            double j = cuenta.getSaldo() - retirar;
            System.out.println("se retira:" + retirar);
            System.out.println("saldo de la cuenta: " + j);
            cuenta.setSaldo(j);
        } else if (retirar > cuenta.getSaldo()) {
            System.out.println("saldo insuficiente:");
            System.out.println("saldo alctual de la cuenta: " + cuenta.getSaldo());
            System.out.println("se le entregara el saldo de la cuenta:" + cuenta.getSaldo());
            retirar = cuenta.getSaldo() - cuenta.getSaldo();
            System.out.println("estas seco ñery: " + retirar);
           cuenta.setSaldo(retirar);
        }
        return retirar;
    }
//    Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
//Validar que el usuario no saque más del 20%.
    public void extracionRapida() {
        System.out.println("este metodo solo entrega el 20% de su saldo: " + cuenta.getSaldo());
        double exrapida = cuenta.getSaldo() * 0.2;
        System.out.println("el 20% corresponde a: " + exrapida);
        double retirar = cuenta.getSaldo() - (cuenta.getSaldo() * 0.2);
        System.out.println("su saldo actual es: " + retirar);
        cuenta.setSaldo(retirar);
    }
//    Método consultarSaldo: permitirá consultar el saldo disponible en la
//cuenta.
    public void consultaSaldo() {
        System.out.println("su saldo altual es: " + cuenta.getSaldo());
    }
//    Método consultarDatos: permitirá mostrar todos los datos de la
//cuenta.
    public void consultarDatos() {
        System.out.println("numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI: " + cuenta.getDniCliente());
        System.out.println("el saldo de la cuenta es: " + cuenta.getSaldo());
    }
}

    


