package guia9extra.ejercicio2otraforma.servicios;

import guia9extra.ejercicio2otraforma.entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class AhorcadoService {

    private Scanner leer = new Scanner(System.in);
    char letraIngresada;

    public Ahorcado crearJuego() {
        Ahorcado juego = new Ahorcado();
        System.out.println("Ingrese la palabra");
        String palabra = leer.next();
        juego.setPalabraBuscar(palabra.toCharArray());
        System.out.println("Ingresa la cantidad de jugadas máximas");
        juego.setCantidadJugadasMaximas(leer.nextInt());
        //System.out.println(Arrays.toString(juego.getPalabraBuscar()));        
        System.out.println(juego.getPalabraBuscar().length);
        System.out.println("Cantidad de jugadas máximas: " + juego.getCantidadJugadasMaximas());
        for (char elemento : juego.getPalabraBuscar()) {
            System.out.print(elemento);
        }
        System.out.println("");
        return juego;
    }

    public void longitud(Ahorcado juego) {
        int longitudVector = juego.getPalabraBuscar().length;
        System.out.println("La longitud de la palabra que se debe buscar es: " + longitudVector);
    }

    public void buscar(Ahorcado juego) {
        System.out.println("Ingrese una letra");
        letraIngresada = leer.next().charAt(0);
        int contador = 0;
        for (int i = 0; i < juego.getPalabraBuscar().length; i++) {
            if (letraIngresada == juego.getPalabraBuscar()[i]) {
                contador++;
            } 
        }
        if (contador == 0) {
            System.out.println("La letra no se encuentra en la palabra buscada");
        } else {
            System.out.println("La letra se encuentra en la palabra buscada " + contador);

        }
    }

    public boolean encontradas(Ahorcado juego) {
        int contador = 0;
        for (int i = 0; i < juego.getPalabraBuscar().length; i++) {
            if (letraIngresada == juego.getPalabraBuscar()[i]) {
                contador++;
            } else {                 
            //System.out.println("La letra no se encuentra en la palabra buscada"); 
            }
        }
        juego.setCantidadLetrasEncontradas(contador + juego.getCantidadLetrasEncontradas());
        System.out.println("Cantidad de letras encontradas " + juego.getCantidadLetrasEncontradas());
        System.out.println("Cantidad de letras restantes " + (juego.getPalabraBuscar().length - juego.getCantidadLetrasEncontradas()));
        return contador > 0;
    }

    public void intentos(Ahorcado juego) {
        if (encontradas(juego) == false) {
            juego.setCantidadJugadasMaximas(juego.getCantidadJugadasMaximas() - 1);
            System.out.println("La cantidad de intentos restantes es: " + juego.getCantidadJugadasMaximas());
        } else {
            System.out.println("La cantidad de intentos restantes es: " + juego.getCantidadJugadasMaximas());
        }

    }

    public void juego(Ahorcado juego) {
        
       while (juego.getCantidadJugadasMaximas()> 0 &&juego.getCantidadLetrasEncontradas() < juego.getPalabraBuscar().length) {
            longitud(juego);
            buscar(juego);
            //encontradas(juego);
            intentos(juego);
        } 
        
        
        if (juego.getCantidadLetrasEncontradas() == juego.getPalabraBuscar().length) {
            System.out.println("Acertaste");
        } else {
            System.out.println("Perdió");
        }

    }

}
