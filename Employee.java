//To display Name,Age,Sex,Salary of an Employee
import java.util.Scanner;
class Employee{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Employee name");
			String Name=s.nextLine();
		System.out.println("Enter the Employee Age");
			int Age=s.nextInt();
		System.out.println("Enter the salary of the Employee");
			Double salary=s.nextDouble();
		System.out.println("Enter M for male and F for female");
			char sex=s.next().charAt(0);
		System.out.println("Employee Details");	
		System.out.println("--------------------------------");	
		System.out.println("NAME:   "+" "+ Name);	
		System.out.println("AGE :  "+" "+Age);	
		System.out.println("SALARY: "+ " "+salary);
		System.out.println("SEX   :"+" "+sex);			
	}
}