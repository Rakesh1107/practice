package dsimplementation;

public class MyLinkedList<E> {

    private Node<E> head;
    private int size = 0;

    public void add(E data) {
        Node<E> node = new Node<>(data);
        if (head == null) {
            head = node;
            size++;
            return;
        }
        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    public void remove(int index) {
        if (index + 1 > size()) {
            return;
        }
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        Node<E> temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public boolean contains(E data) {
        Node<E> temp = head;
        while (temp.next != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> temp = head;
        while (temp != null) {
            sb.append(temp.data).append(", ");
            temp = temp.next;
        }
        return sb.toString();
    }

    private static class Node<E> {
        Node<E> next;
        E data;

        Node(E data) {
            this.data = data;
            this.next = null;
        }

    }
}
