import java.util.Scanner;

class Charstuffing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String start, end;
        System.out.println("Enter the character to be stuffing: ");
        String Userinput;
        Userinput = s.next();
        System.out.println("Enter start delimetre");
        start = s.next();
        System.out.println("Enter last delimetre");
        end = s.next();
        // System.out.println(start.charAt(0));
        int len = Userinput.length();
        System.out.print("Character stuffed:");
        for (int i = 0; i < len; i++) {
            if (Userinput.charAt(i) == start.charAt(0) || Userinput.charAt(i) == end.charAt(0)) {
                System.out.print(Userinput.charAt(i));
                System.out.print(Userinput.charAt(i));
            } else {
                System.out.print(Userinput.charAt(i));
            }

        }
    }
}