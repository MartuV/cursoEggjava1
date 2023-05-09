package guia3ejerciciosextra;

import java.util.Scanner;

/**
 *Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
 * 
 * @author MartuV
 */
public class Ejercicio7DoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingresar la cantidad de numeros a evaluar");
        int n = sc.nextInt();

        int cont =1;
        int suma = 0;
        
       /* int maximo=0;
        //aca tengo que poner un tope, por eso despues hice el if de num > 1000 si 
        int minimo=1000;

        do {
            System.out.println("ingresar numero " + cont);
            int num = sc.nextInt();
            
            // si ingresa todos numeros mayores a mil no funcionaria  el minimo , porque todos serian mayores a 1000
            if (num>1000) {
              System.out.println("el numero ingresado no puede ser mayor a 1000 "); 
              continue;
            }
            
            suma = suma + num;
            cont++;
            maximo=Math.max(num, maximo);
            
            minimo=Math.min(num, minimo);

        } while (cont <= n);*/
       
        int maximo =0;
             
        int minimo =0; 
       
        do {
            System.out.println("ingresar numero " + cont);
            int num = sc.nextInt();
            
            //para no tener que poner un tope en minimo
            if (cont==1){
                
               maximo=num;
             
               minimo=num; 
               
            }
            
            suma = suma + num;
            cont++;
            maximo=Math.max(num, maximo);
            
            minimo=Math.min(num, minimo);
           
           

        } while (cont <= n);
        
        System.out.println("el valor maximo es: "+maximo);
        System.out.println("el valor minimo es: "+minimo);
        System.out.println("el valor promedio es: "+(suma/n));

    }
}