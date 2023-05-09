package guia3ejerciciosextra;

import java.util.Scanner;

/**
 *Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 * 
 * @author MartuV
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        
        int dividendo;
        int divisor;
        
        
        Scanner sc = new Scanner(System.in);
        
        do {
            
            System.out.println("ingresar el dividendo debe ser un numero entero mayor a 1");
            dividendo = sc.nextInt();

            System.out.println("ingresar el divisor debe ser un numero entero mayor a 1");
            divisor = sc.nextInt();
            
            // si se ingresan numeros menores a 1 o el dividendo es mayor al divisor aparece inpreso
            if(dividendo<= 0 || divisor<=0  || dividendo< divisor){
            
                System.out.println("los numeros deben ser enteros mayores a 0 y e; dividendo debe ser mayor al divisor");
            }
            
        } while ( dividendo<= 0 || divisor<=0  || dividendo< divisor );
        
        
        
        
        //lo defino afuera porque adentro del while me da error
        int resto=dividendo;
        int i=0;
        
                
        do{ 
            
            resto=resto-divisor;
            i++;
           
        //mientras que el resto sea mayor a al divisor se sigue ejecutando la resta    
        }while(resto >= divisor );
        
        System.out.println("el cociente es igual: "+i);
        System.out.println("el resto de la division es: "+resto);
    }
    

}
