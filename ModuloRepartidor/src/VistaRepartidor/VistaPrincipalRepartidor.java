package VistaRepartidor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaPrincipalRepartidor extends JFrame {
    //inicializando
    JButton  botonIniciar, botonCreditos, botonSalir;
    JPanel panelInicio = new JPanel();
    JPanel panelBlanco = new JPanel();
    JPanel panelModulos = new JPanel();
    JLabel fondo = new JLabel();
    JLayeredPane contenedor=new JLayeredPane();

    public VistaPrincipalRepartidor() {
        this.setTitle("Hot Dogs Palace");
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setBackground(Color.white);
        panelInicio();
    }


    public void panelInicio() {

        //Panel que tendrá las etiquetas y botones
        panelInicio.setLayout(null);
        panelInicio.setVisible(true);
        panelInicio.setOpaque(false);
        panelInicio.setBounds(0,0,1500,800);
        Color colo1=new Color(255,245,238);
        panelInicio.setBackground(Color.white);

        panelBlanco.setLayout(null);
        panelBlanco.setVisible(true);
        panelBlanco.setOpaque(true);
        panelBlanco.setBounds(0,0,1400,800);
        panelBlanco.setBackground(Color.white);
        this.add(panelBlanco);
        //this.add(panelInicio);

        //boton de inicio

        botonIniciar = new JButton("ENTRAR");
        botonIniciar.setBounds(600, 570, 230, 80);
        ImageIcon img= new ImageIcon("src/Imagenes/INICIO.png");// se le pone icono a boton
        Icon i= new ImageIcon(img.getImage().getScaledInstance(botonIniciar.getWidth(), botonIniciar.getHeight(), Image.SCALE_DEFAULT));
        botonIniciar.setIcon(i);
        botonIniciar.setLayout(null);
        botonIniciar.setOpaque(true);
        botonIniciar.setBorderPainted(false);
        ImageIcon imgJugar1= new ImageIcon("src/Imagenes/INICIO2.png");// se le pone icono a boton
        Icon iconIniciar= new ImageIcon(imgJugar1.getImage().getScaledInstance(botonIniciar.getWidth(), botonIniciar.getHeight(), Image.SCALE_DEFAULT));
        botonIniciar.setRolloverIcon(iconIniciar);
        botonIniciar.setBackground(Color.white);

        botonIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panelInicio.add(botonIniciar);

        botonSalir = new JButton("Salir");
        botonSalir.setBounds(1100, 600, 200, 70);
        //botonReglas.setFont(new Font("BeaufortforLOL-Bold", Font.ITALIC, 12));
        ImageIcon imgSalir3= new ImageIcon("src/Imagenes/SALIR.png");// se le pone icono a boton
        Icon iconSalir= new ImageIcon(imgSalir3.getImage().getScaledInstance(botonSalir.getWidth(), botonSalir.getHeight(), Image.SCALE_DEFAULT));
        botonSalir.setIcon(iconSalir);
        botonSalir.setOpaque(false);
        botonSalir.setBorderPainted(false);
        botonSalir.setBackground(Color.white);

        ImageIcon imgSalirD= new ImageIcon("src/Imagenes/SALIR2.png");// se le pone icono a boton
        Icon iconSalirD= new ImageIcon(imgSalirD.getImage().getScaledInstance(botonSalir.getWidth(), botonSalir.getHeight(), Image.SCALE_DEFAULT));
        botonSalir.setRolloverIcon(iconSalirD);

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

            }
        });
        panelInicio.add(botonSalir);
        panelContenedor();

    }

   /*
    public void panelModulos(){

        //Panel que tendrá las etiquetas y botones
        panelModulos.setLayout(null);
        panelModulos.setOpaque(false);
        panelModulos.setVisible(false);
        panelModulos.setBounds(300,100,1400,500);
        Color colo1=new Color(255,245,238);
        //panelModulos.setBackground();
        this.add(panelModulos);

        JLabel modulo=new JLabel("Modulo");
        modulo.setBounds(250,0,300,150);
        ImageIcon imgmod= new ImageIcon("src/Imagenes/MODULO.png");// se le pone icono a boton
        Icon imod= new ImageIcon(imgmod.getImage().getScaledInstance(modulo.getWidth(), modulo.getHeight(), Image.SCALE_DEFAULT));
        modulo.setIcon(imod);
        panelModulos.add(modulo);

        botonAdmin = new JButton("Aministrador");
        botonAdmin.setBounds(100, 300, 300, 300);
        ImageIcon img= new ImageIcon("src/Imagenes/ADMIN.png");// se le pone icono a boton
        Icon i= new ImageIcon(img.getImage().getScaledInstance(botonAdmin.getWidth(), botonAdmin.getHeight(), Image.SCALE_DEFAULT));
        botonAdmin.setIcon(i);
        botonAdmin.setLayout(null);
        botonAdmin.setOpaque(true);
        botonAdmin.setBorderPainted(false);
        ImageIcon imgadmin= new ImageIcon("src/Imagenes/ADMIN.png");// se le pone icono a boton
        Icon iconAdmin= new ImageIcon(imgadmin.getImage().getScaledInstance(botonAdmin.getWidth(), botonAdmin.getHeight(), Image.SCALE_DEFAULT));
        botonAdmin.setRolloverIcon(iconAdmin);
        botonAdmin.setBackground(Color.white);

        botonAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdmin JframeAdmin = new VistaAdmin();
                JframeAdmin.setVisible(true);
                dispose();

                panelModulos.setVisible(false);
                panelInicio.setVisible(false);

            }
        });
        panelModulos.add(botonAdmin);

        botonOperador = new JButton("Operador");
        botonOperador.setBounds(400, 300, 300, 300);
        ImageIcon imgopera= new ImageIcon("src/Imagenes/OPERADOR.png");// se le pone icono a boton
        Icon iOpera= new ImageIcon(imgopera.getImage().getScaledInstance(botonOperador.getWidth(), botonOperador.getHeight(), Image.SCALE_DEFAULT));
        botonOperador.setIcon(iOpera);
        botonOperador.setLayout(null);//
        botonOperador.setOpaque(true);
        botonOperador.setBorderPainted(false);
        ImageIcon imgaopera= new ImageIcon("src/Imagenes/OPERADOR.png");// se le pone icono a boton
        Icon iconopera= new ImageIcon(imgaopera.getImage().getScaledInstance(botonOperador.getWidth(), botonOperador.getHeight(), Image.SCALE_DEFAULT));
        botonOperador.setRolloverIcon(iconopera);
        botonOperador.setBackground(Color.white);

        botonOperador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaOperador JframeOperador=new VistaOperador();
                JframeOperador.setVisible(true);
                dispose();

                panelModulos.setVisible(false);
                panelInicio.setVisible(false);

            }
        });
        panelModulos.add(botonOperador);

        botonCocina = new JButton("Cocina");
        botonCocina.setBounds(700, 300, 300, 300);
        ImageIcon imgococina= new ImageIcon("src/Imagenes/COCINA.png");// se le pone icono a boton
        Icon iCocina= new ImageIcon(imgococina.getImage().getScaledInstance(botonCocina.getWidth(), botonCocina.getHeight(), Image.SCALE_DEFAULT));
        botonCocina.setIcon(iCocina);
        botonCocina.setLayout(null);
        botonCocina.setOpaque(true);
        botonCocina.setBorderPainted(false);
        ImageIcon imgaCocina= new ImageIcon("src/Imagenes/COCINA.png");// se le pone icono a boton
        Icon iconoCocina= new ImageIcon(imgaCocina.getImage().getScaledInstance(botonCocina.getWidth(), botonCocina.getHeight(), Image.SCALE_DEFAULT));
        botonCocina.setRolloverIcon(iconoCocina);
        botonCocina.setBackground(Color.white);

        botonCocina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaCocina JframeCocina=new VistaCocina();
                JframeCocina.setVisible(true);
                dispose();

                panelModulos.setVisible(false);
                panelInicio.setVisible(false);


            }
        });
        panelModulos.add(botonCocina);




        botonRepartidor = new JButton("Repartidor");
        botonRepartidor.setBounds(1000, 300, 300, 300);
        ImageIcon imgorRepartidor= new ImageIcon("src/Imagenes/REPARTIDOR.png");// se le pone icono a boton
        Icon iRepartidor= new ImageIcon(imgorRepartidor.getImage().getScaledInstance(botonRepartidor.getWidth(), botonRepartidor.getHeight(), Image.SCALE_DEFAULT));
        botonRepartidor.setIcon(iRepartidor);
        botonRepartidor.setLayout(null);
        botonRepartidor.setOpaque(true);
        botonRepartidor.setBorderPainted(false);
        ImageIcon imgRepartidor= new ImageIcon("src/Imagenes/REPARTIDOR.png");// se le pone icono a boton
        Icon iconoRepartidor= new ImageIcon(imgRepartidor.getImage().getScaledInstance(botonRepartidor.getWidth(), botonRepartidor.getHeight(), Image.SCALE_DEFAULT));
        botonRepartidor.setRolloverIcon(iconoRepartidor);
        botonRepartidor.setBackground(Color.white);

        botonRepartidor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelModulos.setVisible(false);
                botonAdmin.setVisible(false);
                botonRepartidor.setVisible(false);
                botonCocina.setVisible(false);
                botonOperador.setVisible(false);

                //  panel.setVisible(true);

            }
        });
        panelModulos.add(botonRepartidor);
    }

    */

    public void panelContenedor(){
        ImageIcon imagen =(new ImageIcon("img.png"));
        fondo.setIcon(imagen);
        fondo.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        fondo.setBounds(100,40,1400,600);
        //fondo.setBounds(100,0,1000,70);



        contenedor.add(panelBlanco,Integer.valueOf(0));
        contenedor.add(fondo,Integer.valueOf(1));
        contenedor.add(panelInicio,Integer.valueOf(2));


        this.getContentPane().add(contenedor);
        this.setSize(getMaximumSize());
        //this.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


}
