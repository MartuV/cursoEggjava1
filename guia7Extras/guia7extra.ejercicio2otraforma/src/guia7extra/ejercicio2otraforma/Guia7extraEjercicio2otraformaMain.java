package guia7extra.ejercicio2otraforma;

import guia7extra.ejercicio2otraforma.entidades.Puntos;

/**
 *
 * @author MartuV
 */
public class Guia7extraEjercicio2otraformaMain {

    public static void main(String[] args) {
        
        
        Puntos p = new Puntos();
        
        p.crearPuntos();
        
        System.out.println("la distancia entre los dos puntos es: "+p.calcularDistancia());
        
    }

}
