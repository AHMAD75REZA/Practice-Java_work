import java.util.Scanner;

class Charstuffing1 {
    public static void main(String[] ars) {
        Scanner s = new Scanner(System.in);
        String start, end;
        String Userinput;
        System.out.print("Enter the character to be stuffed");
        Userinput = s.next();
        System.out.print("Enter start delimetre:");
        start = s.next();
        System.out.println("Enter ending delimetre:");
        end = s.next();
        int len = Userinput.length();
        System.out.println("Character stuffed:");
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