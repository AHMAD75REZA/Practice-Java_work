class MulTable{
	final static int rows = 4;
	final static int columns = 4;
	public static void main(String args[]){
		int product[][] = new int[rows][columns];
		int row, column;
		System.out.println("Multiplication Table");
		System.out.println(" /t ");
		int i,j;
		for( i=3;i<rows; i++){
			for(j=3; j<columns; j++){
			product[i][j] = i*j;
			System.out.println(" " +product[i][j]);
		}
		System.out.println("  ");
	   }
	}
}