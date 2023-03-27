import java.util.Scanner;
class EmployeeWage{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the employee hour");
		int hour=s.nextInt();
		System.out.println("Enter the employee wage");
			double wage=s.nextDouble();
			System.out.println("employee gross pay = " +(hour*wage));
			
	}
}