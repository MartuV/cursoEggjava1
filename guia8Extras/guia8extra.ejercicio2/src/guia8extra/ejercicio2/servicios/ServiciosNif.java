package guia8extra.ejercicio2.servicios;

import guia8extra.ejercicio2.entidades.Nif;
import java.util.Scanner;

/**
 *En NIFService
se dispondrá de los siguientes métodos:

 * @author MartuV
 */
public class ServiciosNif {
    
    /*//se puede reemplazar el arreglo nifLetra por una cadena constante de caracteres para mejorar el 
    //rendimiento y reducir la complejidad del código.
     private static final String NIF_LETRAS = "TRWAGMYFPDXBNJZSQVHLCK";
    */
    
    
    //a) Métodos getters y setters para el número de DNI y la letra.
    
    //insert code no me aparecen setter y getter, en realidad la clase no tiene atributos por eso no aparecen
    //los hice pasando como parametro el obj nif y copiando los getter y setter del la clase Nif
    
    /*Sí, los métodos de la clase ServiciosNif que acceden y modifican los atributos de la clase Nif no necesariamente
    deben llamarse get y set. Estos métodos pueden tener cualquier nombre que los identifique claramente como métodos 
    que acceden y modifican los atributos de la clase Nif a través de la clase ServiciosNif.

    Por ejemplo, en lugar de setDni() y getDni() podrían llamarse actualizarDni() y consultarDni(). Lo importante es 
    que estos métodos permitan acceder y modificar los atributos de la clase Nif de manera controlada a través de la 
    clase ServiciosNif, y que su nombre sea lo suficientemente descriptivo para que su uso sea fácilmente comprensible por otros programadores que trabajen en el mismo proyecto.
    
    */
     public long getDni(Nif nif) {
        return nif.getDni();
    }

    public void setDni(Nif nif, long dni) {
        nif.setDni(dni) ;
    }

    public String getLetra(Nif nif) {
        return nif.getLetra();
    }

    public void setLetra(Nif nif, String letra) {
        nif.setLetra(letra);
    }

    /*b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
    letra que le corresponderá. Una vez calculado, le asigna la letra que
    le corresponde según la tabla
    
    La letra correspondiente al dígito verificador se calculará a traves de un
    método que funciona de la siguiente manera: Para calcular la letra se
    toma el resto de dividir el número de DNI por 23 (el resultado debe ser
    un número entre 0 y 22). El método debe buscar en un array (vector) de
    caracteres la posición que corresponda al resto de la división para
    obtener la letra correspondiente. La tabla de caracteres es la siguiente:

    */
    
    public Nif crearNif() {

        String nifLetra[] = new String[]{"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K"};
        
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresar DNI: ");
        long dni = sc.nextLong();

        //el resto me da la letra
        int dniResto = (int) (dni % 23);
        
        String letra = nifLetra[dniResto];
        
        /*//con charAt obtengo la letra en la posicion de la cadena nifletra
        //con Charater.tostring convierto el caracter a String
        String letra = Character.toString(NIF_LETRAS.charAt(dniResto));*/
        
        

        return new Nif(dni, letra);
    }
    
    // c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
    //guion y la letra en mayúscula; por ejemplo: 00395469-F).

    public void mostrarNif(Nif nif) {

        //para que complete con 0 los 8 digitos
        String dniFormato = String.format("%08d", nif.getDni());

        System.out.println(dniFormato + "-" + nif.getLetra());
        
    }
    
   
    

}
