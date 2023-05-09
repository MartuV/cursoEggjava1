package guia8ejercicio2.servicios;

import guia8ejercicio2.entidades.Cafetera;
import java.util.Scanner;


/**
 * Crear clase CafeteraServicio en el paquete Servicios con los siguiente: a)
 * Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
 * máxima. b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
 * método recibe el tamaño de la taza y simula la acción de servir la taza con
 * la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar
 * la taza, se sirve lo que quede. El método le informará al usuario si se llenó
 * o no la taza, y de no haberse llenado en cuanto quedó la taza. c) Método
 * vaciarCafetera(): pone la cantidad de café actual en cero. d) Método
 * agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
 * recibe y se añade a la cafetera la cantidad de café indicada.
 *
 * @author MartuV
 */
public class CafeteraServicio {

    private Scanner sc = new Scanner(System.in);
    
    
    //si quisiera que el usuario ingrese capacidad max y cantidad actual
     public Cafetera crearCafetera(){
        
        System.out.println("ingresar la capacidad maxima");
        int capacidadMax = sc.nextInt();
        System.out.println("ingresar cantidad actual:");
        int cantActual = sc.nextInt();
        
        return new Cafetera(capacidadMax,cantActual);
        
    }
    
    /*public void llenarCafetera() {
        //aca estoy creando otra cafetera por eso no funcionaba
       Cafetera caf= new Cafetera(1500);
       caf.setCantActual(caf.getCapacidadMax());
       System.out.println("cafetera.llenarCafeter():"+caf);
        
    }  */
    
   public void llenarCafetera(Cafetera caf) {
        //si creo una cafetera aca no es la misma que creo en el main
        //entonces se la paso por parametro
        //Cafetera caf= new Cafetera(1500);
       caf.setCantActual(caf.getCapacidadMax());
       System.out.println("cafetera.llenarCafeter():"+caf);
        
    }   
   
   //podria hacer que en el metodo llenar cafetera se cree cafetera
   //entoces no la creo en el main con el constructor de cafetra y no la paso por parametro
    public Cafetera llenarCafetera() {
        Cafetera caf = new Cafetera(2000);
        caf.setCantActual(caf.getCapacidadMax());
       
        
        return caf;
    }  

    public void llenartaza(int taza, Cafetera caf) {
        
        System.out.println("en cafetera.llenarTaza :La cafetera tiene " + caf.getCantActual());
        
        if (taza > caf.getCantActual()) {
            System.out.println("No alcanzo para llenar la taza, la taza se lleno " + caf.getCantActual() + " mL.");
            caf.setCantActual(0);
           
        } else {
            System.out.println("La taza se lleno correctamente");
            caf.setCantActual(caf.getCantActual()-taza);
        }
        System.out.println("despues de llenar taza La cafetera tiene " + caf.getCantActual());
    }
    
    
    public void vaciarCafetera(Cafetera caf) {
       caf.setCantActual(0);
       System.out.println("cafetera.vaciarCafetera():"+caf);
        
    } 
    
    public void agregarCafe(int cafe,Cafetera caf) {
       
       caf.setCantActual(caf.getCantActual()+cafe);
       System.out.println("cafetera.agregarCafe():"+caf);
        
    }   
    
 
    
   
    
   
    
    
  
    
}