package guia7extra.ejercicio3.entidades;

import java.util.Scanner;

/**
 *Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado
 * @author MartuV
 */
public class Juego {
    
   private int numSuerte;
   private int num;
   private int intentos;
   

    public Juego() {
        //inicializo el objeto con los valores del numero a adivinar y la cant de intentos
        numSuerte=(int) (Math.random() *100);
        intentos=6;
    }

   
   
    public void iniciarJuego(){
        
        int iIntentos = 0;

        Scanner sc = new Scanner(System.in);

        // para que se repita mientras no se acierte el numero y no se supere el numero de intentos permitidos
        do {
            
            //para validar y pedir que el numero sea entre 0 y 99
            do {
                
                 System.out.print("ingresar numero (intento " + (iIntentos+1) + "): ");
                 num = sc.nextInt();
                 
                 if (num<0 || num>=100) {
                    
                     System.out.println("Ingrese nuevamente el numero, debe ser entre 0 y 99");
                }
                
            } while (num<0 || num>=100);
                       
            iIntentos++;
            
            //este if para cuando es el ultimo intento , sino me aparecia que el numero era mas bajo o mas alto
            if (iIntentos == intentos) {

                //para ver si acerto en el ultimo intento
                if (numSuerte == num) {
                    System.out.println("Ud. ha Ganado!!!!! en el Ultimo intento");
                    System.out.println("El numero de la suerte era: " + numSuerte);
                } else {

                    System.out.println("Se terminaron los intentos!!!!Ud.ha Perdioo");
                    System.out.println("El numero de la suerte era: " + numSuerte);
                }

            } else {
                //para ver si acerto en el resto de los intentos
                if (numSuerte == num) {
                    System.out.println("Ud. ha Ganado!!!!! en el intento numero: " + iIntentos);
                    System.out.println("El numero de la suerte era: " + numSuerte);
                } else if (num < numSuerte) {

                    System.out.println("El numero de la suerte es mas alto");

                } else {
                    System.out.println("El numero de la suerte es mas bajo");

                }

            }

        } while (num != numSuerte && iIntentos < intentos);

        System.out.println("");

    }
   
    //si sale del bucle porque acerto num es igual a numSuerte
    //si sale del bucle por se terminaron los intentos num no es igual a numSuerte
    public boolean acertar (){
        
        boolean acierto=true;
        
        if (num != numSuerte) {
            
            acierto=false;
        }
    
    
        return acierto;
    }
    
   
   

       
       
    //la hice para ir probando
    @Override
    public String toString() {
        return "Juego{" + "numSuerte=" + numSuerte + ", num=" + num + ", intentos=" + intentos + '}';
    }
   

}
