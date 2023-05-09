package guia3ejerciciosextra;
/**
 *Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String
 * 
 * @author MartuV
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
       
        for (int i = 0; i < 1000; i++) {
            
            //.metodo format El método devuelve una cadena con formato basada en el argumento pasado.
            //Estos son los especificadores de formato más utilizados:
          /*Especificador	Descripción
            %b, %B	"true" o basado en el argumento"false"
            %s, %S	una cadena
            %c, %C	un carácter Unicode
            %d          Un entero decimal (utilizado sólo para enteros)
            %o          un entero octal (usado sólo para enteros)
            %x, %X	Un entero hexadecimal (utilizado sólo para enteros)
            %e, %E	para notación científica (usada para números de coma flotante)
            %f          para números decimales (utilizados para números de coma flotante)
            
            //para agregar los 0 a la izquierda y se convierte a String*/
            String numFormato = String.format("%03d", i);
            
            String p1 = numFormato.substring(0, 1);
            String p2=  numFormato.substring(1, 2);
            String p3=  numFormato.substring(2, 3);
            
            if (p1.equals("3") ) {
                p1="E";
            }
            
            if (p2.equals("3") ) {
                p2="E";
            }
            
            if (p3.equals("3") ) {
                p3="E";
            }
            
            //cada %s es un especificador
           System.out.println(String.format("%s-%s-%s", p1,p2,p3));
            
            
           /* //StringBuilder es una clase para dar formato al String
            StringBuilder builder = new StringBuilder(numFormato);
            
            // 1 y 3 serian las posiciones de la cadena donde quiero insertar el guion
            builder.insert(1, '-');
            builder.insert(3, '-');
            String guion = builder.toString();

            
            //String guion = numFormato.substring(0, 1) + "-" + numFormato.substring(1, 2) + "-" + numFormato.substring(2, 3);
            
            
            String reemplazoE = guion.replaceAll("3", "E");
            
            System.out.println(reemplazoE);*/
           
           
         
        }

    }

}
