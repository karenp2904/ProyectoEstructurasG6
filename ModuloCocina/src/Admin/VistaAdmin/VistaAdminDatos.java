package Admin.VistaAdmin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaAdminDatos extends JFrame {
    JPanel panelCentral =new JPanel();
    JLabel fondo = new JLabel();
    JLayeredPane contenedor=new JLayeredPane();
    public VistaAdminDatos(){
        this.setTitle("Hot Dogs Palace");
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setBackground(Color.white);
        contenedor();
    }

    public void ingresarRepartidor(){
        panelCentral.setLayout(null);
        panelCentral.setVisible(true);
        panelCentral.setOpaque(true);
        panelCentral.setBounds(200, 70, 900, 600);
        panelCentral.setBackground(Color.white);

        //logo de la salchica para el fondo
        JLabel logo = new JLabel("Logo");
        logo.setBounds(70, 130, 350, 350);
        ImageIcon imgLogo = new ImageIcon("ModuloCocina/src/Imagenes/FotoPerrito.png");// se le pone icono a boton
        Icon ilogo = new ImageIcon(imgLogo.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(ilogo);
        panelCentral.add(logo);

        //letrero del registro de clinetes en el panel
        JLabel letreroRegistro = new JLabel(" REGISTRAR REPARTIDOR");
        letreroRegistro.setBackground(Color.black);
        letreroRegistro.setFont(new Font("Arial", Font.BOLD, 40));
        letreroRegistro.setBounds(230, -20, 600, 200);
        panelCentral.add(letreroRegistro);


        //registro con la informacion del cliente
        //Label del nombre
        JLabel nombretext = new JLabel("NOMBRE: ");
        nombretext.setBackground(Color.black);
        nombretext.setFont(new Font("Arial", Font.BOLD, 20));
        nombretext.setBounds(480, 170, 200, 100);
        panelCentral.add(nombretext);
        //Label del numero telefonico
        JLabel telefonoText = new JLabel("USUARIO: ");
        telefonoText.setBackground(Color.black);
        telefonoText.setFont(new Font("Arial", Font.BOLD, 20));
        telefonoText.setBounds(480, 220, 200, 100);
        panelCentral.add(telefonoText);

        JLabel direccionText = new JLabel("CONTRASEÑA: ");
        direccionText.setBackground(Color.black);
        direccionText.setFont(new Font("Arial", Font.BOLD, 20));
        direccionText.setBounds(480, 270, 200, 100);
        panelCentral.add(direccionText);



        String nombre=ingresarNombre();
        String codigo= ingresarUsuario();
        String direccion= ingresarContraseña();


        JButton botonIngresar=new JButton(); //boton para ingresar pedido
        botonIngresar.setBounds(630, 400, 200, 80);
        ImageIcon imgR= new ImageIcon("ModuloCocina/src/Imagenes/btningresarPedido.png");// se le pone icono a boton
        Icon i= new ImageIcon(imgR.getImage().getScaledInstance(botonIngresar.getWidth(), botonIngresar.getHeight(), Image.SCALE_DEFAULT));
        botonIngresar.setIcon(i);
        botonIngresar.setLayout(null);
        botonIngresar.setOpaque(true);
        botonIngresar.setBorderPainted(false);
        ImageIcon imgadmin= new ImageIcon("ModuloCocina/src/Imagenes/btningresarPedido2.png");// se le pone icono a boton
        Icon iconAdmin= new ImageIcon(imgadmin.getImage().getScaledInstance(botonIngresar.getWidth(), botonIngresar.getHeight(), Image.SCALE_DEFAULT));
        botonIngresar.setRolloverIcon(iconAdmin);
        botonIngresar.setBackground(Color.white);

        botonIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdmin admin=new VistaAdmin();
                admin.panelMenu();
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
        txusuario.setBounds(640, 200, 220, 40);
        panelCentral.add(txusuario);
        String usuario=txusuario.getText();
        return usuario;
    }

    public String ingresarUsuario(){
        JTextField txtCodigo = new JTextField();
        txtCodigo.setBackground(Color.white);
        // txTelefono.setBackground(new Color(217,217,217));
        txtCodigo.setFont(new Font("Arial", Font.BOLD, 20));
        txtCodigo.setBounds(640, 250, 220, 40);
        panelCentral.add(txtCodigo);
        String codigo=txtCodigo.getText();
        return codigo;
    }

    public String ingresarContraseña(){
        JTextField txDireccion = new JTextField();
        txDireccion.setBackground(Color.white);
        txDireccion.setFont(new Font("Arial", Font.BOLD, 20));
        txDireccion.setBounds(640, 300, 220, 40);
        panelCentral.add(txDireccion);
        String direccion=txDireccion.getText();
        return direccion;
    }



    public void ingresarOperador(){
        panelCentral.setLayout(null);
        panelCentral.setVisible(true);
        panelCentral.setOpaque(true);
        panelCentral.setBounds(200, 70, 900, 600);
        panelCentral.setBackground(Color.white);

        //logo de la salchica para el fondo
        JLabel logo = new JLabel("Logo");
        logo.setBounds(70, 130, 350, 350);
        ImageIcon imgLogo = new ImageIcon("ModuloCocina/src/Imagenes/FotoPerrito.png");// se le pone icono a boton
        Icon ilogo = new ImageIcon(imgLogo.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(ilogo);
        panelCentral.add(logo);

        //letrero del registro de clinetes en el panel
        JLabel letreroRegistro = new JLabel(" REGISTARAR OPERADOR");
        letreroRegistro.setBackground(Color.black);
        letreroRegistro.setFont(new Font("Arial", Font.BOLD, 40));
        letreroRegistro.setBounds(230, -20, 600, 200);
        panelCentral.add(letreroRegistro);


        //registro con la informacion del cliente
        //Label del nombre
        JLabel nombretext = new JLabel("NOMBRE: ");
        nombretext.setBackground(Color.black);
        nombretext.setFont(new Font("Arial", Font.BOLD, 20));
        nombretext.setBounds(480, 170, 200, 100);
        panelCentral.add(nombretext);
        //Label del numero telefonico
        JLabel telefonoText = new JLabel("USUARIO: ");
        telefonoText.setBackground(Color.black);
        telefonoText.setFont(new Font("Arial", Font.BOLD, 20));
        telefonoText.setBounds(480, 220, 200, 100);
        panelCentral.add(telefonoText);

        JLabel direccionText = new JLabel("CONTRASEÑA: ");
        direccionText.setBackground(Color.black);
        direccionText.setFont(new Font("Arial", Font.BOLD, 20));
        direccionText.setBounds(480, 270, 200, 100);
        panelCentral.add(direccionText);


        String nombre=ingresarNombre();
        String usuario= ingresarUsuario();
        String contra= ingresarContraseña();


        JButton botonIngresar=new JButton(); //boton para ingresar pedido
        botonIngresar.setBounds(630, 400, 200, 80);
        ImageIcon imgR= new ImageIcon("ModuloCocina/src/Imagenes/btningresarPedido.png");// se le pone icono a boton
        Icon i= new ImageIcon(imgR.getImage().getScaledInstance(botonIngresar.getWidth(), botonIngresar.getHeight(), Image.SCALE_DEFAULT));
        botonIngresar.setIcon(i);
        botonIngresar.setLayout(null);
        botonIngresar.setOpaque(true);
        botonIngresar.setBorderPainted(false);
        ImageIcon imgadmin= new ImageIcon("ModuloCocina/src/Imagenes/btningresarPedido2.png");// se le pone icono a boton
        Icon iconAdmin= new ImageIcon(imgadmin.getImage().getScaledInstance(botonIngresar.getWidth(), botonIngresar.getHeight(), Image.SCALE_DEFAULT));
        botonIngresar.setRolloverIcon(iconAdmin);
        botonIngresar.setBackground(Color.white);
        botonIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdmin admin=new VistaAdmin();
                admin.panelMenu();
                dispose();

            }
        });
        panelCentral.add(botonIngresar);

        contenedor.add(panelCentral,Integer.valueOf(1));

    }
    public void contenedor(){
        ImageIcon imagen =new ImageIcon("ModuloCocina/src/Imagenes/fondoLetras.png");
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
