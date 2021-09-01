package set1;

import java.util.ArrayList;
import java.util.List;

public class GrandChildren {

    public static void main(String[] args) {
        String[][] relation = {{"luke", "shaw"},
                            {"wayne", "rooney"},
                            {"rooney", "ronaldo"},
                            {"shaw", "rooney"}};
        String name = "rooney";

        int grandChildren = findGrandChildren(relation, name);
        System.out.println(grandChildren);
    }

    private static int findGrandChildren(String[][] relation, String name) {
        List<String> children = new ArrayList<>();

        for (String[] pair : relation) {
            if (pair[1].equals(name)) {
                children.add(pair[0]);
            }
        }
        int count = 0;
        for (String[] pair: relation) {
            if (children.contains(pair[1])) {
                count++;
            }
        }
        return count;
    }
}
