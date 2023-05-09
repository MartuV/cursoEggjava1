package guia9extra.ejercicio2otraforma.entidades;
/**
 *
 * @author MartuV
 */
public class Ahorcado {
    
    char[] palabraBuscar;
    int cantidadLetrasEncontradas;
    int cantidadJugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabraBuscar, int cantidadLetrasEncontradas, int cantidadJugadasMaximas) {
        this.palabraBuscar = palabraBuscar;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }

    public char[] getPalabraBuscar() {
        return palabraBuscar;
    }

    public void setPalabraBuscar(char[] palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getCantidadJugadasMaximas() {
        return cantidadJugadasMaximas;
    }

    public void setCantidadJugadasMaximas(int cantidadJugadasMaximas) {
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabraBuscar=" + palabraBuscar + ", cantidadLetrasEncontradas=" + cantidadLetrasEncontradas + ", cantidadJugadasMaximas=" + cantidadJugadasMaximas + '}';
    }  

}
