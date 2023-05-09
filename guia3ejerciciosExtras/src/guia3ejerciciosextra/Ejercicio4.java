package guia3ejerciciosextra;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.

 * 
 * @author MartuV
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        
        /*Scanner sc = new Scanner(System.in);
        System.out.println("ingresar numero para mostrar");
        int num = sc.nextInt();*/
        
      /*//1=I 5=V 10=X
        Scanner leer = new Scanner(System.in);
        byte num,i;
        String rom="";
        System.out.print("Ingrese un número entre 1 y 10: ");
        num=leer.nextByte();
        if (num>8) {
            if (num==10) {
                rom="X";
            } else { rom="IX";}
        } else if (num>3){
            if (num==4){
                rom="IV";
            } else {
                rom="V";
                for (i=0;i<num%5;i++) {
                   rom=rom.concat("I");
                }
            }
        } else {
            for (i=0;i<num;i++) {
                   rom=rom.concat("I");
                }
        }
        System.out.println("Romano: " + rom);*/

      
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.print("Introduce un número entre 1 y 3999: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 3999);

        int i, miles, centenas, decenas, unidades;
        String romano = "";

        //obtenemos cada cifra del número
        miles = numero / 1000;
        centenas = numero / 100 % 10;
        decenas = numero / 10 % 10;
        unidades = numero % 10;

        //millar
        for (i = 1; i <= miles; i++) {
            romano = romano + "M";
        }

        //centenas
        if (centenas == 9) {
            romano = romano + "CM";
        } else if (centenas >= 5) {
            romano = romano + "D";
            for (i = 6; i <= centenas; i++) {
                romano = romano + "C";
            }
        } else if (centenas == 4) {
            romano = romano + "CD";
        } else {
            for (i = 1; i <= centenas; i++) {
                romano = romano + "C";
            }
        }

        //decenas
        if (decenas == 9) {
            romano = romano + "XC";
        } else if (decenas >= 5) {
            romano = romano + "L";
            for (i = 6; i <= decenas; i++) {
                romano = romano + "X";
            }
        } else if (decenas == 4) {
            romano = romano + "XL";
        } else {
            for (i = 1; i <= decenas; i++) {
                romano = romano + "X";
            }
        }

        //unidades
        if (unidades == 9) {
            romano = romano + "IX";
        } else if (unidades >= 5) {
            romano = romano + "V";
            for (i = 6; i <= unidades; i++) {
                romano = romano + "I";
            }
        } else if (unidades == 4) {
            romano = romano + "IV";
        } else {
            for (i = 1; i <= unidades; i++) {
                romano = romano + "I";
            }
        }

        System.out.println(numero + " en numeros romanos -> " + romano);

    }

}
