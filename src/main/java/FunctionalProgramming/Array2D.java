package FunctionalProgramming;
import java.io.*;
import java.util.*;
public class Array2D {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);

    public static void getArray(int arr[][], int rows, int cols) {
        System.out.println("Enter Array elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr, rows, cols);

    }

    public static void getArray(double arr[][], int rows, int cols) {
        System.out.println("Enter Array elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }
        printArray(arr, rows, cols);

    }

    public static void getArray(boolean arr[][], int rows, int cols) {
        System.out.println("Enter Array elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextBoolean();
            }
        }
        printArray(arr, rows, cols);

    }
    public static void printArray(int arr[][], int rows, int cols) {
        System.out.println("==Array==");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                out.print(arr[i][j] + " ");
            }
            out.println();
        }

    }

    public static void printArray(double arr[][], int rows, int cols) {

        if (arr.length > 0) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    out.print(arr[i][j] + " ");
                }
                out.println();
            }
        }
    }

    public static void printArray(boolean arr[][], int rows, int cols) {

        if (arr.length > 0) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    out.print(arr[i][j] + " ");
                }
                out.println();
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter what type of array you want \n1.Integer \n2.Double \n3.Boolean");
        int choice =sc.nextInt();
        System.out.println("Enter number of rows and columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        switch(choice){
            case 1:
                int array[][]=new int[rows][cols];
                getArray(array, rows, cols);
                break;
            case 2:
                double arrayDouble[][]=new double[rows][cols];
                getArray(arrayDouble, rows, cols);
                break;
            case 3:
                boolean arrayBool[][]=new boolean[rows][cols];
                getArray(arrayBool, rows, cols);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }


    }
}
