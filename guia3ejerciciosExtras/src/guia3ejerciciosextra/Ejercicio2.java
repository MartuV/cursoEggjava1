package guia3ejerciciosextra;
/**
 *
 * @author MartuV
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        int A=1,B=2,C=3,D=4,aux=0;
        System.out.println("A: " + A + "  B: " + B + "  C: " + C + "  D: " + D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("A: " + A + "  B: " + B + "  C: " + C + "  D: " + D);
        
        
    }

}
