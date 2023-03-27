import java.util.Scanner;
class Arithmetic1{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter first number");
			int a=s.nextInt();
		System.out.println(" Enter second number");
			int b=s.nextInt();
		System.out.println("Addition" + " is " +(a+b));
		System.out.println("Subtraction" + " is " +(a-b));
		System.out.println("Multiplication" +" is " +(a*b));
		System.out.println("Division" + " is " +(a/b));
		System.out.println("mode" +" is " +(a%b));
		
	}
}