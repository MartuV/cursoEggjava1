package guia9ejercicio2;

import guia9ejercicio2.entidades.ParDeNumeros;
import guia9ejercicio2.servicios.ParDeNumerosService;

/**
 *
 * @author MartuV
 */
public class Guia9ejercicio2Main {

    public static void main(String[] args) {
        
        ParDeNumerosService ps1 = new ParDeNumerosService();
        
        ParDeNumeros p1= new ParDeNumeros();
        
        ps1.mostrarValores(p1);
        
        ps1.devolverMayor(p1);
        
        ps1.calcularPotencia(p1);
        
        System.out.println("");
    }

}
