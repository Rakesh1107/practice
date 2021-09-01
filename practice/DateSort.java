package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DateSort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of dates: ");
        int n = Integer.parseInt(br.readLine());
        String[] dates = new String[n];
        System.out.println("Enter dates: ");
        for (int i = 0; i < n; i++) {
            dates[i] = br.readLine();
        }
        sortDates(dates);
    }

    private static void sortDates(String[] dates) {
        if (dates == null || dates.length == 0) {
            return;
        }

        long[] res = new long[dates.length];

        int i = 0;
        for (String date : dates) {
            String[] temp = date.split("-");
            String s = "";
            for (String val : temp) {
                s+=val;
            }
            res[i++] = Long.parseLong(s);
        }

        Arrays.sort(res);

        System.out.println(Arrays.toString(res));
    }
}
