import java.util.*;

public class Function2 {
    public static int findproduct(int a, int b) {
        int res = a * b;
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = s.nextInt();
        System.out.println("Enter second number");
        int b = s.nextInt();
        System.out.println("the result is:");
        int product = findproduct(a, b);
        System.out.print(product);
    }

}