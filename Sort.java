class Sort{
	public static void main(String[] args){
		int[] a={10,19,8,15,12};
		for(int i=0; i<a.length;i++){
			for(int j=1; j<a[i]; j++){
				if(a[j]<a[j+1]){
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
				}
			}
		}
		for(int i=0; i<a.length; i++){
			System.out.println(" "+a[i]);
		}
	}
}