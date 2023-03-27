class Asort{
	public static void main(String[] args){
		int temp=0;
		int[] a={12,25,7,20,18};
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a.length; j++){
				if(a[j]<a[j+1]){
					temp=a[j];
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