import java.util.Scanner;
class Average{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
			int a=s.nextInt();
		System.out.println("Enter second number");
			int b=s.nextInt();
		System.out.println("Enter 3rd number");
			int c=s.nextInt();
		System.out.println("Average of the number is:" +(a+b+c)/3 );
			//double Average =s.nextDouble();
			//Average = (a+b+c)/3;
		//System.out.println(Average);
	}
}