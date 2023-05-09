package guia7extra.ejercicio2otraforma.entidades;

import java.util.Scanner;

/**
 *Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
* 
 * @author MartuV
 */
public class Puntos {
    
    private double x1,x2,y1,y2;
    
    //no necesite escribir el constructor vacio, como no use ningun otro constructor,
    //java lo crea implicito
    
    public void crearPuntos(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingresar coordenadas del punto 1 ");
    
        System.out.print("ingresar x1: ");
        //asigno el valor directamente al atributo
        //el this. puede no ir,porque no hay otra variable local o parametro con el mismo nombre
        this.x1=sc.nextInt();
        
        System.out.print("ingresar y1: ");
        y1=sc.nextInt();
        
        
        System.out.println("ingresar coordenadas del punto 2 ");
        
        System.out.print("ingresar x2: ");
        x2=sc.nextInt();
        
        System.out.print("ingresar y2: ");
        y2=sc.nextInt();
    
    }

    //no necesito pasarle parametros porque los valores ya los tengo en los atributos
    public double calcularDistancia(){
    
         return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
    }
}
