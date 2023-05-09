package guia7extra.ejercicio1;

import guia7extra.ejercicio1.entidades.Cancion;

/**
 *
 * @author MartuV
 */
public class Guia7extraEjercicio1Main {

    public static void main(String[] args) {
        
      /*"c1" es una variable que está declarada como una instancia de la clase "Cancion".

        Cuando se crea un objeto de una clase en Java utilizando la palabra clave "new", se reserva 
        un espacio en la memoria para ese objeto y se inicializa con los valores predeterminados. 
        La variable "c1" se utiliza para hacer referencia a ese objeto y se puede utilizar para 
        acceder a los miembros y métodos de la clase "Cancion".

        "c1" es una variable de referencia que se utiliza para hacer referencia a un objeto de la clase "Cancion".
        
        los términos "variable de objeto" y "variable de referencia" se refieren a la misma cosa: una variable 
        que se utiliza para almacenar la dirección de memoria de un objeto y que se utiliza para acceder a ese objeto.
        
        */
              
        
        
        
        // cadenas vacias
        Cancion c1 =new Cancion();
      
        
        System.out.println("datos de la cancion: "+c1.toString());
        
        
        System.out.println("-------------------------------");
        
        //recibe como parametro
        Cancion c2 =new Cancion("EGG","Juan");
        
        c2.mostrarDatos();
        
        System.out.println("-------------------------------");
        
        System.out.println("datos de la cancion: "+c2.toString());
        
        //para ver la imprimir la referencia de memoria hasCode
         System.out.println("datos de la cancion: "+c2.hashCode());
    }

}
