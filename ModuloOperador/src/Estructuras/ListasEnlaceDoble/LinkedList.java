package Estructuras.ListasEnlaceDoble;
import java.util.Iterator;


public class LinkedList<T> implements List<T> {
	//17-02 inicio- borro metodos
	//19-02 investigar e iniciar con metodos add
	//21-02 verificar el nodo prev y el toString

    public LinkedListNode head; //Es una referencia, una dirección de memoria
    public LinkedListNode tail;
    
    // Iterador.
    LinkedListNode inode=new LinkedListNode();

    public LinkedList() { //permite iniciar una lista sin que tenga ningun nodo
        this.head = null;
        this.tail = null;
    }

    public LinkedList(T object) { //Permite pasar el primer elemento
        this.head = tail = new LinkedListNode(object);
    }
    
    
    //1 Agrega un objeto al final de la lista.
    @Override
    public boolean add(T object) {
        boolean agregado = false;
        try{
           if(object!=null) {
        	   if(isEmpty()) {
        		   this.head=tail=new LinkedListNode(object);
        	   }else {
        		   LinkedListNode nuevoNodo= new LinkedListNode(object);
        		   nuevoNodo.prev=tail;//se conecta al previo del nuevoNodo con la cola
        		   tail.next=nuevoNodo;// la cola siguiente sera el nueov nodo
        		   tail=nuevoNodo;// la nueva cola sera el nuevoNodo
        	   }
        	   agregado=true;
        	   return agregado;
           }
        } catch (Exception e){
            e.printStackTrace();
        }finally{
            return agregado; //retornar el valor booleano que indica si hubo una insercion o no
        }
    }
    
    
    //2 Inserta un objeto en una posición siguiente al nodo especificado.
    @Override
    public boolean add(Node node, T object) {
    	boolean agregado=false;
    	try {
    		LinkedListNode nuevoNodo=(LinkedListNode)node;
    		LinkedListNode nodoSiguiente;
    		if(object!=null) {
    			if(isEmpty()) {
        			nuevoNodo=head;
        			nuevoNodo=new LinkedListNode(object,null,null);
        		}
        		if(nuevoNodo==tail) {
        			nodoSiguiente=new LinkedListNode(object);
        			nodoSiguiente.prev=tail;// se conecta el nodo con la cola
        			tail.next=nodoSiguiente;//la cola siguiente se conecta con el nodo 
        			tail=nodoSiguiente;//la cola sera el nodo
        		}
        		else {    
        			nodoSiguiente=new LinkedListNode(object);
        			nodoSiguiente=nuevoNodo.next;//el nodo sera el siguiente
        			nodoSiguiente.prev=nuevoNodo;
        			nodoSiguiente.next=nuevoNodo.next.next.prev;//se conecta el siguietne del nodo con el nuevo nodo de dps posiciones
        			nuevoNodo.next.next.prev=nodoSiguiente.next;// se conecta el nodo de dos posiciones alla con dole enlaca
        		}
        		agregado=true;
    		}
        	return agregado;	
    	}catch (Exception e){
            e.printStackTrace();
        }finally{
            return agregado; //retornar el valor booleano que indica si hubo una insercion o no
        }
    }

    
    //3 Inserta un nodo en una posición siguiente al nodo especificado.
    @Override
    public boolean add(Node node, Node next) {
    	LinkedListNode nodoAInsertar= (LinkedListNode)node;
    	LinkedListNode nodoEspecificado=(LinkedListNode)next;
    	boolean agredado=false;
    	try {
    		if(nodoAInsertar!=null) {
    			if(isEmpty()){//si la lista esta vacia
    				nodoEspecificado=head; 
    				nodoAInsertar=nodoEspecificado.next;//el siguiente a la cabeza
    				nodoAInsertar.prev=nodoEspecificado;
    				nodoAInsertar=new LinkedListNode();  
                    }
    			else {
    				if(nodoEspecificado.next==tail) {// si se inserta la cola
    					nodoAInsertar=new LinkedListNode();
                    	nodoAInsertar=nodoEspecificado.next;
                    	nodoAInsertar.prev=nodoEspecificado.next;
    				}else {
    					nodoAInsertar=new LinkedListNode();//si se inserta un nodo en medio de la lista
                    	nodoAInsertar=nodoEspecificado.next;
                    	nodoAInsertar.prev=nodoEspecificado.next;
                    	nodoEspecificado.next.prev=nodoAInsertar.next;//se estabablece el enlace si hay un nodo despues
                    	nodoAInsertar.next=nodoEspecificado.next.next;
    				}
            	}
    			agredado=true;
    			return agredado;
    			}	
    	}catch (Exception e) {
    		e.printStackTrace();
        }finally{
            return agredado; 
        }
    }

