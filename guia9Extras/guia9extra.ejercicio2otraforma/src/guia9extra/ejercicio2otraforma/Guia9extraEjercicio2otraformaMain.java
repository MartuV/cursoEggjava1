package guia9extra.ejercicio2otraforma;

import guia9extra.ejercicio2otraforma.entidades.Ahorcado;
import guia9extra.ejercicio2otraforma.servicios.AhorcadoService;

/**
 *
 * @author MartuV
 */
public class Guia9extraEjercicio2otraformaMain {

    public static void main(String[] args) {
        
        AhorcadoService aS = new AhorcadoService();
        Ahorcado juego = aS.crearJuego();
        //aS.longitud(juego);
        //aS.buscar(juego);
        //aS.encontradas(juego);
        //aS.intentos(juego);
        aS.juego(juego);
        
        
    }

        
}


