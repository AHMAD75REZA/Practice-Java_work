class FirstDuplicate{
	public static void main(String[] args){
		int[] a={6,5,3,1,2,4};
		int temp=0;
		//Hashset<integers> hs=new Hashset< > ();
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1; j<a.length; j++){
				if((a[i]==a[j])&& (i!=j)){
					temp=temp+1;
					System.out.println("first duplicate is"+ a[i]);
					break;
				}
			}
			//if(temp>0){
				//System.out.println(a[i]+ " ");
			//}
		}
	}
}