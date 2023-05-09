package guia7ejemplo.entidad;



/**
 *
 * @author MartuV
 */
public class Persona {
    
    //atributos
    private String nombre;

    private String apellido;

    private int altura;

    private String sexo;

    private int energia;

    

    //constructores
    public Persona() {
        energia = 1000;
    }

    public Persona(int energia) {
        this.energia = energia;
    }

    //set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    //get
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAltura() {
        return altura;
    }

    public String getSexo() {
        return sexo;
    }

    //metodos de operaciones o funciones???
    public int paseo(int restarEnergia) {

        energia -= restarEnergia;

        return energia;

    }

    //to string
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", altura=" + altura + ", sexo=" + sexo + '}';
    }


}
