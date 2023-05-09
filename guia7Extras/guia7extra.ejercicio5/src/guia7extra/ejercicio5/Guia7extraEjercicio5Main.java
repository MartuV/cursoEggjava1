package guia7extra.ejercicio5;

import guia7extra.ejercicio5.entidades.Empleado;
import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class Guia7extraEjercicio5Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese nombre del empleado: ");
        String nombre = sc.nextLine();
        
        System.out.println("ingrese edad del empleado: ");
        int edad = sc.nextInt();
        
        System.out.println("ingrese sueldo del empleado: ");
        double sueldo = sc.nextDouble();
        
        Empleado e1 = new Empleado(nombre,edad,sueldo);
        
        System.out.println("el aumento de sueldo del empleado "+ e1.getNombre()+" es de: "+ e1.calcularAumento()+" pesos");
                
                
    }

}
