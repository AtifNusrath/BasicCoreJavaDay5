package BasicCoreProgram;

public class Factor
{
           public static void main(String[] args)
           {

            int n = Integer.parseInt(args[0]);

            System.out.print("The prime factorization of " + n + " is: ");


            for (int factor = 2; factor*factor <= n; factor++) {
                while (n % factor == 0) {
                    System.out.print(factor + " ");
                    n = n / factor;
                }
            }

            if (n > 1) System.out.println(n);
            else       System.out.println();
        }
    
}
