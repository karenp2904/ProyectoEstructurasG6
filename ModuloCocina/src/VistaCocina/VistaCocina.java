package VistaCocina;

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

    public VistaCocina(){
        this.setTitle("Hot Dogs Palace");
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setBackground(Color.white);

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

        //Probandoooo
        String prueba;
        prueba="perro caliente";
        prueba="perro caliente";
        prueba="perro caliente";
        editarColaDeDespacho(prueba);

        panelDespacho.setLayout(null);
        panelDespacho.setVisible(true);
        panelDespacho.setOpaque(true);
        panelDespacho.setBounds(350,200,600,400);
        panelDespacho.setBackground(new Color(217, 217, 217));

        JLabel fondoLetras=new JLabel();
        ImageIcon imagen =new ImageIcon("ModuloCocina/src/Imagenes/fondoLetras.png");
        fondoLetras.setIcon(imagen);
        fondoLetras.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        this.setSize(imagen.getIconWidth(), imagen.getIconHeight());

        contenedor.add(fondoLetras,Integer.valueOf(6));
        contenedor.add(titulo,Integer.valueOf(7));
        contenedor.add(panelDespacho,Integer.valueOf(7));

        contenedor();
    }
    int y=50;
    public void editarColaDeDespacho(String pedidosEnOrden){
            JLabel titulo=new JLabel(pedidosEnOrden);
            titulo.setBackground(Color.black);
            titulo.setFont(new Font("Arial", Font.BOLD, 20));
            titulo.setBounds(150,y,600,100);
            panelDespacho.add(titulo);
            y+=50;//se le agrega distancia a y para la ubicacion del texto
            //otorga espacios
            JLabel espacio=new JLabel();
            espacio.setBackground(Color.white);
            espacio.setFont(new Font("Arial", Font.BOLD, 20));
            espacio.setBounds(100,y+10,600,100);
            panelDespacho.add(espacio);

    }


    public void contenedor(){

        this.getContentPane().add(contenedor);
        this.setSize(getMaximumSize());

        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
