package practice;

import java.util.LinkedList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);

        addIntegers(list);

        System.out.println(list);
    }

    private static void addIntegers(List<Integer> list) {

        list = new LinkedList<>();

        System.out.println(list);
    }
}
