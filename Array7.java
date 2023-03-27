import java.util.Arrays;
import java.util.Scanner;
class Array7{
public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for sorting");
		//int i =s.nextInt();
		//int n =s.nextInt();
		int a, b, c, d =s.nextInt();
		//for (i=1; i<n; i++){
			//System.out.println(i +" ");
		//}
		int[] G={a, b, c, d};
		System.out.println("original number" +Arrays.toString(G));
		Arrays.sort(G);
		System.out.println("sorted Array" +Arrays.toString(G));
	}
}