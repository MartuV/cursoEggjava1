package guia7ejercicio3;

import guia7ejercicio3.entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class Guia7Ejercicio3Main {

    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);

        Operacion op = new Operacion();

        System.out.println("ingresar numero 1:");
        int num1 = sc.nextInt();
        op.setNum1(num1);

        System.out.println("ingresar numero 2:");
        int num2 = sc.nextInt();
        op.setNum2(num2);

        System.out.println("suma = " + op.sumar());

        System.out.println("resta = " + op.restar());

        System.out.println("multiplicacion = " + op.multiplicacion());

        System.out.println("division = " + op.division());*/

        
        Scanner sc = new Scanner(System.in);

        Operacion op = new Operacion();

        System.out.println("ingresar numero 1:");
        int num1 = sc.nextInt();
       

        System.out.println("ingresar numero 2:");
        int num2 = sc.nextInt();
        
        
        op.crearOperacion(num1, num2);

        System.out.println("suma = " + op.sumar());

        System.out.println("resta = " + op.restar());

        System.out.println("multiplicacion = " + op.multiplicacion());

        System.out.println("division = " + op.division());
    }

}
