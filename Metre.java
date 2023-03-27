import java.util.Scanner;

public class Metre {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Entre the numbers in inch");
        double inch = s.nextDouble();
        double metre = ((.0254 * inch) ) ;
        System.out.println("Now the number is in metre: " + metre);
    }
}