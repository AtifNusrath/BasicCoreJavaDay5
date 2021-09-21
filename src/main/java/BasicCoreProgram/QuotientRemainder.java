package BasicCoreProgram;
import java.util.*;
public class QuotientRemainder {

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of the divisor:: ");
            int divisor = sc.nextInt();
            int dividend = sc.nextInt();

            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.println("Quotient value:"+quotient);
            System.out.println("Remainder value:"+remainder);
        }
}
