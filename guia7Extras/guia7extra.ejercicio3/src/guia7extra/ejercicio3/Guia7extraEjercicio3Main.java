package guia7extra.ejercicio3;

import guia7extra.ejercicio3.entidades.Juego;
import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class Guia7extraEjercicio3Main {

    public static void main(String[] args) {
        
        char menu;
        char jugador;
        int iGanarJug1 = 0;
        int iGanarJug2 = 0;
        int iJug1=0;
        int iJug2=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("----Adivinar Numero Entero-----");
        System.out.println("--------Entre 0 y 99-----------");
        System.out.println("-----Dispone de 6 Intentos-----");
        
        do {
            
            System.out.println("-------------Menu--------------");
            System.out.println("1. Turno");
            System.out.println("2. Salir");
            menu = sc.next().charAt(0);
            System.out.println("");

            switch (menu) {
                case '1':

                    System.out.println("***Elegir Jugador***");
                    System.out.println("1. Jugador 1");
                    System.out.println("2. Jugador 2");

                    jugador = sc.next().charAt(0);

                    System.out.println("");

                    switch (jugador) {
                        case '1':
                            //inicializo obj juego (en el constructor tiene numeros de intentos posibles, y el numero que tengo que adivinar)
                            // o sea esta inicializado con esos valores
                            Juego j1 = new Juego();
                           
                            System.out.println("***Jugador 1***");
                            j1.iniciarJuego();

                           /* boolean ganarJuego1 = j1.acertar();
                            

                            if (ganarJuego1 == true) {
                                iGanarJug1++;
                                //System.out.println(iGanarJug1);
                            }*/
                            
                            // Utilizar un operador ternario para contar el número de victorias
                            iGanarJug1 += (j1.acertar() ? 1 : 0);

                            iJug1++;
                            
                            break;

                        case '2':
                            Juego j2 = new Juego();
                            System.out.println("***Jugador 2***");
                            j2.iniciarJuego();
                            boolean ganarJuego2 = j2.acertar();

                            if (ganarJuego2 == true) {
                                iGanarJug2++;
                                
                            }
                            
                            iJug2++;

                            break;

                        default:
                            System.out.println("***No es una opcion valida****");

                            System.out.println("");
                    }

                    break;
                case '2':
                    System.out.println("-----Ud. ha salido del juego--------");
                    break;

                default:
                    System.out.println("*********No es una opcion valida*********");
                    System.out.println("***Elija nuevamente la opcion del Menu***");
                    System.out.println("");
            }

        } while (menu != '2');
        
        
        System.out.println("------Resultados del Juego----------");
        System.out.println("********Partidas Jugadas:***********");
        System.out.println("Jugador 1: "+iJug1);
        System.out.println("Jugador 2: "+iJug2);
        System.out.println("*******Partidas Ganadas:************");
        System.out.println("Jugador 1: "+iGanarJug1);
        System.out.println("Jugador 2: "+iGanarJug2);
    }

}
