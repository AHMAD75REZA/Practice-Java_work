class SearchMax{
	public static void main(String[] args){
		int[] a={4,3,5,2,8,1,6};
		int Max=a[0];
		for(int i=1; i<a.length; i++){
			if(a[i]>Max){
				Max=a[i];
			}
		}
		System.out.println("maximum element is " +Max);
	}
}