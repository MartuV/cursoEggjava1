package guia4ejercicios;

import java.util.Scanner;

/**
 *Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 * 
 * 
 * @author MartuV
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingresar el primer numero: ");
        double num1 = sc.nextInt();
        
        System.out.println("ingresar el segundo numero: ");
        double num2 = sc.nextInt();
        
        char opcion=' ';
                
        do {
            System.out.println("ingrese una opcion:");
            System.out.println("1. sumar");
            System.out.println("2. restar");
            System.out.println("3. multiplicar");
            System.out.println("4. dividir");
            System.out.println("5. salir");
            
            opcion = sc.next().charAt(0);
            
            switch (opcion) {
            case '1':
                
                double retorno = suma(num1,num2);
                
                System.out.println("El resultado de la suma es "+retorno);
               
                break;
            case '2':
                
                double retorno1 = resta(num1,num2);
                
                System.out.println("El resultado de la resta es "+retorno1);
               
                break;    
            case '3':
                
                double retorno2 = multiplicacion(num1,num2);
                
                System.out.println("El resultado de la multiplicacion es "+retorno2);
               
                break;    
            case '4':
                
                double retorno3 = division(num1,num2);
                
                System.out.println("El resultado de la division es "+retorno3);
               
                
                break;    
            case '5':
                
                System.out.println("ud. ha salido del sistema.");
                break;    
                
            default:
                System.out.println("no es una opcion valida");
        }
            
        } while (opcion!='5');
        
       
    }
    
    public static double suma (double num1, double num2){
        
        double resultado = num1+num2;
        
        return resultado;
    
    } 
    
    public static double resta (double num1, double num2){
        
        double resultado = num1-num2;
        
        return resultado;
    
    } 
    
    public static double multiplicacion (double num1, double num2){
        
        double resultado = num1*num2;
        
        return resultado;
    
    } 
    
    public static double division (double num1, double num2){
        
        double resultado = num1/num2;
        
        return resultado;
    
    } 
}
