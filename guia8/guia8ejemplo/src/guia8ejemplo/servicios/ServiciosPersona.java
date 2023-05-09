package guia8ejemplo.servicios;

import guia8ejemplo.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class ServiciosPersona {
    
   private Scanner sc = new Scanner(System.in);
    
  /*  public Persona crearPersona(){
        
        Persona p = new Persona();
        
        System.out.println("ingresar nombre de la persona:");
        p.setNombre(sc.nextLine());
        
        System.out.println("ingresar apellido de la persona:");
        p.setApellido(sc.nextLine());
        
        return p;
    }*/
   
   /*
    Ambas formas son válidas, pero la segunda forma que propone es más eficiente en cuanto a uso de memoria.
   
    En la primera forma, se crea una instancia de Persona llamada p y luego se establecen los valores de los atributos 
    con los métodos set, para finalmente retornar p. Esto implica que se está creando una instancia de Persona en 
    memoria, para luego setear sus atributos, y luego se retorna esa instancia. Es decir, se está utilizando más memoria 
    de la necesaria.
   
    En la segunda forma, se crean variables locales nombre y apellido para almacenar los valores ingresados por
    el usuario, y luego se crea directamente una nueva instancia de Persona utilizando esos valores en el constructor,
    que es lo que se retorna. De esta forma, no es necesario crear una instancia de Persona antes de setear sus atributos, 
    lo que hace que sea más eficiente en términos de uso de memoria.
   
    Por lo tanto, es mejor utilizar la segunda forma propuesta si se quiere optimizar el uso de memoria.
   */
    
    public Persona crearPersona(){
      
        
        System.out.println("ingresar nombre de la persona:");
        String nombre=(sc.nextLine());
        
        System.out.println("ingresar apellido de la persona:");
        String apellido=(sc.nextLine());
        
        //Persona p= new Persona(nombre,apellido)
        
        return new Persona(nombre,apellido);
    }
    
    public void mostrarPersona(Persona p){
    
        System.out.println("nombre de la persona: "+p.getNombre());
        
        System.out.println("apellido de la persona: "+p.getApellido());
    
    }

    @Override
    public String toString() {
        return "ServiciosPersona{" + '}';
    }

   
    

}
 