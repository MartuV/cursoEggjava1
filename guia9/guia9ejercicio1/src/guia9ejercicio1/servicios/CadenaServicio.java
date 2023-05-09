package guia9ejercicio1.servicios;

import guia9ejercicio1.entidades.Cadena;

/** 
 *
 * @author MartuV
 */
public class CadenaServicio {
    
    
 

    /*a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
    que tiene la frase ingresada.*/
    public void mostrarVocales(Cadena cadena) {

        int vocales = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {
            String letra = cadena.getFrase().substring(i, (i + 1));

            // System.out.println(letra); //para probar
            
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
                vocales++;
            }
        }

        System.out.println("la cantidad de vocales es " + vocales);

    }

    /* b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
    por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
    asac".*/
    public void invertirFrase(Cadena cadena) {

        String fraseInvert = "";

        for (int i = cadena.getLongitud(); i > 0; i--) {
            String letra = cadena.getFrase().substring((i - 1), (i));

            fraseInvert = fraseInvert.concat(letra);

            //System.out.println(fraseInvert);//para probar

        }

        System.out.println("la frase invertida es " + fraseInvert);

    }

    /*c) Método vecesRepetido(String letra), recibirá un carácter ingresado
    por el usuario y contabilizar cuántas veces se repite el carácter en la
    frase, por ejemplo:*/
     /*d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
    veces.*/
    public void vecesRepetido(Cadena cadena, String caracter) {

        int repetido = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {
            String letra = cadena.getFrase().substring(i, (i + 1));

            // System.out.println(letra); //para probar
            if (letra.equalsIgnoreCase(caracter)) {
                repetido++;
            }
        }

        System.out.println("el caracter " + caracter + " se repite " + repetido);

    }

    /*e) Método compararLongitud(String frase), deberá comparar la longitud
    de la frase que compone la clase con otra nueva frase ingresada por
    el usuario.*/
    
    public void compararLongitud(Cadena cadena, String frase){
       
        System.out.println("la primer frase tiene "+cadena.getLongitud()+" y la segunda frase tiene "+frase.length()+" caracteres");
    
        
    }
    
    
     /*f) Método unirFrases(String frase), deberá unir la frase contenida en la
    clase Cadena con una nueva frase ingresada por el usuario y mostrar
    la frase resultante.*/
    public void unirFrases(Cadena cadena, String frase) {

      System.out.println("la frase unida es " + cadena.getFrase()+" "+frase);

    }
    
    
    
    /* g) Método reemplazar(String letra), deberá reemplazar todas las letras
    “a” que se encuentren en la frase, por algún otro carácter
    seleccionado por el usuario y mostrar la frase resultante.*/
    public void reemplazar(Cadena cadena, String caracter) {
        
        String fraseReempl=cadena.getFrase().replaceAll("a", caracter);
        fraseReempl=fraseReempl.replaceAll("A", caracter);
        
       /* String fraseReempl = "";

        for (int i = 0; i < cadena.getLongitud(); i++) {
            String letra = cadena.getFrase().substring(i, (i + 1));

            // System.out.println(letra); //para probar
            if (letra.equalsIgnoreCase("a")) {
                fraseReempl = fraseReempl.concat(caracter);
            } else {

                fraseReempl = fraseReempl.concat(letra);
            }
        }*/

        System.out.println("la frase con reemplazos es " + fraseReempl);

    }

    /* h) Método contiene(String letra), deberá comprobar si la frase contiene
    una letra que ingresa el usuario y devuelve verdadero si la contiene y
    falso si no.
     */
    public boolean contiene( Cadena cadena, String caracter){
    
        return cadena.getFrase().contains(caracter);
    }
    
}
