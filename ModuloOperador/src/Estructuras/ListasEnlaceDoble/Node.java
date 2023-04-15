package Estructuras.ListasEnlaceDoble;

public interface Node<T> {

    /***
     * Asigna un objeto genérico.
     * @param object objeto
     * @return boolean true
     */
    public boolean setObject(T object);

    /***
     * Retorna el objeto genérico.
     * @return object objeto
     */
    public T getObject();

    /***
     * Retorna verdadero si el objeto especificado es igual al que contiene el nodo.
     * @param object objeto
     * @return true
     */
    public boolean isEquals(T object);

    /***
     * Retorna toda la información del nodo como una cadena.
     * @return String node
     */
    public String toString();

}
