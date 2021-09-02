package dsimplementation;

public class MyQueue<E> {

    MyLinkedList<E> ll = new MyLinkedList<E>();

    public void add(E data) {
        ll.add(data);
    }

    public E remove() {
        return ll.removeFirst();
    }

    public int size() {
        return ll.size();
    }

    public boolean contains(E data) {
        return ll.contains(data);
    }

    public String toString() {
        return ll.toString();
    }
}
