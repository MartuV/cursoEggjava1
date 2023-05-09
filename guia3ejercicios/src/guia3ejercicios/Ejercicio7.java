package guia3ejercicios;

import java.util.Scanner;

/**
 * Realizar un programa que simule el funcionamiento de un dispositivo
    RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
    cadenas deben llegar con un formato fijo: tienen que ser de un máximo
    de 5 caracteres de largo, el primer carácter tiene que ser X y el último
    tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas,
    la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
    FDE), y toda secuencia distinta de FDE, que no respete el formato se
    considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de
    lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
    deberá investigar cómo se utilizan las siguientes funciones de Java
    Substring(), Length(), equals().
 * 
 * @author MartuV
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        
        //defini afuera porque daba error, pero por ????no se
        String secuencia;
       //siempre afuera del bucle
        Scanner sc = new Scanner(System.in);
       
        int contCorrectos=0;
        //-1 para que no cuente "&&&&&" el problema es que me aparecia mensaje de incorecta por eso agregue if else
        //asi que lo puse en 0 de nuevo
        int contIncorrectos=0;
        
        do {
            
            System.out.println("ingresar secuencia RS232");
            secuencia = sc.nextLine();
            
            
           
            if (secuencia.length()==5 && secuencia.substring(0,1).equals("X") && secuencia.substring(secuencia.length()-1,secuencia.length()).equals("O")) {
                System.out.println("la secuencia es correcta");
                contCorrectos++;
                
            } else if (secuencia.equals("&&&&&")) {
                System.out.println("ud. ha salido del sistema");
                
            }else {
                System.out.println("la secuencia es incorrecta");
                contIncorrectos++;
                
            }
  
            
            
            
        } while (!secuencia.equals("&&&&&"));
        
        
        System.out.println("la cantidad de secuencias correctas es "+contCorrectos);
        
        System.out.println("la cantidad de secuencias incorrectas es "+contIncorrectos);
    }

}
