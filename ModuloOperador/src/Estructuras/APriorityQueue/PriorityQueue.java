package Estructuras.APriorityQueue;

import Estructuras.DinamicQueue.Queue;

public class PriorityQueue implements QueueInterface {

	Queue arrayQueue[];//array de prioridad
	final int numeroPrioridad;//numero de prioridades establecedido
	
	public PriorityQueue(int numeroPrioridad) {
		
		this.numeroPrioridad=numeroPrioridad;//se modifica el numero de prioridad
		arrayQueue=new Queue[numeroPrioridad];// el array tendra el tamaño del numero de prioridades que se establezcan
		for (int a = 0; a < arrayQueue.length; a++) {
			arrayQueue[a]=new Queue(); // en cada posicion del array se inicializa una cola de listas
		}
	}
	
	
	public void clear() {
		arrayQueue=new Queue[numeroPrioridad];// se intancia nuevamente el arrayQueue
		for (int i = 0; i < arrayQueue.length; i++) {
			arrayQueue[i]= new Queue();// se inicializa al lista en la posicion de forma que vuelve a quedar vacia
		}
		
	}
	
	
	public boolean isEmpty() {
		boolean vacia=false;
		for (int i = 0; i < arrayQueue.length; i++) {
			Queue queue=arrayQueue[i];
			if (!queue.isEmpty()) {
				vacia=false;// si encuentra una cola que no este vacia pues ya se retorna el false que indica que hay elementos
				break;
			}
		}
		return vacia;
		
	}
	
	
	public Object extract() {
		for (int i = 0; i < arrayQueue.length; i++) {
			Queue queue= arrayQueue[i];
			while(!queue.isEmpty()) {//hasta que la cola en esa posicion no este vacia se sigue extrayendo de la misma posicion
				return queue.extract();
			}
		}
		return arrayQueue;
		
	}
	
	
	public boolean insert(Object object, int prioridad) {
		boolean insertado=false;
		if(!isEmpty()) {
			if (prioridad>0 && object!=null) {
				Queue queue= arrayQueue[prioridad];
			    arrayQueue[prioridad].insert(object);//en el indice segun la prioridad que se indique se aña el objeto a la lista
				insertado=true;
			}
		}
		return insertado;	
	}
	
	
	public int size() {
		return numeroPrioridad;
		
	}
	
	public boolean search(Object object) {
		boolean encontrado=false;
		for (int i = 0; i < arrayQueue.length; i++) {
			Queue queue=arrayQueue[i];
			if(queue.search(object)) {
				encontrado= true;
			}
		}
		return encontrado;
	}
	
	
	public void sort() {
		for (int i = 0; i < arrayQueue.length; i++) {
			Queue queue= arrayQueue[i];
			queue.sort();
		}
	}
	
	
	public void reverse() {
		Queue[] nuevoArray=new Queue[numeroPrioridad];
		int k=0;
		int i=numeroPrioridad-1;
		while(k!=numeroPrioridad) {
			arrayQueue[k]=arrayQueue[i];
			k++;
			i--;
		}
		
	}
	
	
	public String toString() {
		String print="";
		for (int i = 0; i < arrayQueue.length; i++) {
			Queue queue= arrayQueue[i];
			print+="\nPrioridad "+ i +" - ";
			print+=queue.toString();
			 
		}
		return print;
		
	}
}
