class BubbleSort{
	public static void main(String[] args){
		int[] a ={10,36,19,29,12,5};
		for(int i=0;i<a.length;i++){
			int flag=0;
			for(int j=0; j<a.length-1-i; j++){
				if(a[j]>a[j+1]){
				int	temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag =1;
				}
				//System.out.print(" "+a[j]);
			}
			if (flag==0){
				break;
			}
			//System.out.println( );
		}
		for(int i=0; i<a.length; i++){
			System.out.print(" "+ a[i]);
		}
	}
}	