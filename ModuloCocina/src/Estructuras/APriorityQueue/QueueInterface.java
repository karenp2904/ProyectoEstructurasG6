package Estructuras.APriorityQueue;

public interface QueueInterface {
	public void clear();
	public boolean isEmpty();
	public Object extract();
	public boolean insert(Object object, int prioridad);
	public int size();
	public boolean search(Object object);
	public void sort();
	public void reverse();
	public String toString();
}
