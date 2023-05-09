package guia9ejercicio4.servicios;

import java.util.Date;
import java.util.Scanner;

/**
 * Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
 * @author MartuV
 */
public class FechaService {
    
    private Scanner sc = new Scanner(System.in);
    
    
    /*a) Método fechaNacimiento que pregunte al usuario día, mes y año de
    su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
    El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
    new Date(anio, mes, dia);
    */
    
    public Date fechaNacimiento(){
        
        System.out.print("ingresar dia nacimiento: ");
        int dia= sc.nextInt();
         
        System.out.print("ingresar mes nacimiento: ");
        int mes= sc.nextInt();
        
         
        System.out.print("ingresar año nacimiento: ");
        int anio= sc.nextInt();
        
        //Date fechaNac = new Date(dia,mes,anio);
       
        //me retorna directamente el objeto
        //al año le resto 1900 porque los años empiezan en 1900, entonces lo dejo en 0
        //los meses se indexan a partir de 0, entonces al mes le resto 1, porque por ej enero debe ser 0
        return new Date(anio-1900,mes-1,dia);
     
    }
    
    /*b) Método fechaActual que cree un objeto fecha con el día actual. Para
    esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
    fechaActual = new Date();
    El método debe retornar el objeto Date.
    */
    
    public Date fechaActual(){
        
        //me retorna directamente el objeto
        return new Date();
     
    }
    
    
    /*c) Método diferencia que reciba las dos fechas por parámetro y retorna
    la diferencia de años entre una y otra (edad del usuario)
    */

    public int diferecia(Date fechaActual, Date fechaNac){
    
        int edad= fechaActual.getYear() - fechaNac.getYear();
    
        return edad;
    }
    
    
    //(1000 * 60 * 60 * 24 * 365.25) es la cantidad de milisegundos que hay en un año
    public static int diferencia(Date fechaActual, Date fechaNac) {
        
        int anios = (int) ((fechaActual.getTime() - fechaNac.getTime()) / (1000 * 60 * 60 * 24 * 365.25));
        
        return anios;
    }
}
