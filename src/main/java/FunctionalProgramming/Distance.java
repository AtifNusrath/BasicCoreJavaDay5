package FunctionalProgramming;

import java.util.Scanner;

public class Distance {
    public static void getDistance(int xPoint, int yPoint) {
        double distance = Math.sqrt(Math.pow(xPoint, 2) + Math.pow(yPoint, 2));

        System.out.println("Distance From "+xPoint+" and "+yPoint+" is "+distance);
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter xPoint Value: ");
        int xPoint= sc.nextInt();

        System.out.println("Enter yPoint Value: ");
        int yPoint=sc.nextInt();

        getDistance(xPoint,yPoint);

    }
}

