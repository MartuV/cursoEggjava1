package guia3ejerciciosextra;

import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class Ejercicio7While {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresar la cantidad de numeros a evaluar");
        int n = sc.nextInt();

        int cont = 1;
        int suma = 0;
        int maximo=0;
        int minimo=1000;

         while (cont <= n){
            System.out.println("ingresar numero " + cont);
            int num = sc.nextInt();
            // si ingresa todos numeros mayores a mil no funcionaria  el minimo , porque todos serian mayores a 1000,
            //el minimo me quedaria en 1000
            if (num>1000) {
              System.out.println("el numero ingresado no puede ser mayor a 1000 "); 
              //no se ejecuta las lineas de abajo y sigo adentro del bucle
              continue;
            }
            
            suma = suma + num;
            cont++;
            maximo=Math.max(num, maximo);
            
            minimo=Math.min(num, minimo);

        } 

        System.out.println("el valor maximo es: "+maximo);
        System.out.println("el valor minimo es: "+minimo);
        System.out.println("el valor promedio es: "+(suma/n));
        
    }

}
