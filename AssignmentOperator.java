class AssignmentOperator{
	public static void main(String[] args){
		int a, b, c, d;
		 a=b=c=d=20; //chain
		 a += b -= c *= d /= 2; //compound
		System.out.println(a+ " " +b+ " "+c+ " "+d);
		int x=10; // simple
		x += 20; //compound
		System.out.println(x);
		byte y=10;
		//y++;
		//y+=1;
		//y=y+1;x
		y =(byte)(y+1); //compound
		System.out.println(y);
		int w= (10<20)?30:40; //conditional operator
		System.out.println(w);
		int u = (10>20)?30:(40>50)?60:70;//conditional
		System.out.println(u);
	}
}