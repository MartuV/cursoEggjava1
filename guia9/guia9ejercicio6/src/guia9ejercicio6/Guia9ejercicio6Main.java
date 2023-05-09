package guia9ejercicio6;

import guia9ejercicio6.entidades.Curso;
import guia9ejercicio6.servicios.CursoService;

/**
 *
 * @author MartuV
 */
public class Guia9ejercicio6Main {

    public static void main(String[] args) {
        
        CursoService cs= new CursoService();
        
        Curso c1= cs.crearCurso();
        
        //para probar
        System.out.println(c1);
        
        cs.calcularGananciaSemanal(c1);
        
    }

}
