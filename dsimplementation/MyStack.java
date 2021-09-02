package dsimplementation;

public class MyStack<E> {

    MyLinkedList<E> ll = new MyLinkedList<>();

    public void push(E data) {
        ll.add(data);
    }

    public E pop() {
        return ll.removeLast();
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
