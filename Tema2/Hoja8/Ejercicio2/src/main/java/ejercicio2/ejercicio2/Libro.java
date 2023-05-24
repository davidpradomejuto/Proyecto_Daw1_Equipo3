/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.ejercicio2;
/**
  * @author david
 */
public class Libro {
    private String isbn, titulo, autor;
    
    public Libro (String newIsbn, String newTitulo, String newAutor) {
    this.isbn = newIsbn;
    this.titulo = newTitulo;
    this.autor = newAutor;
    }
    
    public String getIsbn (){
        return this.isbn;
    }
    public String getTitulo (){
        return this.titulo;
    }
    public String getAutor (){
        return this.autor;
    }
    
    public void setIsbn ( String newIsbn ){
            this.isbn = newIsbn;
    }
    public void setTitulo (  String newTitulo ){
        this.titulo = newTitulo;
    }
    public void setAutor ( String newAutor ){
        this.autor = newAutor;
    }
    
    public boolean esEspanol () {
        boolean result;
        //saco la cadena que tiene los numeros que necesito comparar
         String numerosString = this.isbn.substring(3,5);
        result = numerosString.equalsIgnoreCase("84");     
        return result;
    }
    
    public void mostrar () {
        //saco la incial y el resto del nombre para posteriormente pasarlos a minusculas y mayusculas
    String inicialNombre = this.autor.substring(0,1);
    String restoNombre = this.autor.substring(1,this.autor.length());
    //creo una string en la que junto las mayusculas y minusculas y lo muestro
    String result = "Titulo: "+this.titulo.toUpperCase()+"\nAutor : "+inicialNombre.toUpperCase()+restoNombre.toLowerCase();
    System.out.println(result);
    }
    
    
}
