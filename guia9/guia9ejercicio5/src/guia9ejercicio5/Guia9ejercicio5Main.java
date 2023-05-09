package guia9ejercicio5;

import guia9ejercicio5.entidades.Persona;
import guia9ejercicio5.servicios.PersonaService;
import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class Guia9ejercicio5Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PersonaService ps = new PersonaService();

        Persona p1 = ps.crearPersona();

        //System.out.println(p1);

        System.out.println("ingresar edad limite:");
        int edadLimite = sc.nextInt();

        ps.mostrarPersona(p1, edadLimite);

    }

}
