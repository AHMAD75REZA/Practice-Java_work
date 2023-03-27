class ComlineTest{
	public static void main(String args[]){
	int count, i=0;
	String String;
	count = args.length;
	System.out.println("Number of arguments = " +count);
		while(i < count){
		String = args[i];
		i = i + 1;
		System.out.println(i + ":" + "java is " +String+ "!");
		}
	}
}