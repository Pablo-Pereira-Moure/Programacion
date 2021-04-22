package com.Pablopm07.Boletin20;

import javax.swing.*;
import java.awt.*;

public class Ventana {
    JFrame marco;
    JPanel panel1, panel2;
    JButton bLimpar, bPremer, bBoton;
    JLabel etqNome, etqPassword;
    JTextField lTextNome, lTextPassword;
    JTextArea areaTexto;
    JList textoLista;
    DefaultListModel modeloLista;

    public void iniciar(){
        marco = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        textoLista = new JList();
        modeloLista = new DefaultListModel();
        bLimpar = new JButton("Limpa");
        bPremer = new JButton("Preme");
        bBoton = new JButton("Boton");
        lTextNome = new JTextField();
        lTextPassword = new JTextField();
        etqNome = new JLabel("NOME:");
        etqPassword = new JLabel("PASSWORD:");
        areaTexto = new JTextArea();

        //Marco
        marco.setSize(750,750);
        marco.add(panel1);
        marco.add(panel2);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

        //Primer panel
        panel1.setSize(750, 350);
        panel1.setBorder(BorderFactory.createMatteBorder(1, 1, 1,1, Color.black));
        panel1.setLayout(null);
        bLimpar.setBackground(Color.red);
        bLimpar.setBounds(500, 270, 100, 50);
        bPremer.setBounds(200, 270, 100, 50);
        bPremer.setText("Premer");
        bPremer.setToolTipText("Copia o que temos na liña de texto na area de texto");
        lTextNome.setBounds(300, 75, 300, 50);
        lTextPassword.setBounds(300, 150, 300, 50);
        etqNome.setBounds(50, 25, 100, 150);
        etqPassword.setBounds(50, 75, 100, 200);


        //Segundo panel
        panel2.setSize(750, 400);
        panel2.setBorder(BorderFactory.createMatteBorder(1, 1, 1,1, Color.black));
        panel2.setLayout(null);
        bBoton.setBounds(300, 500, 100, 50);
        bBoton.setText("Boton");
        areaTexto.setBounds(450, 400, 200, 250);
        areaTexto.setBackground(Color.CYAN);
        textoLista.setBounds(50, 400, 200, 250);
        textoLista.setBackground(Color.lightGray);
        modeloLista.addElement("ElementoLista1");
        modeloLista.addElement("ElementoLista2");
        modeloLista.addElement("ElementoLista3");
        textoLista.setModel(modeloLista);

        //Añadimos componentes
        panel1.add(lTextNome);
        panel1.add(lTextPassword);
        panel1.add(bPremer);
        panel1.add(bLimpar);
        panel1.add(etqNome);
        panel1.add(etqPassword);

        panel2.add(areaTexto);
        panel2.add(bBoton);
        panel2.add(textoLista);
    }
}
