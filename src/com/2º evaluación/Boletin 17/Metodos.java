
package boletin.pkg17;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class Metodos {
    
    public static void engadirLibro (ArrayList<Libros> listaLibros ){
        Libros lib=pedirLibro(" Libro engadido ");
        listaLibros.add(lib);
    }
    
    public static Libros pedirLibro (String mensaxe){
        String titulo= JOptionPane.showInputDialog(" titulo :");
        String autor= JOptionPane.showInputDialog(" autor :");
        String ISBN= JOptionPane.showInputDialog(" ISBM :");
        float prezo= Integer.parseInt(JOptionPane.showInputDialog("prezo :"));
        int unidades= Integer.parseInt(JOptionPane.showInputDialog(" unidades :"));       
        Libros al = new Libros (titulo,autor,ISBN,prezo,unidades);
        return al;
        
    }
     
    public static void eliminar (ArrayList<Libros>listaLibros){
         boolean atopado=false;
         String titulo = JOptionPane.showInputDialog("Titulo :");
        Iterator it = listaLibros.iterator();
        while(it.hasNext()){
             Libros al = (Libros)it.next();
         if (al.getTitulo().equalsIgnoreCase(titulo)){
         it.remove();
            atopado = true;
         }
           
         }
         if(atopado == false)
             System.out.println("non esta na lista");
     }
    
    public static void amosar (ArrayList<Libros> listaLibros ){
        for(Libros lib: listaLibros){
            System.out.println(lib);
        }
    }   
    
    public static void darDeBaja (ArrayList<Libros> listaLibros ){
        
    }
    
     
    public static void consultarLibro (ArrayList<Libros> listaLibros ){
        boolean atopado = false;
        String titulo  = JOptionPane.showInputDialog("titulo :");
        for(int i=0;i<listaLibros.size();i++){
            if(titulo.equalsIgnoreCase(listaLibros.get(i).getTitulo())){
                JOptionPane.showMessageDialog(null,"titulo :" +listaLibros.get(i));
                atopado = true;
            }
        }
        if(!atopado )
             System.out.println("El libro no esta en la lista");
                    
     }

    
}
