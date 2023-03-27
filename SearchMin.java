class SearchMin{
	public static void main(String[] args){
		int[] a={4,3,2,5,8,1,6};
		int Min=a[0];
		for(int i=1; i<a.length; i++){
			if(Min>a[i]){
				Min=a[i];
			}
		}
		System.out.println("Minimum element is " +Min);
	}
}