package guia8ejercicio1.servicios;

import guia8ejercicio1.entidades.CuentaBancaria;
import java.util.Scanner;


/**
 *
 * @author MartuV
 */
public class ServiciosCuentaBancaria {

    private Scanner sc = new Scanner(System.in);

    /*public CuentaBancaria crearCuentaBancaria() {
        CuentaBancaria cb = new CuentaBancaria();
       
        System.out.println("Ingresar Nombre de la cuenta");
        cb.setNumeroCuenta(sc.nextInt());
        System.out.println("Ingresar Numero de DNI ");
        cb.setDniCliente(sc.nextLong());
        System.out.println("Ingresar Saldo actual  ");
        cb.setSaldoActual(sc.nextDouble());
        return new CuentaBancaria(cb.getNumeroCuenta(), cb.getDniCliente(), cb.getSaldoActual());

    }
    
     //En el método crearCuentaBancaria() se está creando un objeto CuentaBancaria innecesario, 
     // ya que se está creando un objeto vacío y luego se están estableciendo los valores con los métodos set.
     //En lugar de eso, podemos establecer los valores directamente en el objeto cb que ya se ha creado y
     //retornarlo al final del método.
    // return cb;
    
     */
    public CuentaBancaria crearCuentaBancaria() {
        
        System.out.println("Crear cuenta Bancaria");
        System.out.println("Ingresar Numero de la cuenta");
        int numeroCuenta = sc.nextInt();

        System.out.println("Ingresar Numero de DNI ");
        long dniCliente = sc.nextLong();

        System.out.println("Ingresar Saldo actual  ");
        double saldoActual = sc.nextDouble();

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    
    /*El método crearCuenta no recibe parámetros porque su función es precisamente pedirle al usuario que
    ingrese los datos de la nueva cuenta bancaria y crear un objeto CuentaBancaria con esos datos. 
    Es decir, cuando se llama al método crearCuenta, aún no se ha creado ninguna cuenta bancaria, 
    por lo que no hay ningún objeto CuentaBancaria al que se le puedan pasar parámetros.

    Por otro lado, los otros métodos (como ingresar, retirar, extraccionRapida, consultarSaldo y consultarDatos) 
    sí reciben como parámetro un objeto CuentaBancaria porque necesitan modificar o consultar los datos de una 
    cuenta bancaria en particular. Es decir, cada vez que se llama a uno de estos métodos, 
    se debe especificar cuál es la cuenta bancaria a la que se refiere. 
    Por eso, se pasa un objeto CuentaBancaria como parámetro.
    
     */
    
    //b)Método ingresar(double): recibe una cantidad de dinero a ingresar y
    //se le sumará al saldo actual.
    //le paso como parametro la cuenta que ya tengo creada
    public double ingresarDinero(CuentaBancaria cb,double deposito) {

        //si creo un nuevo objeto aca,se me va a inicializar vacio ,tengo que pasar la cuenta como parametro
        //CuentaBancaria cb = new CuentaBancaria(); 
        //lo pido en el main porque el metodo recibe el deposito
        //System.out.println("monto a depositar:");
        //double deposito = sc.nextDouble();
        // set siempre recibe parametro, que es el valor que le asigno al atributo , no hay que igualar
        //cb.setSaldoActual=cb.getSaldoActual()+deposito; 
        cb.setSaldoActual((cb.getSaldoActual() + deposito));
        return cb.getSaldoActual();

    }

    //c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
    //restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
    //retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    
    public double retirarDinero(CuentaBancaria cb,double retiro) {
        
        //retiro lo pido en el  main porque me dice que el metodo recibe una cantidad de dinero
        //double retiro
        //System.out.println("monto a retirar:");
        //retiro = sc.nextDouble();

        if (retiro <= cb.getSaldoActual()) {
            cb.setSaldoActual((cb.getSaldoActual() - retiro));

        } else {
            //el maximo es lo que hay en la cuenta, el valor lo recupero con el get
            System.out.println("el maximo dinero a retirar es:" + cb.getSaldoActual());
            System.out.println("Ud. ha retirado " + cb.getSaldoActual());
            //el saldo me tiene que quedar en 0, entonces uso el set
            cb.setSaldoActual(0);

        }

        return cb.getSaldoActual();
    }

    //d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
    //Validar que el usuario no saque más del 20%.
    public double extraccionRapida(CuentaBancaria cb) {

        double extraccion;

        do {
            System.out.println("monto a retirar por extraccion rapida:");
            extraccion = sc.nextDouble();

            if (extraccion > 0.2 * cb.getSaldoActual()) {
                System.out.println("en la extraccion rapida no se puede extraer mas del 20% del saldo");
                System.out.println("Ud puede retirar hasta "+0.2*cb.getSaldoActual());
            }

        } while (extraccion > 0.2 * cb.getSaldoActual());
        
        cb.setSaldoActual((cb.getSaldoActual() - extraccion));
        
        return cb.getSaldoActual();
    }

    //e) Método consultarSaldo: permitirá consultar el saldo disponible en la
    //cuenta.
    public void mostrarSaldoActual(CuentaBancaria cb) {

        System.out.println("Saldo Actual:: " + cb.getSaldoActual());
    }

    //f) Método consultarDatos: permitirá mostrar todos los datos de la
    //cuenta.
    public void mostrarDatos(CuentaBancaria cb) {

        System.out.println("Numero de cuenta: " + cb.getNumeroCuenta());
        System.out.println("Numero de DNI: " + cb.getDniCliente());
        System.out.println("Saldo Actual:: "+cb.getSaldoActual());
    }
}
