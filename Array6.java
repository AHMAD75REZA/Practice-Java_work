import java.util.Arrays;
class Array6{

	public static void main(String[] args){
		int[]  a ={10,14,5,8,7,15};
		String[] b={"Dilwar", " jakir ", " Ahmad"};
		System.out.println("original Array" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(" Sorted numeric Arrays" +Arrays.toString(a));
		System.out.println("original String" +Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("sorted string" + Arrays.toString(b));
	}
}