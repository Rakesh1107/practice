package practice;

class CapitaliseFirstLetter {

    static String capitaliseFirstLetter(String word) {
        char[] array = word.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i-1] == ' ') {
                array[i]-=32;
            }
        }

        return String.valueOf(array);
    }

    public static void main(String[] args) {

        String word = "hello world";
        System.out.println(capitaliseFirstLetter(word));

    }
}

