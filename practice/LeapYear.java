package practice;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2016;
        System.out.println(isLeapYear(year));
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
