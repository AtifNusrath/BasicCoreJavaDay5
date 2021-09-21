package BasicCoreProgram;
import java.util.*;
public class Swap2Number {
        public static void main(String[] args) {
            int num1, num2, temp;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of X and Y");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("before swapping numbers: "+num1 +"  "+ num2);

            temp = num1;
            num1 = num2;
            num2 = temp;
            System.out.println("After swapping: "+num1 +"   " + num2);

        }
}

