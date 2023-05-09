package guia7ejercicio2;

import guia7ejercicio2.entidades.Circunferencia;

import java.util.Scanner;

/**
 *Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
 * @author MartuV
 */
public class Guia7ejercicio2Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //creo el objeto con el construtor vacio por defecto
        Circunferencia c1 = new Circunferencia();

        System.out.println("ingresar radio de la circunferencia:");

        //con el set le asigno el valor al atributo radio
        c1.setRadio(sc.nextFloat());

        
        System.out.println("perimetro = " + c1.perimetroCircunferencia());

        System.out.println("area = " + c1.areaCircunferencia());

        System.out.println("------------------------------------");

        //otra forma de asignar el valor al radio
        Circunferencia c2 = new Circunferencia();
        
        c2.crearCircunferencia();

        System.out.println("perimetro = " + c2.perimetroCircunferencia());

        System.out.println("area = " + c2.areaCircunferencia());

        System.out.println("------------------------------------");

        //otra forma de crear el objeto uso el constructor con parametros
        System.out.println("ingresar radio de la circunferencia:");

        Circunferencia c3 = new Circunferencia(sc.nextInt());

        System.out.println("perimetro = " + c3.perimetroCircunferencia());

        System.out.println("area = " + c3.areaCircunferencia());

    }

}
