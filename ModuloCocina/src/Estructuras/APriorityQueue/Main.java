package Estructuras.APriorityQueue;

public class Main {
	public static void main(String[] args) {
		PriorityQueue prioridad= new PriorityQueue(4);
		prioridad.insert("Buenas", 0);
		prioridad.insert(1, 0);
		prioridad.insert("cilantrooo", 0);
		prioridad.insert(2, 0);
		prioridad.insert("vecina", 1);
		prioridad.insert("cilantrooo", 1);
		prioridad.insert("arroz", 1);
		prioridad.extract();
		prioridad.insert(9, 2);
		prioridad.insert(6, 2);
		prioridad.insert("arroz", 3);
		prioridad.insert("cilantrooo", 3);
		System.out.println(prioridad.toString());
		prioridad.sort();//el sort ordena numeross
		System.out.println(prioridad.toString());
		
	}

}
