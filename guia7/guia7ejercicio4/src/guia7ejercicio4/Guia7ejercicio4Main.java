package guia7ejercicio4;

import guia7ejercicio4.entidades.Rectangulo;
import java.util.Scanner;
/**
 *Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 * @author MartuV
 */
public class Guia7ejercicio4Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Rectangulo r = new Rectangulo();

        
       /* //con los setter
        System.out.println("ingresar la base del rectangulo (numero entero):");
        r.setBase(sc.nextInt());

        System.out.println("ingresar altura del rectangulo (numero entero): ");
        r.setAltura(sc.nextInt());

        System.out.println("perimetro = " + r.perimetroRectangulo());
        System.out.println("area = " + r.areaRectangulo());

        r.dibujarRectangulo();*/
        
        

       /*//usando crearRectangulo sin parametros
        
        r.crearRectangulo();
        System.out.println("perimetro = " + r.perimetroRectangulo());
        System.out.println("area = " + r.areaRectangulo());

        r.dibujarRectangulo();*/
        
        
        // usando crear rectangulo con parametros
        System.out.println("ingresar la base del rectangulo (numero entero):");
        int base=sc.nextInt();
        
        System.out.println("ingresar altura del rectangulo (numero entero): ");
        int altura=sc.nextInt();
        
        r.crearRectanguloConParametros(base,altura);
        
        System.out.println("perimetro = " + r.perimetroRectangulo());
        System.out.println("area = " + r.areaRectangulo());

        r.dibujarRectangulo();
    }

}
