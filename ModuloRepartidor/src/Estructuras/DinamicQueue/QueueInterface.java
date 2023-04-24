package Estructuras.DinamicQueue;


public interface QueueInterface {
	public void clear();
	public boolean insert(Object object);
	public Object extract();

	public boolean isEmpty();
	public int size();
	public boolean search(Object object);
	public void sort();
	public void reverse();
	public String toString();
}
