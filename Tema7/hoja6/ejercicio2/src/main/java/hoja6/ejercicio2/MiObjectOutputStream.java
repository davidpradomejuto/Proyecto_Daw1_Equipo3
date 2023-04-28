/**
 * 
 * Redefinicion de la clase ObjectOutputStream para que no escriba una cabecera
 * al principio del Stream.
 */
package hoja6.ejercicio2;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Redefinicion de la clase ObjectOuputStream para que no escriba una cabecera
 * al inicio del Stream.
 *
 */
public class MiObjectOutputStream extends ObjectOutputStream
{
    /** Constructor que recibe OutputStream
     * @param out
     * @throws java.io.IOException */
    public MiObjectOutputStream(OutputStream out) throws IOException
    {
        super(out);
    }

    /** Constructor sin par�metros
     * @throws java.io.IOException */
    protected MiObjectOutputStream() throws IOException, SecurityException
    {
        super();
    }

    /** Redefinici�n del m�todo de escribir la cabecera para que no haga nada.
     * @throws java.io.IOException */
    @Override
    protected void writeStreamHeader() throws IOException
    {
    }

}
