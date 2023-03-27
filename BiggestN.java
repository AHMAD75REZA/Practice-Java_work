import java.io.*;
import java.util.Scanner;

public class BiggestN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter total number to be processed: ");
        int n = s.nextInt();
        System.out.println("Enter numbers: ");
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
            int big = a[0];
            for (int e : a) {
                if (e > big) {
                    big = e;
                }
            }
            System.out.println("Biggest: " + big);
        }
    }
}