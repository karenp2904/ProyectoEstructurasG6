package VistaOperador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaOperadorDatos extends JFrame {
    JPanel panelCentral =new JPanel();
    JLabel fondo = new JLabel();
    JLayeredPane contenedor=new JLayeredPane();
    public VistaOperadorDatos(){
        this.setTitle("Hot Dogs Palace");
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setBackground(Color.white);
        contenedor();
    }

    public void panelRegistroCliente(){
        panelCentral.setLayout(null);
        panelCentral.setVisible(true);
        panelCentral.setOpaque(true);
        panelCentral.setBounds(200, 70, 900, 600);
        panelCentral.setBackground(Color.white);

        //logo de la salchica para el fondo
        JLabel logo = new JLabel("Logo");
        logo.setBounds(70, 130, 350, 350);
        ImageIcon imgLogo = new ImageIcon("ModuloOperador/src/Imagenes/FotoPerrito.png");// se le pone icono a boton
        Icon ilogo = new ImageIcon(imgLogo.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(ilogo);
        panelCentral.add(logo);

        //letrero del registro de clinetes en el panel
        JLabel letreroRegistro = new JLabel(" REGISTRO DE CLIENTES ");
        letreroRegistro.setBackground(Color.black);
        letreroRegistro.setFont(new Font("Arial", Font.BOLD, 40));
        letreroRegistro.setBounds(230, -20, 600, 200);
        panelCentral.add(letreroRegistro);


        //registro con la informacion del cliente
        //Label del nombre
        JLabel nombretext = new JLabel("NOMBRE: ");
        nombretext.setBackground(Color.black);
        nombretext.setFont(new Font("Arial", Font.BOLD, 20));
        nombretext.setBounds(480, 120, 200, 100);
        panelCentral.add(nombretext);
        //Label del numero telefonico
        JLabel telefonoText = new JLabel("TELEFONO: ");
        telefonoText.setBackground(Color.black);
        telefonoText.setFont(new Font("Arial", Font.BOLD, 20));
        telefonoText.setBounds(480, 170, 200, 100);
        panelCentral.add(telefonoText);

        JLabel direccionText = new JLabel("DIRECCIÓN: ");
        direccionText.setBackground(Color.black);
        direccionText.setFont(new Font("Arial", Font.BOLD, 20));
        direccionText.setBounds(480, 220, 200, 100);
        panelCentral.add(direccionText);

        JLabel tipoText = new JLabel("TIPO: ");
        tipoText.setBackground(Color.black);
        tipoText.setFont(new Font("Arial", Font.BOLD, 20));
        tipoText.setBounds(480, 270, 200, 100);
        panelCentral.add(tipoText);


        String nombre=ingresarNombre();
        String telefono=ingresarTelefono();
        String direccion=ingresarDireccion();
        String tipo=ingresarTipoCliente();

        JButton botonIngresar=new JButton(); //boton para ingresar pedido
        botonIngresar.setBounds(520, 400, 200, 100);
        ImageIcon imgR= new ImageIcon("ModuloOperador/src/Imagenes/btningresarPedido.png");// se le pone icono a boton
        Icon i= new ImageIcon(imgR.getImage().getScaledInstance(botonIngresar.getWidth(), botonIngresar.getHeight(), Image.SCALE_DEFAULT));
        botonIngresar.setIcon(i);
        botonIngresar.setLayout(null);
        botonIngresar.setOpaque(true);
        botonIngresar.setBorderPainted(false);
        ImageIcon imgadmin= new ImageIcon("ModuloOperador/src/Imagenes/btningresarPedido.png");// se le pone icono a boton
        Icon iconAdmin= new ImageIcon(imgadmin.getImage().getScaledInstance(botonIngresar.getWidth(), botonIngresar.getHeight(), Image.SCALE_DEFAULT));
        botonIngresar.setRolloverIcon(iconAdmin);
        botonIngresar.setBackground(Color.white);

        botonIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaOperador vistaMenu=new VistaOperador();
                vistaMenu.panelOperador();
                dispose();
            }
        });
        panelCentral.add(botonIngresar);



        contenedor.add(panelCentral,Integer.valueOf(1));

    }

    public String ingresarNombre(){
        JTextField txusuario = new JTextField();
        txusuario.setBackground(Color.white);
        txusuario.setFont(new Font("Arial", Font.BOLD, 20));
        txusuario.setBounds(640, 150, 220, 40);
        panelCentral.add(txusuario);
        String usuario=txusuario.getText();
        return usuario;
    }

    public String ingresarTelefono(){
        JTextField txTelefono = new JTextField();
        txTelefono.setBackground(Color.white);
       // txTelefono.setBackground(new Color(217,217,217));
        txTelefono.setFont(new Font("Arial", Font.BOLD, 20));
        txTelefono.setBounds(640, 200, 220, 40);
        panelCentral.add(txTelefono);
        String telefono=txTelefono.getText();
        return telefono;
    }

    public String ingresarDireccion(){
        JTextField txDireccion = new JTextField();
        txDireccion.setBackground(Color.white);
        txDireccion.setFont(new Font("Arial", Font.BOLD, 20));
        txDireccion.setBounds(640, 250, 220, 40);
        panelCentral.add(txDireccion);
        String direccion=txDireccion.getText();
        return direccion;
    }

    public String ingresarTipoCliente(){
        JTextField txCliente = new JTextField();
        txCliente.setBackground(Color.white);
        txCliente.setFont(new Font("Arial", Font.BOLD, 20));
        txCliente.setBounds(640, 300, 220, 40);
        panelCentral.add(txCliente);
        String tipo=txCliente.getText();
        return tipo;
    }

    public void panelIngresarPedido(){
        panelCentral.setLayout(null);
        panelCentral.setVisible(true);
        panelCentral.setOpaque(true);
        panelCentral.setBounds(300, 200, 400, 400);
        panelCentral.setBackground(Color.gray);



        contenedor.add(panelCentral,Integer.valueOf(1));
    }

    public void panelActualizarDatos(){
        panelCentral.setLayout(null);
        panelCentral.setVisible(true);
        panelCentral.setOpaque(true);
        panelCentral.setBounds(200, 70, 900, 600);
        panelCentral.setBackground(Color.white);

        //logo de la salchica para el fondo
        JLabel logo = new JLabel("Logo");
        logo.setBounds(70, 130, 350, 350);
        ImageIcon imgLogo = new ImageIcon("ModuloOperador/src/Imagenes/FotoPerrito.png");// se le pone icono a boton
        Icon ilogo = new ImageIcon(imgLogo.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(ilogo);
        panelCentral.add(logo);

        //letrero del registro de clinetes en el panel
        JLabel letreroRegistro = new JLabel(" ACTUALIZAR INFORMACIÓN");
        letreroRegistro.setBackground(Color.black);
        letreroRegistro.setFont(new Font("Arial", Font.BOLD, 40));
        letreroRegistro.setBounds(230, -20, 600, 200);
        panelCentral.add(letreroRegistro);


        //registro con la informacion del cliente
        //Label del nombre
        JLabel nombretext = new JLabel("NOMBRE: ");
        nombretext.setBackground(Color.black);
        nombretext.setFont(new Font("Arial", Font.BOLD, 20));
        nombretext.setBounds(480, 120, 200, 100);
        panelCentral.add(nombretext);
        //Label del numero telefonico
        JLabel telefonoText = new JLabel("TELEFONO: ");
        telefonoText.setBackground(Color.black);
        telefonoText.setFont(new Font("Arial", Font.BOLD, 20));
        telefonoText.setBounds(480, 170, 200, 100);
        panelCentral.add(telefonoText);

        JLabel direccionText = new JLabel("DIRECCIÓN: ");
        direccionText.setBackground(Color.black);
        direccionText.setFont(new Font("Arial", Font.BOLD, 20));
        direccionText.setBounds(480, 220, 200, 100);
        panelCentral.add(direccionText);

        JLabel tipoText = new JLabel("TIPO: ");
        tipoText.setBackground(Color.black);
        tipoText.setFont(new Font("Arial", Font.BOLD, 20));
        tipoText.setBounds(480, 270, 200, 100);
        panelCentral.add(tipoText);


        String nombre=ingresarNombre();
        String telefono=ingresarTelefono();
        String direccion=ingresarDireccion();
        String tipo=ingresarTipoCliente();

        JButton botonIngresar=new JButton(); //boton para ingresar pedido
        botonIngresar.setBounds(520, 400, 200, 100);
        ImageIcon imgR= new ImageIcon("ModuloOperador/src/Imagenes/btningresarPedido.png");// se le pone icono a boton
        Icon i= new ImageIcon(imgR.getImage().getScaledInstance(botonIngresar.getWidth(), botonIngresar.getHeight(), Image.SCALE_DEFAULT));
        botonIngresar.setIcon(i);
        botonIngresar.setLayout(null);
        botonIngresar.setOpaque(true);
        botonIngresar.setBorderPainted(false);
        ImageIcon imgadmin= new ImageIcon("ModuloOperador/src/Imagenes/btningresarPedido.png");// se le pone icono a boton
        Icon iconAdmin= new ImageIcon(imgadmin.getImage().getScaledInstance(botonIngresar.getWidth(), botonIngresar.getHeight(), Image.SCALE_DEFAULT));
        botonIngresar.setRolloverIcon(iconAdmin);
        botonIngresar.setBackground(Color.white);

        botonIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaOperador vistaMenu=new VistaOperador();
                vistaMenu.panelOperador();
                dispose();
            }
        });
        panelCentral.add(botonIngresar);

        contenedor.add(panelCentral,Integer.valueOf(1));

    }

    public void panelActualizarPedido(){
        panelCentral.setLayout(null);
        panelCentral.setVisible(true);
        panelCentral.setOpaque(true);
        panelCentral.setBounds(500, 200, 400, 400);
        panelCentral.setBackground(Color.lightGray);

        //logo de la salchica para el fondo
        JLabel logo = new JLabel("Logo");
        logo.setBounds(250, 300, 350, 350);
        ImageIcon imgLogo = new ImageIcon("ModuloOperador/src/Imagenes/FotoPerrito.png");// se le pone icono a boton
        Icon ilogo = new ImageIcon(imgLogo.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(ilogo);


        contenedor.add(logo,Integer.valueOf(2));
        contenedor.add(panelCentral,Integer.valueOf(1));
    }

    public void contenedor(){
        ImageIcon imagen =new ImageIcon("ModuloOperador/src/Imagenes/fondoLetras.png");
        fondo.setIcon(imagen);
        fondo.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        //fondo.setBounds(100,40,1400,600);


        contenedor.add(fondo,Integer.valueOf(0));

        //  contenedor.add(panelInicio,Integer.valueOf(2));

        this.getContentPane().add(contenedor);
        this.setSize(getMaximumSize());
        this.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
