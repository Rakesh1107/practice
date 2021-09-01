package practice;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        int n = 5;
        n = test.change(n);
        System.out.println(n++);
    }

    private int change(int a) {
        return a++;
    }
}
