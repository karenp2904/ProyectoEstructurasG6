package Estructuras.ListasEnlaceDoble;

import java.util.Iterator;

public interface List<T> {

    /***
     * 1. Agrega un objeto al final de la lista.
     * @param object objeto
     * @return boolean true
     */
    public boolean add(T object);

    /***
     * 2. Inserta un objeto en una posición siguiente al nodo especificado.
     * @param node nodo
     * @param object objeto
     * @return boolean true
     */
    public boolean add(Node node, T object);

    /***
     * 3. Inserta un nodo en una posición siguiente al nodo especificado.
     * @param node node
     * @param next node
     * @return boolean true
     */
    public boolean add(Node node, Node next);

    /***
     * 4. Agrega todos los objetos de un array al final de la lista.
     * @param objects objetos
     * @return boolean true
     */
    public boolean add(T[] objects);

    /***
     * 5. Inserta todos los objetos de un array desde el nodo especificado.
     * @param node nodo
     * @param objects objetos
     * @return boolean true
     */
    public boolean add(Node node, T[] objects);

    /***
     * 6. Inserta el objeto especificado al inicio de la lista.
     * @param object objecto
     * @return boolean true
     */
    public boolean addFirst(T object);

    /***
     * 7. Agrega todos los objetos de un array al inicio de la lista.
     * @param objects objetos
     * @return boolean true
     */
    public boolean addFirst(T[] objects);

    /***
     * 8. Inserta el objeto especificado al final de la lista.
     * @param object objeto
     * @return boolean true
     */
    public boolean addLast(T object);

    /***
     * 9. Agrega todos los objetos de un array al final de la lista.
     * @param objects objetos
     * @return boolean true
     */
    public boolean addLast(T[] objects);

    /***
     * 10. Elimina todos los elementos de la lista.
     * @return boolean true
     */
    public boolean clear();

    /***
     * 11. Retorna una instacia nueva de la lista.
     * @return List
     */
    public List clone();

    /***
     * 12. Retorna verdadero si contiene el objeto.
     * @param object objecto
     * @return boolean true
     */
    public boolean contains(T object);

    /***
     * 13. Retorna verdadero si contiene todos los objetos.
     * @param objects objectos
     * @return boolean true
     */
    public boolean contains(T[] objects);

    /***
     * 15. Retorna el nodo del objeto especificado, o null si no contiene el objeto.
     * @param object objeto
     * @return node nodo
     */
    public Node nodeOf(T object);

    /***
     * 16. Retorna verdadero si no contiene elementos.
     * @return boolean true
     */
    public boolean isEmpty();

    /***
     * 17. Retorna el objeto del último nodo insertado.
     * @return Object objeto
     */
    public T get();

    /***
     * 18. Retorna un objeto de la posición del nodo especificado.
     * @param node nodo
     * @return Object objeto
     */
    public T get(Node node);

    /***
     * 19. Retorna un objeto de la posición previa al nodo especificado.
     * @param node nodo
     * @return Object objeto
     */
    public T getPrevious(Node node);

    /***
     * 20. Retorna un objeto de la posición siguinete al nodo especificado.
     * @param node nodo
     * @return Object objeto
     */
    public T getNext(Node node);

    /***
     * 21. Retorna el objeto al inicio de esta lista.
     * @return Object objeto
     */
    public T getFirst();

    /***
     * 22. Retorna un array de n objetos desde inicio de esta lista.
     * @return Object objetos
     */
    public T[] getFirst(int n);

    /***
     * 23. Retorna el objeto al final de esta lista.
     * @return Object objeto
     */
    public T getLast();

    /***
     * 24. Retorna un array de n objetos previos al final de esta lista.
     * @return Object objetos
     */
    public T[] getLast(int n);

    /***
     * 25. Retorna el objeto al final de esta lista y lo elimina.
     * @return Object objeto
     */
    public T pop();

    /***
     * 26. Elimina el nodo en la lista.
     * @param object objeto
     * @return true
     */
    public boolean remove(T object);

    /***
     * 27. Elimina el nodo en la lista.
     * @param node nodo
     * @return true
     */
    public boolean remove(Node node);

    /***
     * 28. Elimina de esta lista todos los nodos de los objetos que están contenidos en la colección especificada.
     * @param  objects objetos
     * @return true
     */
    public boolean removeAll(T[] objects);

    /***
     * 29. Conserva solo los objetos del array.
     * @param objects objetos
     * @return boolean true
     */
    public boolean retainAll(T[] objects);

    /***
     * 30. Reemplaza el objeto en la posición del nodo especificado.
     * @param node nodo
     * @param object object
     * @return true
     */
    public boolean set(Node node, T object);

    /***
     * 31. Retorna el número de nodos de esta lista.
     * @return int amount
     */
    public int size();

    /***
     * 32. Retorna una sub lista de la lista.
     * @param from nodo
     * @param to nodo
     * @return List list
     */
    public List subList(Node from, Node to);

    /***
     * 33. Retorna un array que contiene todos los elementos de esta lista.
     * @return array arreglo
     */
    public T[] toArray();

    /***
     * 34. Ordenar lista por un criterio.
     * @param c criterio
     * @return boolean list
     */
    public boolean orderBy(char c);

    /***
     * 35. Retorna un string con el contenido de la lista.
     * @return String lista
     */
    public String toString();

    /***
     * Imprimir en consola el contenido de la lista.
     */
    public void print();

    /***
     * Iterator.
     */
    public Iterator<Node> iterator();

    /***
     * TODO DO *
     */

}
