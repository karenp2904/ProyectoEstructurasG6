package Estructuras.Colas;

import java.util.ArrayList;

public class ColasArray {
    private ArrayList<Object> items;

    public ColasArray() {
        items = new ArrayList<>();
    }

    public void enqueue(Object element) {
        items.add(element);
    }

    public Object dequeue() {
        if (items.size() == 0) {
            return null;
        }
        return items.remove(0);
    }

    public Object front() {
        if (items.size() == 0) {
            return null;
        }
        return items.get(0);
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
