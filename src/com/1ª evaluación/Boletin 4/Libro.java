
package boletin4;

public class Libro {
    private String titulo, autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    //Constructor por defecro
    public Libro(){
    }
    //Constructor que inicializa
    public Libro(String t, String au, int an, short nump, float val){
    titulo=t;
    autor=au;
    ano=an;
    numPaginas=nump;
    valoracion=val;
    }
    //metodos de acceso atributos
    public void setTitulo(String t){
    titulo=t;
    }
    public String getTitulo(){  
    return titulo;
    }
    public void setAutor(String au){
    autor=au;
    }
    public String getAutor(){
    return autor;
    }
    public void setAno(int an){
    ano=an;
    }
    public int getAno(){
    return ano;
    }
    public void setNumPaginas(short nump){
    numPaginas=nump;
    }
    public short getNumPaginas(){
    return numPaginas;
    }
    public void setValoracion(float val){
    valoracion=val;
    }
    public float getValoracion(){
    return valoracion;
    }
    public void amosar(){
    System.out.println("Titilo="+titulo+"\n Autor="+autor+"\n Año="+ano+"\n NºPaginas="+
    numPaginas+"\n Valoracion="+valoracion);
    }
}