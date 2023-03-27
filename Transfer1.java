class Transfer1{
	public static void main(String[] args){
		int x=10;
		L1:
		{
			System.out.println("begin");
			if(x==10)
				break L1;
			System.out.println("end");
			
		}
		System.out.println("hello");
	}
}