package ejercicio1.ejercicio1;

import java.util.Scanner;

/**
 * @author david
 */
public class Calculo {

    Scanner teclado = new Scanner(System.in);

    public Calculo() {
    }

    public void metodo1() {
        //pido los datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n1 = teclado.nextInt();

        //hago el calculo
        String result = n1 >= 100 && n1 <= 1000 ? "el numero esta comprendido entre 100 y 1000" : "el numero no esta comprendido entre 100 y 1000";
        System.out.println(result);
    }

    public void metodo2() {
        //pido datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n1 = teclado.nextInt();

        //hago el calculo
        if (n1 == 0) {
            System.out.println(n1 + " es nulo");
        } else if (n1 > 0) {
            System.out.println(n1 + " es positivo");
        } else {
            System.out.println(n1 + " es negativo");
        }
    }

    public void metodo3() {
        //pido datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n1 = teclado.nextInt();

        //hago el calculo
        if (n1 % 2 == 0 && n1 % 5 == 0) {
            System.out.println(n1 + " es divisible entre 2 y 5");
        } else {
            System.out.println(n1 + " es indivisible entre 2 y 5");
        }
    }

    public void metodo4() {
        //pido datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        double n1 = teclado.nextDouble();

        //hago el calculo
        if (n1 % 1 == 0) {
            System.out.println("no tiene parte faccionaria");
        } else {
            System.out.println("El numero tiene parte fraccionaria");
        }
    }

    public void metodo5() {
        //pido datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n1 = teclado.nextInt();

        //hago el calculo
        if (n1 >= 1900 && n1 <= 2100) {
            if ((n1 % 4 == 0) || (n1 % 100 == 0) && (n1 % 400 != 0 )) {
                System.out.println("el año " + n1 + " es bisiesto");
            } else {
                System.out.println("el año" + n1 + "no es bisiesto");
            }

        } else {
            System.out.println("el valor no esta en rango");
        }

    }

    public void metodo6() {
        //pido datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n1 = teclado.nextInt();

        //hago el calculo
        if (n1 % 2 == 0) {
            System.out.println("el numero es Par");
        } else {
            System.out.println("el numero es Impar");
        }
    }

    public void metodo7() {
        //pido datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n1 = teclado.nextInt();

        //hago el calculo
        if (n1 >= 1 && n1 <= 10) {

            if (n1 % 2 == 0) {
                System.out.println("el numero es Par");
            } else {
                System.out.println("el numero es Impar");
            }

        } else {
            System.out.println("el numero no esta dentro del rango");
        }
    }

    public void metodo8() {
        //pido datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n1 = teclado.nextInt();
        
        System.out.println("Introduce un numero 2: ");
        int n2 = teclado.nextInt();
        
        System.out.println("Introduce un numero 3: ");
        int n3 = teclado.nextInt();
        
        //hago los calculos
        //saco el mayor y el menor
        int mayor = Math.max(n3, Math.max(n2, n1));
        int menor = Math.min(n3, Math.min(n2, n1));
        int medio = 0;
        // una vez tengo cual es el mayor y cual es el menor compruebo si son iguales y el que 
        //sea igual a otro lo pongo en el medio
       
        if (n1 == n2 || n1 == n3) {
            medio = n1;
        }else if (n2 == n3) {
            medio = n2;
        }
        
        //si ninguno con iguales comparto los  3 numeros que tengo con el valor de mayor y menor
        if (n1 != mayor && n1 != menor) {
            medio = n1;
        }
        if (n2 != mayor && n2 != menor) {
            medio = n2;
        }
        if (n3 != mayor && n3 != menor) {
            medio = n3;
        }
        System.out.println("orden de mayor a menor " + mayor + " " + medio + " " + menor);
    }

    public void metodo9(){
        //pido datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n1 = teclado.nextInt();
        
        System.out.println("Introduce un numero 2: ");
        int n2 = teclado.nextInt();
        
        //hago los calculos
        if (n1 % n2 == 0){
            System.out.println(n1+" es divisor de "+n2);
        }else if (n2 % n1 == 0){
            System.out.println(n2+" es divisor de "+n1);
        }else{
            System.out.println("ninguno es divisor de ninguno");
        }
    }
    
}
