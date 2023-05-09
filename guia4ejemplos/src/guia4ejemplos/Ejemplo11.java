package guia4ejemplos;

import java.util.Scanner;

/**
 *Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto,
 * y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el 
 * carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas)
 * se mantienen sin cambios.
a @
e #
i $
o %
u *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
* Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 * 
 * @author MartuV
 */
public class Ejemplo11 {

    public static void main(String[] args) {
        
        String frase = " ";
        
        
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("ingresar frase a convertir (debe terminar en punto):");
            frase = sc.nextLine();
       // }while ( frase.charAt(frase.length() - 1)!= '.');
        //.endsWhith metodo para buscar el ultimo caracter de la cadena
        // para el primero starswhith
        }while (! frase.endsWith("."));
        
       
        String salida = convertirFrase(frase);
        
        System.out.println("la frase convertida es: "+salida);
        
        
    }

    public static String convertirFrase(String frase)   {
        
        String fraseNueva = frase.replaceAll("a", "@");
           
       /* String fraseNueva = "";
     

        for (int i = 1; i <= frase.length(); i++) {

            String letra = frase.substring(i - 1, i);
            switch (letra) {
                case "a":
                case "A":
                    letra = "@";
                    break;
                case "e":
                case "E":
                    letra = "#";
                    break;
                case "i":
                case "I":
                    letra = "$";
                    break;
                case "o":
                case "O":
                    letra = "%";
                    break;
                case "u":
                case "U":
                    letra = "*";
                    break;

                //no es necesariodefault:
                   // letra = letra;
            }

            fraseNueva = fraseNueva.concat(letra);


        }*/
    
          return fraseNueva;

    
    }
    
    
    /*
    Scanner leer=new Scanner(System.in) ;
       String frase ;
        do {
           System.out.println("Ingrese frase a codificar: ");
           frase = leer.nextLine() ;
        } while (!frase.substring(frase.length()-1,frase.length()).equals("."));
           
     System.out.println("su nueva frase es: "+codificada(frase));
    }
    public static String codificada(String frase ) {
      String nuevaFrase =""  ;
      
    for (int i=0 ; i<(frase.length()) ; i++) {
        switch (frase.substring(i, i+1)) {
            case "a" :
            case "A" :   
                nuevaFrase= nuevaFrase.concat("@") ;
            break ;
            case "e" :
            case "E" :    
                nuevaFrase= nuevaFrase.concat("#") ;
            break;
            case "i" :
            case "I" :
                nuevaFrase= nuevaFrase.concat("$") ;
            break;
            case "o" :
            case "O" :    
                nuevaFrase= nuevaFrase.concat("%") ;
            break ;
            case "u" :
            case "U" :
                nuevaFrase= nuevaFrase.concat("*") ;
            break ;    
            default :
              nuevaFrase= nuevaFrase.concat(frase.substring(i, i+1)) ;
            break ;  
        }
      
    }
     
    return nuevaFrase  ;    
        
    }
}

    */
    
}
