package guia5ejercicios;
/**
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
 * 
 * @author MartuV
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        
        int matriz [] [] = new int [4] [4];
        
        // lleno la matriz
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                //numeros del 0 al 9
                matriz [i] [j]= (int) (Math.random()*10);
            }
        }
        
        //imprimo la matriz
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                //para que escriba en la misma linea .next
                System.out.print(matriz [i] [j]+ "   ");
                
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
                matrizTransp [j] [i]=matriz [i] [j] ;
            }
        }   
        
            //imprimo la matrizTransp
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                //para que escriba en la misma linea .next
                System.out.print(matrizTransp [i] [j]+ "   ");
                
            }
            System.out.println("");
        
        }
        
    }

}
