package guia7ejercicio4.entidades;

import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class Rectangulo {
    
    //atributos
    
    private int base;
    
    private int altura;
    
    //constructores:
    
    //vacio
    public Rectangulo() {
        
        
    }

    //con parametros 
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        
        
    }
    
    //setter

    public void setBase(int base) {
        this.base = base;
    }

    //dentro de set validaciones
    public void setAltura(int altura) {
        Scanner sc = new Scanner(System.in);
        
        while (base==altura) {
            if (base== altura) {
                System.out.println("la altura debe ser distinta a la base, ingrese nuevamente la altura");
                altura=sc.nextInt();
                
            }
        }
        
         this.altura = altura;
        
        
        
    }
    
    //getter

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    
    public void crearRectangulo(){
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("ingresar la base del rectangulo (numero entero):");
        //this. porque le estoy asignando el valor al atributo, aunque tb funciona sin el this????
        //this. se usa cuando hay ambiguedad de nombres(o sea parametros o variables locales se llaman igual al atributo),
        //aca no hay, base directamente es el atibuto
        //entonces si saco el this funciona t
        this.base=sc.nextInt();
        
        System.out.println("ingresar altura del rectangulo (numero entero): ");
        this.altura=sc.nextInt();
    
    } 
    
      public void crearRectanguloConParametros(int base, int altura){
        
        Scanner sc = new Scanner(System.in);
        //this. porque tengo ambiguedad de nombres
        this.base=base;
        this.altura=altura;
    
    } 
    
    public int areaRectangulo(){
    
        int area=base*altura;
        
        return area;
    }
    
   
    public int perimetroRectangulo(){
    
        int perimetro=(base+altura)*2;
        
        return perimetro;
    }
    
    public void dibujarRectangulo() {

        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < base; j++) {

                if ( i==0 || i == altura - 1|| j == 0 || j == base - 1) {
                    System.out.print(" * ");

                } else {

                    System.out.print("   ");
                }

            }

            System.out.println("");
        }

    }

}
