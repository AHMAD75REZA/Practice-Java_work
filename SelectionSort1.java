class SelectioSort1{
	public static void main(String[] args){
		int min;
		String temp= "";
		String[] s={"Ahmad","Dilwar","Zakir","Imran"};
		for(int i=0;i<s.length;i++){
			int flag=0;
			min=i;
			for(int j=i+1; j<s.length; j++){
				if(s[j].compareTo(s[min])>0){
					temp=s[j];
					s[j]=s[min];
					s[min]=temp;
					flag=1;
				}
			}
			if(flag==0){
				break;
			}
		}
		for(int i=0; i<s.length;i++){
			System.out.print(" "+s[i]);
		}
		System.out.println();
	}
}
