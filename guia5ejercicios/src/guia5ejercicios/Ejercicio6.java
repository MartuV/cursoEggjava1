package guia5ejercicios;

import java.util.Scanner;

/**
 *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
* 
 * @author MartuV
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        int num, sumaPrincipal, suma;
        boolean magica = true;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                do {
                    System.out.print("ingresar el numero que corresponde a la posicion ("+i+","+j+"):");
                    num = sc.nextInt(); 
                    if (num<=0 || num>=10) {
                        
                        System.out.println("el numero ingresado debe ser entre 1 y 9");
                        
                    }
                    
                } while (num<=0 || num>=10);
                
                matriz[i][j] = num;
                //matriz[i][j] = (int) (Math.random() * 10);
                    
            }

        }

        //imprimo la matriz para probar
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                //para que escriba en la misma linea .next
                System.out.print(matriz[i][j] + "   ");

            }
            System.out.println("");
        }

        sumaPrincipal = 0;
        suma = 0;

        //para ver la diagonal principal, j=i 
        for (int i = 0; i < 3; i++) {

            sumaPrincipal = sumaPrincipal + matriz[i][i];

        }

        //para ver diagonal secundaria (0,2) + (1,1) +(2,0) / [i][n-1-i]
        for (int i = 0; i < 3; i++) {

            suma = suma + matriz[i][2 - i];

        }

        System.out.println("la suma de la diagonal principal es: " + sumaPrincipal);
        System.out.println("la suma de la diagonal secundaria es: " + suma);

        if (sumaPrincipal != suma) {

            System.out.println(" NO es suna matriz magica");

        } else {

            //evaluo las filas
            for (int i = 0; i < 3; i++) {

                suma = 0;

                for (int j = 0; j < 3; j++) {

                    suma = suma + matriz[i][j];

                }

                System.out.println("la suma de la fila " + i + " es igual a: " + suma);
                if (suma != sumaPrincipal) {

                    magica = false;
                    break;

                }

            }

            //evaluo las columnas, pero si magica es false ya se que no es magica
            if (magica == false) {

                 System.out.println(" NO es suna matriz magica");

            } else {

                for (int j = 0; j < 3; j++) {

                    suma = 0;

                    for (int i = 0; i < 3; i++) {

                        suma = suma + matriz[i][j];

                    }

                    System.out.println("la suma de la columna " + j + " es igual a: " + suma);
                    if (suma != sumaPrincipal) {
                        System.out.println(" NO es suna matriz magica");
                        break;

                    }else {
                        System.out.println("es suna matriz magica");
                }

                }

                

            }

        }

       
    }
}
