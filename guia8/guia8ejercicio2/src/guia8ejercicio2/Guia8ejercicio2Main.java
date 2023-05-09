package guia8ejercicio2;

import guia8ejercicio2.entidades.Cafetera;
import guia8ejercicio2.servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 *
 * @author MartuV
 */
public class Guia8ejercicio2Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        
        CafeteraServicio cs = new CafeteraServicio();
       
        //aca creo la cafetera con el constructor de capacidad maxima
        //el enunciado no decia que habia un metodo crear cafetera en cafeteraServicios
        Cafetera caf = new Cafetera(1000);
        
        System.out.println("Cuando creo la cafetera "+caf);
        
        System.out.println("--------");
        
        //le tengo que pasar la cafetera que creo como parametro
        cs.llenarCafetera(caf);
        
        System.out.println("--------");
        
        System.out.println("Ingrese el tamaño de la taza que desea:");
        int taza = sc.nextInt();
        cs.llenartaza(taza, caf);
        
        
        System.out.println("--------");
        
        cs.vaciarCafetera(caf);
        
        System.out.println("--------");
        
        System.out.println("Ingresar cafe:");
        int cafe = sc.nextInt();
        cs.agregarCafe(cafe, caf);
        
        
        System.out.println("******************");
        
        System.out.println("otra forma de crear cafetera");
        
        
        /*//CafeteraServicio cs = new CafeteraServicio();
        no es necesario crear una nueva instancia de CafeteraServicio para cada instancia de Cafetera que crees.
        La clase CafeteraServicio es una clase que proporciona servicios para trabajar con objetos de tipo Cafetera. 
        Por lo tanto, puedes crear una instancia de CafeteraServicio y utilizarla para trabajar con múltiples objetos
        de tipo Cafetera. Esto es más eficiente en términos de memoria y recursos, ya que no necesitas crear múltiples
        instancias de la misma clase para realizar las mismas tareas.
        */
        
        //en el metodo llenarCafetera creo la cafetera
        Cafetera caf1 = cs.llenarCafetera();
        //entonces no la tengo que pasar como parametro en llenar cafetera,porque la estoy creando;
        //en el resto de los metodos si
        
        System.out.println("Cuando creo la cafetera "+caf1);
        
        
        System.out.println("--------");
        
        System.out.println("Ingrese el tamaño de la taza que desea:");
        taza = sc.nextInt();
        cs.llenartaza(taza, caf1);
        
        
        System.out.println("--------");
        
        cs.vaciarCafetera(caf1);
        
        System.out.println("--------");
        
        System.out.println("Ingresar cafe:");
        cafe = sc.nextInt();
        cs.agregarCafe(cafe, caf1);
        
        System.out.println("******************");
        
        System.out.println("otra forma de crear cafetera pidiendo datos al usuario y usando .crearCaferera()");
        
        Cafetera caf3= cs.crearCafetera();
   
        System.out.println("Cuando creo la cafetera "+caf3);
        
         System.out.println("--------");
        
        //le tengo que pasar la cafetera que creo como parametro
        cs.llenarCafetera(caf3);
        
        System.out.println("--------");
        
        System.out.println("Ingrese el tamaño de la taza que desea:");
        taza = sc.nextInt();
        cs.llenartaza(taza, caf3);
        
        
        System.out.println("--------");
        
        cs.vaciarCafetera(caf3);
        
        System.out.println("--------");
        
        System.out.println("Ingresar cafe:");
        cafe = sc.nextInt();
        cs.agregarCafe(cafe, caf3);
        
        

    }

}
