/*
 * ejemplos de expresiones regulares
 */
package ejemplo06.ejemplo09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author cic
 */
public class Ejemplo09 {

    public static void main(String[] args) {
        System.out.println("? cualificador ....");
        System.out.println(Pattern.matches("[amn]?", "a"));//true (a o m o n solo una vez)  
        System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a más de una vez)  
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m y n mas de una vez)  
        System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a más de una vez)  
        System.out.println(Pattern.matches("[amn]?", "am"));//false (a o m o n más de una vez)  
        System.out.println("+ cualificador ....");
        System.out.println(Pattern.matches("[amn]+", "a"));//true (a o m o n una o mas veces)
        System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a mas de una vez)  
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a o m o n mas de una vez)  
        System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z y t no se encuentran en el patrón)  
        System.out.println("* cualificador ....");
        System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a o m o n de cero a n veces) 

        System.out.println("metacaracteres d...."); //d significa un digito  
        System.out.println(Pattern.matches("\\d", "abc"));//false (no son digitos) 
        System.out.println(Pattern.matches("\\d", "1"));//true (un digito)  
        System.out.println(Pattern.matches("\\d", "4443"));//false (digito pero más de uno)  
        System.out.println(Pattern.matches("\\d", "323abc"));//false (digito y carácter)  
        System.out.println("metacaracteres D....");//D significa que no es un dígito  
        System.out.println(Pattern.matches("\\D", "abc"));//false (no es un digito pero más de uno)  
        System.out.println(Pattern.matches("\\D", "1"));//false (es un digito)  
        System.out.println(Pattern.matches("\\D", "4443"));//false (es un digito)  
        System.out.println(Pattern.matches("\\D", "323abc"));//false (digitò y caracter)  
        System.out.println(Pattern.matches("\\D", "m"));//true (no es un digito y solo uno)  
        System.out.println("metacaracteres D con cuantificadores....");
        System.out.println(Pattern.matches("\\D*", "mak"));//true (no es digito y se puede encontrar de cero a n ocurrencias)  

        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true  
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (mas de 6 caracteres)  
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ no está en el patrón)

        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true  
        System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true    
        System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 caracteres)  
        System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (comienza por 6)  
        System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true  
        System.out.println(Pattern.matches("[789]{1}\\d{9}","8853038949"));//true  
        System.out.println(Pattern.matches("[789]{1}\\d{9}","3853038949"));//false (comienza por 3)
        
        // para validar fechas (PERO NO VALIDA QUE REALMENTE SEA UNA FECHA VALIDA SOLO VALIDA FORMATO)
          String texto = "2014-02-02";
          Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
          Matcher matcher = pattern.matcher(texto);
          System.out.println(matcher.find());//true;
        // Para validar un correo electrónico
         String texto2 = "carmen.izacastanedo@iesmiguelherrero.com";
         Pattern pattern1 = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);//A destacar se hace uso de \\ para escapar el símbolo .
         Matcher matcher1 = pattern1.matcher(texto2);
         System.out.println(matcher1.find());//true;
         // validar un dni ( PERO NO VALIDA QUE LA LETRA SEA LA LETRÁ VALIDA SOLO VALIDA FORMATO)
         String dni="13925507M";
         System.out.println(validarDni(dni));
    }
    public static boolean validarDni(String dni){
        Pattern pat = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
        Matcher mat = pat.matcher(dni);
        return mat.matches(); //true
    }
}
