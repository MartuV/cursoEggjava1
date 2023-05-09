package guia9extras.ejercicio2.servicios;

import guia9extras.ejercicio2.entidades.Ahorcado;


import java.util.Arrays;
import java.util.Random;

import java.util.Scanner;

/**
 * juego Ahorcado: . Definir los siguientes métodos en AhorcadoService:
 *
 * @author MartuV
 */
public class AhorcadoService {

    private Scanner sc = new Scanner(System.in);

    private String letraIngresada;

    /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de
    jugadas máxima. Con la palabra del usuario, pone la longitud de la
    palabra, como la longitud del vector. Después ingresa la palabra en el
    vector, letra por letra, quedando cada letra de la palabra en un índice
    del vector. Y también, guarda la cantidad de jugadas máximas y el
    valor que ingresó el usuario.*/
    public Ahorcado crearJuego() {

        System.out.println("Ingrese la palabra a adivinar:");
        String palabraIngresada = sc.nextLine();


        
        
//        //para que no se vea la palabra ingresada la elige de una lista
//        String[] listaPalabras = {"sol","perro","computadora", "programacion", "teclado", "mouse", "java","gato"};
//
//        Random random = new Random();
//        int indicePalabra = random.nextInt(listaPalabras.length);
//        String palabraIngresada = listaPalabras[indicePalabra];

        // String[] palabra = new String[palabraIngresada.length()];

        //for (int i = 0; i < palabraIngresada.length(); i++) {
        //
        //palabra[i] = palabraIngresada.substring(i, (i + 1));
        //           
        // }
        
        //utilizar metodo .split de la clase String, dividir la cadena en una matriz de String donde 
        //cada elemento es un carácter de la cadena original.
        //o sea hace lo mismo que el for de arriba
        String[] palabra = palabraIngresada.split("");

        String[] letrasAcertadas = new String[palabraIngresada.length()];
        Arrays.fill(letrasAcertadas,"");

        System.out.println("ingrese cantidad de intentos maximos para adivinar la palabra: ");
        int intentos = sc.nextInt();

        String[] letrasIntentos = new String[intentos];

        sc.nextLine();
        
        return new Ahorcado(palabra, intentos, letrasAcertadas, letrasIntentos);

    }

    /*Método longitud(): muestra la longitud de la palabra que se debe
    encontrar. Nota: buscar como se usa el vector.length.
    
     */
    public void mostrarLongitud(Ahorcado a) {

        System.out.println("la longitud de la palabra es " + a.getPalabra().length);
        System.out.println("la cantidad de intentos es " + a.getIntentos());
    }

    /*Método buscar(letra): este método recibe una letra dada por el
    usuario y busca si la letra ingresada es parte de la palabra o no.
    También informará si la letra estaba o no.
     */
    public void buscarLetra(Ahorcado a) {
        //contador para saber si hay letras y cuantas veces se repiten
        int contador = 0;

        //para validar que la letra ingreasda no fue buscada en otro intento
        do {

            System.out.println("ingresar letra ");
            letraIngresada = sc.nextLine();

            contador = 0;

            for (int i = 0; i < a.getLetrasAcertadas().length; i++) {

                if (letraIngresada.equals(a.getLetrasAcertadas()[i])) {

                    contador++;

                }

            }

            if (contador >= 1) {

                System.out.println("la letra ya se busco y acerto, no cuenta como intento");

            } else {

                contador = 0;

                //valido para saber si la letra se busco
                for (int i = 0; i < a.getLetrasIntentos().length; i++) {

                    if (letraIngresada.equals(a.getLetrasIntentos()[i])) {

                        contador++;

                    }

                }

                if (contador >= 1) {
                    System.out.println("la letra ya se busco, no se cuenta como intento");

                }

            }

            //asigno la letra al vector de letras que voy buscando
            a.setLetrasIntentosPosicion(a.getIntentos() - 1, letraIngresada);
           

        } while (contador > 0);


        

        contador = 0;
        
        //para saber en que posicion esta la letraIngresada
        for (int i = 0; i < a.getPalabra().length; i++) {

            if (letraIngresada.equals(a.getPalabra()[i])) {
                System.out.println("la letra esta en la posicion " + (i + 1));
                contador++;
                //la ubico en el lugar que va
                a.setLetrasAcertadasPosicion(i, letraIngresada);
                
            }

        }

        switch (contador) {
            case 0:

                System.out.println("la letra no se encuentra");

                break;
            case 1:
                System.out.println("la letra se repite: " + contador + " vez");
                System.out.println("no se cuenta como intento");
                break;
            default:
                System.out.println("la letra se repite: " + contador + " veces");
                System.out.println("no se cuenta como intento");
                break;

        }
        //para saber cuantas letras llevo acertadas
        a.setCantLetrasAcertadas(a.getCantLetrasAcertadas() + contador);

    }

