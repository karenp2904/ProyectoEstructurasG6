package Admin.VistaAdmin;

import Admin.VistaAdmin.VistaAdmin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaPrincipal extends JFrame {
    //inicializando
    JButton  botonIniciar, botonCreditos, botonSalir;
    JPanel panelInicio = new JPanel();
    JPanel panelBlanco = new JPanel();
    JPanel panelModulos = new JPanel();
    JLabel fondo = new JLabel();
    JLayeredPane contenedor=new JLayeredPane();

    public VistaPrincipal() {
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
        ImageIcon img= new ImageIcon("ModuloCocina/src/Imagenes/INICIO.png");// se le pone icono a boton
        Icon i= new ImageIcon(img.getImage().getScaledInstance(botonIniciar.getWidth(), botonIniciar.getHeight(), Image.SCALE_DEFAULT));
        botonIniciar.setIcon(i);
        botonIniciar.setLayout(null);
        botonIniciar.setOpaque(true);
        botonIniciar.setBorderPainted(false);
        ImageIcon imgJugar1= new ImageIcon("ModuloCocina/src/Imagenes/INICIO2.png");// se le pone icono a boton
        Icon iconIniciar= new ImageIcon(imgJugar1.getImage().getScaledInstance(botonIniciar.getWidth(), botonIniciar.getHeight(), Image.SCALE_DEFAULT));
        botonIniciar.setRolloverIcon(iconIniciar);
        botonIniciar.setBackground(Color.white);

        botonIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdmin admin=new VistaAdmin();
                admin.panelRegistro();
                dispose();

                panelModulos.setVisible(false);
                panelInicio.setVisible(false);
                /*
                panelInicio.setVisible(false);
                fondo.setOpaque(false);
                fondo.setVisible(false);
                panelModulos();
                panelModulos.setVisible(true);
                panelBlanco.setVisible(true);

                contenedor.add(botonAdmin,Integer.valueOf(3));
                contenedor.add(botonOperador,Integer.valueOf(3));
                contenedor.add(botonRepartidor,Integer.valueOf(3));
                contenedor.add(botonCocina,Integer.valueOf(3));
                contenedor.add(panelModulos,Integer.valueOf(4));
                */

            }
        });
        panelInicio.add(botonIniciar);

        botonSalir = new JButton("Salir");
        botonSalir.setBounds(1100, 600, 200, 70);
        //botonReglas.setFont(new Font("BeaufortforLOL-Bold", Font.ITALIC, 12));
        ImageIcon imgSalir3= new ImageIcon("ModuloCocina/src/Imagenes/SALIR.png");// se le pone icono a boton
        Icon iconSalir= new ImageIcon(imgSalir3.getImage().getScaledInstance(botonSalir.getWidth(), botonSalir.getHeight(), Image.SCALE_DEFAULT));
        botonSalir.setIcon(iconSalir);
        botonSalir.setOpaque(false);
        botonSalir.setBorderPainted(false);
        botonSalir.setBackground(Color.white);

        ImageIcon imgSalirD= new ImageIcon("ModuloCocina/src/Imagenes/SALIR2.png");// se le pone icono a boton
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


    public void panelContenedor(){
        ImageIcon imagen =(new ImageIcon("ModuloCocina/src/Imagenes/Logo.jpeg"));
        fondo.setIcon(imagen);
        fondo.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        fondo.setBounds(100,20,1400,600);
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
