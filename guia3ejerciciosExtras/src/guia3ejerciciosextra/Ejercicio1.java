package guia3ejerciciosextra;

import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        
        /*int dias, horas;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese minutos: ");
        int minutos = leer.nextInt();
        dias = minutos/(24*60);
        //obtengo el resto de la division anterior
        minutos = minutos - dias*24*60;
        // si divido el resto por 60 obtengo las hs
        horas = minutos/60;
        System.out.println("Días: " + dias + " - Horas: " + horas + " - Minutos: " + (minutos=minutos-(horas)*60));*/
        
       
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar la cantidad de minutos a convertir");
        int minIngresados = sc.nextInt();
        
        //1 dia=24 hs=1440 mimutos
        
        //si en una variable int hago una division ya estoy truncando el numero, o sea me quedo con la parte entera
        //si divido los min ingresados por 1440 la parte entera son los dias
        int dias =minIngresados/1440;
        
        // obtengo el resto de la division anterior con mod % 
        int resto= minIngresados % 1440;
        
        //y si lo divido 60 ,la parte entera me da las hs
        int hs = resto/60 ;
        
        //y el resto son los minutos
        int min = resto % 60;
        
        if (dias==0 || dias==1) {
            System.out.println(minIngresados+" minutos equivalen a "+dias+" dia, "+hs+" horas y "+min+" minutos");
            
        } else {
            System.out.println(minIngresados+" minutos equivalen a "+dias+" dias, "+hs+" horas y "+min+" minutos");
        }
        
                
    }

}
