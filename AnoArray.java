class AnoArray{
	public static void main(String[] args){
		AnoArray.sum(new int[][][]{{{10,20,30},{40,50},{60,70,80,90}}});
	}
	static void sum(int[][][] no){
		int total=0;
		for(int iii[][]:no){
			for(int ii[]:iii){
				for(int i:ii){
					total = total+i;
				}
			}
		}
		System.out.println("Sum of Array is =" +total);
	}
}