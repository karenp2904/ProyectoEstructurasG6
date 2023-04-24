package Estructuras.Colas;
import java.util.ArrayList;
import java.util.List;
public class PriorityQueue {

        private List<QueueElement> items;

        private class QueueElement {
            private Object element;
            private int priority;

            public QueueElement(Object element, int priority) {
                this.element = element;
                this.priority = priority;
            }
        }

        public PriorityQueue() {
            items = new ArrayList<>();
        }

        public void enqueue(Object element, int priority) {
            QueueElement queueElement = new QueueElement(element, priority);
            boolean added = false;

            for (int i = 0; i < items.size(); i++) {
                if (queueElement.priority < items.get(i).priority) {
                    items.add(i, queueElement);
                    added = true;
                    break;
                }
            }

            if (!added) {
                items.add(queueElement);
            }
        }

        public Object dequeue() {
            if (items.isEmpty()) {
                return null;
            }
            return items.remove(0).element;
        }

        public Object front() {
            if (items.isEmpty()) {
                return null;
            }
            return items.get(0).element;
        }

        public boolean hasElements() {
            return !items.isEmpty();
        }

        public int size() {
            return items.size();
        }

        public String print() {
            StringBuilder printStr = new StringBuilder();
            String str = "|";

            for (int i = 0; i < items.size(); i++) {
                if (i == items.size() - 1) {
                    str = "";
                }

                printStr.append(items.get(i).element).append("-").append(items.get(i).priority).append(str);
            }

            return printStr.toString();
        }

        public void clear() {
            items.clear();
        }
    }
