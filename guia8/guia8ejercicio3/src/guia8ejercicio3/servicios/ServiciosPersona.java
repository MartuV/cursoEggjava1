package guia8ejercicio3.servicios;

import guia8ejercicio3.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class ServiciosPersona {

    /*Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje
     */
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");;

    public Persona crearPersona() {

        System.out.print("ingresar nombre persona: ");
        String nombre = sc.nextLine();
        
        System.out.print("ingresar edad persona: ");
        int edad = sc.nextInt();

        char sexo = ' ';

        do {

            System.out.print("ingresar sexo persona (como H,M u O): ");
            sexo = sc.next().charAt(0);

        } while (sexo != 'h' && sexo != 'H' && sexo != 'm' && sexo != 'M' && sexo != 'o' && sexo != 'O');

        System.out.print("ingresar peso persona: ");
        float peso = sc.nextFloat();

        System.out.print("ingresar altura persona: ");
        float altura = sc.nextFloat();
        
        //sin esto con la segunda persona no puedo ingresar el nombre
        sc.nextLine(); // Consumir la nueva línea pendiente en el búfer
        
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    /*
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La
    función devuelve un booleano. 
    */
    
    /*public boolean esMayorDeEdad(Persona persona) {

        boolean mayor = true;

        if (persona.getEdad() < 18) {

            mayor = false;

        }

        return mayor;
    }*/
    
    
   // lo que recibe es una persona ,seria persona[i], no es que le tengo que pasar el vector
    public boolean esMayorDeEdad(Persona persona) {
    //se puede simplificar
    //Esto se debe a que el método devuelve true si la edad de la persona es mayor o igual a 18, y false 
    //si es menor. Por lo tanto, no es necesario declarar y asignar una variable booleana mayor para 
    //luego devolverla, sino que se puede devolver directamente el resultado de la evaluación de la condición.    
        return persona.getEdad() >= 18;
        
    }
    
   /* Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
     */
    public int calcularIMC(Persona persona) {

        int calcular ;
        double imc = persona.getPeso() / (Math.pow(persona.getAltura(), 2));

        if (imc < 20) {

            calcular = -1;
            System.out.println("la persona esta por debajo de su peso ideal");

        }else if(imc >= 20 && imc <= 25){
            calcular = 0;
            System.out.println("la persona esta en su peso ideal");

        }else{
            calcular = 1;
            System.out.println("la persona esta por encima de su peso ideal");
            }

        return calcular;
    }
}
