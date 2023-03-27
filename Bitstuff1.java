import java.util.Scanner;
Class Bitstuff1{
	public static void main(String[] args){
		Scanner Sc = new Scanner(System.in);
		String userinput;
		userinput = Sc.next();
		System.out.println("Enter number of 0 and 1");
		int n = Sc.nextInt();
		int len=userinput.length();
		int count 0;
		for(int i=0; i<len; i++){
			System.out.print(userinput.charAt(i));
				if(userinput.charAt(i='1')){
					count +=1;
				}
				else if(userinput.charAt(i= '0')){
					count = 0;
				}
				if(count = 5){
						System.out.print(i:0);
				count 0;
				}
		}
	}
}