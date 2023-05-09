package guia9ejercicio5.servicios;

import guia9ejercicio5.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 * Crear una clase PersonaService, en el paquete servicio, con los siguientes
 * métodos:
 *
 *
 * deseada.
 *
 * @author MartuV
 */
public class PersonaService {

    private Scanner sc = new Scanner(System.in);

    /*a) Método crearPersona que pida al usuario Nombre y fecha de
    nacimiento de la persona a crear. Retornar el objeto Persona creado.
     */
    public Persona crearPersona() {

        System.out.println("ingresar nombre persona:");
        String nombre = sc.nextLine();

        System.out.println("ingresar fecha nacimiento: ");
        System.out.print("ingrese dia: ");
        int dia = sc.nextInt();
        System.out.print("ingrese mes: ");
        int mes = sc.nextInt();
        System.out.print("ingrese año: ");
        int anio = sc.nextInt();
        Date fechaNacimiento = new Date(anio - 1900, mes - 1, dia);

        return new Persona(nombre, fechaNacimiento);
    }

    /*b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.*/
    public int calcularEdad(Persona p) {

        Date fechaActual = new Date();

        int edad = fechaActual.getYear() - p.getFechaNacimiento().getYear();

        return edad;
    }

    /*c) Método menorQue recibe como parámetro una Persona y una edad.
        Retorna true si la persona es menor que la edad consultada o false
        en caso contrario.
     */
    public boolean menorQue(Persona p, int edadLimite) {

        return calcularEdad(p) < edadLimite;
    }

    //d) Método mostrarPersona que muestra la información de la persona  
    public void mostrarPersona(Persona p, int edadLimite) {

        System.out.println("nombre de la persona: " + p.getNombre());
        System.out.println("fecha nacimiento de la persona: " + p.getFechaNacimiento());
        System.out.println("edad: " + calcularEdad(p) + " años");
        System.out.println("la persona es menor que la edad limite: " + menorQue(p, edadLimite));
    }
}
