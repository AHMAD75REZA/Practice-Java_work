// Binary to Decimal number
import java.util.Scanner;
class Binary{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter any number");
			//int a = s.nextInt();
			System.out.println(" Enter first binary number");
		int n = s.nextInt();
		int r = 1, result1 = 0;
		for( int i = n; i>0; i = i/10){
			result1 = result1 + ( i%10)*r;
			r = r*2;
		}
		System.out.println("Decimal number = " + result1);
	}
}