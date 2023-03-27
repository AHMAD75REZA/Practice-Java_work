import java.util.Scanner;
class GreatestNo{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter first number");
			int a =s.nextInt();
		System.out.println(" Enter second number");
			int b =s.nextInt();
		System.out.println(" Enter 3rd number");
			int c = s.nextInt();
			if(a>b && a>c){
			System.out.println( "the greatest number is = " +a);
				if( b>a && b>c){
				System.out.println(" the greatset number is = " +b);
				}
				
			}
			else{
				System.out.println("the greatest number is = " +c);
			}
	}
}