package guia9ejercicio2.servicios;

import guia9ejercicio2.entidades.ParDeNumeros;

/**
 *Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
 * 
 * @author MartuV
 */
public class ParDeNumerosService {
    
    /*a) Método mostrarValores que muestra cuáles son los dos números
    guardados.*/
    
    public void mostrarValores(ParDeNumeros p){
        
        System.out.println("el numero1 es: "+p.getNum1());
        System.out.println("el numero2 es: "+p.getNum2());
    
    }
    
    /*b) Método devolverMayor para retornar cuál de los dos atributos tiene
    el mayor valor
    
    compareTo(entero, otroEntero) Compara dos objetos Integer numéricamente. Retorna 0 si son iguales, 
    entero negativo si el primer número es menor o entero positivo si el primer número es mayor.
    */
    
    public void devolverMayor(ParDeNumeros p){
    
            //double.compare acepta double o Double 
           int retorno= Double.compare(p.getNum1(), p.getNum2());
           
           switch (retorno) {
            case -1:
                 System.out.println("el numero2 es mayor");
                break;
            case 0:
                 System.out.println("son iguales");
                break;
            case 1:
                 System.out.println("el numero1 es mayor");
                break;    
        }
    
    }
    
    /*c) Método calcularPotencia para calcular la potencia del mayor valor de
    la clase elevado al menor número. Previamente se deben redondear
    ambos valores.
     */

    public void calcularPotencia(ParDeNumeros p){
        
        int potencia=0;
        
        //Math.round redondea segun los decimales al entero superior o al inferior
        double num1Red= Math.round(p.getNum1());
        System.out.println(num1Red);
        
        double num2Red= Math.round(p.getNum2());
        System.out.println(num2Red);
        
        int retorno= Double.compare(p.getNum1(), p.getNum2());
           
           switch (retorno) {
            case -1:
                
                potencia= (int) Math.pow(num2Red, num1Red);
                System.out.println("el mayor numero elevado al menor numero es igual a "+potencia);
                 
                break;
            case 0:
                 potencia= (int) Math.pow(num2Red, num1Red);
                System.out.println("los dos numeros son iguales la potencia es "+potencia);
                break;
            case 1:
                potencia= (int) Math.pow(num1Red, num2Red);
                System.out.println("el mayor numero elevado al menor numero es igual a "+potencia);
                break;    
        }
        
    }
    
    /*d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
    dos valores. Antes de calcular la raíz cuadrada se debe obtener el
    valor absoluto del número.
    */
     public void calcularRaiz(ParDeNumeros p){
         
        double raizCuadrada=0;
        
        double num1Abs=Math.abs(p.getNum1());
        double num2Abs=Math.abs(p.getNum2());
        
        int retorno= Double.compare(p.getNum1(), p.getNum2());
           
           switch (retorno) {
            case -1:
                raizCuadrada= Math.sqrt(num1Abs);
                System.out.println("la raiz cuadrada del menor de los numeros es "+raizCuadrada);
               
                break;
            case 0:
                raizCuadrada= Math.sqrt(num1Abs);;
                System.out.println("los numeros son iguales, la raiz cuadrada es "+raizCuadrada);
               
                break;
            case 1:
                 raizCuadrada=  Math.sqrt(num2Abs);
                System.out.println("la raiz cuadrada del menor de los numeros es "+raizCuadrada);
               
                break;    
        }
        
    }
     
    
    
}
