import java.util.Scanner;
class IfTest1{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount of purchase");
		int purchase =s.nextInt();
		if (purchase>=5000){
		System.out.println("purchase amount=" +purchase);
		System.out.println("Discount =" +purchase*.1);
		System.out.println("Amount TO be paid=" +(purchase-(purchase*.1)));
		
		}
	}
}