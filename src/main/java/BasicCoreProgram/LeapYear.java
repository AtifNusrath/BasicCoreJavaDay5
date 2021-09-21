package BasicCoreProgram;
import java.util.*;
public class LeapYear {
    public static void main(String args[]) {
        System.out.println("Enter year");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        boolean isLeapYear;

        if (year >= 1582) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not leap Year");
            }

        }
    }
}