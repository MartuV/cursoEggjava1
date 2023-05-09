package guia7extra.ejercicio2.entidades;

import java.util.Scanner;

/**
 *Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
 * @author MartuV
 */
public class Punto {

    private int x;
    private int y;

    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    
    
    public void crearPunto() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar coordenadas del punto");
        
        System.out.print("ingresar x: ");
        this.x=sc.nextInt();
        
        System.out.print("ingresar y: ");
        this.y=sc.nextInt();
        
    }
    
    public double calcularDistancia(Punto p2) {

        double distancia = Math.sqrt(Math.pow(p2.getX() - x, 2) + Math.pow(p2.getY() - y, 2));

        return distancia;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
     
    
}
