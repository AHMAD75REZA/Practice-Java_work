import java.util.Scanner;
class Array1{
	public static void main(String[] args){
		int[] marks= new int[5];
		int i;
		Scanner s = new Scanner(System.in);
		for (i=0; i<5; i++){
		System.out.print("Enter the marks");
		marks[i]= s.nextInt();
		}
		System.out.println("The students marks are ");
			for(i=0; i<5; i++){
			System.out.println(marks[i]);
			}
	}
}