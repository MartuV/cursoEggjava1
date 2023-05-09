package guia8extra.ejercicio1;

import guia8extra.ejercicio1.entidades.Raices;
import guia8extra.ejercicio1.servicios.RaicesServicio;


/**
 *Vamos a realizar una clase llamada Raices, donde representaremos los
valores de una ecuación de 2º grado. Tendremos los 3 coeficientes
como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores
para construir el objeto a través de un método constructor.
 * @author MartuV
 */
public class Guia8extraEjercicio1Main {

    public static void main(String[] args) {
        
        RaicesServicio rs= new RaicesServicio();
        
        //creo con el constructor el objeto r
        Raices r= new Raices(1,-5,6);
        
        System.out.println("El polinomio tiene una discriminante de "+rs.getDiscriminante(r));
        
        rs.calcular(r);
    }

}
