package guia9ejercicio1;

import guia9ejercicio1.entidades.Cadena;
import guia9ejercicio1.servicios.CadenaServicio;

import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class Guia9ejercicio1Main {

    public static void main(String[] args) {
        
     
        Scanner sc = new Scanner(System.in);
        
        CadenaServicio cs =  new CadenaServicio();
        
        System.out.println("ingresar frase ");
        String  frase = sc.nextLine();
        
        //aca creo el objeto con el constructor por parametro, le paso la frase y settea la longitud automaticamente
        Cadena cadena = new Cadena(frase);
        
        cs.mostrarVocales(cadena);
        cs.invertirFrase(cadena);
        
        System.out.println("ingresar caracter para ver si esta repetido");
        String caracter = sc.nextLine();
        
        cs.vecesRepetido(cadena, caracter);
        
        System.out.println("ingresar una frase nueva para comparar la longitud ");
        frase = sc.nextLine();
        
        cs.compararLongitud(cadena, frase);
        
        cs.unirFrases(cadena, frase);
        
        
        System.out.println("ingresar caracter con que se quiere reemplazar la letra a");
        caracter = sc.nextLine();
        cs.reemplazar(cadena, caracter);
        
        
        System.out.println("ingresar caracter para ver si esta contenido en la frase");
        caracter = sc.nextLine();
        
        System.out.println(cs.contiene(cadena, caracter));
    }
    
        
    }


