package guia7ejercicio1;

import guia7ejercicio1.entidades.Libro;

import java.util.Scanner;


/**
 *Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 * @author MartuV
 */
public class Guia7Ejercicio1Main {

    public static void main(String[] args) {
        
        /*Scanner sc = new Scanner(System.in);
        
        Libro l1 = new Libro();
        
        System.out.println("ingrese ISBN del libro :");
        String iSBN = sc.nextLine();
        l1.setiSBN(iSBN);
        
        System.out.println("ingrese titulo del libro :");
        String titulo = sc.nextLine();
        l1.setTitulo(titulo);
        
        System.out.println("ingrese autor del libro :");
        String autor = sc.nextLine();
        l1.setAutor(autor);
        
        System.out.println("ingrese numero de paginas del libro :");
        String numPag = sc.nextLine();
        l1.setNumPag(numPag);
        
        
        System.out.println("datos del libro ingresado: "+l1.toString());*/
        
        
        //si uso el constructor con todos los parametros
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("ingrese ISBN del libro :");
        String iSBN = sc.nextLine();
        
        
        System.out.println("ingrese titulo del libro :");
        String titulo = sc.nextLine();
        
        
        System.out.println("ingrese autor del libro :");
        String autor = sc.nextLine();
        
        
        System.out.println("ingrese numero de paginas del libro :");
        
        String numPag = sc.nextLine();
        
        
        Libro l1 = new Libro(iSBN, titulo, autor, numPag);
        
        
        System.out.println("datos del libro ingresado: "+l1.toString());
       
       
       
       /*//para muchos libros
       
       int n=3;
        Scanner sc = new Scanner(System.in);
        
        Libro li = new Libro();
       
        for (int i = 0; i < n; i++) {
            
        System.out.println("ingrese ISBN del libro "+(i+1)+":");
        String iSBN = sc.nextLine();
        li.setiSBN(iSBN);
        
       
        
        System.out.println("ingrese titulo del libro "+(i+1)+":");
        String titulo = sc.nextLine();
        li.setTitulo(titulo);
        
        System.out.println("ingrese autor del libro "+(i+1)+" :");
        String autor = sc.nextLine();
        li.setAutor(autor);
        
        System.out.println("ingrese numero de paginas del libro "+(i+1)+" :");
        String numPag = sc.nextLine();
        li.setNumPag(numPag);
        
        
        System.out.println("datos del libro "+(i+1)+" ingresado: "+li.toString());*/
            
        }
       
      
        
        
        
    }

