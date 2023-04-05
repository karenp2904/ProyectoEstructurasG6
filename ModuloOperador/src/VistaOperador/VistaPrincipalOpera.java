package VistaOperador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaPrincipalOpera extends JFrame {
    /*
    Esta ventana tendra la funcionalidad UNICAMENTE de dar el inicio al programa, muestra el logo con boton par acceder a modulo
     */
    //inicializando
    JButton  botonIniciar, botonCreditos, botonSalir; //botones a usar
    JPanel panelInicio = new JPanel();//panel para el inicio
    JPanel panelBlanco = new JPanel();//panel para el fondo blaco de la ventana

    JLabel fondo = new JLabel();//fondo "The hot dog palace"
    JLayeredPane contenedor=new JLayeredPane();//encargado de las capas en la ventana -contenedor

    //constructor donde se definen las propiedades de la ventana
    public VistaPrincipalOpera() {
        this.setTitle("Hot Dogs Palace");//titulo
        this.setExtendedState(MAXIMIZED_BOTH);//para el tamaño
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);//para la visibilidad
        this.setBackground(Color.white);
        panelInicio(); //se llama al metodo que que tiene el panel inicial
    }


    //panel para el inicio del modulo
    public void panelInicio() {

        //Panel que tendrá las etiquetas y botones
        panelInicio.setLayout(null);
        panelInicio.setVisible(true);//para la visibilidad
        panelInicio.setOpaque(false);//se da la ubicacion y el tamaño
        panelInicio.setBounds(0,0,1500,800);
        Color colo1=new Color(255,245,238);
        panelInicio.setBackground(Color.white);

        panelBlanco.setLayout(null);
        panelBlanco.setVisible(true);//para la visibilidad
        panelBlanco.setOpaque(true);
        panelBlanco.setBounds(0,0,1400,800);//se da la ubicacion y el tamaño
        panelBlanco.setBackground(Color.white);
        this.add(panelBlanco);//se agrega a la ventana
        //this.add(panelInicio);

        //boton de inicio
        botonIniciar = new JButton("ENTRAR");
        botonIniciar.setBounds(600, 570, 230, 80);//se da la ubicacion y el tamaño
        ImageIcon img= new ImageIcon("ModuloOperador/src/Imagenes/INICIO.png");// se le pone icono a boton
        Icon i= new ImageIcon(img.getImage().getScaledInstance(botonIniciar.getWidth(), botonIniciar.getHeight(), Image.SCALE_DEFAULT));
        botonIniciar.setIcon(i);//se define el icono
        botonIniciar.setLayout(null);
        botonIniciar.setOpaque(true);
        botonIniciar.setBorderPainted(false);
        ImageIcon imgJugar1= new ImageIcon("ModuloOperador/src/Imagenes/INICIO2.png");// se le pone icono a boton
        Icon iconIniciar= new ImageIcon(imgJugar1.getImage().getScaledInstance(botonIniciar.getWidth(), botonIniciar.getHeight(), Image.SCALE_DEFAULT));
        botonIniciar.setRolloverIcon(iconIniciar);//esta propiedad permite que al pasar el mouse se cambie la imagen del boton
        botonIniciar.setBackground(Color.white);

        botonIniciar.addActionListener(new ActionListener() {//al oprimir el boton se ejecuta una accion
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaOperador JframeOperador=new VistaOperador();//se llama a la ventana del operador
                JframeOperador.panelLogin();//metodo para el registro
                dispose();//se cierra la ventana

                panelInicio.setVisible(false);
            }
        });
        panelInicio.add(botonIniciar);

        //boton para salir
        botonSalir = new JButton("Salir");
        botonSalir.setBounds(1100, 600, 200, 70);
        //botonReglas.setFont(new Font("BeaufortforLOL-Bold", Font.ITALIC, 12));
        ImageIcon imgSalir3= new ImageIcon("ModuloOperador/src/Imagenes/SALIR.png");// se le pone icono a boton
        Icon iconSalir= new ImageIcon(imgSalir3.getImage().getScaledInstance(botonSalir.getWidth(), botonSalir.getHeight(), Image.SCALE_DEFAULT));
        botonSalir.setIcon(iconSalir);
        botonSalir.setOpaque(false);
        botonSalir.setBorderPainted(false);
        botonSalir.setBackground(Color.white);
        ImageIcon imgSalirD= new ImageIcon("ModuloOperador/src/Imagenes/SALIR2.png");// se le pone icono a boton
        Icon iconSalirD= new ImageIcon(imgSalirD.getImage().getScaledInstance(botonSalir.getWidth(), botonSalir.getHeight(), Image.SCALE_DEFAULT));
        botonSalir.setRolloverIcon(iconSalirD);

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); //se cierra la ventana
            }
        });
        panelInicio.add(botonSalir);
        panelContenedor();

    }

    //metodo para el contenedor
    public void panelContenedor(){
        //imagen de fondo
        ImageIcon imagen =(new ImageIcon("ModuloOperador/src/Imagenes/Logo.jpeg"));
        fondo.setIcon(imagen);
        fondo.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        fondo.setBounds(100,40,1400,600);
        //fondo.setBounds(100,0,1000,70);

        //implementacion de las capas (menor numero más al fondo - mayor numero más adelante)
        contenedor.add(panelBlanco,Integer.valueOf(0));
        contenedor.add(fondo,Integer.valueOf(1));
        contenedor.add(panelInicio,Integer.valueOf(2));

        this.getContentPane().add(contenedor);//se agrega el contenedor a la ventana
        this.setSize(getMaximumSize());//tamaño maximo
        //this.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
