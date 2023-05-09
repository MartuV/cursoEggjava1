package guia9ejercicio1.entidades;
/**
 *Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase 
 * @author MartuV
 */
public class Cadena {
    

    
    private String frase;
    private int longitud;

    public Cadena() {
        
        
    }

    public Cadena(String frase) {
 
        this.frase = frase;
        //automaticamente settea la long de la frase
        this.longitud=frase.length();
        
       
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        
        return longitud;
    }
    
    
    

}
