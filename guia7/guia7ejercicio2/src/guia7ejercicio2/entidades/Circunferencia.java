package guia7ejercicio2.entidades;

import java.util.Scanner;

/**
 *
 * @author MartuV
 */
public class Circunferencia {
    
    //atributo
    private float radio;
    
    //constructor sin parametros es el que me permite crear el objeto circunferencia en main

    public Circunferencia() {
        
    }
    
    //constructor con parametros
    
    public Circunferencia(float radio) {
        this.radio = radio;
    }
    
    //set

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    //get

    public float getRadio() {
        return radio;
    }
    
    //seria como un setter???
    public void crearCircunferencia(){
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresar radio de la circunferencia:");
        this.radio=sc.nextInt();
        
        /*float radio1 = sc.nextFloat();
        this.radio=radio1;*/

    }
    
    
    public float areaCircunferencia(){
        
        float area= (float) ((Math.PI)*(Math.pow(radio, 2)));
        
        return area;
  
    }
    
    public float perimetroCircunferencia (){
    
        float perimetro= (float) (Math.PI * radio*2);
        
        return perimetro;
    }
}
