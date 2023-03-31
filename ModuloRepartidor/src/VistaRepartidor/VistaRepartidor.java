package VistaRepartidor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaRepartidor extends JFrame {
    JLabel fondo = new JLabel();
    JLayeredPane contenedor=new JLayeredPane();
    JPanel panelInicio = new JPanel();
    JPanel panelBlanco = new JPanel();

    public VistaRepartidor(){
        this.setTitle("Hot Dogs Palace");
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setBackground(Color.white);
        panelRegistro();
    }

    public void panelRegistro(){
        //Panel que tendrá las etiquetas y botones
        panelBlanco.setLayout(null);
        panelBlanco.setVisible(true);
        panelBlanco.setOpaque(true);
        panelBlanco.setBounds(160,80,400,500);
        panelBlanco.setBackground(Color.white);


        JLabel logo=new JLabel("Logo");
        logo.setBounds(110,10,150,150);
        ImageIcon imgLogo= new ImageIcon("src/Imagenes/logoPerrito.png");// se le pone icono a boton
        Icon ilogo= new ImageIcon(imgLogo.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(ilogo);
        panelBlanco.add(logo);

        JLabel adminText=new JLabel("REPARTIDOR");
        adminText.setBackground(Color.black);
        adminText.setFont(new Font("Arial", Font.BOLD, 20));
        adminText.setBounds(90,140,200,100);
        panelBlanco.add(adminText);


        JLabel nombreUsuario=new JLabel("Usuario");
        nombreUsuario.setBounds(40,180,200,100);
        panelBlanco.add(nombreUsuario);

        JTextField txusuario=new JTextField();
        txusuario.setBounds(30,250,300,40);
        panelBlanco.add(txusuario);

        JLabel contraseña=new JLabel("Contraseña");
        contraseña.setBounds(40,290,200,100);
        panelBlanco.add(contraseña);

        JTextField txcontraseña=new JTextField();
        txcontraseña.setBounds(30,360,300,40);
        txcontraseña.setBorder(null);;
        panelBlanco.add(txcontraseña);

        JButton botonRegistrar=new JButton();
        botonRegistrar.setBounds(140, 420, 100, 50);
        ImageIcon img= new ImageIcon("src/Imagenes/INGRESAR.png");// se le pone icono a boton
        Icon i= new ImageIcon(img.getImage().getScaledInstance(botonRegistrar.getWidth(), botonRegistrar.getHeight(), Image.SCALE_DEFAULT));
        botonRegistrar.setIcon(i);
        botonRegistrar.setLayout(null);
        botonRegistrar.setOpaque(true);
        botonRegistrar.setBorderPainted(false);
        ImageIcon imgadmin= new ImageIcon("src/Imagenes/INGRESAR2.png");// se le pone icono a boton
        Icon iconAdmin= new ImageIcon(imgadmin.getImage().getScaledInstance(botonRegistrar.getWidth(), botonRegistrar.getHeight(), Image.SCALE_DEFAULT));
        botonRegistrar.setRolloverIcon(iconAdmin);
        botonRegistrar.setBackground(Color.white);

        botonRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        panelBlanco.add(botonRegistrar);

        //se llama al contenedor
        contenedor();
    }

    public void contenedor(){
        ImageIcon imagen =new ImageIcon("src/Imagenes/loginRepartidor.png");
        fondo.setIcon(imagen);
        fondo.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        //fondo.setBounds(100,40,1400,600);

        contenedor.add(panelBlanco,Integer.valueOf(5));
        contenedor.add(fondo,Integer.valueOf(4));
        //  contenedor.add(panelInicio,Integer.valueOf(2));

        this.getContentPane().add(contenedor);
        this.setSize(getMaximumSize());
        this.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
