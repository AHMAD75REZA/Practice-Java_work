import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit");
        double Fahrenheit = S.nextDouble();
        double Celsius = ((5 * (Fahrenheit - 32.0) / 9.0));
        System.out.println("Now temperature in Celcius:" + Celsius);
    }
}