package publicacion;
public class Periodico extends Publicacion implements Periodicidad{
   
   private String secciones, editor;
   private String periodicidad;
   
   public void setSecciones(String sections){
      secciones = sections;
   }
   
   public String getSecciones(){
      return secciones;
   }
   
   public void setEditor(String e){
      editor = e;
   }
   
   public String getEditor(){
      return editor;
   }
   
   @Override
   public void setPeriodicidad(String peri){
      periodicidad = peri;
   }
   
   @Override
   public String getPeriodicidad(){
      return periodicidad;
   }
}