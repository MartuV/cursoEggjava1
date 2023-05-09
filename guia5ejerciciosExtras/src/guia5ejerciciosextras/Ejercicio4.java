package guia5ejerciciosextras;

import java.util.Scanner;

/**
 *Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 * @author MartuV
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        
        int n=3;
        float primerTP[]= new float[n];
        float segundoTP[]= new float[n];
        float primerIntegrador[]= new float[n];
        float segundoIntegrador[]= new float [n];
        float promedioNotas[]= new float[n];
        
        int contAprob=0;
        int contDesap=0;
         
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("ingresar nota primer TP del alumno "+(i+1));
            primerTP[i] = sc.nextFloat();
            
            System.out.println("ingresar nota segundo TP del alumno "+(i+1));
            segundoTP[i] = sc.nextFloat();
            
            System.out.println("ingresar nota primer Integrador del alumno "+(i+1));
            primerIntegrador[i] = sc.nextFloat();
            
            System.out.println("ingresar nota segundo Integrador del alumno "+(i+1));
            segundoIntegrador[i] = sc.nextFloat();
            
            promedioNotas[i]=(float) (primerTP[i]*0.1+segundoTP[i]*0.15+primerIntegrador[i]*0.25+segundoIntegrador[i]*0.5);
            
            System.out.println("nota promedio: "+promedioNotas[i]);
            if (promedioNotas[i]>=7) {
                
                contAprob++;
                
            } else {
                
                contDesap++;
            }
        }
        
        System.out.println("la cantidad de alumnos aprobados es: "+contAprob);
        
        System.out.println("la cantidad de alumnos desaprobados es: "+contDesap);
        
    }

}
