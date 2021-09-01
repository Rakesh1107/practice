package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class CommonWords {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String one = br.readLine();
        String two = br.readLine();
        String three = br.readLine();

        findCommonWords(one, two, three);
    }

    private static void findCommonWords(String one, String two, String three) {
        List<String> list1 = Arrays.asList(one.split(" "));
        List<String> list2 = Arrays.asList(two.split(" "));
        List<String> list3 = Arrays.asList(three.split(" "));

        for (String temp: list1) {
            if (list2.contains(temp) && list3.contains(temp)) {
                System.out.println(temp);
            }
        }
    }
}
