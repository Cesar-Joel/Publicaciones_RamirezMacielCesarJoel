package publicacion;
public class Libro extends Publicacion{
   
   private String isbn, edicion, autor;
   
   public void setISBN(String x){
      isbn = x;
   }
   
   public String getISBN(){
      return isbn;
   }
   
   public void setEdicion(String edition){
      edicion = edition;
   }
   
   public String getEdicion(){
      return edicion;
   }
   
   public void setAutor(String writer){
      autor = writer;
   }
   
   public String getAutor(){
      return autor;
   }
} 