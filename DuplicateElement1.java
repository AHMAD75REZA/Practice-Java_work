//Set interface
import java.util.set;
import java.util.Hashset;
class DuplicateElement1{
	public static void main(String[] args){
		int[] a={3,5,4,3,2,2,2,1};
		System.out.println("Duplicate elements are:");
		set<integer> s= new Hashset< >();
		for(int no: a){
			boolean b=s.add(no);
			if(b==false){
			System.out.println(no + " ");
			}
		}
	}
}