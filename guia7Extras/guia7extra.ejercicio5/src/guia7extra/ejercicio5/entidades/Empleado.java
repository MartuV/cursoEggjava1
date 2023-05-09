package guia7extra.ejercicio5.entidades;
/**
 *Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.

 * @author MartuV
 */
public class Empleado {
     
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
     public String getNombre() {
        return nombre;
    }
    
    
    public double calcularAumento(){
        
        double aumento=0;
        
        if (edad > 30){
            
            aumento= 0.1*salario;
        
        }else{
        
           aumento= 0.05*salario;
        }
    
        return aumento;
    }

   

}
