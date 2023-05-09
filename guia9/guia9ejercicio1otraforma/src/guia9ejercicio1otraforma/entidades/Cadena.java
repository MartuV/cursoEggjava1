package guia9ejercicio1otraforma.entidades;

/**
 *
 * @author MartuV
 */
public class Cadena {

    public String frase;
    public int longitud;

    public Cadena() {
        
    }
    
    
    public Cadena(String frase) {
        this.frase = frase;
       // this.longitud = frase.length();       
        setLongitud(frase.length());    
    
    } 

    

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    
}