    //4. Agrega todos los objetos de un array al final de la lista.
    @Override
    public boolean add(T[] objects) {
    	boolean agregado=false;
    	try {
    		if(objects!=null) {
				for (int i = 0; i < objects.length; i++) {
					add(objects[i]);//se llama al metodo añadir al final de la lista
					agregado=true;
				}
				return agregado;
    		}
    	}catch (Exception e) {
    		e.printStackTrace();
        }finally{
            return agregado; 
        }
        
    }

    //5. Inserta todos los objetos de un array desde el nodo especificado.
    @Override
    public boolean add(Node node, T[] objects) {
    	LinkedListNode nodo=(LinkedListNode)node;
    	boolean agredado=false;
    	try {
    		if(nodo!=null) {
    			if(objects!=null) {
    				for (int i = 0; i < objects.length; i++) {
    					if(isEmpty()){
            				add(objects[i]);//se llama al metodo añadir a la lista
                            }
            			else {
                        	add(nodo,objects[i]);//se llama al metodo de nodo con objeto
                        	nodo=nodo.next;// el nodo cambia de posicion
                        	agredado=true;
                        	}
					}
    				return agredado;
    			}
    		}	
    	}catch (Exception e) {
    		e.printStackTrace();
        }finally{
            return agredado; 
        }
    }

    // 6. Inserta el objeto especificado al inicio de la lista.
    @Override
    public boolean addFirst(T object) {
    	boolean agregado=false;
    	try {
    		if(object!=null) {
    			if(isEmpty()) {// si esta vacia
            		head= new LinkedListNode(object,null,null);// apunta al siguiente nodo - Constructor de la clase de nodos
            		tail=head;
            	}
            	else {
            		LinkedListNode nuevoNodo=new LinkedListNode(object,null, head);
            		nuevoNodo.next=head;//se da enlace a la cabeza
            		head.prev=nuevoNodo;//la cabeza apunta al nuevo nodo
            		head=nuevoNodo;// la nueva cabeza
            	}
    			agregado=true;
    		}
    	}catch (Exception e) {
    		e.printStackTrace();
        }finally{
            return agregado; 
        }
    }

    // 7. Agrega todos los objetos de un array al inicio de la lista.
    @Override
    public boolean addFirst(T[] objects) {
    	boolean agregado=false;
    	try {
    		if(objects!=null) {
    			for (int i = 0; i < objects.length; i++) {
    					addFirst(objects[i]);//se llama al metdodo agregar al inicio
    					agregado=true;
				}
    		}			
    	}catch (Exception e) {
    		e.printStackTrace();
        }finally{
            return agregado; 
        }
    }

    //8. Inserta el objeto especificado al final de la lista.
    @Override
    public boolean addLast(T object) {
    	boolean agregado=false;
    	try {
    		if(object!=null) {
    			add(object);//se llama al meotod añadir al final
    			agregado=true;
    			}
    	}catch (Exception e) {
    		  e.printStackTrace();
		}finally{
			return agregado;
		}
    	 
    }

    //9. Agrega todos los objetos de un array al final de la lista.
    @Override
    public boolean addLast(T[] objects) {
    	boolean agregado=false;
    	try {
    		if(objects!=null) {
    			for (int i = 0; i < objects.length; i++) {
					add(objects[i]);//se llama al meotod añadir al final
					agregado=true;
				}
    		}
    	}catch (Exception e) {
    		e.printStackTrace();
		}finally{
			return agregado;
		}
    }

