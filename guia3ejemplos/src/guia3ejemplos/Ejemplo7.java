package guia3ejemplos;

import java.util.Scanner;

/**
 *. Definir una variable tipoMotor y permitir que el usuario ingrese un valor
entre 1 y 4. El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es
una bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es
una bomba de gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es
una bomba de hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es
una bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje
“No existe un valor válido para tipo de bomba”
 * 
 * @author MartuV
 */
public class Ejemplo7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingresar el tipo de motor.El menu es del 1 al 4");
        
        int tipoMotor = sc.nextInt();
        
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
                
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
                
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
                
              case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;    
                
            default:
                System.out.println("el valor no esta dentro del menu");
        }
            
            
       
        
        
       
        
        
    }

}
