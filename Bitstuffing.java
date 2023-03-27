import java.util.Scanner;

class Bitstuffing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to be stuffed as 0 and 1");
        String Userinput;
        Userinput = s.next();
        int len = Userinput.length();
        int count = 0;
        System.out.println("Bitstufffed:");
        for (int i = 0; i < len; i++) {
            System.out.print(Userinput.charAt(i));
            if (Userinput.charAt(i) == '1') {
                count += 1;
            } else if (Userinput.charAt(i) == '0') {
                count = 0;
            }
            if (count == 5) {
                System.out.print(0);
                count = 0;
            }
        }
    }
}