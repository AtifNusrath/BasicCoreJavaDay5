package BasicCoreProgram;

import java.util.Scanner;

public class FlipCoin  {
    public static void main(String args[]) {

        Scanner s= new Scanner(System.in);
        int n=s.nextInt();

        int countHead=0,countTail=0;
        float percentH,percentT;

        for(int i=0;i<n;i++) {
            if(Math.random()<0.5) {
                System.out.println("Head");
                countHead++;
            } else {
                System.out.println("Tails");
                countTail++;
            }
        }

        percentH=(countHead*100)/n;
        percentT=(countTail*100)/n;
        System.out.println("Percentage of Tail="+percentT+"\nPercentage of Heads="+percentH);

    }
}

