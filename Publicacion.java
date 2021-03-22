package publicacion;
public class Publicacion{
   
   private String titulo;
   private int paginas;
   private double precio;
   
   public void setTitulo(String title){
      titulo = title;
   }
   
   public String getTitulo(){
      return titulo;
   }
   
   public void setPaginas(int pag){
      paginas = pag;
   }
   
   public int getPaginas(){
      return paginas;
   }
   
   public void setPrecio(double price){
      precio = price;
   }
   
   public double getPrecio(){
      return precio;
   }
}