/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo3.proyecto_intermodular;

/**
 *
 * @author david
 */
public class Validaciones {

    public static boolean validarDni(String dni) {
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        boolean result = false;
        try {
            if (dni.length() == 9) {

                if (dni.substring(0, 8).matches("[0-9]+")) {
                    int resultDivision = Integer.parseInt(dni.substring(0, 8)) % 23;
                    if (dni.substring(8, 9).toUpperCase().contentEquals(letrasDni.substring(resultDivision, resultDivision + 1))) {
                        result = true;
                    } else {
                        throw new Exception("La letra no es correcta");
                    }

                } else {
                    throw new Exception("los primeros 8 caracteres del Dni no son numeros");
                }

            } else {
                throw new Exception("El Dni tiene menos de 9 caracteres");
            }

        } catch (Exception e) {
            System.out.println("Error indeterminado...");
            System.out.println(e.getMessage());
        }

        return result;
    }

    public static boolean validarTlf(int n) {
        boolean valido = false;
        try{
        if (n >= 0 && String.valueOf(n).length() >= 9) { // si es positivo salgo del bucle, si es negativo doy un error
            valido = true;
        } else {
            System.out.println("Has introducido un numero negativo o tiene un tamaño menor de 9. ,Repite");
        }
        }catch (Exception e){
            System.out.println("Error consola en validacion de teloon"+ e.getMessage());
        }
        return valido;
    }
}
