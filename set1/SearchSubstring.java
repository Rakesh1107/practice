package set1;

public class SearchSubstring {

    public static void main(String[] args) {
        String word = "WELCOMETOZOHOCORPORATION";
        char[][] array = new char[5][5];

        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = word.charAt(k);
                k++;
                System.out.print(array[i][j] + " ");
                if (k == word.length()) break;
            }
            System.out.println();
        }

        // From left to right
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-2; j++) {
                if (array[i][j] == 'T' && array[i][j+1] == 'O' && array[i][j+2] == 'O') {
                    System.out.println(i + "," + j);
                    System.out.println(i + "," + j+2);
                }
            }
        }

        // From top to bottom
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-2; j++) {
                if (array[j][i] == 'T' && array[j+1][i] == 'O' && array[j+2][i] == 'O') {
                    System.out.println(j + "," + i);
                    System.out.println(j+2 + "," + i);
                }
            }
        }


    }
}
