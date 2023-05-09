package guia7extra.ejercicio1.entidades;
/**
 *Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.

 * @author MartuV
 */
public class Cancion {
    
    private String titulo;
    
    private String autor;

    /*//con este constructor cuando inicializo el objeto y pruebo los valores son null, no vacio
    public Cancion() {
    
    }*/
    
    // constructor vacio e inicializa cadena vacia
    public Cancion() {
        this.titulo = " ";
        System.out.println("para ver que es this.: "+this);
        System.out.println("para ver que es this.titulo: "+this.titulo);
        System.out.println("para ver que es this.autor: "+this.autor);
        this.autor = " ";
        System.out.println("para ver que es this.: "+this);
        System.out.println("para ver que es this.titulo: "+this.titulo);
        System.out.println("para ver que es this.autor: "+this.autor);
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    
    public void mostrarDatos(){
        
        System.out.println("titulo cancion: "+titulo);
        
        System.out.println("Autor cancion: "+autor);
    
    }
    
  

//    @Override
//    public String toString() {
//        return "Cancion{" + "titulo=" + titulo + ", autor=" + autor + '}';
//    }
    
    

}
