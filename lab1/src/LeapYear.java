/**
 * Created by jieqi on 9/4/15.
 */
public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;
        boolean isLeapYear;

        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

