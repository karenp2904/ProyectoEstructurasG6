package Estructuras.ListasSimples;

public class LinkedList {
    public Node head;
    int SizeList;
    public Node previous;

    // First method
    public void list(){
        this.head = null;
        this.SizeList = 0;
    }

    public void addLast(Object element) {
    }

    public Void getFirst() {
        return null;
    }

    public Void removeFirst() {
        return null;
    }

    public void clear() {
    }

    //Crear el nodo
    public class Node{
        // Primero se crean los objetos
        public Object element;
        public Node next;



        // Se crea el Constructor
        public Node(Object element){
            this.element = element;
            next = null;
        }

    }

    public void append( Object element){
        Node node = new Node(element);
        Node current;
        // Validar si la lista está vacía
        if(head == null){
            head = node; // Se agrega a la head el nuevo Nodo
        } else {
            // Se recorre la lista
            current = head;
            // Si existe elemento en el node.next hasta que finalice la lista = null

            while (current.next != null ){
                // Toma el siguiente valor
                current = current.next;

            }
            current.next = node;
        }
        //La lista agranda is like a list size
        SizeList++;

    }

    public boolean insert(int position ,Object element){
        Node node = new Node(element);
        Node current = head;
        Node previous = null;
        int index = 0;

        //Primero se valida el rango de los elementos
        if(position >= 0 && position <= SizeList){
            // Agregar elemento al inicio
            if(position == 0){
                node.next = current;
                this.head = node;
            } else {
                // recorrer la lista  la posición que se requiera
                while (index++ < position){
                    previous = current;
                    current = current.next;
                }

                node.next = current;
                previous.next = node;
            }
            SizeList++;
            return true;
        }
            return false;
        }

    public boolean removeAt(int position){
        // Validar rango
        if(position > -1 && position < SizeList) {
            Node current = head;
            Node previous = null;
            Node node = new Node(position);
            int index = 0;

            // Removemos el primer elemento

            if (position == 0) {
                node.next = head;
                head = node;
            } else {
                // Siempre se usa un while para recorrer
                while (index++<position){
                    previous = current;
                    current = current.next;
                }

                node.next = current;
                previous.next = node;

            }
            SizeList++;
            return true;
        }
        return false;
    }

    public boolean remove(Object element) {
        int index = indexOf(element);
        if (index >= 0) {
            removeAt(index);
            return true;
        }
        return false;
    }

    public int indexOf(Object element) {
        Node current = head;
        int index = 0;

        while(current != null){

            if(current.element.equals(element)){
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    public boolean hasElements(){
        return SizeList > 0;
    }

    public int size(){
        return SizeList;
    }

    public String print(){
        // Definen los objetos con sus instacias respectivas si es el caso
        Node current = head;
        StringBuilder string = new StringBuilder(new String());
        int index = 0;

        while (current != null){
            string.append("[").append(index).append("]").append(current.element);
            if(current.next != null){
                string.append("=>");

            }
            current = current.next;
            index++;
        }

        return string.toString();
    }


}