    //  10. Elimina todos los elementos de la lista.
    @Override
    public boolean clear() {
       tail=null; head=null;
       return true;
    }

    //11. Retorna una instacia nueva de la lista.
    @Override
    public List clone() {
    	LinkedList nuevaLista=new LinkedList();
    	try {
    		if(isEmpty()) {
    			return nuevaLista;
    		}
    		else {
    			LinkedListNode nodoAux=head;
        		for (int i = 0; i < size(); i++) {
    				nuevaLista.add(nodoAux.getObject());
    				nodoAux=nodoAux.next;
    			}
        	    return nuevaLista;
    		}
    	}catch (Exception e) {
        		e.printStackTrace();
        		return null;
		}
    }

    //12. Retorna verdadero si contiene el objeto.
    @Override
    public boolean contains(T object) {
    	boolean objetoEncontrado=false;
    	try {
    		if(object==null) {
    			return objetoEncontrado;
    		}
    		else{
    			
    			while(objetoEncontrado!=true) {
                	Iterator iterador=iterator();
                	while( iterador.hasNext()) {//mientras se itere
                		LinkedListNode  nodoAux=(LinkedListNode) iterador.next();// se hace un cast para el iterador
                		if(nodoAux.getObject()==object) {// se obtiene el objeto de la lista y se compara
                			objetoEncontrado=true;
                    		System.out.println("Contiene al objeto "+ object);
            			}
    				}
            	}	
            }
    		return objetoEncontrado;
    	}catch (Exception e) {
    		e.printStackTrace();
		}finally {
			return objetoEncontrado;
		}
        
    }

    // 13. Retorna verdadero si contiene todos los objetos.
    @Override
    public boolean contains(T[] objects) {
    	boolean objetoEncontrados=false; int contenedor=0;
    	try {
    	    	//REVISAR
    			Iterator iterador=iterator();
            	while(iterador.hasNext()) {
            		LinkedListNode nodoObjeto=(LinkedListNode) iterador.next();
            		for (int j = 0; j < objects.length; j++) {
            			if(nodoObjeto.getObject()==objects[j]) {// se obtiene el objeto de la lista y se compara
            				contenedor++;
            			}
    				}
            	}
            	if(contenedor==objects.length) {
	        		objetoEncontrados=true;
        		}else {
	        		objetoEncontrados=false;
    	        	}
    			return objetoEncontrados;
    	}catch (Exception e) {
    		e.printStackTrace();
		}finally {
			return objetoEncontrados;
		}
    }

    //15. Retorna el nodo del objeto especificado, o null si no contiene el objeto.
    @Override
    public Node nodeOf(T object) {
    	boolean nodoEncontrado=false;
    	LinkedListNode nodoRetornar=new LinkedListNode();
    	try {
    		 Iterator iterador=iterator();
    		 while(iterador.hasNext()) {
    			 inode=(LinkedListNode) iterador.next();
    	        	if(inode.getObject()==object) {
    	        		nodoEncontrado=true;
    	        		System.out.println("Se ha encontradon el nodo" + inode);
    	        	}
    	        	if(nodoEncontrado) {
    	        		 nodoRetornar=inode;
    	        	}
    	        }
    		 if(nodoEncontrado) {
    			 return inode;
    				}
    		 else {
    			 nodoRetornar= null;
    				}
    	}catch (Exception e) {
    		e.printStackTrace();
		}finally {
			return nodoRetornar;
		}
    }
    
    //16. Retorna verdadero si no contiene elementos.
    @Override
    public boolean isEmpty() {
    	//return tail==null;
        return head == null;
    }

    // 17. Retorna el objeto del último nodo insertado.
    @Override
    public T get() {
    	return (T) tail.getObject();
    }

