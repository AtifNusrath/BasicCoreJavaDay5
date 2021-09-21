package BasicCoreProgram;

import java.util.*;

class PowerOf2 {
    public static void main(String args[]) {

        System.out.println("Enter power value <31");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        double ans;
        for(int i=0;i<=n && i<=31;i++) {
            ans=Math.pow(2,i);
            System.out.println(i+" : "+ans);
        }
    }
}

