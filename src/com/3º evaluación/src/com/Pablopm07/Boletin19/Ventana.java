/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Pablopm07.Boletin19;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Pablo
 */
public class Ventana {
    JFrame marco;
    JPanel panel;
    JButton bLimpar, bPremer;
    JLabel etqNome, etqPassword;
    JTextField lTextNome, lTextPassword;
    JTextArea areaTexto;

    public void iniciar(){
        marco = new JFrame();
        panel = new JPanel();
        bLimpar = new JButton("Limpa");
        bPremer = new JButton("Preme");
        lTextNome = new JTextField();
        lTextPassword = new JTextField();
        etqNome = new JLabel("NOME:");
        etqPassword = new JLabel("PASSWORD:");
        areaTexto = new JTextArea();

        //damos las caracteristicas
        marco.setSize(750,600);
        panel.setSize(750, 750);
        panel.setLayout(null); //anulamos el layout del panel
        bLimpar.setBackground(Color.red);
        bLimpar.setBounds(500, 400, 100, 50);
        bPremer.setBounds(200, 400, 100, 50);
        bPremer.setText("Premer");
        bPremer.setToolTipText("Copia o que temos na liña de texto na area de texto");
        lTextNome.setBounds(300, 75, 300, 50);
        lTextPassword.setBounds(300, 150, 300, 50);
        areaTexto.setBounds(150, 250, 450, 100);
        areaTexto.setBackground(Color.GRAY);
        etqNome.setBounds(50, 25, 100, 150);
        etqPassword.setBounds(50, 75, 100, 200);

        panel.add(lTextNome);
        panel.add(lTextPassword);
        panel.add(areaTexto);
        panel.add(bPremer);
        panel.add(bLimpar);
        panel.add(etqNome);
        panel.add(etqPassword);

        marco.add(panel);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

