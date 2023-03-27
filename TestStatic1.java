class TestStatic1{
	static int x =10;
		int y = 20;
	public static void main(String[] args){
		TestStatic1 t1 = new TestStatic1();
			t1.x = 888;
			t1.y = 999;
		TestStatic1 t2 = new TestStatic1();
		System.out.println(t1.x);
		System.out.println(t2.y);
		System.out.println(t1.y);
		System.out.println(t2.x);
			
	}
	
}