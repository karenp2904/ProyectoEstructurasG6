package VistaOperador;

import Estructuras.Colas.ColasArray;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaOperadorDatos extends JFrame {

    /*
    Datos de registro de cliente y actulizacion, ingreso y actulizacion del pedido
     */
    JPanel panelCentral =new JPanel();
    JPanel panelFrecuentes=new JPanel();
    JPanel panelCompletar=new JPanel();
    JLabel fondo = new JLabel();
    JLayeredPane contenedor=new JLayeredPane();
    JTextField txbuscarPedido =new JTextField();
    JTextField txIngresarProducto =new JTextField();
    JTextField txIngresarCantidad =new JTextField();
    JTextField txIngresarTamaño =new JTextField();

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
        ImageIcon imgadmin= new ImageIcon("ModuloOperador/src/Imagenes/btningresarPedido2.png");// se le pone icono a boton
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

    //metodo para obtener el nombre el cliente
    public String ingresarNombre(){
        JTextField txusuario = new JTextField();
        txusuario.setBackground(Color.white);
        txusuario.setFont(new Font("Arial", Font.BOLD, 20));
        txusuario.setBounds(640, 150, 220, 40);
        panelCentral.add(txusuario);
        String usuario=txusuario.getText();// se obtiene el usuario
        return usuario;// se retorna
    }

    //metodo para obtener el telefono el cliente
    public String ingresarTelefono(){
        JTextField txTelefono = new JTextField();
        txTelefono.setBackground(Color.white);
       // txTelefono.setBackground(new Color(217,217,217));
        txTelefono.setFont(new Font("Arial", Font.BOLD, 20));
        txTelefono.setBounds(640, 200, 220, 40);
        panelCentral.add(txTelefono);
        String telefono=txTelefono.getText();// se obtiene el telefonor
        return telefono;// se retorna
    }

    //metodo para obtener la direccion el cliente
    public String ingresarDireccion(){
        JTextField txDireccion = new JTextField();
        txDireccion.setBackground(Color.white);
        txDireccion.setFont(new Font("Arial", Font.BOLD, 20));
        txDireccion.setBounds(640, 250, 220, 40);
        panelCentral.add(txDireccion);
        String direccion=txDireccion.getText();
        return direccion;
    }

    //metodo para obtener el tipo de cliente el cliente
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
        panelCentral.setBounds(200, 100, 900, 700);
        panelCentral.setBackground(Color.white);

        panelCompletar.setLayout(null);
        panelCompletar.setVisible(false);
        panelCompletar.setOpaque(true);
        panelCompletar.setBounds(350, 130, 500, 50);
        panelCompletar.setBackground(Color.lightGray);

        panelFrecuentes.setLayout(null);
        panelFrecuentes.setVisible(true);
        panelFrecuentes.setOpaque(true);
        panelFrecuentes.setBorder(null);
        panelFrecuentes.setBounds(100, 300, 300, 300);
        panelFrecuentes.setBackground(new Color(135, 170, 248));

        //letrero del registro de clinetes en el panel
        JLabel letreroFrecuentes = new JLabel("MÁS PEDIDOS");
        letreroFrecuentes.setBackground(new Color(16, 1, 1));
        letreroFrecuentes.setFont(new Font("Arial", Font.BOLD, 20));
        letreroFrecuentes.setBounds(60, 0, 300, 70);
        panelFrecuentes.add(letreroFrecuentes);

        JLabel logo=new JLabel("logoPerrito");
        logo.setBounds(800,500,300,300);
        ImageIcon imlogo= new ImageIcon("ModuloOperador/src/Imagenes/logoPerro.png");// se le pone icono a boton
        Icon logo1= new ImageIcon(imlogo.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(logo1);

        //letrero del registro de clinetes en el panel
        JLabel letreroIngreso = new JLabel("INGRESAR PEDIDO");
        letreroIngreso.setBackground(Color.black);
        letreroIngreso.setFont(new Font("Arial", Font.BOLD, 40));
        letreroIngreso.setBounds(500, 150, 600, 200);

        JLabel productoText = new JLabel("PRODUCTO: ");
        productoText.setBackground(Color.black);
        productoText.setFont(new Font("Arial", Font.BOLD, 20));
        productoText.setBounds(370, 190, 200, 100);
        panelCentral.add(productoText);

        JLabel tamañoText = new JLabel("CÓDIGO: ");
        tamañoText.setBackground(Color.black);
        tamañoText.setFont(new Font("Arial", Font.BOLD, 20));
        tamañoText.setBounds(370, 260, 200, 100);
        panelCentral.add(tamañoText);

        JLabel cantidadText = new JLabel("CANTIDAD: ");
        cantidadText.setBackground(Color.black);
        cantidadText.setFont(new Font("Arial", Font.BOLD, 20));
        cantidadText.setBounds(370, 330, 200, 100);
        panelCentral.add(cantidadText);

        JButton botonBuscar=new JButton();
        botonBuscar=new JButton();//boton para buscar cliente
        botonBuscar.setBounds(900, 50, 200, 80);
        ImageIcon imgBus= new ImageIcon("ModuloOperador/src/Imagenes/botonBuscar.png");// se le pone icono a boton
        Icon ibus= new ImageIcon(imgBus.getImage().getScaledInstance(botonBuscar.getWidth(), botonBuscar.getHeight(), Image.SCALE_DEFAULT));
        botonBuscar.setIcon(ibus);
        botonBuscar.setLayout(null);
        botonBuscar.setOpaque(true);
        botonBuscar.setBorderPainted(false);
        ImageIcon imgBus2= new ImageIcon("ModuloOperador/src/Imagenes/botonBuscar2.png");// se le pone icono a boton
        Icon ibus2= new ImageIcon(imgBus2.getImage().getScaledInstance(botonBuscar.getWidth(), botonBuscar.getHeight(), Image.SCALE_DEFAULT));
        botonBuscar.setRolloverIcon(ibus2);
        botonBuscar.setBackground(Color.white);

        botonBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCompletar.setVisible(true);
            }
        });



        JButton botonIngresar=new JButton(); //boton para ingresar pedido
        botonIngresar.setBounds(350, 450, 200, 100);
        ImageIcon imgR= new ImageIcon("ModuloOperador/src/Imagenes/btnConfirmar.png");// se le pone icono a boton
        Icon i= new ImageIcon(imgR.getImage().getScaledInstance(botonIngresar.getWidth(), botonIngresar.getHeight(), Image.SCALE_DEFAULT));
        botonIngresar.setIcon(i);
        botonIngresar.setLayout(null);
        botonIngresar.setOpaque(true);
        botonIngresar.setBorderPainted(false);
        ImageIcon imgadmin= new ImageIcon("ModuloOperador/src/Imagenes/btnConfirmar2.png");// se le pone icono a boton
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

        contenedor.add(txbuscarPedido,Integer.valueOf(2));
        contenedor.add(panelFrecuentes,Integer.valueOf(4));
        contenedor.add(logo,Integer.valueOf(3));
        contenedor.add(letreroIngreso,Integer.valueOf(3));
        contenedor.add(botonBuscar,Integer.valueOf(2));
        contenedor.add(panelCentral,Integer.valueOf(2));
        contenedor.add(panelCompletar,Integer.valueOf(4));
    }

    //metodo para buscar pedido- autocompletar
    public String buscarPedido(){
        Color colorPanel=new Color(234,234,234);
        txbuscarPedido.setBackground(colorPanel);
        txbuscarPedido.setFont(new Font("Arial", Font.BOLD, 30));
        txbuscarPedido.setBounds(350, 60, 500, 60);
        String nombrePedido=txbuscarPedido.getText();
        panelCentral.add(txbuscarPedido);
        return nombrePedido;
    }

    //metodo para segun el pedido de la barra de busqueda se muestren los parecidos
    public void mostrarPedidosEncontrados(ColasArray pedidosEncontrados){
        //letrero del registro de clinetes en el panel
        int y=10;//se define la altura
        while(pedidosEncontrados.size()==0) {
            JLabel titulo=new JLabel(pedidosEncontrados.dequeue().toString());
            titulo.setBackground(Color.black);
            titulo.setFont(new Font("Arial", Font.BOLD, 20));
            titulo.setBounds(50,y,600,100);
            panelCompletar.add(titulo);
            y+=40;//se le agrega distancia a y para la ubicacion del texto

        }
    }

    //metodo para ingresar producto del pedido
    public String ingresarProducto(){
        Color colorPanel=new Color(234,234,234);
        txIngresarProducto.setBackground(colorPanel);
        txIngresarProducto.setFont(new Font("Arial", Font.BOLD, 20));
        txIngresarProducto.setBounds(500, 210, 400, 50);
        String producto=txIngresarProducto.getText();
        panelCentral.add(txIngresarProducto);
        return producto;
    }

    //metodo para ingresar codigo del producto del pedido
    public String ingresarCodido(){
        Color colorPanel=new Color(234,234,234);
        txIngresarTamaño.setBackground(colorPanel);
        txIngresarTamaño.setFont(new Font("Arial", Font.BOLD, 20));
        txIngresarTamaño.setBounds(500, 280, 400, 50);
        String tamaño=txIngresarTamaño.getText();
        panelCentral.add(txIngresarTamaño);
        return tamaño;
    }

    //metodo para ingresar cantidad del producto del pedido
    public String ingresarCantidad(){
        Color colorPanel=new Color(234,234,234);
        txIngresarCantidad.setBackground(colorPanel);
        txIngresarCantidad.setFont(new Font("Arial", Font.BOLD, 20));
        txIngresarCantidad.setBounds(500, 350, 400, 50);
        String Cantidad=txIngresarCantidad.getText();
        panelCentral.add(txIngresarCantidad);
        return Cantidad;
    }

    //metodo para editar los mas pedidos del restaurante
    public void editarPedidosFrecuentes(String[] pedidos){
        int y=50;
        for (int i = 0; i <pedidos.length ; i++) {
            JLabel titulo=new JLabel(pedidos[i]);
            titulo.setBackground(Color.black);
            titulo.setFont(new Font("Arial", Font.BOLD, 20));
            titulo.setBounds(50,y,600,100);
            panelFrecuentes.add(titulo);
            y+=50;//se le agrega distancia a y para la ubicacion del texto
            //otorga espacios
            JLabel espacio=new JLabel();
            espacio.setBackground(Color.white);
            espacio.setFont(new Font("Arial", Font.BOLD, 20));
            espacio.setBounds(100,y+10,600,100);
            panelFrecuentes.add(espacio);
        }
    }


    //panel para actualizar los datos del cliente
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
        ImageIcon imgadmin= new ImageIcon("ModuloOperador/src/Imagenes/btningresarPedido2.png");// se le pone icono a boton
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

    //panel para actualizar el pedido
    public void panelActualizarPedido(){
        panelCentral.setLayout(null);
        panelCentral.setVisible(true);
        panelCentral.setOpaque(true);
        panelCentral.setBounds(200, 100, 900, 700);
        panelCentral.setBackground(Color.white);

        panelCompletar.setLayout(null);
        panelCompletar.setVisible(false);
        panelCompletar.setOpaque(true);
        panelCompletar.setBounds(350, 130, 500, 50);
        panelCompletar.setBackground(Color.lightGray);

        panelFrecuentes.setLayout(null);
        panelFrecuentes.setVisible(true);
        panelFrecuentes.setOpaque(true);
        panelFrecuentes.setBorder(null);
        panelFrecuentes.setBounds(100, 300, 300, 300);
        panelFrecuentes.setBackground(new Color(135, 170, 248));

        //letrero del registro de clinetes en el panel
        JLabel letreroFrecuentes = new JLabel("MÁS PEDIDOS");
        letreroFrecuentes.setBackground(new Color(16, 1, 1));
        letreroFrecuentes.setFont(new Font("Arial", Font.BOLD, 20));
        letreroFrecuentes.setBounds(60, 0, 300, 70);
        panelFrecuentes.add(letreroFrecuentes);

        JLabel logo=new JLabel("logoPerrito");
        logo.setBounds(800,500,300,300);
        ImageIcon imlogo= new ImageIcon("ModuloOperador/src/Imagenes/logoPerro.png");// se le pone icono a boton
        Icon logo1= new ImageIcon(imlogo.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(logo1);

        //letrero del registro de clinetes en el panel
        JLabel letreroIngreso = new JLabel("ACTUALIZAR PEDIDO");
        letreroIngreso.setBackground(Color.black);
        letreroIngreso.setFont(new Font("Arial", Font.BOLD, 40));
        letreroIngreso.setBounds(500, 150, 600, 200);

        String buscar=buscarPedido();
        String producto=ingresarProducto();
        String cantidad=ingresarCantidad();
        String tamaño= ingresarCodido();

        JLabel productoText = new JLabel("PRODUCTO: ");
        productoText.setBackground(Color.black);
        productoText.setFont(new Font("Arial", Font.BOLD, 20));
        productoText.setBounds(370, 190, 200, 100);
        panelCentral.add(productoText);

        JLabel tamañoText = new JLabel("CÓDIGO: ");
        tamañoText.setBackground(Color.black);
        tamañoText.setFont(new Font("Arial", Font.BOLD, 20));
        tamañoText.setBounds(370, 260, 200, 100);
        panelCentral.add(tamañoText);

        JLabel cantidadText = new JLabel("CANTIDAD: ");
        cantidadText.setBackground(Color.black);
        cantidadText.setFont(new Font("Arial", Font.BOLD, 20));
        cantidadText.setBounds(370, 330, 200, 100);
        panelCentral.add(cantidadText);

        JButton botonBuscar=new JButton();
        botonBuscar=new JButton();//boton para buscar cliente
        botonBuscar.setBounds(900, 50, 200, 80);
        ImageIcon imgBus= new ImageIcon("ModuloOperador/src/Imagenes/botonBuscar.png");// se le pone icono a boton
        Icon ibus= new ImageIcon(imgBus.getImage().getScaledInstance(botonBuscar.getWidth(), botonBuscar.getHeight(), Image.SCALE_DEFAULT));
        botonBuscar.setIcon(ibus);
        botonBuscar.setLayout(null);
        botonBuscar.setOpaque(true);
        botonBuscar.setBorderPainted(false);
        ImageIcon imgBus2= new ImageIcon("ModuloOperador/src/Imagenes/botonBuscar2.png");// se le pone icono a boton
        Icon ibus2= new ImageIcon(imgBus2.getImage().getScaledInstance(botonBuscar.getWidth(), botonBuscar.getHeight(), Image.SCALE_DEFAULT));
        botonBuscar.setRolloverIcon(ibus2);
        botonBuscar.setBackground(Color.white);

        botonBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCompletar.setVisible(true);
            }
        });



        JButton botonIngresar=new JButton(); //boton para ingresar pedido
        botonIngresar.setBounds(350, 450, 200, 100);
        ImageIcon imgR= new ImageIcon("ModuloOperador/src/Imagenes/btnConfirmar.png");// se le pone icono a boton
        Icon i= new ImageIcon(imgR.getImage().getScaledInstance(botonIngresar.getWidth(), botonIngresar.getHeight(), Image.SCALE_DEFAULT));
        botonIngresar.setIcon(i);
        botonIngresar.setLayout(null);
        botonIngresar.setOpaque(true);
        botonIngresar.setBorderPainted(false);
        ImageIcon imgadmin= new ImageIcon("ModuloOperador/src/Imagenes/btnConfirmar2.png");// se le pone icono a boton
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

        contenedor.add(txbuscarPedido,Integer.valueOf(2));
        contenedor.add(panelFrecuentes,Integer.valueOf(4));
        contenedor.add(logo,Integer.valueOf(3));
        contenedor.add(letreroIngreso,Integer.valueOf(3));
        contenedor.add(botonBuscar,Integer.valueOf(2));
        contenedor.add(panelCentral,Integer.valueOf(2));
        contenedor.add(panelCompletar,Integer.valueOf(4));
    }


    //metodo para el contendor
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
