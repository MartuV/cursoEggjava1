package guia7ejemplo;

import guia7ejemplo.entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class Guia7ejemploMain {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Persona p1 = new Persona();
        
        //p1.setNombre("juan");

        System.out.println("ingrese nombre de la persona:");
        
        String nombre = sc.nextLine();
        
        p1.setNombre(nombre);
        
       // p1.setNombre(sc.nextLine());

        System.out.println("ingrese apellido de la persona:");
        p1.setApellido(sc.nextLine());

        System.out.println("ingrese la cantidad de energia gastada en el paseo:");
        int restarEnergia=sc.nextInt();
        
        
        
        System.out.println("nombre: "+p1.getNombre());
        
        System.out.println("apellido: "+p1.getApellido());

        System.out.println(p1.toString());

        System.out.println("cant de energia restante de la persona: "+p1.paseo(restarEnergia));
        
    }

}
