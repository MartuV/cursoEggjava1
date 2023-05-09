package guia3ejerciciosextra;

import java.util.Scanner;

/**
 *Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
 * 
 * @author MartuV
 */
public class Ejercicio_14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingresar la cantidad de familias");
        int nFlias = sc.nextInt();
       
        int suma=0;
        int contHijos=0;
       
        
        for (int i = 1; i <= nFlias; i++) {
            System.out.println("ingresar la cantidad de hijos de la flia numero: "+ (i));
            int mHijos= sc.nextInt();
            
            for (int j = 1; j <= mHijos; j++) {
                
                System.out.println("ingresar la edad del hijo numero: "+(j)+" de la flia numero: "+ i);
                int edad = sc.nextInt();
                
                suma=suma+edad;
                contHijos++;
                
                
            }
            
            
        }
                
        
            
        System.out.println("el promedio de edad es: "+(suma/contHijos));
        
      

    }

}
