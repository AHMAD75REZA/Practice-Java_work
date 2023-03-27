import java.util.Scanner;
public class HexToOctal{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any Decimal number");
			int a=s.nextInt();
				int res=0,f=1,b;
			for(int i=a; i>0;i=i/2){
				res=res+(i%2)*f;
				f=f*10;
			
				
			}
			System.out.println("Binary number is" +res);
			System.out.println(" Enter any Binary number");
				int c=s.nextInt();
				int D=0,e=1;
			for(int i=c; i>0; i=i/10){
				D=D+(i%10)*e;
				e=e*2;
				
			}
			System.out.println("Decimal number is "+ D);
			System.out.println("Enter any decimal number");
				int O=s.nextInt();
				int p=0;
			for(int i=O;i>0; i=i/10){
				p=p*4+(i%10);
			}
			System.out.print("Octal number is" +p);
	}
}