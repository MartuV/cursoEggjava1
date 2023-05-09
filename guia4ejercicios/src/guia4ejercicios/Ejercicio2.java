package guia4ejercicios;

import java.util.Scanner;

/**
 *Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”
 * 
 * @author MartuV
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingresar la cantidad de personas a evaluar");
        int n = sc.nextInt();
        
        String respuesta;
        int cont=0;
        
        do {
            
            cont ++;
            
            boolean retorno= esMayor(n,cont);
            
            //== es una condicion , si pongo un solo = le estoy asignando nuevamente el valor true o false
            if (retorno==true) {
                
                System.out.println("la persona es mayor");
                
            } else {
                
                System.out.println("la persona es menor");
            }
            
            //para que no pregunte si se quieren seguir ingresando datos en la ultima vuelta
            if (n==cont) {
               //sale del bucle
               break;
               
            }else{
               System.out.println("quiere seguir ingresando personas? responda si/no :");
               respuesta = sc.next(); 
               
            }
            
         //cont solo menor y no igual ,porque lo inicialice en 0
        } while (! respuesta.equalsIgnoreCase("no") && cont<n);
        
    }   
    
        public static boolean esMayor(int n, int cont){
    
        boolean mayor=true;
        
        //tengo que volver a crear el objeto sc
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese el nombre de la persona numero "+cont);
        String nombre = sc.next();
        
        System.out.println("ingrese la edad de la persona numero "+cont);
        int edad = sc.nextInt();
        
        //se pueden imprimir los datos que ingreso, no es que los devuelve como un String
        System.out.println("*****datos ingresados persona "+cont+"*****");
        System.out.println("nombre: "+nombre);
        System.out.println("edad: "+edad);
        
        
        if (edad<18) {
            mayor=false;
            
        }
    
        return mayor;
    
    }

        
        
        /*Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas: ");
        int N = leer.nextInt();
        for (int i=0; i<N; i++) {
            if (datos(i)){
                System.out.print("La persona es MAYOR de edad");
            }
            else{
                System.out.print("La persona es MENOR de edad");
            }
            System.out.println("");
            System.out.print("Desea mostrar la siguiente persona?: ");
            String resp = leer.next();
            if (resp.equalsIgnoreCase("No"))
                break;
        }
        
    }
    public static boolean datos(int i){
       Scanner leer = new Scanner(System.in);
       System.out.print("Ingrese el nombre de la persona "+(i+1)+": ");
       String nombre = leer.next();
       System.out.print("Ingrese la edad de la persona "+(i+1)+": ");
       int edad = leer.nextInt();
        System.out.println("---------DATOS:---------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
       if (edad>=18){
           return true;
       }
       else{
           return false;
       }*/
        
        
    }
    

        



