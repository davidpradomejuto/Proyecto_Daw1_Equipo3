/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.ejercicio1;

/**
 *
 * @author DAW118
 */
public class Tarjeta {

    private String nombre;
    private int numeroC;
    private int pin;
    private Estado estado;
    private double saldo;

    //contructor por parametros
    public Tarjeta(String newnombre, int newnumeroC, double newsaldo) {
        this.nombre = newnombre;
        this.numeroC = newnumeroC;
        this.pin = (int) Math.floor(Math.random() * 9999) + 1000;
        this.estado = Estado.Deshabilitado;
        this.saldo = newsaldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroC() {
        return numeroC;
    }

    public int getPin() {
        return pin;
    }

    public Enum isEstado() {
        return estado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroC(int numeroC) {
        this.numeroC = numeroC;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //si el pin es correcto, el estado se vuelve true
    public void desbloquea(int newpin) {
        if (newpin == this.pin) {
            this.estado = Estado.Habilitado;
            System.out.println("Tarjeta desbloqueada");
        } else {
            System.out.println("Pin incorrecto");
        }
    }

    public void pagar(double importe, int newpin, String descripcion, boolean propina) {
        if (this.estado == Estado.Habilitado) { //si el estado es true, el pin es correcto y tiene dinero suficiente en el banco, se cumple la condicion
            if (newpin == this.pin) {
                if (propina && importe * 1.05 <= this.saldo) { //propina == true y importe < saldo
                    //importe *5%
                    this.saldo -= importe * 1.05;
                    System.out.printf("Se ha realizado un pago por valor de %,.2f\n" ,importe * 1.05);
                    imprimirTicket(importe, descripcion, propina);

                } else if (importe <= this.saldo) {
                    this.saldo -= importe;
                    System.out.printf("Se ha realizado un pago por valor de %,.2\n" , importe);
                    imprimirTicket(importe, descripcion, propina);
                } else {
                    System.out.println("no tiene saldo suficiente");
                }
            } else {
                System.out.println("Pin incorrecto");
            }
        } else {
            System.out.println("La tarjeta esta bloqueada");
        }
    }

    private void imprimirTicket(double importe, String descripcion, boolean propina) {
        //introduccion de parametros por el metodo de pagar
        System.out.println("******** Ticket de Compra ******** ");
        System.out.println("\tEl titular de la cuenta es: " + this.nombre);

        //formateo los numeros de la cuenta a String, despues corto los numeros a 3
        String NcuentaString = String.valueOf(numeroC);
        int charNcuenta = NcuentaString.length(); //saco los la longitud del string, para luego sustituir los asteriscos
        String finalNcuenta = NcuentaString.substring(0, 3); //meto en otra string los 3 primeros numeros

        System.out.printf("\tEl numero de cuenta es: %s", finalNcuenta);//muestro lo 3 primeros numeros
        for (int i = 0; i <= charNcuenta - 3; i++) { //hago un for para mostrar tantos asteriscos como caracteres tenga el numero de cuenta - 3
            System.out.print("*");
        }
        System.out.println("");

        String finalDescripcion = descripcion.substring(0, 8); //saco los 8 primeros caracteres  de la descripcion , no me preocupo por que haya menos de 8      
        System.out.println("\tLa descripcion del pago es: " + finalDescripcion); //muestro la descripcion

        if (propina == true) {
            System.out.printf("\tEl importe de la compra es de: %,.2f € \n", importe);
            double importePropina = importe * 0.05;
            System.out.printf("\tLos cargos son: %,.2f €  \n", importePropina);

            System.out.printf("\tEl total es de: %,.2f € ", (importePropina + importe));
        } else {
            System.out.printf("\tEl importe de la compra es de: %,.2f € \n", importe);
            System.out.printf("\tEl total es de: %,.2f €", importe);
        }

    }
}
