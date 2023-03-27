class SelectionSort2{
	public static void main(String[] args){
		String temp= " ";
		String[] a={"Ahmad", "Zakir", "Dilwar", "Danish"};
		int min;
		for(int i=0; i<a.length; i++){
			min=i;
			for(int j=0; j<a.length-1; j++){
				if(a[j].compareTo(a[min])>0){
					min=j;
					
				}
				temp=a[j];
					a[j]=a[min];
					a[min]=temp;
			}
			
		}
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+ " ");
		}
	}
}