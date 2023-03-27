import java.util.*;

public class Function1 {
    public static int findsum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = s.nextInt();
        System.out.println("Enter second number");
        int b = s.nextInt();
        System.out.println("the result is:");
        int sum = findsum(a, b);
        System.out.print(sum);
    }

}