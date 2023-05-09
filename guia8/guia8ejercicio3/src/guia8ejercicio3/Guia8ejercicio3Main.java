package guia8ejercicio3;

import guia8ejercicio3.entidades.Persona;
import guia8ejercicio3.servicios.ServiciosPersona;

/**
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación,
 * llamaremos todos los métodos para cada objeto, deberá comprobar si la persona
 * está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
 * indicar para cada objeto si la persona es mayor de edad.
 *
 *
 * Por último, guardaremos los resultados de los métodos calcularIMC y
 * esMayorDeEdad en distintas variables(arrays), para después calcular un
 * porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en
 * su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de
 * cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos
 * métodos adicionales
 *
 * @author MartuV
 */
public class Guia8ejercicio3Main {

    public static void main(String[] args) {

        int imc[] = new int[4];
        boolean mayor[] = new boolean[4];
        
        //creo un vector para poder almacenar las personas que voy ingresando
        Persona persona []= new Persona[4];

        ServiciosPersona sp = new ServiciosPersona();

        for (int i = 0; i < 4; i++) {

            System.out.println("ingresar datos de la persona " + (i + 1));

            persona[i] = sp.crearPersona();

            System.out.println(persona[i]);

//            if (sp.esMayorDeEdad(persona[i]) == true) {
//
//                System.out.println("la persona es mayor");
//
//            } else {
//
//                System.out.println("la persona es menor");
//            }
            //se puede simplificar:
            //expresión ternaria es una estructura condicional abreviada que permite escribir una instrucción de forma
            //más concisa. La sintaxis de la expresión ternaria es la siguiente:
            //condición ? resultado si verdadero : resultado si falso;
            System.out.println(sp.esMayorDeEdad(persona[i]) ? "la persona es mayor" : "la persona es menor");

            //System.out.println("la funcion devuelve " + sp.calcularIMC(persona[i]));
            
            //lleno los vectores
            mayor[i] = sp.esMayorDeEdad(persona[i]);
            imc[i] = sp.calcularIMC(persona[i]);

            System.out.println("------------------------------");
            System.out.println("");
        }

        calcularPorcentIMC(imc);
        System.out.println("------------------------------------");
        calcularPorcentMayores(mayor);
    }

    public static void calcularPorcentIMC(int imc[]) {

        //defino tres contadores para peso normal, bajo y sobrepeso
        int pN = 0;
        int pB = 0;
        int pA = 0;
        //defino n
        int n = 4;
        
        //para probar imprimo el vector
        System.out.print("vector imc[]=");
        for (int i = 0; i < 4; i++) {
            System.out.print("[" + imc[i] + "]  ");

            switch (imc[i]) {
                case 0:
                    pN++;
                    break;
                case 1:
                    pA++;
                    break;
                case -1:
                    pB++;
                    break;

            }

        }

        System.out.println("");
        //salgo del for para ver los porcentajes

        float porcentPN = pN * 100 / n;
        System.out.println("el porcentaje de personas con peso Normal es: " + porcentPN);

        float porcentPA = pA * 100 / n;
        System.out.println("el porcentaje de personas con sobrepeso es: " + porcentPA);

        float porcentPB = pB * 100 / n;
        System.out.println("el porcentaje de perosnas con peso Bajo es: " + porcentPB);
    }

    public static void calcularPorcentMayores(boolean mayor[]) {

        //defino contadores para menores y mayores y n
        int iMay = 0;
        int iMen = 0;
        int n = 4;
        
        //para probar imprimo el vector
       System.out.print("vector mayor[]=");
        for (int i = 0; i < 4; i++) {
            System.out.print("[" + mayor[i] + "]  ");
            
            if (mayor[i]==true) {
                
                iMay ++;
                
            }else{
                iMen ++;
            
            }
        }
        
        System.out.println("");
        //salgo del bucle para ver porcentajes
        float porcentMayores = iMay * 100 / n;
        System.out.println("el porcentaje de personas mayores es: " + porcentMayores);

        float porcentMenores = iMen * 100 / n;
        System.out.println("el porcentaje de personas menores es: " + porcentMenores);
    }
}
