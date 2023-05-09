package guia3ejerciciosextra;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author MartuV
 */
public class RedondeoDecimales {

    public static void main(String[] args) {

        double num = 8.0450 ;
        

        System.out.println("el numero a redondear es: " + num);
        System.out.println("");
        
        //si quiero pasarlo a una variable int entonces casting y lo trunca o sea me queda la parte entera
        int numInt = (int) num;
        System.out.println("el numero casting en una variable int es: " + numInt + " - trunca la parte entera, No redondea");
        System.out.println("");
        
        //roud redonde al entero superior o dependiendo de los decimales, menor a 0,5 al inferior , mayor o igual a 0.5 al superior
        double numR = Math.round(num);
        System.out.println("el numero redondeado con Math.round() en una variable double es: " + numR);
        

        long numRlong = Math.round(num);
        System.out.println("el numero redondeado con Math.round() en una variable long es: " + numRlong);
        
        
        double numRMulti = Math.round(num*100.0)/100.0;
        System.out.println("el numero redondeado con Math.round() multiplicado es: " + numRMulti);
        
        //ceil redonde al entero superior siempre, no dependiendo de los decimales
        double numC = Math.ceil(num);
        System.out.println("el numero redondeado con Math.ceil() en una variable double es: " + numC);
        
         //floor redonde al entero inferior siempre, no dependiendo de los decimales
        double numF = Math.floor(num);
        System.out.println("el numero redondeado con Math.floor() en una variable double es: " + numF);


        
        
        //Usando la clase BigDecimal , usando el método setScale que recibe dos parámetros la cantidad de decimales a limitar y el modo de redondeo
        //import java.math.BigDecimal;
        //import java.math.RoundingMode;
        BigDecimal bd = new BigDecimal(num);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        //no iria solo bd porque el doubleValue()????
        System.out.println("el numero redondeado con BigDecimal.setScale() es: "+ bd.doubleValue());

        //hay que importar la clase DecimalFormat y crear el objeto
        // Reducimos el número de decimales a 2 con la clase DecimalFormat con ("#.00") y si le pongo (#.##) es lo mismo???
        //puedo poner (#.000) y redondea al tercer decimal
        //redondea en el ultimo decimal: menos  0,5 al inferior y mas o igual de 0,5 al superior
        //para redondear me fijo en el decimal anterior al ultimo decimal que quiero mostrar, no tiene en cuenta el resto
        //convertimos a String!!!!
        System.out.println("");
        System.out.println("aca convirto a String");
        DecimalFormat df = new DecimalFormat("#.00");
        String numRString = df.format(num);
        System.out.println("el numero redondeado con DecimalFormat (\"#.00\") es: " + numRString);

        DecimalFormat df1 = new DecimalFormat("#.##");
        String numRString1 = df1.format(num);
        System.out.println("el numero redondeado con DecimalFormat (\"#.##\") es: " + numRString1);

        //2f indica la cantidad decimales,
        //el redondeo es con el ultimo decimal , no tiene en cuenta los otros
        String numFormato = String.format("%.2f", num);
        System.out.println("el numero redondeado con String.format() : " + numFormato);
        
        
      double d =  8.52522719;
      double roundDbl = Math.round(d*100.0)/100.0;
      System.out.println("Rounded Double value: "+roundDbl);

    }

}
