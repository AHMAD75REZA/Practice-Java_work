import java.util.Scanner;
class Operation{
	public static void main(String[] args){
			int c,d,e,f,g;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number:");
			int a=s.nextInt();
		System.out.println("Enter second number:");
			int b=s.nextInt();
		System.out.println("--------------------------");
		System.out.println("Enter numbers are "+a+" ,"+b);
			c=a+b;
			d=a-b;
			e=a*b;
			f=a/b;
			g=a%b;
		System.out.println("Sum of two number is "  +c);	
		System.out.println("subtraction of two number is" +d);	
		System.out.println("Multiply of two number is"  +e);	
		System.out.println("Division  of two number is"  +f);
		System.out.println("modulus  of two number is"  +g);
		
	}
}