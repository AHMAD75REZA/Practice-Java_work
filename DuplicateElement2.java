import java.util.Map;
import java.util.HashMap;
import java.util.Set;
class DuplicateElement2{
	public static void main(String[] args){
		int[] arr={3,5,4,3,2,2,1,3,2};
		Map<Integer, Integer> hm=new HashMap< >( );
			for(int no: arr){
				integer count= hm.get(no);
				if(count==null){
					hm.put(no,1);
				}
			}
			else{
				count= count+1;
				hm.put(no, count);
			}
	}
	System.out.println("duplicateElement are:");
	set<Map.Entry<Integer, Integers>> es=hm.entryset();
	for(Map.Entry <Integer, Integer>me:es){
		if(me.get Value()>1){
			System.out.println(me.getKey() + " ");
		}
	}
	
}