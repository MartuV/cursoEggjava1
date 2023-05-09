package guia8ejemplo;

import guia8ejemplo.entidades.Persona;
import guia8ejemplo.servicios.ServiciosPersona;

/**
 *
 * @author MartuV
 */
public class Guia8ejemploMain {

    public static void main(String[] args) {
        
        /*
        crea un objeto de la clase ServiciosPersona y lo asigna a la variable de referencia sp1. 
        Esto significa que sp1 ahora puede acceder a todos los métodos públicos y variables de la 
        clase ServiciosPersona.

        En este caso, la variable sp1 se utiliza para llamar a los métodos crearPersona() y mostrarPersona() 
        de la clase ServiciosPersona. Estos métodos permiten crear y mostrar objetos de la clase Persona, 
        y como la clase ServiciosPersona tiene acceso a los atributos de la clase Persona, 
        también es posible modificarlos a través de los métodos definidos en ServiciosPersona.
        */
        
        ServiciosPersona sp1= new ServiciosPersona();
        
        /*
        crea un objeto de la clase Persona sin usar el constructor new Persona(nombre,apellido), sino mediante el 
        uso del método crearPersona() de la clase ServiciosPersona.
        
        ventaja: se puede encapsular la lógica de creación de objetos en una clase separada. Esto significa que si
        se necesita cambiar la forma en que se crea un objeto Persona, sólo se tiene que cambiar el método crearPersona()
        en la clase ServiciosPersona, en lugar de tener que buscar y cambiar todas las instancias del constructor 
        new Persona(nombre, apellido) en todo el código.
        */
        
        Persona p1= sp1.crearPersona();
        
        /*
        se está pasando el objeto Persona referenciado por p1 como parámetro a mostrarPersona(), y es este objeto el 
        que se muestra en la pantalla utilizando los métodos get de la clase Persona. Por lo tanto, sí es necesario 
        pasar p1 como parámetro a mostrarPersona() para poder ver los datos de la persona creada en crearPersona().
        */
        
        sp1.mostrarPersona(p1);
        
        System.out.println("--------------------------------");
        System.out.println(p1);
        System.out.println(sp1);
        
    }

}
