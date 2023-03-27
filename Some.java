class Some{
public static void main(String[] args){
	Sum();
	Sum(10);
	Sum(10,20,30);
	Sum(10,20,30,40);
	}
	public static void Sum(int... x){
		int total = 0;
		for(int x1:x){
		total = total+x1;
		}
		System.out.println("The Sum is : " +total);
	}
}