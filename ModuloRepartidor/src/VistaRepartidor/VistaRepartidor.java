package VistaRepartidor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

public class VistaRepartidor extends JFrame {
    JLabel fondo = new JLabel();
    JLayeredPane contenedor=new JLayeredPane();
    JPanel panelInicio = new JPanel();
    JPanel panelBlanco = new JPanel();
    JPanel panelPedidos=new JPanel();
    JPanel panelRuta=new JPanel();
    Icon  iconoEntregado,iconoEncamino,iconoesperando;
    int contador=1;
    public VistaRepartidor(){
        this.setTitle("Hot Dogs Palace");
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setBackground(Color.white);
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
        ImageIcon imgLogo= new ImageIcon("ModuloRepartidor/src/Imagenes/logoPerrito.png");// se le pone icono a boton
        Icon ilogo= new ImageIcon(imgLogo.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(ilogo);
        panelBlanco.add(logo);

        JLabel adminText=new JLabel("REPARTIDOR");
        adminText.setBackground(Color.black);
        adminText.setFont(new Font("Arial", Font.BOLD, 20));
        adminText.setBounds(120,140,200,100);
        panelBlanco.add(adminText);


        JLabel nombreUsuario=new JLabel("Usuario");
        nombreUsuario.setBounds(40,180,200,100);
        panelBlanco.add(nombreUsuario);

       String usuario=verificarUsuario();

        JLabel contraseña=new JLabel("Contraseña");
        contraseña.setBounds(40,290,200,100);
        panelBlanco.add(contraseña);

       String validarContraseña=verificarContraseña();

        JButton botonRegistrar=new JButton();
        botonRegistrar.setBounds(140, 420, 100, 50);
        ImageIcon img= new ImageIcon("ModuloRepartidor/src//Imagenes/INGRESAR.png");// se le pone icono a boton
        Icon i= new ImageIcon(img.getImage().getScaledInstance(botonRegistrar.getWidth(), botonRegistrar.getHeight(), Image.SCALE_DEFAULT));
        botonRegistrar.setIcon(i);
        botonRegistrar.setLayout(null);
        botonRegistrar.setOpaque(true);
        botonRegistrar.setBorderPainted(false);
        ImageIcon imgadmin= new ImageIcon("ModuloRepartidor/src//Imagenes/INGRESAR2.png");// se le pone icono a boton
        Icon iconAdmin= new ImageIcon(imgadmin.getImage().getScaledInstance(botonRegistrar.getWidth(), botonRegistrar.getHeight(), Image.SCALE_DEFAULT));
        botonRegistrar.setRolloverIcon(iconAdmin);
        botonRegistrar.setBackground(Color.white);

        botonRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelBlanco.setVisible(false);
                panelInicio.setVisible(false);
                panelPedidos.setVisible(true);
                panelRutas();
                contenedor.add(panelPedidos,Integer.valueOf(7));

            }
        });
        panelBlanco.add(botonRegistrar);

        //se llama al contenedor
        contenedor();

        ImageIcon imagen =new ImageIcon("ModuloRepartidor/src/Imagenes/loginRepartidor.png");
        fondo.setIcon(imagen);
        fondo.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        //fondo.setBounds(100,40,1400,600);
        this.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        contenedor.add(panelBlanco,Integer.valueOf(5));
        contenedor.add(fondo,Integer.valueOf(4));
    }
    public String verificarUsuario(){
        JTextField txusuario=new JTextField();
        txusuario.setBounds(30,250,300,40);
        panelBlanco.add(txusuario);
        String usuario=txusuario.getText();
        return usuario;
    }
    public String verificarContraseña(){
        JTextField txcontraseña=new JTextField();
        txcontraseña.setBounds(30,360,300,40);
        panelBlanco.add(txcontraseña);
        String contraseña=txcontraseña.getText();
        return contraseña;
    }

    public void panelRutas(){

        panelPedidos.setLayout(null);
        panelPedidos.setVisible(true);
        panelPedidos.setOpaque(true);
        panelPedidos.setBounds(650, 200, 550, 400);
        panelPedidos.setBackground(Color.white);

        panelRuta.setLayout(null);
        panelRuta.setVisible(true);
        panelRuta.setOpaque(true);
        panelRuta.setBounds(100, 200, 500, 400);
        panelRuta.setBackground(Color.lightGray);

        //letrero del registro de clinetes en el panel
        JLabel letreroEntrega = new JLabel(" ENTREGA DE PEDIDOS");
        letreroEntrega.setBackground(Color.black);
        letreroEntrega.setFont(new Font("Arial", Font.BOLD, 40));
        letreroEntrega.setBounds(400, -20, 600, 200);

        //registro con la informacion del cliente
        //Label del nombre
        JLabel nombretext = new JLabel("PEDIDOS: ");
        nombretext.setBackground(Color.black);
        nombretext.setFont(new Font("Arial", Font.BOLD, 20));
        nombretext.setBounds(200, -40, 200, 100);
        panelPedidos.add(nombretext);

        JLabel fondoLetras=new JLabel();
        ImageIcon imagen =new ImageIcon("ModuloRepartidor/src/Imagenes/fondoLetras.png");
        fondoLetras.setIcon(imagen);
        fondoLetras.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        //fondo.setBounds(100,40,1400,600);
        this.setSize(imagen.getIconWidth(), imagen.getIconHeight());

        contenedor.add(letreroEntrega,Integer.valueOf(7));
        contenedor.add(fondoLetras,Integer.valueOf(5));
        contenedor.add(panelRuta,Integer.valueOf(6));
        contenedor.add(panelPedidos,Integer.valueOf(7));

        editarEntregaPedidos("Salchipapa");
        editarEntregaPedidos("Perro caliente");
        editarEntregaPedidos("Perro Extra Grande");
        editarEntregaPedidos("Salchipapa");
    }

    public void editarRutaEntre(){
        //Grafo
    }

    JLabel pedidosText=new JLabel();
    int yLabel=20; //posicion y de la lista de pedidos para un orden en el label
    public void editarEntregaPedidos(String pedidoAEntregar){
        pedidosText=new JLabel(pedidoAEntregar);
        pedidosText.setBounds(20,yLabel,300,100);
        yLabel=yLabel+70;//se edita la altura del texto
        pedidosText.setFont(new Font("Serif", Font.PLAIN, 20));
        panelPedidos.add(pedidosText);
        añadirBotones();
    }

    int yBotones=30;
    public void añadirBotones(){
        contador=1;
        JButton botonEstado=new JButton(); //boton para ingresar pedido
        botonEstado.setBounds(400, yBotones, 150, 60);
        botonEstado.setBackground(Color.white);
        yBotones=yBotones+70;
        //se edita la altura del texto
        //cuando el boton dice esperando
        ImageIcon imgenEsperando= new ImageIcon("ModuloRepartidor/src/Imagenes/esperando.png");// se le pone icono a boton
        iconoesperando= new ImageIcon(imgenEsperando.getImage().getScaledInstance(botonEstado.getWidth(), botonEstado.getHeight(), Image.SCALE_DEFAULT));
        botonEstado.setIcon(imgenEsperando);
        botonEstado.setLayout(null);
        botonEstado.setOpaque(false);
        botonEstado.setBorderPainted(false);

        //cuando el boton dice encamino
        ImageIcon imEncamino= new ImageIcon("ModuloRepartidor/src/Imagenes/encamino.png");// se le pone icono a boton
        iconoEncamino= new ImageIcon(imEncamino.getImage().getScaledInstance(botonEstado.getWidth(), botonEstado.getHeight(), Image.SCALE_DEFAULT));

        //cuando el boton dice entregado
        ImageIcon imgEntregado= new ImageIcon("ModuloRepartidor/src/Imagenes/encamino.png");// se le pone icono a boton
        iconoEntregado = new ImageIcon(imgEntregado.getImage().getScaledInstance(botonEstado.getWidth(), botonEstado.getHeight(), Image.SCALE_DEFAULT));


        botonEstado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contador++;
              if (contador == 2) {
                    botonEstado.setIcon(imEncamino);
              } else if (contador == 3) {
                    botonEstado.setIcon(imgEntregado);
                }
            }
        });


        panelPedidos.add(botonEstado);


    }

    public void contenedor(){

        //  contenedor.add(panelInicio,Integer.valueOf(2));

        this.getContentPane().add(contenedor);
        this.setSize(getMaximumSize());

        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
