package com.Programacion.boletin_18.buzon_correos;


public class Correo {
    private String titulo;
    private String contenido;
    private boolean lidos;

   
    public Correo(String titulo, String contenido, boolean lidos) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.lidos = lidos;
    }

    public Correo() {
        
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getContenido() {
        return contenido;
    }

    public boolean isLidos() {
        return lidos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setLidos(boolean lidos) {
        this.lidos = lidos;
    }

    @Override
    public String toString() {
        return "Correo {" + "titulo = " + titulo + ", contenido = " + contenido + ", lidos = " + lidos + '}';
    }
}