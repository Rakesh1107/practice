package dsimplementation;

public class Runner {

    public static void main(String[] args) {
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println(ll.contains(30));
        System.out.println(ll);
        ll.remove(2);
        System.out.println(ll.contains(30));
        System.out.println(ll);
        System.out.println(ll.size());
    }
}
