package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String s = "proooogrammmmminggg";
        findDuplicateCharacters(s);
        findDuplicateCharacters2(s);
    }

    private static void findDuplicateCharacters2(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length()-1; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

    }

    private static void findDuplicateCharacters(String s) {

        char[] array = s.toCharArray();
        Arrays.sort(array);

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i+1]) {
                System.out.print(array[i] + " ");
                int count = 0;
                while (i < array.length-1 && array[i] == array[i+1]) {
                    i++;
                    count++;
                }
                System.out.print(count + "\n");
            }
        }

    }


}
