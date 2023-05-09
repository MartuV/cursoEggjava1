package guia9ejercicio1otraforma;

import guia9ejercicio1otraforma.entidades.Cadena;
import guia9ejercicio1otraforma.servicios.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class Guia9ejercicio1otraformaMain {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        CadenaServicio cads = new CadenaServicio();
        
        
       
        //Cadena r = new Cadena(frase);
        
        
        
        cads.MostrarVocales();
        cads.invertirFrase(r);
        cads.vecesRepetido(r);
        System.out.println("ingrese una nueva frase para comparar la longitud");
        frase = leer.nextLine();
        cads.comparaLongitud(frase + r);
        cads.unirFrases(frase + r);
        
    }

}
