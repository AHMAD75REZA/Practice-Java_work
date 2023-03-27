public class SequentialSearch {
    public static void main(String[] args) {
        int size = args.length;
        if (args.length < size) {
            System.out.println("Enter list of numbers and key to seach");
            // retur
        }

        int key = Integer.parseInt(args[size - 1]);
        int[] elements = new int[size];
        for (int i = 0; i < size; i++) {
            int value = Integer.parseInt(args[i]);
            elements[i] = value;
        }
        int loc = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i] == key) {
                loc = -1;
                break;
            }
        }
        if (loc == -1) {
            System.out.println(key + "does not exist in the given list");
        } else {
            System.out.println(key + "EXIST first at location" + loc);
        }
    }
}