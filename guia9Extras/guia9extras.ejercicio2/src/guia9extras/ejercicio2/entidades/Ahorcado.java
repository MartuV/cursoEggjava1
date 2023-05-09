package guia9extras.ejercicio2.entidades;

import java.util.Arrays;

/**
 *Crear una clase Ahorcado (como el juego), la cual
deberá contener como atributos, un vector con la palabra a buscar, la
cantidad de letras encontradas y la cantidad jugadas máximas que
puede realizar el usuario
 * @author MartuV
 */
public class Ahorcado {
    
    private String [] palabra;
    private int intentos;
    private int cantLetrasAcertadas;
    //lo agregue para poder ver como se va formando la palabra
    private String []letrasAcertadas;
    //lo agregue para poder ver las letras que se intentan
    private String []letrasIntentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int intentos, String[] letrasAcertadas,String[] letrasIntentos) {
        this.palabra = palabra;
        this.intentos = intentos;
        this.letrasAcertadas = letrasAcertadas;
        this.letrasIntentos = letrasIntentos;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void setCantLetrasAcertadas(int cantLetrasAcertadas) {
        this.cantLetrasAcertadas = cantLetrasAcertadas;
    }

    public void setLetrasAcertadas(String[] letrasAcertadas) {
        this.letrasAcertadas = letrasAcertadas;
    }

    public void setLetrasIntentos(String[] letrasIntentos) {
        this.letrasIntentos = letrasIntentos;
        
    }
    
    //para poder asignar una letra a una posicion
     public void setLetrasAcertadasPosicion(int i,String letrasAcertadas) {
        this.letrasAcertadas[i] = letrasAcertadas;
    }

    public void setLetrasIntentosPosicion(int i, String  letrasIntentos) {
        this.letrasIntentos[i] = letrasIntentos;
        
    }
    

    public String[] getPalabra() {
        return palabra;
    }

    public int getIntentos() {
        return intentos;
    }

    public int getCantLetrasAcertadas() {
        return cantLetrasAcertadas;
    }

    public String[] getLetrasAcertadas() {
        return letrasAcertadas;
    }

    public String[] getLetrasIntentos() {
        return letrasIntentos;
    }

    

   
    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + Arrays.toString(palabra) +"letrasAcertadas=" + Arrays.toString(letrasAcertadas) +"letrasIntentos=" + Arrays.toString(letrasIntentos)+ ", intentos=" + intentos + ", cantLetrasAcertadas=" + cantLetrasAcertadas + '}';
    }
    
    

}