    // 18. Retorna un objeto de la posición del nodo especificado.
    @Override
    public T get(Node node) {
    	LinkedListNode nodoNuevo = (LinkedListNode) node;
    	boolean objetoEn=false;
    	try {
    		return (T) nodoNuevo.getObject();
    	}catch (Exception e) {
    		e.printStackTrace();
    		return null;
		}
    }

    //19. Retorna un objeto de la posición previa al nodo especificado.
    @Override
    public T getPrevious(Node node) {
    	try {
    		LinkedListNode nodeCast = (LinkedListNode) node;
    		
    		return (T) nodeCast.getPrev().getObject();//retorna el previo

		}catch (Exception e) {
    		e.printStackTrace();
    		return null;
		}
    }

    //20. Retorna un objeto de la posición siguinete al nodo especificado.
    @Override
    public T getNext(Node node) {
    	
    	LinkedListNode nodoEspecificado=(LinkedListNode)node;
    	try {
    		return (T) nodoEspecificado.getNext().getObject();
    	}catch (Exception e) {
    		e.printStackTrace();
    		 return null;
        }
    }

    //21. Retorna el objeto al inicio de esta lista.
    @Override
    public T getFirst() {
    	return (T) head.getObject();
    
    }

    //22. Retorna un array de n objetos desde inicio de esta lista.
    @Override
    public T[] getFirst(int n) {
    	try {
    		Object [] arrayObjeto=new Object[100];
    		if(isEmpty()) {
    			arrayObjeto=null;		       
    			return (T[]) arrayObjeto;
    		}
    		else{
    			LinkedListNode inode=head;
    			for (int i = 0; i < n; i++) {
					arrayObjeto[i]= (T) inode.getObject();
					inode=inode.next;
				}
    				return (T[]) arrayObjeto;	//retorna el array
    		}	
    	}catch (Exception e) {
    		e.printStackTrace();
    		 return null;
        }
    }

    //23. Retorna el objeto al final de esta lista.
    @Override
    public T getLast() {
    	if(isEmpty()) {
    		return null;
    	}else {
    		return (T) tail.getObject();
    	}
		
    }
   

    // 24. Retorna un array de n objetos previos al final de esta lista.
    @Override
    public T[] getLast(int n) {
    	try {
    		Object [] arrayObjetos=new Object[100];
    		if(isEmpty()) {
    			arrayObjetos=null;
    			return (T[]) arrayObjetos;
    		}
    		else{
    			//head=tail;///revisar si se empieza desde la colaa
    			inode=tail;
    			for (int i = 0; i < n; i++) {
					arrayObjetos[i]=(T) inode.getObject();
					inode=inode.prev;
				}
    			return (T[]) arrayObjetos;
    		}
    	}catch (Exception e) {
    		e.printStackTrace();
    		return null;
        }
    }

    //25. Retorna el objeto al final de esta lista y lo elimina. 
	@Override
    public T pop() {
		try {
			
			Object temporalObjeto=tail.getObject();
			tail=tail.prev;// la nueva cola sera la cola previa
			
			//tail.next=null;//el objeto siguiente a la cola es null
			return (T) temporalObjeto;
		}catch (Exception e) {
    		e.printStackTrace();
    		 return null;
        }	
    }
	
	public T popHead() {
		try {
			LinkedListNode temporal=head.next;
		    Object temporalObjett=head.getObject();
			
			head=null;// la nueva cola sera la cola previa
			head=temporal;
			return (T) temporalObjett;
		}catch (Exception e) {
    		e.printStackTrace();
    		 return null;
        }
		
	}

    //26. Elimina el nodo en la lista.
    @Override
    public boolean remove(T object) {
    	boolean removido=false;
    	LinkedListNode node=new LinkedListNode();
    	try {
    		if(!isEmpty()) {
    			if(object!=null) {
    				node=head;
					while(node.getObject()!=object) {// se itera para encotrar el nodo indicado con el objeto
						node=node.next;
					}
    				if(node.prev==null) {//si es la cabeza
    					head=head.next;
    					//System.out.println(head.getObject() + " aca" );
    				}
    				if(node.next==null) {// si es la cola
    					pop();
    				}
    				if(node.prev!=null || node.next!=null) {// si es otro nodo en la lista
    					node.prev.next=node.next;
    					node.next.prev=node.prev;
    				}
    				removido=true;
    			}
    		}
    	}catch (Exception e) {
    		e.printStackTrace();
        }finally{
            return removido;
        }
 	 
    }

