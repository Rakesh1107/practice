package dsimplementation;

import java.util.LinkedList;
import java.util.Objects;

public class MyHashMap<K, V> {

    int currentCapacity = 16;
    float loadFactor = 0.75f;
    int size = 0;
    LinkedList<Entry<K, V>>[] map = new LinkedList[currentCapacity];

    public void put(K key, V value) {
        if (size == currentCapacity * loadFactor) {
            resize();
        }
        int index = Objects.hash(key) % currentCapacity;

        if (map[index] == null) {
            map[index] = new LinkedList<>();
        }

        for (int i = 0; i < map[index].size(); i++) {
            if (map[index].get(i).getKey().equals(key)) {
                map[index].get(i).setValue(value);
                size++;
                return;
            }
        }
        map[index].add(new Entry<>(key, value));
        size++;
    }

    public V get(K key) {
        int index = Objects.hash(key) % currentCapacity;

        if (map[index] == null) {
            return null;
        }

        for (int i = 0; i < map[index].size(); i++) {
            if (map[index].get(i).getKey().equals(key)) {
                return map[index].get(i).getValue();
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = Objects.hash(key) % currentCapacity;

        if (map[index] == null) {
            return;
        }

        for (int i = 0; i < map[index].size(); i++) {
            if (map[index].get(i).getKey().equals(key)) {
                map[index].remove(i);
                size--;
                return;
            }
        }
    }

    public boolean containsKey(K key) {
        int index = Objects.hash(key) % currentCapacity;

        if (map[index] == null) {
            return false;
        }

        for (int i = 0; i < map[index].size(); i++) {
            if (map[index].get(i).getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < map.length; i++) {
            if (map[i] != null) {
                for (int j = 0; j < map[i].size(); j++) {
                    Entry<K, V> entry = map[i].get(j);
                    sb.append(entry.getKey()).append("=").append(entry.getValue()).append(", ");
                }
            }
        }
        return sb.toString();
    }

    public int size() {
        return size;
    }

    public void resize() {
        LinkedList<Entry<K, V>>[] oldMap = map;
        map = new LinkedList[currentCapacity * 2];
        currentCapacity*=2;

        for (int i = 0; i < oldMap.length; i++) {
            for (LinkedList<Entry<K, V>> list: oldMap) {
                for (Entry<K, V> entry: list) {
                    put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

}
