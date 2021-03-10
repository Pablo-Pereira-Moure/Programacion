package com.Programacion.boletin_18.buzon_correos;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Buzon {

    ArrayList<Correo> correosElectronicos = new ArrayList();

  
    public int numeroDeCorreos(){
        int correos = 0;
        for (Correo c:correosElectronicos){
            correos++;
        }
        return correos;
    }

   
    public Correo darParametrosCorreo(){
        String titulo = (JOptionPane.showInputDialog("Titulo do correo: "));
        String contenido = (JOptionPane.showInputDialog("Contenido do correo: "));
        boolean lidos = false;
        Correo c = new Correo(titulo, contenido, lidos);
        return c;
    }

   
    public void engade(Correo c){
        c = darParametrosCorreo();
        correosElectronicos.add(c);
    }

 
    public boolean porLer(){
        boolean correosPorLer = false;
        for (Correo c:correosElectronicos){
            if (c.isLidos() == false){
                correosPorLer = true;
            }   
        }
        return correosPorLer;
    }


    public String amosarPrimerNoLeido(){
        String correo = null;
        for (Correo c:correosElectronicos){
            if (c.isLidos() == false){
                correo = c.getTitulo() + " no ha sido leido";
                c.toString();
                c.setLidos(true);
                break;
            }
            else {
                correo = "Non quedan correos non lidos";
            }
        }
        return correo;
    }

 
    public String amosa(int k){
        String correo = null;
        k = Integer.parseInt(JOptionPane.showInputDialog("Que correo quere ler?"));
        for (int i = 0; i < correosElectronicos.size(); i++){
            if (i == k){
                correo = correosElectronicos.get(i -1).toString();
                correosElectronicos.get(i - 1).setLidos(true);
            }
            else{
                correo = "Non existe ese correo";
            }
        }
        return correo;
    }

  
    public void eliminar(int k){
        k = Integer.parseInt(JOptionPane.showInputDialog("Que correo quere eliminar?"));
        for (int i = 0; i < correosElectronicos.size(); i++){
            if (i == k){
                System.out.println("Correo '" + correosElectronicos.get(i - 1) + "' eliminado");
                correosElectronicos.remove(correosElectronicos.get(i - 1));
                break;
            }
            else if (correosElectronicos.size() < k){
                System.out.println("Non existe ese correo");
            }
        }
    }
}