    //27. Elimina el nodo en la lista.
    @Override
    public boolean remove(Node node) {
    	boolean removido=false;
    	LinkedListNode nodoEliminado=(LinkedListNode)node;
       try {
    	   if(!isEmpty()) {
   			if(nodoEliminado==null) {
   				if(nodoEliminado.prev==null) {
   					head=head.next;// el nodo sera la cabeza
   					//System.out.println(head.getObject() + " aca" );
   				}
   				if(nodoEliminado.next==null) {
   					pop();// el nodo sera la cola
   				}
   				if(nodoEliminado.prev!=null || nodoEliminado.next!=null) {
   					//System.out.println(node.getObject() + " aca" );
   					nodoEliminado.prev.next=nodoEliminado.next;//el nodo previo  siguiente apunta al sigueite
   					nodoEliminado.next.prev=nodoEliminado.prev;//nodo siguienete previo apunta al previo
   				}
   				removido=true;
   			}
   		}
       }catch (Exception e) {
    	   e.printStackTrace();
		}finally {
			return removido;
		}
    }

    //28. Elimina de esta lista todos los nodos de los objetos que están contenidos en la colección especificada
    @Override
    public boolean removeAll(T[] objects) {
    	boolean conserva=false;
    	try {
    		if(objects!=null) {       	
        		for (int i = 0; i < objects.length; i++) {
        			remove(objects[i]);// se usa el metodo de remover objeto
				}
        		conserva=true;
        	}
        }catch (Exception e) {
     	   e.printStackTrace();
 		}finally {
 			return conserva;
 		}
        
    }

    // 29. Conserva solo los objetos del array
    @Override
    public boolean retainAll(T[] objects) {
    	boolean conserva=false; 
        try {
        	inode=head;
        	head=null;
        	tail=null;
        	for (int i = 0; i < objects.length; i++) {
				if(inode.getObject()==objects[i]) {
					inode=new LinkedListNode(objects[i]);
					inode=inode.next;
					inode.prev=inode;
				}
			}
        	conserva=true;
        	return conserva;
        }catch (Exception e) {
        	e.printStackTrace();
		}finally {
			return conserva;
		}
    }

    //30. Reemplaza el objeto en la posición del nodo especificado.
    @Override
    public boolean set(Node node, T object) {
    	boolean reemplazar=false;
    	LinkedListNode nodoEspecificado=(LinkedListNode)node;
        try {
        	if(object!=null) {
        		nodoEspecificado.setObject(object);
        		reemplazar=true;
        	}
        }catch (Exception e) {
        	e.printStackTrace();
		}finally {
			return reemplazar;
		}
    }

    //31. Retorna el número de nodos de esta lista.
    @Override
    public int size() {
    	int temporalContador=0;
    	if(isEmpty()) {
    		return temporalContador;
    	}
    	else {
    		inode=head;  
    		while(inode!=null) {
    			inode=inode.next;
    			temporalContador++;
    		}
    	}
    	return temporalContador;
    }
       
    //32. Retorna una sub lista de la lista.
    @Override
    public List subList(Node from, Node to) {
       LinkedListNode nodoFrom=(LinkedListNode)from;
       LinkedListNode nodoTo=(LinkedListNode)to;
       LinkedList nuevaLista= new LinkedList();
       try {
    	   if(nodoFrom!=null && nodoTo!=null) {
    		   nodoFrom= new LinkedListNode();
    		   nodoTo= new LinkedListNode();
    	   if(isEmpty()) {
    		   nodoFrom=head;
    		   nodoTo=tail;
    		   nuevaLista.head=nodoFrom;
    		   nuevaLista.tail=nodoTo;
    		   return nuevaLista;
    		   }
    	   else{
    		   nuevaLista.head=nodoFrom;//head
    		   nuevaLista.tail=nodoTo;//tail
    		  
    		   return nuevaLista;
    		   } 
    	   } 	 	   
       }catch (Exception e) {
       	e.printStackTrace();
		}finally {
			return nuevaLista;
		}
    }

