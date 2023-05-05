/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemplonio2;


import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


/**
 *
 * @author cic
 */
public class EjemploNIO2 {

    public static void main(String[] args) {
        try {
            /*Listado del contenido de un directorio*/
            DirectoryStream<Path> directoryStream= Files.newDirectoryStream(Paths.get("D:/Curso22-23"));
            for(Path p:directoryStream){
                System.out.println(p.getFileName());
            }
            
        } catch (IOException ex) {
            System.err.println("Error");
        }
        try {
            /*El método list devuelve un stream de todas las rutas de un direcorio dado, solo un nivel
            Con un stream podemos filtrar, ordenar, recorrer
            Obtenemos contenido de la carpeta del perfil del usuario*/
            Stream<Path> stream = Files.list(Paths.get("."));//el . representa el directorio actual
            stream.map(p -> p.getFileName().toString())
                    .filter(p -> !p.startsWith("."))
                    .sorted()
                    .forEach(System.out::println);
            System.out.println("\n");
        } catch (IOException ex) {
            System.err.println("Error");    
        }
       
        
    }
}
