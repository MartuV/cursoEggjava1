package guia8ejercicio2.entidades;
/**
 *clase Cafetera en el paquete
Entidades con los atributos capacidadMáxima (la cantidad máxima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vacío y con
parámetros así como setters y getters.
 * @author MartuV
 */
public class Cafetera {
    
    private int capacidadMax;
    private int cantActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }
    
    

    public Cafetera(int capacidadMax, int cantActual) {
        this.capacidadMax = capacidadMax;
        this.cantActual = cantActual;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMex) {
        this.capacidadMax = capacidadMex;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMax=" + capacidadMax + ", cantActual=" + cantActual + '}';
    }
    
    

}
