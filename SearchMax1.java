public class SearchMax1 {
    public static void main(String[] args) {
        int a[] = { 4, 3, 5, 2, 8, 1, 6 };
        int Max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (Max < a[i]) {
                Max = a[i];
            }
        }
        System.out.println("maximum element is " + Max);
    }
}