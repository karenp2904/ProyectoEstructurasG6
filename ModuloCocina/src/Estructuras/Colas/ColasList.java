package Estructuras.Colas;

import Estructuras.ListasSimples.LinkedList;

public class ColasList {


    public class Queue {
        private LinkedList items;

        public Queue() {
            items = new LinkedList();
        }

        public void enqueue(Object element) {
            items.addLast(element);
        }

        public Void dequeue() {
            if (items.size() == 0) {
                return null;
            }
            return items.removeFirst();
        }

        public Void front() {
            if (items.size() == 0) {
                return null;
            }
            return items.getFirst();
        }

        public boolean hasElements() {
            return items.size() > 0;
        }

        public int size() {
            return items.size();
        }

        public String print() {
            return items.toString();
        }

        public void clear() {
            items.clear();
        }
    }







}
