class LinearSearch{
	public static void main(String[] args){
		//int[] a={5,3,6,1,4,2};
		String[] arr={"Ahmad", "Zakir", "Dilwar", "Danish", "Imran"};
		//int item=9;
		String item= "Nisar";
		int temp=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i].equals(item)){
			System.out.println("Given String is present " + arr[i]+  " index position ");
				temp=temp+1;
			}
		}
		if( temp==0){
			
			System.out.print("item not present in the list");
		}
	}
}