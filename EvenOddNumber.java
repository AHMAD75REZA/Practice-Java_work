import java.util.Arraylist;
class EvenOddNumber{
	public static void main(String[] args){
		int[] a={8,5,10,12,3,1,4};
		Arraylist<integer> al1=new Arraylist<> ();
		Arraylist<integer> al2=new Arraylist<> ();
		for(int i=0; i<a.length; i++){
			if(a[i]%2==0){
				al1.add(a[i]);
			}
			else{
				al2.add(a[i]);
			}
		}
		for(int no: al1){
			System.out.println(no + " ");
		}
			System.out.println("\n");
			System.out.println("odd numbers are");
			for(int no:al2){
				System.out.println(no + " ");
			}
		
	}
}