
package boletin.pkg17;


public class Libros {
    private String titulo;
    private String autor;
    private String ISBN;
    private float prezo;
    private int unidades;

    public Libros(){
       
   }
    
    public Libros(String titulo, String autor, String IBSM, float prezo,int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
 
    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getISBN(){
        return ISBN;
    }

    public void setIBSN(String ISBN){
        this.ISBN = ISBN;
    }

    public float getPrezo(){
        return prezo;
    }

    public void setPrezo(float prezo){
        this.prezo = prezo;
    }

    public int getUnidades(){
        return unidades;
    }

    public void setUnidades(int unidades){
        this.unidades = unidades;
    }
   
}