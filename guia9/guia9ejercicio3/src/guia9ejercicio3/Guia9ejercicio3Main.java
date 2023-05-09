package guia9ejercicio3;

import guia9ejercicio3.servicios.ArregloService;

/**
 *Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales.
* 
 * @author MartuV
 */
public class Guia9ejercicio3Main {

    public static void main(String[] args) {
        
        
        double [] vectorA = new double[50];
        
        double [] vectorB =new double [20];
        
        ArregloService vs = new ArregloService ();
        
        System.out.println("vectorA:");
        vs.incializarVector(vectorA);
     
        vs.mostrarVector(vectorA);
       
        //lo pongo antes de ordenar vectorA
        vs.inicializarB(vectorA, vectorB);
        
        System.out.println("-----------------------");
        
        System.out.println("vectorA ordenado:");
        vs.ordenar(vectorA);
        vs.mostrarVector(vectorA);
        
        System.out.println("-----------------------");
        
        System.out.println("vectorB:");
       
        vs.mostrarVector(vectorB);
        
        
        /*
        En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
        mostrar A y B.
        
        
        System.out.println("-----------------------");
        System.out.println("siguiendo el orden del ejercicio");
        
       
        vs.incializarVector(vectorA);
        System.out.println("vectorA:");
        vs.mostrarVector(vectorA);
        vs.ordenar(vectorA);
         
        System.out.println("-----------------------");
        
        System.out.println("vectorB:");
        vs.inicializarB(vectorA, vectorB);
        vs.mostrarVector(vectorB);*/
    }


        
    }


