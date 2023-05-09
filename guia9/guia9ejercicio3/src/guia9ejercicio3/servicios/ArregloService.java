package guia9ejercicio3.servicios;

import java.util.Arrays;

/**
 *
 * @author MartuV
 */
public class ArregloService {

    /*1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
    números aleatorios.
    */
    public void incializarVector(double vector[]) {

        //Arrays.fill(vector, (int) (Math.random()*10));//esto lo llena con un solo numero random
        for (int i = 0; i < vector.length; i++) {

            vector[i] = (int) (Math.random() * 10);

        }

    }

    /*2) Método mostrar recibe un arreglo por parámetro y lo muestra por
    pantalla.
     */
    public void mostrarVector(double vector[]) {

        System.out.println(Arrays.toString(vector));

    }

    /*3) Método ordenar recibe un arreglo por parámetro y lo ordena de
    mayor a menor.
     */
    public void ordenar(double vector[]) {

        //lo ordeno
        Arrays.sort(vector);

    }

    /*4) Método inicializarB copia los primeros 10 números del arreglo A en el
    arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
     */
    public void inicializarB(double vectorA[], double vectorB[]) {

        //para que se vaya lo amarillo del for:me sale en la sugerencia netbeans:
        //System.arraycopy(vectorA, 0, vectorB, 0, vectorB.length-10);
        
        for (int i = 0; i < vectorB.length - 10; i++) {

            vectorB[i] = vectorA[i];

        }

        //llena las ultimas 10 posiciones
        Arrays.fill(vectorB, 10, 20, 0.5);

    }
}
