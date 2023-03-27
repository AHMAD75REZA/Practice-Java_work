import java.util.Scanner;
class Keyword{
	public static void main(String[] args){
		String[] a={"if", "else", "default", "break", "continue", "return"};
		Scanner s=new Scanner(System.in);
		String temp;
		System.out.println("Enter any keyword");
		for(int i=0; i<a.length; i++){
			int flag=0;
			for(int j=0; j<a.length-1-i; j++){
				if(a[j].compareTo(a[i]+1)>0){
					temp=a[i];
					a[i]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0){
				break;
			}
		}
		for(int i=0; i<a.length; i++){
			System.out.println(" "+ a[i]);
		}
		
	}
}