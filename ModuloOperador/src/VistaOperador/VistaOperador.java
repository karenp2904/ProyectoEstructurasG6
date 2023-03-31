package VistaOperador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class VistaOperador extends JFrame {

    JLabel fondo = new JLabel();
    JLayeredPane contenedor=new JLayeredPane();
    JPanel panelInicio = new JPanel();
    JPanel panelBlanco = new JPanel();
    JPanel panelPedido = new JPanel();
    JPanel panelInformacion = new JPanel();
    JTextField txbuscarPedido=new JTextField();
    JButton botonBuscar;

    public VistaOperador(){
        this.setTitle("Hot Dogs Palace");
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setBackground(Color.white);
        panelLogin();
    }

    public void panelLogin() {
        //Panel que tendrá las etiquetas y botones
        panelInicio.setLayout(null);
        panelInicio.setVisible(true);
        panelInicio.setOpaque(true);
        //panelBlanco.setBorder(BorderFactory.createLineBorder(Color.black, 80));
        panelInicio.setBounds(160, 80, 400, 500);
        panelInicio.setBackground(Color.white);


        JLabel logo = new JLabel("Logo");
        logo.setBounds(110, 10, 150, 150);
        ImageIcon imgLogo = new ImageIcon("ModuloOperador/src/Imagenes/logoPerrito.png");// se le pone icono a boton
        Icon ilogo = new ImageIcon(imgLogo.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(ilogo);
        panelInicio.add(logo);

        JLabel operadorText = new JLabel("OPERADOR");
        operadorText.setFont(new Font("Arial", Font.BOLD, 20));
        operadorText.setBounds(130, 140, 200, 100);
        panelInicio.add(operadorText);


        JLabel nombreUsuario = new JLabel("Usuario");
        nombreUsuario.setBackground(Color.black);
        nombreUsuario.setBounds(40, 180, 200, 100);
        panelInicio.add(nombreUsuario);


        JTextField txusuario = new JTextField();
        txusuario.setBackground(Color.white);
       // txusuario.setBorder(BorderFactory.createLineBorder(Color.gray, 80));
        txusuario.setBounds(30, 250, 300, 40);
        // txusuario.setBorder(new Bordes(12));
        panelInicio.add(txusuario);


        JLabel contraseña = new JLabel("Contraseña");
        contraseña.setBackground(Color.black);
        contraseña.setBounds(40, 290, 200, 100);
        panelInicio.add(contraseña);

        JTextField txcontraseña = new JTextField();
        txcontraseña.setBackground(Color.white);
        txcontraseña.setBounds(30,360,300,40);
        panelInicio.add(txcontraseña);

        JButton botonRegistrar=new JButton();
        botonRegistrar.setBounds(140, 420, 100, 50);
        ImageIcon imgR= new ImageIcon("ModuloOperador/src/Imagenes/INGRESAR.png");// se le pone icono a boton
        Icon i= new ImageIcon(imgR.getImage().getScaledInstance(botonRegistrar.getWidth(), botonRegistrar.getHeight(), Image.SCALE_DEFAULT));
        botonRegistrar.setIcon(i);
        botonRegistrar.setLayout(null);
        botonRegistrar.setOpaque(true);
        botonRegistrar.setBorderPainted(false);
        ImageIcon imgadmin= new ImageIcon("ModuloOperador/src/Imagenes/INGRESAR2.png");// se le pone icono a boton
        Icon iconAdmin= new ImageIcon(imgadmin.getImage().getScaledInstance(botonRegistrar.getWidth(), botonRegistrar.getHeight(), Image.SCALE_DEFAULT));
        botonRegistrar.setRolloverIcon(iconAdmin);
        botonRegistrar.setBackground(Color.white);

        botonRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelInicio.setVisible(false);
                fondo.setVisible(false);
                panelOperador();
                panelPedido.setVisible(true);

                contenedor.add(panelBlanco,Integer.valueOf(3));
                contenedor.add(panelPedido,Integer.valueOf(7));
                contenedor.add(panelInformacion,Integer.valueOf(7));
                contenedor.add(botonBuscar,Integer.valueOf(7));

            }
        });
        panelInicio.add(botonRegistrar);

        //se llama al contenedor
        contenedor();
    }


    public void panelOperador(){
        //Panel que tendrá las etiquetas y botones
        //fondo blanco del panel
        panelBlanco.setLayout(null);
        panelBlanco.setVisible(true);
        panelBlanco.setOpaque(true);
        panelBlanco.setBounds(0, 0, 1400, 800);
        panelBlanco.setBackground(Color.white);

        //panel para mostrar los pedidos frecuentes
        panelPedido.setLayout(null);
        panelPedido.setVisible(true);
        panelPedido.setOpaque(true);
        Color colorPanel=new Color(234,234,234);
        panelPedido.setBounds(700, 150, 550, 400);
        panelPedido.setBackground(colorPanel);

        //panel para la informacion del usuario
        panelInformacion.setLayout(null);
        panelInformacion.setVisible(true);
        panelInformacion.setOpaque(true);
        panelInformacion.setBounds(100, 150, 450, 450);
        panelInformacion.setBackground(Color.white);

        JLabel infoCliente = new JLabel("Información Cliente");
        infoCliente.setBackground(Color.black);
        infoCliente.setFont(new Font("Arial", Font.PLAIN, 30));
        infoCliente.setBounds(70, 5, 300, 80);
        panelInformacion.add(infoCliente);

        JLabel fondoCliente = new JLabel("Logo");
        fondoCliente.setBounds(100, 50, 150, 200);
        ImageIcon imgLogo = new ImageIcon("ModuloOperador/src/Imagenes/tipoCliente.png");// se le pone icono a boton
        Icon ilogo = new ImageIcon(imgLogo.getImage().getScaledInstance(fondoCliente.getWidth(), fondoCliente.getHeight(), Image.SCALE_DEFAULT));
        fondoCliente.setIcon(ilogo);
        panelInformacion.add(fondoCliente);

        botonBuscar=new JButton();
        botonBuscar.setBounds(1050, 40, 150, 80);
        ImageIcon imgBus= new ImageIcon("ModuloOperador/src/Imagenes/botonBuscar.png");// se le pone icono a boton
        Icon ibus= new ImageIcon(imgBus.getImage().getScaledInstance(botonBuscar.getWidth(), botonBuscar.getHeight(), Image.SCALE_DEFAULT));
        botonBuscar.setIcon(ibus);
        botonBuscar.setLayout(null);
        botonBuscar.setOpaque(true);
        botonBuscar.setBorderPainted(false);
        ImageIcon imgBus2= new ImageIcon("ModuloOperador/src/Imagenes/botonBuscar.png");// se le pone icono a boton
        Icon ibus2= new ImageIcon(imgBus2.getImage().getScaledInstance(botonBuscar.getWidth(), botonBuscar.getHeight(), Image.SCALE_DEFAULT));
        botonBuscar.setRolloverIcon(ibus2);
        botonBuscar.setBackground(Color.white);

        botonBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPedido.setVisible(true);
            }
        });
        panelBlanco.add(botonBuscar);


        JButton botonIngresar=new JButton();
        botonIngresar.setBounds(400, 600, 200, 100);
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
               panelPedido.setVisible(false);
            }
        });
        panelBlanco.add(botonIngresar);

        JButton botonActPedido=new JButton();
        botonActPedido.setBounds(600, 600, 200, 100);
        ImageIcon imgactPedido= new ImageIcon("ModuloOperador/src/Imagenes/botonActPedido.png");// se le pone icono a boton
        Icon iActPedi= new ImageIcon(imgactPedido.getImage().getScaledInstance(botonActPedido.getWidth(), botonActPedido.getHeight(), Image.SCALE_DEFAULT));
        botonActPedido.setIcon(iActPedi);
        botonActPedido.setLayout(null);
        botonActPedido.setOpaque(true);
        botonActPedido.setBorderPainted(false);
        ImageIcon imgactPedido2= new ImageIcon("ModuloOperador/src/Imagenes/botonActPedido.png");// se le pone icono a boton
        Icon iActPedi2= new ImageIcon(imgactPedido2.getImage().getScaledInstance(botonActPedido.getWidth(), botonActPedido.getHeight(), Image.SCALE_DEFAULT));
        botonActPedido.setRolloverIcon(iActPedi2);
        botonActPedido.setBackground(Color.white);

        botonActPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPedido.setVisible(false);
            }
        });
        panelBlanco.add(botonActPedido);

        JButton botonActDatos=new JButton();
        botonActDatos.setBounds(800, 600, 200, 100);
        ImageIcon imgdatos= new ImageIcon("ModuloOperador/src/Imagenes/botonActDatos.png");// se le pone icono a boton
        Icon idatos= new ImageIcon(imgdatos.getImage().getScaledInstance(botonActDatos.getWidth(), botonActDatos.getHeight(), Image.SCALE_DEFAULT));
        botonActDatos.setIcon(idatos);
        botonActDatos.setLayout(null);
        botonActDatos.setOpaque(true);
        botonActDatos.setBorderPainted(false);
        ImageIcon imgadatos= new ImageIcon("ModuloOperador/src/Imagenes/botonActDatos.png");// se le pone icono a boton
        Icon iconDatos= new ImageIcon(imgadatos.getImage().getScaledInstance(botonActDatos.getWidth(), botonActDatos.getHeight(), Image.SCALE_DEFAULT));
        botonActDatos.setRolloverIcon(iconDatos);
        botonActDatos.setBackground(Color.white);

        botonIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPedido.setVisible(false);
            }
        });
        panelBlanco.add(botonActDatos);

      String nombrePedido= buscarPedido();
      informacionCliente();
    }

    public void informacionCliente(){
        getNameCliente("Maria Perez");
        getTelefonoCliente("3444sddd444");
        getDireccionCliente("calle 21 d # 26");
        getTipoCliente("premium");
    }

    public void getNameCliente(String name){
        JLabel nombreEstatico = new JLabel("Nombre: ");
        nombreEstatico.setBackground(Color.black);
        nombreEstatico.setFont(new Font("Arial", Font.BOLD, 20));
        nombreEstatico.setBounds(50, 250, 300, 40);
        panelInformacion.add(nombreEstatico);

        JLabel nombreUsuario = new JLabel(name);
        nombreUsuario.setBackground(Color.black);
        nombreUsuario.setFont(new Font("Arial", Font.ITALIC, 20));
        nombreUsuario.setBounds(160, 250, 300, 40);
        panelInformacion.add(nombreUsuario);
    }

    public void getTelefonoCliente(String telefono){
        JLabel telefonoEstatico = new JLabel("Telefono: ");// letra estatica
        telefonoEstatico.setBackground(Color.black);
        telefonoEstatico.setFont(new Font("Arial", Font.BOLD, 20));
        telefonoEstatico.setBounds(50, 280, 300, 40);
        panelInformacion.add(telefonoEstatico);

        JLabel numtelefono = new JLabel(telefono);
        numtelefono.setBackground(Color.black);
        numtelefono.setFont(new Font("Arial", Font.ITALIC, 20));
        numtelefono.setBounds(160, 280, 300, 40);
        panelInformacion.add(numtelefono);
    }

    public void getDireccionCliente(String direccion){

        JLabel direccionFija = new JLabel("Direccion: ");// letra estatica
        direccionFija.setBackground(Color.black);
        direccionFija.setFont(new Font("Arial", Font.BOLD, 20));
        direccionFija.setBounds(50, 310, 300, 40);
        panelInformacion.add(direccionFija);

        JLabel direccionCliente = new JLabel(direccion);//letra del cliente
        direccionCliente.setBackground(Color.black);
        direccionCliente.setFont(new Font("Arial", Font.ITALIC, 20));
        direccionCliente.setBounds(160, 310, 300, 40);
        panelInformacion.add(direccionCliente);
    }

    public void getTipoCliente(String tipo){

        JLabel tipoEstatico = new JLabel("Tipo Cliente: ");// letra estatica
        tipoEstatico.setBackground(Color.black);
        tipoEstatico.setFont(new Font("Arial", Font.BOLD, 20));
        tipoEstatico.setBounds(50, 340, 300, 40);
        panelInformacion.add(tipoEstatico);

        JLabel tipoCliente = new JLabel(tipo);//letra del cliente
        tipoCliente.setBackground(Color.black);
        tipoCliente.setFont(new Font("Arial", Font.ITALIC, 20));
        tipoCliente.setBounds(180, 340, 300, 40);
        panelInformacion.add(tipoCliente);
    }



    public String buscarPedido(){
        Color colorPanel=new Color(234,234,234);
        txbuscarPedido.setBackground(colorPanel);
        txbuscarPedido.setFont(new Font("Arial", Font.BOLD, 40));
        txbuscarPedido.setBounds(300, 50, 700, 60);
        String nombrePedido=txbuscarPedido.getText();
        panelBlanco.add(txbuscarPedido);
        return nombrePedido;
    }



    public void contenedor(){
        ImageIcon imagen =new ImageIcon("ModuloOperador/src/Imagenes/loginOperador.png");
        fondo.setIcon(imagen);
        fondo.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        //fondo.setBounds(100,40,1400,600);


        contenedor.add(panelInicio,Integer.valueOf(5));
        contenedor.add(fondo,Integer.valueOf(4));

        //  contenedor.add(panelInicio,Integer.valueOf(2));

        this.getContentPane().add(contenedor);
        this.setSize(getMaximumSize());
        this.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
