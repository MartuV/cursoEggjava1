package guia5ejercicios;
/**
 *Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
* 
* 
*Para obtener un número entero entre dos valores DESDE , HASTA, ambos incluidos, debemos usar la fórmula:

(int)(Math.random()*(HASTA-DESDE+1)+DESDE); 

* 
 * @author MartuV
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        
         int matriz [] [] = new int [4] [4];
        
        // lleno la matriz
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                //numeros del -5 al 5
                //multiplico por 11 porque es la cant de numeros que hay en el rango
                //despues le sumo el minimo
                matriz [i] [j]= (int) (Math.random()*11+(-5));
            }
        }
        
        //imprimo la matriz
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                if (matriz [i] [j]>=0) {
                    System.out.print(" "+matriz [i] [j]+"  ");
                } else {
                    System.out.print(matriz [i] [j]+"  ");
                }
                
            }
            System.out.println("");
        }
        
        System.out.println("matriz transpuesta:");
        
        /*
        //imprimo directamente la matriz
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                //para que escriba en la misma linea .next
                //combio el orden j por i
                System.out.print(matriz [j] [i]+ "   ");
                
            }
            System.out.println("");
        }
        */
        
        int matrizTransp [] [] = new int [4] [4];
        
        // lleno la matrizTransp
        for (int j = 0; j < 4; j++) {
            
            for (int i= 0; i < 4; i++) {
                //numeros del 0 al 9
                matrizTransp [j] [i]=matriz [i] [j] *(-1) ;
            }
        }   
        
            //imprimo la matrizTransp
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                if (matrizTransp [i] [j]>=0) {
                    System.out.print(" "+matrizTransp [i] [j]+"  ");
                } else {
                    System.out.print(matrizTransp [i] [j]+"  ");
                }
                
               
                
                
            }
            System.out.println("");
        }  
    }

}
