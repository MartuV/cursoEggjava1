package guia5ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class Ejercicio6 {
    
    public static void main(String[] args) {

        char sopa[][] = new char[20][20];
        
        String palabra = "";
        //contador para la cantidad de palabras ingresadas
        short p = 0;
       
        //creo un vector para ir almacenando los numeros de fila y ver que no se repitan
        //no lo hago en el procedimiento ubicacion porque se me reiniciaba
        int filas[]=new int[20];
        // lo inicializo en 50 ,no en 0 porque es un numero de fila
        for (int i = 0; i < 20; i++) {
            filas[i]=50;
        }
        
        Scanner sc = new Scanner(System.in);
        

        inicializarSopa(sopa);

        do {
            System.out.print("ingrese palabra " + (p + 1) + " :");
           palabra = sc.nextLine();

            if ((palabra.length() <= 2 || palabra.length() >= 6)) {
                System.out.println("la palabra debe contener minimo: 3 caracteres hasta 5:");

            } else {

                ubicacion(sopa, palabra,filas);

                //contador lo puse dentro del if porque quiero que me cuente solo las palabras correctas
                p++;
            }

            //si la palabra no esta entre 3 y cinco caracteres pide de nuevo 
            //y contador menor a 5 ,no va igual o menor a 5 porque lo inicialice en 0   
        } while ((palabra.length() <= 2 || palabra.length() >= 6) || p < 5);

        rellenarVacios(sopa);
        imprimir(sopa);

    }

    public static void inicializarSopa(char sopa[][]) {

        for (int i = 0; i < 20; i++) {

            for (int j = 0; j < 20; j++) {
                
                
                sopa[i][j] = '0';

            }
            System.out.println("");
        }

    }

    public static void ubicacion(char sopa[][], String palabra,int filas[]) {
       
        int numFila;

        numFila = (int) (Math.random() * 20 + 0);
        //para probar
        System.out.println("fila: " + numFila);
        
       
        //para ver si se repiten los numeros de fila
        boolean validar = false;

        while (!validar) {

            if (filas[numFila] == 50) {

                filas[numFila] = numFila;

                break;

            //tengo que ver que el numero de fila no sea el mismo que ya esta en el vecor
            } else {
                //para probar
                System.out.println("se repitio fila");

                int aux = filas[numFila];

                if (aux == numFila) {

                    numFila = (int) (Math.random() * 20 + 0);

                } else {
                    filas[numFila] = numFila;
                    validar = true;

                }

                //para probar
                System.out.println("fila nueva: " + numFila);
            }

        }

        //para probar el vector
        for (int i = 0; i < 20; i++) {
            System.out.println(filas[i]);

        }

        // para obtener el numero donde comienza a escribir la columna
        int numColumna = (int) (Math.random() * 15 + 0);

        //para probar
        System.out.println("columna: " + numColumna);

        for (int i = numFila; i <= numFila; i++) {
            short contLetras = 0;
            for (int j = numColumna; j < numColumna + palabra.length(); j++) {

                sopa[i][j] = palabra.charAt(contLetras);
                contLetras++;

            }

            System.out.println("");
        }

    }

     public static void rellenarVacios (char sopa[][]){
     
         int num;
        
        for (int i = 0; i < 20; i++) {

            for (int j = 0; j < 20; j++) {

                if (sopa[i][j] == '0') {

                    /*num = (int) (Math.random() * 10);

                    String numString = String.valueOf(num);

                    char numChar = numString.charAt(0);

                    sopa[i][j] = numChar;*/

                    sopa[i][j]= (char) (Math.random()*10+'0'); //no fuciona me da el caracter ? en un recuadro
                }                                             //agregue +'0' y funciono

            }
            System.out.println("");
        }

    }
    public static void imprimir(char sopa[][]) {

        for (int i = 0; i < 20; i++) {

            for (int j = 0; j < 20; j++) {

                System.out.print(sopa[i][j] + " ");

            }
            System.out.println("");
        }

    }



}
