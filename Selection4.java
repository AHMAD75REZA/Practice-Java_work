import java.util.Scanner;
class Selection4{
	public static void main(String[] args){
		Scanner se=new Scanner(System.in);
		String stdname;
		System.out.println(" Enter student  name");
		stdname =se.nextLine();
		System.out.println(" Enter students marks");
		int mark=se.nextInt();
		//System.out.println(" Enter Employee salary");
		//float salary =se.nextFloat();
		if(mark>=80)
		{
		
		System.out.println("student name=" +stdname);
		System.out.println("Student marks =" +mark);
		System.out.println("secured = Distinction");
		
		}
		else if(mark >=60){
		System.out.println("student name=" +stdname);
		System.out.println("Student marks =" +mark);
		System.out.println("secured = first class");
			
			}
			else if(mark >=50)
			{
		System.out.println("student name=" +stdname);
		System.out.println("Student marks =" +mark);
		System.out.println("secured = second class");
			}
		else if(mark >=40)
		{
			System.out.println("student name=" +stdname);
		System.out.println("Student marks =" +mark);
		System.out.println("secured = third class");
		}
		else if(mark <40){
			System.out.println("student name=" +stdname);
		System.out.println("Student marks =" +mark);
		System.out.println("secured = unsuccessful");
		}
	}
}