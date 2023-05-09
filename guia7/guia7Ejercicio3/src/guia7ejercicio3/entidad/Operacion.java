package guia7ejercicio3.entidad;
/**
 *Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.
 * @author MartuV
 */
public class Operacion {
    
    private int num1;
    
    private int num2;
    

    public Operacion() {
        
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
    
    // seria como un setter????
    public void crearOperacion( int num1 , int num2){
          this.num1 = num1;
          this.num2 = num2;
    
    }
    
    public int sumar (){
        
        int suma=num1+num2;
        
        return suma;
    }

    public int restar (){
        
        int resta=num1-num2;
        
        return resta;
    }
    
    public int multiplicacion (){
        
        int multipli =num1*num2;
        
        if (multipli==0) {
            
            System.out.println("no se puede realizar multiplicacion por 0");
            
        } 
        
       
        
        return multipli;
    }
    
    public float division (){
        
        float divi;
        
        if (num2==0) {
            
            System.out.println("no se puede realizar division por 0");
            divi=0;
            
            
        } else{
           divi=num1/num2;
            
        }
        
        return divi;
    }
}
