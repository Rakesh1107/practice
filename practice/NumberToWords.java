package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberToWords {
    static void convert_to_words(char[] num) {
        int len = num.length;

        // Base cases
        if (len == 0) {
            System.out.println("Empty string");
            return;
        }
        if (len > 4) {
            System.out.println("Length more than 4 is not supported");
            return;
        }

        String[] single_digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        String[] two_digits = {"", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] tens_multiple = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        String[] tens_power = {"hundred", "thousand"};

        if (len == 1) {
            System.out.println(single_digits[num[0] - '0']);
            return;
        }

        int x = 0;
        while (x < num.length) {
            // 3 and 4 digits (100-9999)
            if (len >= 3) {
                if (num[x] - '0' != 0) {
                    System.out.print(single_digits[num[x] - '0'] + " ");
                    System.out.print(tens_power[len - 3] + " "); // prints a hundred / thousand depending on digits
                }
                --len; // for next iteration
            }

            // 2 digits
            else {
                // numbers 10-19
                if (num[x] - '0' == 1) {
                    int sum = num[x] - '0' + num[x + 1] - '0';
                    System.out.println(two_digits[sum]);  // (10- 19)
                    return;
                }

                // numbers 20-99
                else {
                    if ((num[x] - '0') > 0)
                        System.out.print(tens_multiple[num[x]-'0'] + " "); // tens digit (20-90)

                    if (num[++x] - '0' != 0)
                        System.out.println(single_digits[num[x] - '0']); // one's digit (21-99)
                }
            }
            ++x;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        int n = Integer.parseInt(br.readLine());
        char[] num = String.valueOf(n).toCharArray();
        convert_to_words(num);

    }

}
