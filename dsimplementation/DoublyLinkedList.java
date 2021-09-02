package dsimplementation;

public class DoublyLinkedList {

    private Node head, tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        tail = node;
        size++;
    }

    private class Node {
        private Node prev, next;
        private int data;

        Node(int data) {
            this.data = data;
        }
    }
}
