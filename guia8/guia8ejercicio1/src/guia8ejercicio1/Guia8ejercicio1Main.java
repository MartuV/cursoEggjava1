package guia8ejercicio1;

import guia8ejercicio1.entidades.CuentaBancaria;
import guia8ejercicio1.servicios.ServiciosCuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class Guia8ejercicio1Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //crea un nuevo objeto de la clase ServiciosCuentaBancaria, que se almacena en una variable llamada scb
        //y me permite entrar a los metodos que hay en la clase servicios
        ServiciosCuentaBancaria scb = new ServiciosCuentaBancaria();
        
        
        //creo una cuenta bancaria
        CuentaBancaria cb = scb.crearCuentaBancaria();    
        System.out.println(cb.toString());
        
        /*es como que servicios.crearCuentaBancaria() hace lo mismo que 
        CuentaBancaria cb = new CuentaBancaria(numeroCuenta, dniCliente, saldoActual), 
        en definitiva se esta creando un objeto cuenta????

        Exacto, la línea CuentaBancaria cuenta = servicios.crearCuentaBancaria(); 
        crea un nuevo objeto CuentaBancaria utilizando el método crearCuentaBancaria() de la clase ServiciosCuentaBancaria, 
        mientras que new CuentaBancaria(numeroCuenta, dniCliente, saldoActual) crea un nuevo objeto CuentaBancaria 
        utilizando el constructor de la clase CuentaBancaria que recibe los valores de numeroCuenta, dniCliente y saldoActual. 
        En ambos casos, se está creando un nuevo objeto CuentaBancaria.
        
        El uso de un método para crear objetos de una clase puede ser una mejor práctica que utilizar el constructor 
        directamente en la aplicación, ya que proporciona un mayor nivel de abstracción y flexibilidad.
        */
        
        /*
        la idea de usar la clase servicios es no modificar directamente los atributos desde la clase cuenta bancaria???

        Exacto, al utilizar la clase ServiciosCuentaBancaria y sus métodos para realizar operaciones con los objetos
        de la clase CuentaBancaria, se logra un mayor encapsulamiento y se evita modificar directamente los atributos
        desde la clase CuentaBancaria. Esto permite tener un código más organizado y fácil de mantener en el futuro. 
        Además, se pueden agregar más funcionalidades a la clase ServiciosCuentaBancaria sin tener que modificar 
        la clase CuentaBancaria.
        */
        
        /*en el caso de los métodos en la clase ServiciosCuentaBancaria que actúan sobre una cuenta bancaria 
        existente (como el método ingresarDinero o mostrarCuentaBancaria), es necesario pasar la cuenta bancaria 
        como parámetro. De lo contrario, el método no tendría acceso a la cuenta sobre la cual actuar.

        En el caso del método crearCuentaBancaria, este método crea una nueva cuenta bancaria y devuelve el objeto
        de la cuenta recién creada. Por lo tanto, en ese caso no es necesario pasar una cuenta como parámetro.
        
        */
        
        int opcion;
        
        do {
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("");
            System.out.println("1) Ingresar dinero");
            System.out.println("2) Retirar dinero");
            System.out.println("3) Extracción rápida");
            System.out.println("4) Consulta de saldo");
            System.out.println("5) Consultar datos");
            System.out.println("6) Salir");
            
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado Ingresar dinero");
                    System.out.println("monto a depositar:");
                    double deposito = sc.nextDouble();
                    scb.ingresarDinero(cb, deposito);
                    //para probar si da bien 
                    System.out.println(cb.toString());
                    break;
                case 2:
                    System.out.println("Ha seleccionado Retirar dinero");
                    
                    System.out.println("monto a retirar:");
                    double retiro = sc.nextDouble();
                     scb.retirarDinero(cb,retiro);
                    //para probar si da bien 
                    System.out.println(cb.toString());
                    break;
                case 3:
                    System.out.println("Ha seleccionado Extracción rápida");
                     scb.extraccionRapida(cb);
                     //para probar si da bien 
                     System.out.println(cb.toString());
                    break;
                case 4:
                    System.out.println("Ha seleccionado Consulta de saldo");
                    scb.mostrarSaldoActual(cb);
                    break;
                case 5:
                    System.out.println("Ha seleccionado Consultar datos");
                    
                    scb.mostrarDatos(cb);
                    break;
                case 6:
                    System.out.println("Ha seleccionado Salir");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente");
                    break;
            }
            System.out.println("");
        } while (opcion != 6);
        
        /*scb.ingresarDinero(cb);
        //para probar si da bien 
        System.out.println(cb.toString());
        
        scb.retirarDinero(cb);
        //para probar si da bien 
        System.out.println(cb.toString());
        
        scb.extraccionRapida(cb);
        
        scb.mostrarSaldoActual(cb);
        scb.mostrarDatos(cb);*/
    }

}
