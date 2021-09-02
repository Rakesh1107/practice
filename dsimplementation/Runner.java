package dsimplementation;

public class Runner {

    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue);
        System.out.println(queue.remove());

        System.out.println(queue.contains(50));

    }
}
