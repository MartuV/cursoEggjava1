package guia8extra.ejercicio1.servicios;

import guia8extra.ejercicio1.entidades.Raices;

/**
 * Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo
 * varía el signo delante de -b
 *
 * @author MartuV
 */
public class RaicesServicio {

    /*a) Método getDiscriminante(): devuelve el valor del discriminante
    (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
     */
    public double getDiscriminante(Raices r) {

        //double discriminante = Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
        //return discriminante;
        //poner directamente
        return Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();
    }

    /*b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
    soluciones, para que esto ocurra, el discriminante debe ser mayor o
    igual que 0. ESTA MAL el enunciado 2 soluciones solo mayor a 0?????
    */
    
  /*public boolean  tieneRaices(){
        
         boolean solucion=false;
         
         
         if (getDiscriminante(r)>0) {
             
             solucion=true;
            
        }
        return solucion;
    
    }*/
    
    
        //puedo (discriminante > 0)simplificar: ya devuelve true si discriminante es mayor o igual a 0    
        public boolean tieneRaices(Raices r) {
        
       // double discriminante=getDiscriminante(r);
        
        return ( getDiscriminante(r) > 0);
    }
    

    /*c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
        única solución, para que esto ocurra, el discriminante debe ser igual
        que 0.
    */
    public boolean tieneRaiz(Raices r) {
        
        double discriminante=getDiscriminante(r);
        
        return (discriminante == 0);
    }
    
    /*d)Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime
    las 2 posibles soluciones
    (-b±√((b^2)-(4*a*c)))/(2*a)
    */
    
    public void obtenerRaices(Raices r){
        
        double x1;
        double x2;
        
        if (tieneRaices(r)==true) {
            
        x1= (-r.getB() + Math.sqrt(getDiscriminante(r))) /(2*r.getA());
        x2= (-r.getB() - Math.sqrt(getDiscriminante(r))) /(2*r.getA());  
        
            System.out.println("la solucion seria x1 = "+x1);
            System.out.println("la solucion seria x2 = "+x2);
        }
    
    }
    
    /*e) Método obtenerRaiz(): llama a tieneRaiz() y si
    devolvió́true imprime una única raíz. Es en el caso en que se tenga una única
    solución posible
    
    */
    public void obtenerRaiz(Raices r){
        
        double x;
       
        
        if (tieneRaiz(r)==true) {
            
        x= (-r.getB() + Math.sqrt(getDiscriminante(r))) /(2*r.getA());
        
        
            System.out.println("la solucion seria x = "+x);
            
        }
    
    }
    
     
    /* f) Método calcular(): esté método llamará tieneRaices() y
    a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene
    nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
    que devuelvan nuestros métodos y en caso de no existir solución, se mostrará
    un mensaje.
    
    */
    
    public void calcular(Raices r){
    
        if (tieneRaices(r)==true) {
            
            obtenerRaices(r);
            
        } else if (tieneRaiz(r)==true){
            
             obtenerRaiz(r);
        }else{
        
            System.out.println("la ecuación cuadrática no tiene soluciones reales.");
        
        }
    
    }
}
