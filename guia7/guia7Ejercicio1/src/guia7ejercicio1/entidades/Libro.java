package guia7ejercicio1.entidades;

import java.util.Scanner;

/**
 *ISBN, Título, Autor, Número de páginas
 * @author MartuV
 */
public class Libro {
    
    private String  iSBN;
    
    private String titulo;
    
    public String autor;
    
    private String  numPag;
    
    //constructores

    public Libro() {
        
        
    }

    public Libro(String  iSBN, String titulo, String autor, String  numPag) {
        
        Scanner sc = new Scanner(System.in);
        
        do {

             if (iSBN.length() != 8) {
                
                System.out.println("el ISBN debe tener 8 caracteres ente numeros y letras");
                System.out.println("ingrese  nuevamente el ISBN del libro :");
                iSBN = sc.nextLine();

            }

        } while (iSBN.length() != 8);

        // cuando sale del bucle es porque tiene 8 caracteres entonces lo puedo guardar
        this.iSBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
        
        
        
        
    }
    
    //set

    public void setiSBN(String  iSBN) {
        
        Scanner sc = new Scanner(System.in);
        
        do {

            if (iSBN.length() != 8){ 
                System.out.println("el ISBN debe tener 8 caracteres ente numeros y letras");
                System.out.println("ingrese  nuevamente el ISBN del libro :");
                iSBN = sc.nextLine();

            }

        } while (iSBN.length() != 8);

        // cuando sale del bucle es porque tiene 8 caracteres entonces lo puedo guardar
        this.iSBN = iSBN;

            

        

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPag(String  numPag) {
        this.numPag = numPag;
    }
    
    
   

    @Override
    public String toString() {
        return "Libro{" + "iSBN=" + iSBN + ", titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + '}';
    }
    
    
    

}
