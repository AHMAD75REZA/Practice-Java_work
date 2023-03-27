import java.util.Scanner;

class Bitstuffing1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to be stuffed:");
        String Userinput;
        Userinput = s.next();
        int count = 0;
        int len = Userinput.length();
        System.out.println("Stuffed number is:");
        for (int i = 0; i < len; i++) {
            System.out.print(Userinput.charAt(i));
            if (Userinput.charAt(i) == '1') {
                count++;
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