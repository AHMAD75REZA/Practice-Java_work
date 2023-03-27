import java.util.Scanner;
class Array2{
	public static void main(String[] args){
	int [] val = new int[10];
	int i, j,k,x,mid,mid1, lo, up;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter odd number from 5 to 10");
	x = s.nextInt();
	for(i=0; i<x; i++){
		System.out.println("Enter the values for the array");
		val[i]=s.nextInt();
		
		}
		System.out.println("\n The given values are \n");
		mid = x/2;
		lo = mid;
		up = mid;
		mid1 = mid;
		for(k=0; k<=mid; k++){
		for (j=mid1; j>=0; j--){
			System.out.println(" ");
			}
			for(i=lo; i<=up; i++){
			System.out.println(val[i]+" ");
			
			}
			lo--;
			up++;
			mid1--;
			System.out.println( );
			
		}
	}
}