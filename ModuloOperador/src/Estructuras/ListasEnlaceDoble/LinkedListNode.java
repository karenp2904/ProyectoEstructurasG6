package Estructuras.ListasEnlaceDoble;

public class LinkedListNode<T> implements Node<T> {

    private T object;
    LinkedListNode prev;
    LinkedListNode next;
    

    public LinkedListNode() {
        this.object = null;
        this.next = null;
        this.prev=null;
    }
    public LinkedListNode(T object) {
        this.object = object;
        this.next = null;
        this.prev=null;
    }

  
  
    public LinkedListNode(T object, LinkedListNode prev, LinkedListNode next) {
		super();
		this.object = object;
		this.prev = prev;
		this.next = next;
	}

    public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}

	public LinkedListNode getPrev() {
		return prev;
	}

	public void setPrev(LinkedListNode prev) {
		this.prev = prev;
	}

	

	@Override
    public boolean setObject(T object) { //Validar que el objeto puede ser almacenado en la linkedlist   
        this.object = object;
        return true;
    }

    @Override
    public T getObject() { 
        return this.object;
    }
    
    @Override
    public boolean isEquals(T object) { 
        return this.object.toString().equals(object.toString());
        
    }
	@Override
	public String toString() {
		return "LinkedListNode [object=" + object + ", prev=" + prev + ", next=" + next + "]";
	}
	

}	
