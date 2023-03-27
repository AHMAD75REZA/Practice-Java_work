import java.util.Scanner;
class Positive{
	public static void main(String[] args){
		Scanner s= new Scanner (System.in);
		System.out.println("Enter any number");
		int a = s.nextInt();
		if(a>0)
		System.out.println(" Given number is positive");
		else
		System.out.println("Given number is negative");
	}
}