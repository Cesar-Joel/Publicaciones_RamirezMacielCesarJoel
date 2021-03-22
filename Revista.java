package publicacion;
public class Revista extends Publicacion implements Periodicidad{
   
   private String issn;
   private int numero, year;
   private String periodicidad;
   
   public void setISSN(String x){
      issn = x;
   }
   
   public String getISSN(){
      return issn;
   }
   
   public void setNumero(int num){
      numero = num;
   }
   
   public int getNumero(){
      return numero;
   }
   
   public void setYear(int ano){
      year = ano;
   }
   
   public int getYear(){
      return year;
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