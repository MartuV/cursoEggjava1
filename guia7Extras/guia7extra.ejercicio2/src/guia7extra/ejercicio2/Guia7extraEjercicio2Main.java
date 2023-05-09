package guia7extra.ejercicio2;

import guia7extra.ejercicio2.entidades.Punto;
import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class Guia7extraEjercicio2Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       
         
       Punto p1=new Punto();
        
       
        p1.crearPunto();
        System.out.println(p1);
        Punto p2=new Punto();
        
        p2.crearPunto();
        System.out.println(p2);
        
      
        System.out.println("la distacia entre el punto 1 y el punto 2 es: "+p1.calcularDistancia(p2));
    }

}
