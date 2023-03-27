import java.util.Scanner;
class Table{
	public static void main(String args[]){
	Scanner s= new Scanner(System.in);
	System.out.println("Enter first number");
		int a=s.nextInt();
	System.out.println("Enter second number");
		int b=s.nextInt();
		//int c=s.nextInt();
	System.out.println("sum of two number is  " +a+ " and " +b+ " = " +(a+b) );
	System.out.println("the subtraction of " +a+ " and " +b+ " = " +(a-b));
	System.out.println(" the multiplication of two number is " +a+ " and" +b+ " = " +(a*b));
	System.out.println(" division of two number is " +a+ "and" +b+ "=" +(a/b));
	}
}	