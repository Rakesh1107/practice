package dsimplementation;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    Map<Integer, Node> map = new HashMap<>();
    int capacity;
    Node head = new Node(0, 0);
    Node tail;
    int size = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public void put (int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(map.get(key));
            node.value = value;
            insert(node);
            return;
        }
        if (size == capacity) {
            remove(tail.prev);
            insert(new Node(key, value));
            return;
        }
        insert(new Node(key, value));
        size++;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            remove(map.get(key));
            insert(map.get(key));
            return map.get(key).value;
        }
        return -1;
    }

    private void remove(Node node) {
        map.remove(node.key);

    }

    private void insert(Node node) {
        map.put(node.key, node);

    }

    static class Node {
        Node prev, next;
        int key, value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;

        }
    }

}
