package guia8ejercicio1otraforma;

import guia8ejercicio1otraforma.entidades.CuentaBancaria;
import java.util.Scanner;
import guia8ejercicio1otraforma.servicios.CuentaBancariaServicios;
/**
 *
 * @author MartuV
 */
public class Guia8ejercicio1otraformaMain {

    public static void main(String[] args) {
        
        Scanner kmo = new Scanner(System.in).useDelimiter("\n");
        
        //esto no hace nada
        //CuentaBancaria cb = new CuentaBancaria();
        
        System.out.println("crear cuenta");
        
        //si quiero crear mas cuentas bancarias ,si tengo cuenta bancaria como atributo de cuenatabancariaservicios
        //tengo que craer mas objetos de cuentabancariaServicios y esa no es la idea
        //la idea seria
        //CuentaBancaria cb1=cbs.crearCuenta();
      
        CuentaBancariaServicios cbs = new CuentaBancariaServicios();
        cbs.crearCuenta();
        CuentaBancariaServicios cbs1 = new CuentaBancariaServicios();
        cbs1.crearCuenta();

              
                
        int Opcion = 0;
        String salir = "si";
        do {
            System.out.println("que operacion desea realisar");
            System.out.println("");
            System.out.println("    1)_ Ingresar dinero");
            System.out.println("    2)_ Retirar dinero");
            System.out.println("    3)_ Extraccion rapida");
            System.out.println("    4)_ Consulta De Saldo");
            System.out.println("    5)_ Consultar Datos");
            System.out.println("    6)_ Salir");
            Opcion = kmo.nextInt();
            switch (Opcion) {
                case 1:
                    cbs.ingresar(Opcion);
                    break;
                case 2:
                    cbs.retirar(Opcion);
                    break;
                case 3:
                    cbs.extracionRapida();
                    break;
                case 4:
                    cbs.consultaSaldo();
                    break;
                case 5:
                    cbs.consultarDatos();
                    break;
                case 6:
                    System.out.println("desea continuar? SI/NO");
                    salir = kmo.next();
                    if ("no".equalsIgnoreCase(salir)) {
                        System.out.println("hasta luego gracias");
                    } else {
                        System.out.println("vamos de nuevo");
                    }
                    break;
                default:
                    System.out.println("no ha ingresado una Opcion valida");

            }

        } while ("si".equalsIgnoreCase(salir));
    }

        
    }


