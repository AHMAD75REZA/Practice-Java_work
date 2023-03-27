import java.util.Scanner;
class Selection3{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String Empname;
		System.out.println(" Enter employee name");
		Empname =s.nextLine();
		System.out.println(" Enter employee exorience");
		int exp=s.nextInt();
		System.out.println(" Enter Employee salary");
		float salary =s.nextFloat();
		if(exp>=15)
		{
		if (salary>=8000){
		System.out.println("Employee name=" +Empname);
		System.out.println("Employee exprience =" +exp);
		System.out.println("salary =" +(salary+1500));
		
		}
			
		}
		else
		{
		if(salary >=6000){
		
			System.out.println("Employee name=" +Empname);
		System.out.println("Employee exprience =" +exp);
		System.out.println("salary =" +(salary+1000));
			}
		}
	}
}