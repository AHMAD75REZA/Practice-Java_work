class SecondLargest{
	public static void main(String[] args){
		int[] a={6,8,2,4,3,1,5,7,9};
		int temp;
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			 //if(i==1){
				// break;
			 //}
		}
		for(int i=0; i<a.length; i++){
				System.out.println(a[i] + " ");
			}
		
		//System.out.println("Second largest element is " + a[1]);
		System.out.println("Second smallest element is " + a[1]);
	}
}