// Decimal to Binary number
package DecimalToBinary;
import java.util.Scanner;
class DecimalToBinary{
	public static void main(String[] args){
		int i = 0; 
		//int result = 0;
		int binary[] = new int[100];
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter any Decimal number");
			int n = s.nextInt();
			while (n!=0){
				binary[i] = n%2;
				n = n/2;
				i++;
			}
			System.out.print("Binary value is :");
			for(int j =i-1; j>=0; j--){
				System.out.print(" " +binary[j]);
			}
		//System.out.println("Binary number is = " + result);
	}
}