    /*Método encontradas(letra): que reciba una letra ingresada por el
    usuario y muestre cuantas letras han sido encontradas y cuántas le
    faltan. Este método además deberá devolver true si la letra estaba y
    false si la letra no estaba, ya que, cada vez que se busque una letra
    que no esté, se le restará uno a sus oportunidades.*/
    public boolean encontrarLetras(Ahorcado a) {

        int contador = 0;
        for (int i = 0; i < a.getPalabra().length; i++) {

            if (letraIngresada.equals(a.getPalabra()[i])) {
                contador++;

            }

        }

        return contador > 0;
    }
    
   

    /*Método intentos(): para mostrar cuántas oportunidades le queda al
    jugador.*/
    public int intentosRestantes(Ahorcado a) {

        int intento = 0;

        if (encontrarLetras(a) == false) {
            intento = 1;
        }

        return a.getIntentos() - intento;

    }
    
    public void dibujarAhorcado(Ahorcado a) {
    switch (a.getIntentos()) {
        case 6:
            System.out.println(" ________");
            System.out.println("|        |");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("|_________");
            break;
        case 5:
            System.out.println(" ________");
            System.out.println("|        |");
            System.out.println("|        O");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("|_________");
            break;
        case 4:
            System.out.println(" ________");
            System.out.println("|        |");
            System.out.println("|        O");
            System.out.println("|        |");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("|_________");
            break;
        case 3:
            System.out.println(" ________");
            System.out.println("|        |");
            System.out.println("|        O");
            System.out.println("|       /|");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("|_________");
            break;
        case 2:
            System.out.println(" ________");
            System.out.println("|        |");
            System.out.println("|        O");
            System.out.println("|       /|\\");
            System.out.println("|         ");
            System.out.println("|         ");
            System.out.println("|_________");
            break;
        case 1:
            System.out.println(" ________");
            System.out.println("|        |");
            System.out.println("|        O");
            System.out.println("|       /|\\");
            System.out.println("|       / ");
            System.out.println("|         ");
            System.out.println("|_________");
            break;
        case 0:
            System.out.println(" ________");
            System.out.println("|        |");
            System.out.println("|        O");
            System.out.println("|       /|\\");
            System.out.println("|       / \\");
            System.out.println("|         ");
            System.out.println("|_________");
            break;
    }
}
   

    /* Método juego(): el método juego se encargará de llamar todos los
    métodos previamente mencionados e informará cuando el usuario
    descubra toda la palabra o se quede sin intentos. Este método se
    llamará en el main.*/
    public void Juego(Ahorcado a) {

        int contador = 1;
        //System.out.println(a);//para probar como esta mi objeto juego

        System.out.println("-------------------------------");

        mostrarLongitud(a);
      
       System.out.println("-------------------------------");

        while (a.getIntentos() > 0 && a.getCantLetrasAcertadas() < a.getPalabra().length) {
            
            System.out.println("intento numero " + contador);

            buscarLetra(a);
            encontrarLetras(a);

            //para que me aparezca el numero de intento que va en el sout de arriba
            if (encontrarLetras(a)==false){
                contador++;
            } else{
             
            }
           
            System.out.println("cantidad de intentos restantes " + intentosRestantes(a));
            a.setIntentos(intentosRestantes(a));
            dibujarAhorcado(a);
            //para mostrar como se va formando la palabra
            System.out.println(Arrays.toString(a.getLetrasAcertadas()));

            //System.out.println(a);//para probar como esta mi objeto juego
            System.out.println("-------------------------------");

        }
        
         
        if (a.getCantLetrasAcertadas()==a.getPalabra().length) {
            
            System.out.println("Ud. ha Ganado!!!!!");
            System.out.println("la palabra era: "+Arrays.toString(a.getPalabra()));
            
        }else{
        
            System.out.println("Ud. ha perdido!!!!!!");
            //System.out.println("la palabra era: "+Arrays.toString(a.getPalabra()));
        }

    }
}
