package Admin.VistaAdmin;

import Admin.VistaAdmin.VistaAdminDatos;
import Cocina.VistaCocina.Bordes;
import Cocina.VistaCocina.VistaCocina;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaAdmin extends JFrame {
    JLabel fondo = new JLabel();
    JLayeredPane contenedor=new JLayeredPane();
    JPanel panelInicio = new JPanel();
    JPanel panelBlanco = new JPanel();

    public VistaAdmin(){
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
        ImageIcon imgLogo= new ImageIcon("ModuloCocina/src/Imagenes/logoPerrito.png");// se le pone icono a boton
        Icon ilogo= new ImageIcon(imgLogo.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(ilogo);
        panelBlanco.add(logo);

        JLabel adminText=new JLabel("ADMINISTRADOR");
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
        panelBlanco.add(txcontraseña);

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
                panelInicio.setVisible(false);
                panelBlanco.setVisible(false);
                fondo.setVisible(false);
                panelMenu();

            }
        });
        panelBlanco.add(botonRegistrar);

        ImageIcon imagen =new ImageIcon("ModuloCocina/src/Imagenes/loginAdmin.png");
        fondo.setIcon(imagen);
        fondo.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        //capas de la ventana
        contenedor.add(panelBlanco,Integer.valueOf(5));
        contenedor.add(fondo,Integer.valueOf(4));
        this.setSize(imagen.getIconWidth(), imagen.getIconHeight());//ajuste de la imagen

        //se llama al contenedor
        contenedor();
    }

    public void panelMenu(){
        //Panel que tendrá las etiquetas y botones

        JPanel panelFondo=new JPanel();
        panelFondo.setLayout(null);
        panelFondo.setVisible(true);
        panelFondo.setOpaque(true);
        panelFondo.setBounds(0,0,1400,800);
        panelFondo.setBackground(Color.white);

        JPanel panelCentral=new JPanel();
        panelCentral.setLayout(null);
        panelCentral.setVisible(true);
        panelCentral.setOpaque(true);
        panelCentral.setBounds(500,0,900,600);
        panelCentral.setBackground(Color.white);

        JLabel fondoAzul=new JLabel("fondo");
        fondoAzul.setBounds(-10,70,300,600);
        ImageIcon imgAzul= new ImageIcon("ModuloCocina/src/Imagenes/fondoAzul.png");// se le pone icono a boton
        Icon iconAzul= new ImageIcon(imgAzul.getImage().getScaledInstance(fondoAzul.getWidth(), fondoAzul.getHeight(), Image.SCALE_DEFAULT));
        fondoAzul.setIcon(iconAzul);

        JLabel logo=new JLabel("logoPerrito");
        logo.setBounds(300,500,300,300);
        ImageIcon imlogo= new ImageIcon("ModuloCocina/src/Imagenes/logoPerro.png");// se le pone icono a boton
        Icon logo1= new ImageIcon(imlogo.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(logo1);

        JLabel menu=new JLabel("Menu");
        menu.setBounds(300,20,300,100);
        menu.setBackground(Color.BLACK);
        menu.setFont(new Font("Arial", Font.BOLD, 50));
        panelCentral.add(menu);

        JLabel menuFoto=new JLabel("MenuuFoto");
        menuFoto.setBounds(50,100,800,500);
        ImageIcon imMenu= new ImageIcon("ModuloCocina/src/Imagenes/menu2.png");// se le pone icono a boton
        Icon iconMenu= new ImageIcon(imMenu.getImage().getScaledInstance(menuFoto.getWidth(), menuFoto.getHeight(), Image.SCALE_DEFAULT));
        menuFoto.setIcon(iconMenu);
        panelCentral.add(menuFoto);

        JButton botonAgregarOperador=new JButton();
        botonAgregarOperador.setBounds(200, 140, 200, 80);
        ImageIcon imgopera= new ImageIcon("ModuloCocina/src/Imagenes/botonAñadirOperador.png");// se le pone icono a boton
        Icon i= new ImageIcon(imgopera.getImage().getScaledInstance(botonAgregarOperador.getWidth(), botonAgregarOperador.getHeight(), Image.SCALE_DEFAULT));
        botonAgregarOperador.setIcon(i);
        botonAgregarOperador.setLayout(null);
        botonAgregarOperador.setOpaque(false);
        botonAgregarOperador.setBorder(new Bordes(10));
        botonAgregarOperador.setBackground(new Color(74,126,235));
        botonAgregarOperador.setBorderPainted(false);
        ImageIcon imgOpera2= new ImageIcon("ModuloCocina/src/Imagenes/botonAñadirOperador2.png");// se le pone icono a boton
        Icon iconopera2= new ImageIcon(imgOpera2.getImage().getScaledInstance(botonAgregarOperador.getWidth(), botonAgregarOperador.getHeight(), Image.SCALE_DEFAULT));
        botonAgregarOperador.setRolloverIcon(iconopera2);
        botonAgregarOperador.setBackground(Color.white);

        botonAgregarOperador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdminDatos adminDatos=new VistaAdminDatos();
                adminDatos.ingresarOperador();
                dispose();

            }
        });


        JButton botonAgregarRepartidor=new JButton();
        botonAgregarRepartidor.setBounds(200, 300, 200, 80);
        ImageIcon imgRepar= new ImageIcon("ModuloCocina/src/Imagenes/botonAñadirRepartidor.png");// se le pone icono a boton
        Icon iRepar= new ImageIcon(imgRepar.getImage().getScaledInstance(botonAgregarRepartidor.getWidth(), botonAgregarRepartidor.getHeight(), Image.SCALE_DEFAULT));
        botonAgregarRepartidor.setIcon(iRepar);
        botonAgregarRepartidor.setLayout(null);
        botonAgregarRepartidor.setOpaque(false);
        botonAgregarRepartidor.setBorder(new Bordes(10));
        botonAgregarRepartidor.setBackground(new Color(74,126,235));
        botonAgregarRepartidor.setBorderPainted(false);
        ImageIcon imgRepartidor2= new ImageIcon("ModuloCocina/src/Imagenes/botonAñadirRepartidor2.png");// se le pone icono a boton
        Icon iRepar2= new ImageIcon(imgRepartidor2.getImage().getScaledInstance(botonAgregarRepartidor.getWidth(), botonAgregarRepartidor.getHeight(), Image.SCALE_DEFAULT));
        botonAgregarRepartidor.setRolloverIcon(iRepar2);
        botonAgregarRepartidor.setBackground(Color.white);

        botonAgregarRepartidor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaAdminDatos adminDatos=new VistaAdminDatos();
                adminDatos.ingresarRepartidor();
                dispose();
            }
        });


        JButton botonActivarCocina=new JButton();
        botonActivarCocina.setBounds(200, 450, 200, 80);
        ImageIcon imgProductos= new ImageIcon("ModuloCocina/src/Imagenes/botonActivarCocina.png");// se le pone icono a boton
        Icon iprod= new ImageIcon(imgProductos.getImage().getScaledInstance(botonActivarCocina.getWidth(), botonActivarCocina.getHeight(), Image.SCALE_DEFAULT));
        botonActivarCocina.setIcon(iprod);
        botonActivarCocina.setLayout(null);
        botonActivarCocina.setOpaque(false);
        botonActivarCocina.setBorder(new Bordes(10));
        botonActivarCocina.setBackground(new Color(74,126,235));
        botonActivarCocina.setBorderPainted(false);
        ImageIcon imgProductos2= new ImageIcon("ModuloCocina/src/Imagenes/botonActivarCocina2.png");// se le pone icono a boton
        Icon iprod2= new ImageIcon(imgProductos2.getImage().getScaledInstance(botonActivarCocina.getWidth(), botonActivarCocina.getHeight(), Image.SCALE_DEFAULT));
        botonActivarCocina.setRolloverIcon(iprod2);
        botonActivarCocina.setBackground(Color.white);

        botonActivarCocina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VistaCocina vista=new VistaCocina();
                vista.panelDespachoPedidos();
                System.out.println("Service on");
                dispose();

            }
        });


        contenedor.add(panelFondo,Integer.valueOf(5));
        contenedor.add(fondoAzul,Integer.valueOf(6));
        contenedor.add(panelCentral,Integer.valueOf(9));
        contenedor.add(logo,Integer.valueOf(9));
        contenedor.add(botonActivarCocina,Integer.valueOf(8));
        contenedor.add(botonAgregarOperador,Integer.valueOf(8));
        contenedor.add(botonAgregarRepartidor,Integer.valueOf(8));

       contenedor();
    }


    public void contenedor(){
        this.getContentPane().add(contenedor);
        this.setSize(getMaximumSize());
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


}
