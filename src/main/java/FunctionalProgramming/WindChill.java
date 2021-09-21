package FunctionalProgramming;

import java.util.Scanner;

public class WindChill {
    public static double getWindChill(double temperature, double windspeed) {
        double windChill;
        windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75)
                * Math.pow(windspeed, 0.16);
        return windChill;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperature Value: ");
        double temperature = sc.nextDouble();

        System.out.println("Enter Wind Speed Value: ");
        double windspeed =sc.nextDouble();

        System.out.print("The effective temperature (the wind chill) to be:");
        System.out.println(getWindChill(temperature, windspeed));
    }
}
