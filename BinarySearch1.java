//Binary search
public class BinarySearch1 {
    public static void main(String[] args) {
        int size = args.length;
        if (args.length < 2) {
            System.out.println("Enter list of numbers and key to search");
            return;
        }

        int key = Integer.parseInt(args[size - 1]);
        int[] elements = new int[size];
        for (int i = 0; i < size - 1; i++) {
            int value = Integer.parseInt(args[i]);
            elements[i] = value;
        }
        int loc = -1;
        int lb = 0;
        int ub = size - 2;
        int mid;
        for (;;) {
            mid = (lb + ub) / 2;
            if (key < elements[mid]) {
                ub = mid - 1;
            } else if (key > elements[mid]) {
                lb = mid + 1;

                if (loc == -1) {
                    System.out.println(key + "does not exist in the given list");
                } else {
                    System.out.println(key + "EXIST first at location" + loc);
                }
            }
        }

    }
}