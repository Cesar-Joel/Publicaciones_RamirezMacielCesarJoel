package publicacion;

import java.util.*;
public class Principal_Publicacion{
   
   public static ArrayList<Object> publicaciones = new ArrayList<Object>();
   public static Scanner leer = new Scanner(System.in);
   
   public static void main(String args[]){
      
      int opc;
      
      do{
         System.out.println("- M E N U -");
         System.out.println("1) Dar de alta una publicacion.");
         System.out.println("2) Consultar publicaciones.");
         System.out.println("3) Salir.");
         System.out.print("Elija una opcion: ");
         opc = leer.nextInt();
         System.out.println();
         switch(opc){
            case 1:
               alta();
               break;
            case 2:
               consulta();
               break;
         }
      } while(opc > 0  && opc < 3);
   }
   
   public static void alta(){
      
      int opc;
      
      System.out.println("- A L T A -");
      System.out.println("1) Libro.");
      System.out.println("2) Revista.");
      System.out.println("3) Periodico.");
      System.out.print("Seleccione el tipo de publicacion que desea dar de alta: ");
      opc = leer.nextInt();
      System.out.println();
      if(opc == 1){
         
         Libro libro = new Libro();
         String isbn, tituloL, edicion, autor;
         int paginasL;
         double precioL;
         
         leer.nextLine();
         System.out.print("Ingrese el ISBN del libro: ");
         isbn = leer.nextLine();
         libro.setISBN(isbn);
         System.out.print("Ingrese el titulo del libro: ");
         tituloL = leer.nextLine();
         libro.setTitulo(tituloL);
         System.out.print("Ingrese el autor del libro: ");
         autor = leer.nextLine();
         libro.setAutor(autor);
         System.out.print("Ingrese la edicion del libro: ");
         edicion = leer.nextLine();
         libro.setEdicion(edicion);
         System.out.print("Ingrese el numero de paginas del libro: ");
         paginasL = leer.nextInt();
         libro.setPaginas(paginasL);
         System.out.print("Ingrese el precio del libro: $");
         precioL = leer.nextDouble();
         libro.setPrecio(precioL);
         publicaciones.add(libro);
         System.out.println();
      }
      if(opc == 2){
         
         Revista revista = new Revista();
         String issn, tituloR, periodicidadR;
         int paginasR, numero, year;
         double precioR;

         leer.nextLine();
         System.out.print("Ingrese el ISSN de la revista: ");
         issn = leer.nextLine();
         revista.setISSN(issn);
         System.out.print("Ingrese el titulo de la revista: ");
         tituloR = leer.nextLine();
         revista.setTitulo(tituloR);
         System.out.print("Ingrese el numero de paginas de la revista: ");
         paginasR = leer.nextInt();
         revista.setPaginas(paginasR);
         System.out.print("Ingrese el numero de la revista: ");
         numero = leer.nextInt();
         revista.setNumero(numero);
         leer.nextLine();
         System.out.print("Ingrese la periodicidad de la revista: ");
         periodicidadR = leer.nextLine();
         revista.setPeriodicidad(periodicidadR);
         System.out.print("Ingrese el año de la revista: ");
         year = leer.nextInt();
         revista.setYear(year);
         System.out.print("Ingrese el precio de la revista: $");
         precioR = leer.nextDouble();
         revista.setPrecio(precioR);
         publicaciones.add(revista);
         System.out.println();
      }
      if(opc == 3){
         
         Periodico periodico = new Periodico();
         String secciones, editor, tituloP, periodicidadP;
         int paginasP;
         double precioP;
         
         leer.nextLine();
         System.out.print("Ingrese las secciones del periodico: ");
         secciones = leer.nextLine();
         periodico.setSecciones(secciones);
         System.out.print("Ingrese el titulo del peridico: ");
         tituloP = leer.nextLine();
         periodico.setTitulo(tituloP);
         System.out.print("Ingrese el editor del periodico: ");
         editor = leer.nextLine();
         periodico.setEditor(editor);
         System.out.print("Ingrese la periodicidad del periodico: ");
         periodicidadP = leer.nextLine();
         periodico.setPeriodicidad(periodicidadP);
         System.out.print("Ingrese el numero de paginas del periodico: ");
         paginasP = leer.nextInt();
         periodico.setPaginas(paginasP);
         System.out.print("Ingrese el precio del periodico: $");
         precioP = leer.nextDouble();
         periodico.setPrecio(precioP);
         publicaciones.add(periodico);
         System.out.println();
      }     
   }
   
   public static void consulta(){
      for(int x = 0; x < publicaciones.size(); x++){
         if(publicaciones.get(x) instanceof Libro){
            Libro book = new Libro();
            book = (Libro)publicaciones.get(x);
            System.out.println("- LIBRO -");
            System.out.printf("ISBN: %S\n", book.getISBN());
            System.out.printf("Titulo: %S\n", book.getTitulo());
            System.out.printf("Autor: %S\n", book.getAutor());
            System.out.printf("Edicion: %S\n", book.getEdicion());
            System.out.printf("Numero de paginas: %d\n", book.getPaginas());
            System.out.printf("Precio: $%.2f\n", book.getPrecio());
            System.out.println();
         } else if(publicaciones.get(x) instanceof Revista){
            Revista magazine = new Revista();
            magazine = (Revista)publicaciones.get(x);
            System.out.println("- REVISTA -");
            System.out.printf("ISSN: %S\n", magazine.getISSN());
            System.out.printf("Titulo: %S\n", magazine.getTitulo());
            System.out.printf("Numero: %d\n", magazine.getNumero());
            System.out.printf("Año: %d\n", magazine.getYear());
            System.out.printf("Periodicidad: %S\n", magazine.getPeriodicidad());
            System.out.printf("Numero de paginas: %d\n", magazine.getPaginas());
            System.out.printf("Precio: $%.2f\n", magazine.getPrecio());
            System.out.println();
         } else if(publicaciones.get(x) instanceof Periodico){
            Periodico newspaper = new Periodico();
            newspaper = (Periodico)publicaciones.get(x);
            System.out.println("- PERIODICO -");
            System.out.printf("Titulo: %S\n", newspaper.getTitulo());
            System.out.printf("Editor: %S\n", newspaper.getEditor());
            System.out.printf("Periodicidad: %S\n", newspaper.getPeriodicidad());
            System.out.printf("Numero de paginas: %d\n", newspaper.getPaginas());
            System.out.printf("Precio: $%.2f\n", newspaper.getPrecio());
            System.out.println();
         }
      }
   }
}