package practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByOccurrence {
    public static void main(String[] args) {
        int[] ar = new int[] {5,2,8,8,5,5,8,1,9,0,1,1,0,1};

        Map<Integer,Integer> numbers = new HashMap<>();

        for(int number : ar) {
            if(numbers.containsKey(number)) {
                Integer count = numbers.get(number);
                numbers.put(number, ++count);
            } else {
                numbers.put(number,1);
            }
        }

        final class FrequencyComparator implements Comparator<Integer> {
            Map<Integer,Integer> refMap;

            public FrequencyComparator(Map<Integer,Integer> base) {
                this.refMap = base;
            }

            @Override
            public int compare(Integer k1, Integer k2) {
                Integer val1 = refMap.get(k1);
                Integer val2 = refMap.get(k2);

                int num = val1.compareTo(val2);

                return num == 0 ? k1.compareTo(k2) : num;
            }
        }

        FrequencyComparator comp = new FrequencyComparator(numbers);
        TreeMap<Integer,Integer> sortedMap = new TreeMap<>(comp);
        sortedMap.putAll(numbers);
        for(Integer i : sortedMap.keySet()) {
            int frequency = sortedMap.get(i);
            for(int count  = 1 ; count <= frequency ; count++) {
                System.out.print(i + " ");
            }
        }
    }
}