package guia9ejercicio4;

import guia9ejercicio4.servicios.FechaService;
import java.util.Date;

/**
 *
 * @author MartuV
 */
public class Guia9ejercicio4Main {

    public static void main(String[] args) {
        
        FechaService fs= new FechaService();
        
        Date fechaNac1= fs.fechaNacimiento();
        
        //aca imprimo el objeto para probar
        System.out.println("fecha nacimiento: "+fechaNac1.toString());
        
        Date fechaActual = fs.fechaActual();
        
        //aca imprimo el objeto para probar
        System.out.println("fecha actual: "+fechaActual.toString());
        
        System.out.println("la edad es(si solo considero los años): "+fs.diferecia(fechaActual, fechaNac1));
        
        int edad=FechaService.diferencia(fechaActual, fechaNac1);
        System.out.println("la edad es (calculado con milisegundos (.getTime): "+ edad );
        
        //para probar desde donde comienza a contar java
        Date fecha = new Date(0,0,1);
        System.out.println("fecha de inicio de Date: "+fecha.toString());
    }

}
