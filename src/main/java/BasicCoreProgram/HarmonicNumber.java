package BasicCoreProgram;
import java.util.*;
public class HarmonicNumber {
        public static void main(String args[]) {
            System.out.println("Enter a number:");

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            double hNumber=0.0;
            for(float i=1;i<=n;i++) {
                hNumber+=(1/i);
            }
            System.out.println(hNumber);
        }
  
}
