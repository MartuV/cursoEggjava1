package guia5ejercicios;

import java.util.Scanner;

/**
 *Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
* 
 * @author MartuV
 */
public class Ejercicio3 {

    public static void main(String[] args) {

       /*//determino cuantas posiciones tiene el vector
        int n = 30;

        int numeros[] = new int[n];

        //lleno el vector
        for (int i = 0; i < n; i++) {
            
            //al multiplicar por 100.000 los numeros van de 0 a 99.999
            numeros[i] = (int) (Math.random() * 100000);

            System.out.println("[" + numeros[i] + "]");

        }

        //contadores para contar cuantos numeros hay de un digito, dos ....hasta 5
        int u = 0;
        int d = 0;
        int t = 0;
        int ct = 0;
        int cc = 0;

        //recorro el vector y evaluo cuantos digitos tiene cada numero
        for (int i = 0; i < n; i++) {

            //contador para saber cuantas veces se trunca el numero
            //se tiene que reiniciar en cada vuelta
            int j = 0;

            //cuento cuantas veces se trunca el numero
            // int se queda con la parte entera, o sea truca el numero
            //al no estar usando un aux el vector  va a quedar en 0
            while (numeros[i]>0) {
                
                 numeros[i]=numeros[i]/10;
                 
                 j++;
                 
            }
            
            //cuento los numeros que tienen 1,2...hasta 5 digitos
            switch (j) {
                case 1:
                    u++;
                    break;
                case 2:
                    d++;
                    break;
                case 3:
                    t++;
                    break;
                case 4:
                    ct++;
                    break;
                case 5:
                    cc++;
                    break;
                //no es necesario tengo hasta 5 digitos
                //default:
            }

        }

        System.out.println("los numeros que tienen 1 digito son: " + u);
        System.out.println("los numeros que tienen 2 digito son: " + d);
        System.out.println("los numeros que tienen 3 digito son: " + t);
        System.out.println("los numeros que tienen 4 digito son: " + ct);
        System.out.println("los numeros que tienen 5 digito son: " + cc);
        
         for (int i = 0; i < n; i++) {
            
            //al multiplicar por 100.000 los numeros van de 0 a 99.999
            //numeros[i] = (int) (Math.random() * 100000);

            System.out.println("[" + numeros[i] + "]");

        }*/
       
       
        int n, aux, j;

        System.out.println("Dame tu N!!!!");

        n = new Scanner(System.in).nextInt();

        int[] vector = new int[n];
        int[] numdig = new int[5];

        for (int i = 0; i < n; i++) {
           
            vector[i] = (int) (Math.random() * 10);

            System.out.println(vector[i]);

            j = 0;

            aux = vector[i];
            
            //para que cuente el 0 como 1 digito
            if (aux == 0) {
                j = 1;

            } else {

                while (aux > 0) {

                    j++;
                    aux = aux / 10;

                }
            }

            // voy almacenando la cantidad de numeros de 1 hasta cinco digitos
            //en la posicion 0 del vector numdig tengo los numeros de 1 digito y asi sucesivamente
            //le tengo que ir sumando 1
            numdig[j - 1] = numdig[j - 1] + 1;

        }

        for (j = 0; j < 5; j++) {

            System.out.println("la cantidad de numeros de " + (j + 1) + " digito es: " + numdig[j]);

        }
        
        /*for (int i = 0; i < n; i++) {
          
            System.out.println(vector[i]);
        }*/
    }

}

