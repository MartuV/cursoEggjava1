package guia5ejerciciosextras;

import java.util.Scanner;

/**
 * Realizar un programa que complete un vector con los N primeros
números de la sucesión de Fibonacci. Recordar que la sucesión de
Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a
él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente
fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una
función que reciba como parámetro el valor de “n” y que calcule la serie
hasta llegar a ese valor
 * 
 *definir a,b,f,i Como Entero
	definir serie ,fcaracter,fcaracterComa Como Caracter
	
	f=1
	a=1
	serie=""
	Para i<-1 Hasta n Hacer
		fcaracter=ConvertirATexto(f)
		fcaracterComa= Concatenar(fcaracter," , ")
		serie=Concatenar(serie,fcaracterComa)
		b=f+a
		f=a
		a=b
		
		
	FinPara
 * 
 * @author MartuV
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar hasta hasta que numero se quiere ver la serie de Fibonacci: ");

        int n = sc.nextInt();

        serieFibonacci(n);

    }

    public static void serieFibonacci(int n) {
        int serie[] = new int[n];

        int f = 1;
        int a = 1;
        int i;

        //lleno el vector
        for (i = 0; i < n; i++) {

            serie[i] = f;

            int b = f + a;
            f = a;
            a = b;

            //podria mostrar el vector aca tb
            //System.out.println(serie[i]);
        }

        //recorro el vector
        for (i = 0; i < n; i++) {

            System.out.println("[" + serie[i] + "]");

        }

    }

}
