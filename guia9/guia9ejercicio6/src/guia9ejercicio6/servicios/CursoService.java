package guia9ejercicio6.servicios;

import guia9ejercicio6.entidades.Curso;
import java.util.Scanner;

/**
 * @author MartuV
 */
public class CursoService {
    
    
    private Scanner sc = new Scanner(System.in);
    
    /*d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.*/

    
    public String [] cargarAlumnos (){
          
         String []alumnos=new String [5];
            
        for (int i = 0; i < alumnos.length; i++) {
            
            System.out.print("ingresar nombre del alumno "+(i+1)+" : ");
            String nombre = sc.nextLine();
            
            alumnos[i]=nombre;
            
            
        }
        
        return alumnos ;
    }
    
    /*e) Método crearCurso(): el método crear curso, le pide los valores de
    los atributos al usuario y después se le asignan a sus respectivos
    atributos para llenar el objeto Curso. En este método invocamos al
    método cargarAlumnos() para asignarle valor al atributo alumnos
    */
    
    public Curso crearCurso(){
       
        System.out.println("ingresar nombre del curso: ");
        String nombreCurso = sc.nextLine();
        
        System.out.println("ingresar cantidad de hs por dia: ");
        int cantidadHorasPorDia = sc.nextInt();
        
        System.out.println("ingresar cantidad de dias por semana: ");
        int cantidadDiasPorSemana = sc.nextInt();
        
        sc.nextLine();
        System.out.println("ingresar turno (mañana o tarde): ");
        String turno = sc.nextLine();
    
        System.out.println("ingresar precio por hora: ");
        double precioPorHora =sc.nextDouble();
        sc.nextLine();
        
        String []alumnos=cargarAlumnos();
        
        return new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno,  precioPorHora, alumnos);
                
    }
    
    /*f) Método calcularGananciaSemanal(): este método se encarga de
    calcular la ganancia en una semana por curso. Para ello, se deben
    multiplicar la cantidad de horas por día, el precio por hora, la
    cantidad de alumnos y la cantidad de días a la semana que se repite
    el encuentro.*/
    
    public void calcularGananciaSemanal(Curso c){
    
        double ganancia = c.getCantidadHorasPorDia()*c.getPrecioPorHora()*c.getCantidadDiasPorSemana()*c.getAlumnos().length;
        
        System.out.println("la ganacia semanal es de "+ganancia+" pesos");
    
    }
}


