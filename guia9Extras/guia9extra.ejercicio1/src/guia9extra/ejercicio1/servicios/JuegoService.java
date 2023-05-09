package guia9extra.ejercicio1.servicios;

import guia9extra.ejercicio1.entidades.Juego;
import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class JuegoService {

    private Scanner sc = new Scanner(System.in);

    public void iniciarJuego(String mesAdivinar) {

        Juego j = new Juego();

        //System.out.println(j);//para probar que este bien el objeto

        while (!j.getMesSecreto().equals(mesAdivinar)) {

            System.out.println("NO Acerto, Intente nuevamente");
            mesAdivinar = sc.nextLine();
        }

        //si mes ingresa el usuario es igual al mesSecreto sale del bucle y le dice que acerto
        //si en la primera oportunidad ya acierta no estra al bucle nunca
        System.out.println("Ud. ha acertado!!!!!");
        System.out.println("el mesSecreto era "+j.getMesSecreto());

    }

}
