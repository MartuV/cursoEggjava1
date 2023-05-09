package guia8extra.ejercicio2;

import guia8extra.ejercicio2.entidades.Nif;
import guia8extra.ejercicio2.servicios.ServiciosNif;

/**
 *
 * @author MartuV
 */
public class Guia8extraEjercicio2Main {

    public static void main(String[] args) {
        
        ServiciosNif sNif= new ServiciosNif();
        
        Nif nif= sNif.crearNif();
        
        sNif.mostrarNif(nif);
        
        //para mostrar los datos que tiene el objeto nif
        System.out.println(nif);
        
        //si solo tengo los set en clase Nif
        //puedo modificar los atributos con el set de la clase NIF 
        //tengo que llamar directamente al objeto
        nif.setDni(52215698);
        nif.setLetra("A");
        System.out.println(nif);
        
        //si quiero modificar atraves de la clase servicioNIF 
        //tengo que hacer los set en la clase serviciosNIF y pasar el objeto nif como parametro
        //igualmente al metodo le podria poner otro nombre, por ej cambiardni y cambiaLetra
        //ventaja??? no acceder directamente a los atibutos del objeto con el objeto
        sNif.setDni(nif,13260456);
        sNif.setLetra(nif,"M");
        System.out.println(nif);
        
    }
        
}
