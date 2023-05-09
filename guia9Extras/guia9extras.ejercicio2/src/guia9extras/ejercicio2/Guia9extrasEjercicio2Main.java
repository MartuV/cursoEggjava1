package guia9extras.ejercicio2;

import guia9extras.ejercicio2.entidades.Ahorcado;
import guia9extras.ejercicio2.servicios.AhorcadoService;

import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class Guia9extrasEjercicio2Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AhorcadoService as = new AhorcadoService();

        Ahorcado a1 = as.crearJuego();
        
        
        for (int i = 0; i < 150; i++) {
            System.out.println();
        }

        as.Juego(a1);

    }

}
