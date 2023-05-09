package guia5ejerciciosextras;

import java.util.Scanner;

/**
 * 
 * public static int devolverVector(){
int[] vector = new int[5];
return vector;
 *
 * @author MartuV
 */
public class Ejercicio7FuncionRetorno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar hasta hasta que numero se quiere ver la serie de Fibonacci: ");

        int n = sc.nextInt();

        int retorno[] = new int[n];

        retorno = serieFibonacci(n);

        for (int i = 0; i < n; i++) {

            System.out.println("[" + retorno[i] + "]");

        }

    }

    public static int [] serieFibonacci(int n) {

        int serie[] = new int[n];

        int f = 1;
        int a = 1;
        int i;

        for (i = 0; i < n; i++) {

            serie[i] = f;

            int b = f + a;
            f = a;
            a = b;

        }

        return serie;

    }

}