   // 33. Retorna un array que contiene todos los elementos de esta lista.
    @Override
    public T[] toArray() {
    	try {
    		Object[] arreglo= new Object[size()];
    		Iterator iterador=iterator();
    		for (int i = 0; i < arreglo.length; i++) {
    			if(iterador.hasNext()) {
    				LinkedListNode nodoAux=(LinkedListNode) iterador.next();
    				arreglo[i]= nodoAux.getObject();//se obtiene el objeto del iterador
    			}
			}
    		return (T[]) arreglo;
    	}catch (Exception e) {
           	e.printStackTrace();
           	return null;
    	}
    }

    //34. Ordenar lista por un criterio.
    @Override
    public boolean orderBy(char c) {
    	boolean ordenado = false;

        try {
            LinkedListNode nodoIteradorNodo = head;
            int contador = 0;

            //se recorre la lista
            while (nodoIteradorNodo != null) {
                contador++;
                nodoIteradorNodo = nodoIteradorNodo.next;
            }

            //Se busca el valor maximo o minimo
            for (int i = 0; i < contador-1; i++) {
                nodoIteradorNodo = head;

                LinkedListNode nodoAuxiliar = nodoIteradorNodo;

                //Recorre los nodos de la lista 
                for (int j = i; j < contador-1; j++) {
                    nodoIteradorNodo = nodoIteradorNodo.next;

                    //En este ciclo se comparan c y a a=ascendente ¿?
                    if (c == 'a') {
                        if (nodoIteradorNodo.getObject().toString().compareTo(nodoAuxiliar.getObject().toString()) < 0) {
                            nodoAuxiliar = nodoIteradorNodo;
                        }
                    } else {
                        if (nodoIteradorNodo.getObject().toString().compareTo(nodoAuxiliar.getObject().toString()) > 0) {
                            nodoAuxiliar = nodoIteradorNodo;
                        }
                    }
                }

                Object objetoA = head.getObject();
                head.setObject(nodoAuxiliar.getObject());
                nodoAuxiliar.setObject(objetoA);
                head = head.next;
                ordenado=true;
            }
            return ordenado;
  
         } catch (Exception e) {
             e.printStackTrace();
         } finally {
             return ordenado;
         }
    }

    //Imprimir en consola el contenido de la lista.
    @Override
    public void print() {
    	 try {
    	      	   if(!isEmpty()) {
    	      	 	 Iterator<Node> it=this.iterator();
    	      		 LinkedListNode nodoAux=head.next;
    	      		 System.out.print("LinkedList DobleEnlazada[ " );
    	      		 System.out.print("Head->" +head.getObject()+ " ----> ");
    	      		 
    	      		 while(nodoAux!=null) {//para que solo se imprima una vuelta
    	      			   System.out.print("Prev->"+nodoAux.prev.getObject()+" ----> ");  
    	      			   System.out.print("Next->"+nodoAux.getObject()+" ----> ");
    	      			   nodoAux=nodoAux.next;
    	      		   }
    	      		 System.out.print("Tail-> " + tail.getObject()+ " ]");
    	      		   
    	      	   }
  
         }catch (Exception e) {
             e.printStackTrace();
         }
    }


    
	@Override
    public Iterator<Node> iterator() {
      inode= head;
      return new Iterator<>() {
    	  public boolean hasNext() {
    		  return inode!=null;
    	  }
    	  public Node next() {
    		  Node temp= inode;
    		  inode=inode.next;
    		  return temp;
    	  }
      };
       
    }
    

	@Override
	public String toString() {
		print();
		return "";
	}

    
}
