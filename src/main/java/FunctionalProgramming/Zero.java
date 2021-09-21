package FunctionalProgramming;

import java.util.Scanner;

public class Zero{
    static void findTriplets(int[] array, int n)
    {
        int count = 0;
        boolean found = false;
        for (int i=0; i<n-2; i++)
        {
            for (int j=i+1; j<n-1; j++)
            {
                for (int k=j+1; k<n; k++)
                {
                    if (array[i]+array[j]+array[k] == 0)
                    {
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                        found = true;
                        count++;
                    }
                }
            }
        }
        System.out.println("The no. of such distinct tripletpairs are = " + count);

        if (found == false)
            System.out.println(" not exist ");

    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of element:");
        int limit=sc.nextInt();
        int array[] = new int[limit];

        System.out.println("Enter Array elements");
        for (int i = 0; i < array.length; i++) {

                array[i] = sc.nextInt();
        }

        int n =array.length;
        findTriplets(array, n);

    }
}

