package Cocina.VistaCocina;

import Estructuras.APriorityQueue.PriorityQueue;
import Servidor.Dominio.Pedido;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaCocina extends JFrame{
    JLabel fondo = new JLabel();
    JLayeredPane contenedor=new JLayeredPane();
    JPanel panelCentral=new JPanel();//panel para la pantalla de despacho
    JPanel panelBlanco = new JPanel();//panel para el registro
    JPanel panelDespacho=new JPanel();//panel para la impresion de la cola de pedidos
    int y;
    public VistaCocina(){
        this.setTitle("Hot Dogs Palace");
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setBackground(Color.white);
        y=30; //coordenadas de la pantalla de despacho
    }
/*
    public void panelRegistro(){
        //Panel que tendrá las etiquetas y botones
        panelBlanco.setLayout(null);
        panelBlanco.setVisible(true);
        panelBlanco.setOpaque(true);
        panelBlanco.setBounds(160,80,400,500);
        panelBlanco.setBackground(Color.white);


        JLabel logo=new JLabel("Logo");
        logo.setBounds(110,10,150,150);
        ImageIcon imgLogo= new ImageIcon("ModuloCocina/src/Imagenes/logoPerrito.png");// se le pone icono a boton
        Icon ilogo= new ImageIcon(imgLogo.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(ilogo);
        panelBlanco.add(logo);

        JLabel cocinaText=new JLabel("COCINA");
        cocinaText.setBackground(Color.black);
        cocinaText.setFont(new Font("Arial", Font.BOLD, 20));
        cocinaText.setBounds(120,140,200,100);
        panelBlanco.add(cocinaText);


        JLabel nombreUsuario=new JLabel("Usuario");
        nombreUsuario.setBounds(40,180,200,100);
        panelBlanco.add(nombreUsuario);

       String usuario=registroNombreUsuario();

        JLabel contraseña=new JLabel("Contraseña");
        contraseña.setBounds(40,290,200,100);
        panelBlanco.add(contraseña);

        String contraseñaa=registroContraseñaUsuario();

        JButton botonRegistrar=new JButton();
        botonRegistrar.setBounds(140, 420, 100, 50);
        ImageIcon img= new ImageIcon("ModuloCocina/src/Imagenes/INGRESAR.png");// se le pone icono a boton
        Icon i= new ImageIcon(img.getImage().getScaledInstance(botonRegistrar.getWidth(), botonRegistrar.getHeight(), Image.SCALE_DEFAULT));
        botonRegistrar.setIcon(i);
        botonRegistrar.setLayout(null);
        botonRegistrar.setOpaque(true);
        botonRegistrar.setBorderPainted(false);
        ImageIcon imgadmin= new ImageIcon("ModuloCocina/src/Imagenes/INGRESAR2.png");// se le pone icono a boton
        Icon iconAdmin= new ImageIcon(imgadmin.getImage().getScaledInstance(botonRegistrar.getWidth(), botonRegistrar.getHeight(), Image.SCALE_DEFAULT));
        botonRegistrar.setRolloverIcon(iconAdmin);
        botonRegistrar.setBackground(Color.white);

        botonRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelBlanco.setVisible(false);
                fondo.setVisible(false);
                panelCentral.setVisible(true);
                panelDespachoPedidos();

                contenedor.add(panelCentral,Integer.valueOf(6));


            }
        });
        panelBlanco.add(botonRegistrar);

        //se llama al contenedor
        contenedor();

        ImageIcon imagen =new ImageIcon("ModuloCocina/src/Imagenes/loginCocina.png");
        fondo.setIcon(imagen);
        fondo.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        //fondo.setBounds(100,40,1400,600);

        contenedor.add(panelBlanco,Integer.valueOf(5));
        contenedor.add(fondo,Integer.valueOf(4));
        //  contenedor.add(panelInicio,Integer.valueOf(2));
        this.setSize(imagen.getIconWidth(), imagen.getIconHeight());
    }
*/
    public String registroNombreUsuario(){
        JTextField txusuario=new JTextField();
        txusuario.setBounds(30,250,300,50);
        panelBlanco.add(txusuario);
        String usuario=txusuario.getText();
        return usuario;
    }

    public String registroContraseñaUsuario(){
        JTextField txcontraseña=new JTextField();
        txcontraseña.setBounds(30,360,300,50);
        panelBlanco.add(txcontraseña);
        String contraseña=txcontraseña.getText();
        return contraseña;
    }

    public void panelDespachoPedidos(){

        //panel de color blanco
        panelCentral.setLayout(null);
        panelCentral.setVisible(true);
        panelCentral.setOpaque(true);
        panelCentral.setBounds(0,0,1400,600);
        panelCentral.setBackground(Color.white);

        JLabel titulo=new JLabel("PANTALLA DE PEDIDOS");
        titulo.setBackground(new Color(0,0,0));
        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        titulo.setBounds(420,70,600,100);
        panelCentral.add(titulo);

        JLabel pedido=new JLabel();
        pedido.setBackground(Color.black);
        pedido.setIcon(new ImageIcon("src/Imagenes/pedido.png"));
        pedido.setFont(new Font("Arial", Font.BOLD, 30));
        pedido.setBounds(400,200,200,75);


        JLabel puesto=new JLabel();
        puesto.setBackground(Color.black);
        puesto.setIcon(new ImageIcon("src/Imagenes/puesto.png"));
        puesto.setFont(new Font("Arial", Font.BOLD, 30));
        puesto.setBounds(600,200,200,75);


        //Probandoooo
        String prueba;
        prueba="perro caliente";
        prueba="perro caliente";
        prueba="perro caliente";

        panelDespacho.setLayout(null);
        panelDespacho.setVisible(true);
        panelDespacho.setOpaque(true);
        panelDespacho.setBounds(350,240,600,400);
        panelDespacho.setBackground(new Color(217, 217, 217));

        JLabel fondoLetras=new JLabel();
        ImageIcon imagen =new ImageIcon("src/Imagenes/fondoLetras.png");
        fondoLetras.setIcon(imagen);
        fondoLetras.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        this.setSize(imagen.getIconWidth(), imagen.getIconHeight());

        contenedor.add(fondoLetras,Integer.valueOf(6));
        contenedor.add(titulo,Integer.valueOf(7));
        contenedor.add(puesto,Integer.valueOf(8));
        contenedor.add(pedido,Integer.valueOf(8));
        contenedor.add(panelDespacho,Integer.valueOf(7));

        editarColaDeDespacho(new Pedido("Perro caliente", "15" ,"3"), 5);
        editarColaDeDespacho(new Pedido("Perro caliente", "15" ,"3"), 5);
        editarColaDeDespacho(new Pedido("Perro caliente", "15" ,"3"), 5);
        editarColaDeDespacho(new Pedido("Perro caliente", "15" ,"3"), 5);
        editarColaDeDespacho(new Pedido("Perro caliente", "15" ,"3"), 5);


        contenedor();
    }

    public void editarColaDeDespacho(Pedido pedido, int puestoTrabajo){
        JLabel titulo=new JLabel(pedido.getProductoNombre()+ pedido.getCantidad());
        titulo.setBackground(Color.black);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(50,y-5,600,100);
        panelDespacho.add(titulo);

        JLabel puesto=new JLabel(String.valueOf(puestoTrabajo));
        puesto.setBackground(Color.black);
        puesto.setFont(new Font("Arial", Font.BOLD, 20));
        puesto.setBounds(250,y-5,600,100);
        panelDespacho.add(puesto);

        JButton botonPedidoListo=new JButton();
        botonPedidoListo.setBounds(400, y+15, 150, 50);
        ImageIcon img= new ImageIcon("src/Imagenes/entregado.png");// se le pone icono a boton
        // Icon i= new ImageIcon(img.getImage().getScaledInstance(botonPedidoListo.getWidth(), botonPedidoListo.getHeight(), Image.SCALE_DEFAULT));
        botonPedidoListo.setIcon(img);
        botonPedidoListo.setLayout(null);
        botonPedidoListo.setBackground(new Color(217, 217, 217));
        botonPedidoListo.setOpaque(false);
        botonPedidoListo.setBorderPainted(false);
        boolean estado=pedidoEntregado(false); //dice que no esta listo el pedido
        botonPedidoListo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon imgadmin= new ImageIcon("src/Imagenes/entregado1.png");// se le pone icono a boton
                //  Icon iconAdmin= new ImageIcon(imgadmin.getImage().getScaledInstance(botonPedidoListo.getWidth(), botonPedidoListo.getHeight(), Image.SCALE_DEFAULT));
                botonPedidoListo.setIcon(imgadmin);
                botonPedidoListo.setBackground(new Color(217, 217, 217));
                boolean estado=pedidoEntregado(true);
            }
        });
        panelDespacho.add(botonPedidoListo);

        y+=50;//se le agrega distancia a y para la ubicacion del texto
     }



    public boolean pedidoEntregado(boolean estado){
        return estado;
    }


    public void contenedor(){
        this.getContentPane().add(contenedor);
        this.setSize(getMaximumSize());

        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
