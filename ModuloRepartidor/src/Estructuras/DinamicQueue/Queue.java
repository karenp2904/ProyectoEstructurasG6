package Estructuras.DinamicQueue;

import Estructuras.ListasEnlaceDoble.LinkedList;
import Estructuras.ListasEnlaceDoble.LinkedListNode;

import java.util.Iterator;

public class Queue implements QueueInterface {
	
	LinkedList<Object> cola= new LinkedList();// se instancia la lista para las colas
	
	//Datos:
	//En la cola se ingresa por tail y se extrae por head
	//Cuando se extrae en objeto se elimina - Por lo cual se implementa el pophead()
	
	public Queue() {//constructor
		
	}

	//1 limpiara toda la cola
	@Override
	public void clear() {
		cola.clear();
		
	}

	//2 Extrae un elemento por la cabeza
	@Override
	public Object extract() {
		if(!isEmpty()) {
			return cola.popHead();//extraera el primer elemento y lo borarrá, pero retorna ese objeto
		}else {
			return null;//si la lista esta vacia no podra extraer nada
		}
		
	}

	//3 Inserta un objeto en la ultima posicion
	@Override
	public boolean insert(Object object) {
		boolean objetoInsertado=false;
		try {
			if(object!=null) {
				cola.addLast(object);// agregara un elemento al final de la cola
				objetoInsertado= true;
			}
		} catch (Exception e){
	         e.printStackTrace();
	     }finally{
	         return objetoInsertado; //retornar el valor booleano que indica si hubo una insercion o no
	     }
	}

	//4 Retorna el tamaño de la cola - Cantidad de elementos
	@Override
	public int size() {
		return cola.size();
	}

	//5 Retornará segun si la cola se encuentra vacia o no
	@Override
	public boolean isEmpty() {
		return cola.isEmpty();
	}

	//6 Buscara un objeto dentro de la cola 
	@Override
	public boolean search(Object object) {
		boolean objetoEncontrado=false;
		try {
			if(object!=null) {//el objeto no puede ser null
				objetoEncontrado=cola.contains(object);//el contains retorna un boolean, entonces si lo encuentra retornará true, en caso contrario false
			}
		} catch (Exception e){
	         e.printStackTrace();
	     }finally{
	         return objetoEncontrado; //retornar el valor booleano que indica si hubo una insercion o no
	     }
	}

	//Ordena 
	@Override
	public void sort() {
		Queue queuetemp = new Queue();
		Queue queueaux2 = new Queue();
        int tamaño = this.size();
        for (int i = 0; i < tamaño; i++) {
            Object objt = extract();
            if (objt != null) {
                if (objt instanceof String) {
                	queuetemp.insert(objt);
                } else {
                	queueaux2.cola.addFirst(objt);
                }
            }
        }
        for (int i = 0; i < tamaño; i++) {
            if (queuetemp.size() != 0) {
                insert(queuetemp.extract());
            } else {
                insert(queueaux2.extract());
            }
        }
	}

	//Reveresa
	@Override
	public void reverse() {
		LinkedList colareverse=new LinkedList();
		while(size()!=0) {
			colareverse.addFirst(this.extract());
		}
	
		cola= colareverse;
	}
	
	public String toString() {
		String print=""; 
		Queue temporal= new Queue();
		LinkedListNode nodo=new LinkedListNode();
		print+="Queue[  ";
		int size=size();
		for (int i = 0; i < size; i++) {
			
			Iterator iterador=cola.iterator();
			while(iterador.hasNext()) {
				nodo=(LinkedListNode) iterador.next();
				print+="{ "+nodo.getObject()+" } -- ";
				temporal.insert(extract());
				
			}

		}
		print+=" ]";
		for (int i = 0; i < size; i++) {
			insert(temporal.extract());
			
		}
		return print;
	}

	
	

}
