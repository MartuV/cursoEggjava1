package guia9ejercicio1otraforma.servicios;

import guia9ejercicio1otraforma.entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class CadenaServicio {
    
    private Scanner leer = new Scanner(System.in);
    
     System.out.println("ingrese una frase");
        String frase = leer.nextLine();
    private Cadena cad = new Cadena();

    public void MostrarVocales() {
    cad.longitud=cad.frase.length();               
        int cant = 0;
        for (int i = 0; i < cad.longitud; i++) {
            String a = cad.frase.substring(i, i + 1);
            if (a.equals("a")) {
                cant = cant + 1;
            }
            if (a.equals("e")) {
                cant = cant + 1;
            }
            if (a.equals("i")) {
                cant = cant + 1;
            }
            if (a.equals("o")) {
                cant = cant + 1;
            }
            if (a.equals("u")) {
                cant = cant + 1;
            }
        }
        System.out.println(cant);
    }

    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.   
    public void invertirFrase(Cadena e) {
        String a = "";
        int r = cad.longitud;
        for (int i = 0; i < cad.longitud; i++) {
            r = r - 1;
            a = a + cad.frase.substring(r, r + 1);
        }
        System.out.println(a);
    }

    /*Método vecesRepetido(String letra), recibirá un carácter 
    ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase,  por ejemplo:
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. Método compararLongitud(String frase),
    deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
     */ public void vecesRepetido(Cadena r) {
        String repit = leer.next();
        int cant = 0;
        for (int i = 0; i < cad.longitud; i++) {
            String a = cad.frase.substring(i, i + 1);
            if (a.equals(repit)) {
                cant = cant + 1;
            }
        }
        System.out.println(cant);
    }               


    // Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
    //compone la clase con otra nueva frase ingresada por el usuario.

    public void comparaLongitud(String frase) {
        int a = frase.length();
        System.out.println("la longitud de " + cad.frase + "es" + cad.longitud);
        System.out.println("la longitud de " + a + " es " + a);
    }
    
    

    /*Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva 
             frase ingresada por el usuario y mostrar la frase  resultante.        */
    public void unirFrases(String frase) {
        String newfrase = cad.frase.concat(" " + frase);
        System.out.println("la nueva frase es: " + newfrase);
    }

             
             

}
