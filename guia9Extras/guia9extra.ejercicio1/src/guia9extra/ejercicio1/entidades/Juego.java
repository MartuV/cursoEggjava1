package guia9extra.ejercicio1.entidades;
/**
 *Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año,
 * en minúsculas. A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del 
 * array(por ejemplo, mesSecreto = mes[9].
 * @author MartuV
 */
public class Juego {
    
    private String []mes;
    private String mesSecreto;

    public Juego() {
        
        this.mes=new String [] {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        this.mesSecreto = mes[9]; 
        
    }


    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getMes() {
        return mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    @Override
    public String toString() {
        return "Juego{" + "mes=" + mes + ", mesSecreto=" + mesSecreto + '}';
    }
    
   

}
