import java.util.Scanner;
class RecAreaPeri{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
	System.out.println("Enter width of the Rectangle");
		double width=s.nextDouble();
	System.out.println("Enter Length of the Rectangle");
		double length= s.nextDouble();
		//double Area=(width*length);
		System.out.println("Area is = "+(width*length));
		System.out.println("Perimetre of rectangle= "+2*(width+length));
	}
}