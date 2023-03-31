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
    }

    public void panelLogin() {
        //Panel que tendrá las etiquetas y botones
        panelInicio.setLayout(null);
        panelInicio.setVisible(true);
        panelInicio.setOpaque(true);
        //panelBlanco.setBorder(BorderFactory.createLineBorder(Color.black, 80));
        panelInicio.setBounds(160, 80, 400, 500);
        panelInicio.setBackground(Color.white);

        //logo de la salchica para el fondo
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


        //nombre del usuario en el login
        JLabel nombreUsuario = new JLabel("Usuario");
        nombreUsuario.setBackground(Color.black);
        nombreUsuario.setBounds(40, 180, 200, 100);
        panelInicio.add(nombreUsuario);
        //Aqui se llama al metodo
        String usuario=verificarUsuario();

        //contraseña del usuario en el login
        JLabel contraseña = new JLabel("Contraseña");
        contraseña.setBackground(Color.black);
        contraseña.setBounds(40, 290, 200, 100);
        panelInicio.add(contraseña);
        //Aqui se llama al metodo
        String contraseñaa=verificarContraseña();

        //boton que da acceso al modulo en el login
        JButton botonLogin=new JButton();
        botonLogin.setBounds(140, 420, 100, 50);
        ImageIcon imgR= new ImageIcon("ModuloOperador/src/Imagenes/INGRESAR.png");// se le pone icono a boton
        Icon i= new ImageIcon(imgR.getImage().getScaledInstance(botonLogin.getWidth(), botonLogin.getHeight(), Image.SCALE_DEFAULT));
        botonLogin.setIcon(i);
        botonLogin.setLayout(null);
        botonLogin.setOpaque(true);
        botonLogin.setBorderPainted(false);
        ImageIcon imgadmin= new ImageIcon("ModuloOperador/src/Imagenes/INGRESAR2.png");// se le pone icono a boton
        Icon iconAdmin= new ImageIcon(imgadmin.getImage().getScaledInstance(botonLogin.getWidth(), botonLogin.getHeight(), Image.SCALE_DEFAULT));
        botonLogin.setRolloverIcon(iconAdmin);
        botonLogin.setBackground(Color.white);

        botonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelInicio.setVisible(false);
                fondo.setVisible(false);
                panelOperador();
                panelPedido.setVisible(true);

                contenedor.add(panelBlanco,Integer.valueOf(6));
                contenedor.add(panelPedido,Integer.valueOf(7));
                contenedor.add(panelInformacion,Integer.valueOf(7));
                contenedor.add(botonBuscar,Integer.valueOf(7));

            }
        });
        panelInicio.add(botonLogin);

        //fondo del login
        ImageIcon imagen =new ImageIcon("ModuloOperador/src/Imagenes/loginOperador.png");
        fondo.setIcon(imagen);
        fondo.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        //capas de la ventana
        contenedor.add(panelInicio,Integer.valueOf(5));
        contenedor.add(fondo,Integer.valueOf(4));
        this.setSize(imagen.getIconWidth(), imagen.getIconHeight());//tamaño de la imagen ajustado a la ventana
        contenedor();//llama al contenedor


    }

    public String verificarUsuario(){
        JTextField txusuario = new JTextField();
        txusuario.setBackground(Color.white);
        txusuario.setBounds(30, 250, 300, 40);
        panelInicio.add(txusuario);
        String usuario=txusuario.getText();
        return usuario;
    }

    public String verificarContraseña(){
        JTextField txcontraseña = new JTextField();
        txcontraseña.setBackground(Color.white);
        txcontraseña.setBounds(30,360,300,40);
        panelInicio.add(txcontraseña);
        String contraseña=txcontraseña.getText();
        return contraseña;
    }



    //panel donde se busca al cliente
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

        JLabel infoCliente = new JLabel("Información Cliente");//letrero de titulo
        infoCliente.setBackground(Color.black);
        infoCliente.setFont(new Font("Arial", Font.PLAIN, 30));
        infoCliente.setBounds(70, 5, 300, 80);
        panelInformacion.add(infoCliente);

        JLabel fondoCliente = new JLabel("Logo");//Foto de la salchicha
        fondoCliente.setBounds(100, 50, 150, 200);
        ImageIcon imgLogo = new ImageIcon("ModuloOperador/src/Imagenes/tipoCliente.png");// se le pone icono a boton
        Icon ilogo = new ImageIcon(imgLogo.getImage().getScaledInstance(fondoCliente.getWidth(), fondoCliente.getHeight(), Image.SCALE_DEFAULT));
        fondoCliente.setIcon(ilogo);
        panelInformacion.add(fondoCliente);

        botonBuscar=new JButton();//boton para buscar cliente
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

        JButton botonRegistrar=new JButton(); //boton de registro
        botonRegistrar.setBounds(300, 600, 200, 100);
        ImageIcon imgRegis= new ImageIcon("ModuloOperador/src/Imagenes/botonRegistrar.png");// se le pone icono a boton
        Icon iRegis= new ImageIcon(imgRegis.getImage().getScaledInstance(botonRegistrar.getWidth(), botonRegistrar.getHeight(), Image.SCALE_DEFAULT));
        botonRegistrar.setIcon(iRegis);
        botonRegistrar.setLayout(null);
        botonRegistrar.setOpaque(true);
        botonRegistrar.setBorderPainted(false);
        ImageIcon imgRegis2= new ImageIcon("ModuloOperador/src/Imagenes/botonRegistrar.png");// se le pone icono a boton
        Icon iRegis2= new ImageIcon(imgRegis2.getImage().getScaledInstance(botonRegistrar.getWidth(), botonRegistrar.getHeight(), Image.SCALE_DEFAULT));
        botonRegistrar.setRolloverIcon(iRegis2);
        botonRegistrar.setBackground(Color.white);

        botonRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPedido.setVisible(false);
                VistaOperadorDatos ventanaDatos=new VistaOperadorDatos();
                ventanaDatos.panelRegistroCliente();
                dispose();
            }
        });
        panelBlanco.add(botonRegistrar);

        JButton botonIngresar=new JButton(); //boton para ingresar pedido
        botonIngresar.setBounds(500, 600, 200, 100);
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
                VistaOperadorDatos ventanaDatos=new VistaOperadorDatos();
                ventanaDatos.panelIngresarPedido();
                dispose();
            }
        });
        panelBlanco.add(botonIngresar);

        JButton botonActPedido=new JButton();//boton para actualizar pedido
        botonActPedido.setBounds(700, 600, 200, 100);
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
                VistaOperadorDatos ventanaDatos=new VistaOperadorDatos();
                ventanaDatos.panelActualizarPedido();
                dispose();
            }
        });
        panelBlanco.add(botonActPedido);

        JButton botonActDatos=new JButton();//boton para actualizar datos
        botonActDatos.setBounds(900, 600, 200, 100);
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

        botonActDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaOperadorDatos ventanaDatos=new VistaOperadorDatos();
                ventanaDatos.panelActualizarDatos();
                dispose();
            }
        });
        panelBlanco.add(botonActDatos);


      String nombrePedido= buscarPedido();
      informacionCliente();
      contenedor();
        contenedor.add(panelBlanco,Integer.valueOf(6));
        contenedor.add(panelPedido,Integer.valueOf(7));
        contenedor.add(panelInformacion,Integer.valueOf(7));
        contenedor.add(botonBuscar,Integer.valueOf(7));
    }

    //metodo en donde se da la informacion del cliente
    public void informacionCliente(){
        setNombreCliente("Maria Perez");
        setTelefonoCliente("3157660279");
        setDireccionCliente("calle 21 d # 26");
        setTipoCliente("Premium");
    }

    //estos metodos debe llamarlos el controlador
    public void setNombreCliente(String name){
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

    public void setTelefonoCliente(String telefono){
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

    public void setDireccionCliente(String direccion){

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

    public void setTipoCliente(String tipo){

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
        //  contenedor.add(panelInicio,Integer.valueOf(2));

        this.getContentPane().add(contenedor);
        this.setSize(getMaximumSize());
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}