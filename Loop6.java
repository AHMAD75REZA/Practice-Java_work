class Loop6{
	public static void main(String[] args){
		int fv=0, sv=1, n, i,tv;
		System.out.println("Fibonacci series");
		System.out.print(fv + " " + sv + " ");
		for(i=3; i<=10; i++){
			tv = fv + sv;
			fv = sv;
			sv = tv;
			System.out.print(tv + " ");
		}
	}
}