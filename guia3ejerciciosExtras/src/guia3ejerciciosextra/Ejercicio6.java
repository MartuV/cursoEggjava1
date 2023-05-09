package guia3ejerciciosextra;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
 * 
 * @author MartuV
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        
        int n=0;
        double h;
        double suma=0;
        double sumaTotal=0;
        int ihBaja=0;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar la cantidad de personas en metros a evaluar: ");
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("ingresar altura de la persona numero "+(i+1));
            h = sc.nextDouble();
            
            sumaTotal=sumaTotal+h;
            
            if (h<1.6) {
                
                suma=suma+h;
                ihBaja++;
                
                
            }
        
        }
      
       
       //hay que importar la clase DecimalFormat y crear el objeto
       // Reducimos el número de decimales a 2 con la clase DecimalFormat con ("#.00") y mejor si le pongo (#.##)
       //redondea al decimal: menos o igual a 0,5 al inferior y mas de 0,5 al superior
       //convertimos a String
        DecimalFormat df = new DecimalFormat("#.00");
        
        String promedioTotal= df.format(sumaTotal/n);
        
        //String promediohBaja= df.format(suma/ihBaja);
        
        double promediohBaja= suma/ihBaja;
        
        System.out.println("el promedio general de estatura es: "+ promedioTotal);
        System.out.println("el promedio de las alturas menores a 1.60 m es: "+ promediohBaja);
        
        
        /*
        nextDouble() usa los puntos decimales y separadores de miles propios del idioma.

        En español el punto es separador de miles y la coma los decimales.

        Prueba usando la funcion useLocale() y pasale un Locale inglés, de la siguiente manera:

        entrada.useLocale(Locale.ENGLISH)
        
        */
        
        
    }

}
