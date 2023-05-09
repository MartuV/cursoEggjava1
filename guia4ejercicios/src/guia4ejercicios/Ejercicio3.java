package guia4ejercicios;

import java.util.Scanner;

/**
 *Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 * 
 * @author MartuV
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        String moneda;
        double euro;
        
        Scanner leer = new Scanner(System.in);
        
        do {

            System.out.println("Ingrese cantidad de EUROS: ");
            euro = leer.nextDouble();

            System.out.println("A que moneda desea convertir? dolares-libras-yenes: ");
            moneda = leer.next();

            if (! moneda.equals("dolares") && ! moneda.equals("libras") && ! moneda.equals("yenes")){
                System.out.println("ingresar una moneda valida para realizar la conversion");
            }
            
        } while (!moneda.equals("dolares") && !moneda.equals("libras") && !moneda.equals("yenes"));

            convertir(euro,moneda);
    }
    
    
    public static void convertir(double euro , String moneda) {
        moneda = moneda.toLowerCase();
        boolean salir = false;

        switch (moneda) {
            case "dolares":
                double dolar = 1.28611 * euro;
                System.out.println(String.format("%.2f euros equivalen a %.2f dolares", euro, dolar));

            case "libras":
                double libra = 0.86 * euro;
                //System.out.println(""+1.28611*euro);
                System.out.println(String.format("%.2f euros equivalen a %.2f libras", euro, libra));
                break;
            case "yenes":
                double yen = 129.852 * euro;
                System.out.println(String.format("%.2f euros equivalen a %.2f yenes", euro, yen));
                break;

            /* con el buble en el main no es necesario, siempre se va a ingresar una momeda valida para la conversion
                default:
                System.out.println("no es una opcion valida");*/

        }

            
        
         
        }
    }

        
        
    